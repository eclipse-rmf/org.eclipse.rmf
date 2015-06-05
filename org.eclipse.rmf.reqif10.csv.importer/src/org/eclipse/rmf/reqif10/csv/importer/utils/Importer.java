/*******************************************************************************
 * Copyright (c) 2014 Hussein Mhanna
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hussein Mhanna - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.csv.importer.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.common.util.ProrXhtmlSimplifiedHelper;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.csv.importer.mapping.DataType;
import org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem;
import org.eclipse.rmf.reqif10.csv.importer.mapping.MappingLibrary;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;

import au.com.bytecode.opencsv.CSVReader;

public class Importer {

	private static final ReqIF10Factory FACTORY = ReqIF10Factory.eINSTANCE;
	private EditingDomain editingDomain;
	private String path;
	private MappingLibrary library;
	private ReqIF reqIf;
	private char separator;
	private boolean header;
	private CompoundCommand compoundCommand;
	private Map<String, AttributeDefinition> attributeDefinitionMap;

	public Importer(EditingDomain editingDomain, String path,
			MappingLibrary library, ReqIF reqIf, char separator, boolean header) {
		super();
		this.editingDomain = editingDomain;
		this.path = path;
		this.library = library;
		this.reqIf = reqIf;
		this.separator = separator;
		this.header = header;
		attributeDefinitionMap = new HashMap<String, AttributeDefinition>();
	}

	public static void importReq(EditingDomain editingDomain, IFile file,
			String path, MappingLibrary library, char separator, boolean header)
			throws IOException {
		boolean needDispose = false;
		if (editingDomain == null) {
			URI uri = URI.createPlatformResourceURI(file.getFullPath()
					.toOSString(), true);
			editingDomain = Utils.createReqIFEditingDomain();
			editingDomain.getResourceSet().getResource(uri, true);
			needDispose = true;
		}
		ReqIF reqIf = (ReqIF) editingDomain.getResourceSet().getResources()
				.get(0).getContents().get(0);
		Importer importer = new Importer(editingDomain, path, library, reqIf,
				separator, header);
		importer.doImportReq();
		if (needDispose) {
			ComposedAdapterFactory adapterFactory = (ComposedAdapterFactory) ((AdapterFactoryEditingDomain) editingDomain)
					.getAdapterFactory();
			adapterFactory.dispose();
			EList<Resource> resources = editingDomain.getResourceSet()
					.getResources();
			final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
			saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
					Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
			for (Resource resource : resources) {
				resource.save(saveOptions);
				resource.unload();
				resource.getContents().clear();
			}
		}
	}

	public void doImportReq() throws IOException {
		CSVReader reader = new CSVReader(new FileReader(path), separator);

		Map<Short, String> map = null;
		if (header) {
			String[] headerNames = reader.readNext();
			map = buildMappingMap(library, Arrays.asList(headerNames));
		} else {
			map = buildMappingMap(library);
		}
		compoundCommand = new CompoundCommand();
		importReq(reader, map, library.getItems());
		editingDomain.getCommandStack().execute(compoundCommand);
		compoundCommand = null;
		attributeDefinitionMap.clear();
	}

	protected void importReq(CSVReader reader, Map<Short, String> map,
			List<MappingItem> mappingItems) throws IOException {
		Specification specification = reqIf.getCoreContent()
				.getSpecifications().get(0);
		SpecObjectType specObjectType = getSpecObjectType(mappingItems,
				getSpecTypeName());
		System.out.println();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			Command command = CreateChildCommand.create(editingDomain,
					specification, new CommandParameter(specification,
							ReqIF10Package.Literals.SPECIFICATION__CHILDREN,
							specObjectType), Collections
							.singleton(specification));
			compoundCommand.appendAndExecute(command);
			Collection<?> result = command.getResult();
			for (Object object : result) {
				if (object instanceof SpecHierarchy) {
					SpecObject specObject = ((SpecHierarchy) object)
							.getObject();
					createAttributeValues(specObject);
					for (int i = 0; i < nextLine.length; i++) {
						String attributeName = map.get((short) i);
						String attributeStringValue = nextLine[i];
						if (attributeName != null) {
							EAttribute attribute = getSpecObjectAttribute(attributeName);
							if (attribute != null) {
								specObject.eSet(attribute, EcoreUtil
										.createFromString(
												attribute.getEAttributeType(),
												attributeStringValue));
							} else {
								AttributeDefinition attributeDefinition = attributeDefinitionMap
										.get(attributeName);
								AttributeValue attributeValue = ReqIF10Util
										.getAttributeValue(specObject,
												attributeDefinition);
								if (attributeValue != null) {
									if (attributeValue instanceof AttributeValueEnumeration) {
										EnumValue enumValue = getEnumValue(
												(AttributeDefinitionEnumeration) attributeDefinition,
												attributeStringValue);
										ReqIF10Util.setTheValue(attributeValue,
												Collections
														.singleton(enumValue));
									} else if (attributeValue instanceof AttributeValueXHTML) {
										AttributeValueXHTML attributeValueXHTML = (AttributeValueXHTML) attributeValue;
										// The formatted text is edited
										XhtmlDivType div = ProrXhtmlSimplifiedHelper
												.stringToSimplifiedXhtml(attributeStringValue);

										XhtmlContent origTheValue = attributeValueXHTML
												.getTheValue();
										if (origTheValue == null) {
											origTheValue = ReqIF10Factory.eINSTANCE
													.createXhtmlContent();
											attributeValueXHTML
													.setTheValue(origTheValue);
										}
										if (!attributeValueXHTML.isSimplified()) {

											boolean formattedAttribute = ProrXhtmlSimplifiedHelper
													.isFormattedAttribute(origTheValue);

											if (formattedAttribute) {
												attributeValueXHTML
														.setSimplified(true);
											}
										}
										origTheValue.setXhtml(div);
									} else {
										EAttribute eAttribute = (EAttribute) ReqIF10Util
												.getTheValueFeature(attributeValue);
										ReqIF10Util
												.setTheValue(
														attributeValue,
														EcoreUtil
																.createFromString(
																		eAttribute
																				.getEAttributeType(),
																		attributeStringValue));

									}
								}
							}
						}
					}
				}
			}
		}
		reader.close();
	}

	private void createAttributeValues(SpecObject specObject) {
		EList<AttributeDefinition> attributeDefinitions = specObject.getType()
				.getSpecAttributes();
		for (AttributeDefinition attributeDefinition : attributeDefinitions) {
			specObject.getValues().add(
					ReqIF10Util.createAttributeValue(attributeDefinition));
		}
	}

	private EnumValue getEnumValue(
			AttributeDefinitionEnumeration attributeDefinition,
			String attributeStringValue) {
		EList<EnumValue> values = attributeDefinition.getType()
				.getSpecifiedValues();
		for (EnumValue enumValue : values) {
			if ((enumValue.getLongName() != null)
					&& (enumValue.getLongName().equals(attributeStringValue))) {
				return enumValue;
			}
		}
		// Create the attribute value and return it
		EnumValue enumValue = FACTORY.createEnumValue();
		enumValue.setLongName(attributeStringValue);
		values.add(enumValue);
		return enumValue;
	}

	protected SpecObjectType getSpecObjectType(List<MappingItem> mappingItems,
			String specTypeName) {
		EList<SpecType> specTypes = reqIf.getCoreContent().getSpecTypes();
		for (SpecType specType : specTypes) {
			if (specType instanceof SpecObjectType) {
				SpecObjectType specObjectType = (SpecObjectType) specType;
				if (containsAttributeDefinitions(specObjectType, mappingItems,
						specTypeName)) {
					fillAttributeDefinitionMap(specObjectType);
					return specObjectType;
				}
			}
		}
		return createSpecObjectType(mappingItems, specTypeName);
	}

	private void fillAttributeDefinitionMap(SpecObjectType specObjectType) {
		EList<AttributeDefinition> attributeDefinitions = specObjectType
				.getSpecAttributes();
		for (AttributeDefinition attributeDefinition : attributeDefinitions) {
			attributeDefinitionMap.put(attributeDefinition.getLongName(),
					attributeDefinition);
		}

	}

	private boolean containsAttributeDefinitions(SpecObjectType specObjectType,
			List<MappingItem> mappingItems, String specTypeName) {
		if ((specObjectType.getLongName() == null)
				|| (false == specObjectType.getLongName().equals(specTypeName))) {
			return false;
		}
		if (mappingItems.size() != specObjectType.getSpecAttributes().size()) {
			return false;
		}
		for (MappingItem mappingItem : mappingItems) {
			if (false == containsAttributeDefinition(specObjectType,
					mappingItem)) {
				return false;
			}
		}
		return true;
	}

	private boolean containsAttributeDefinition(SpecObjectType specObjectType,
			MappingItem item) {
		boolean found = false;
		EList<AttributeDefinition> attributeDefinitions = specObjectType
				.getSpecAttributes();
		for (AttributeDefinition attributeDefinition : attributeDefinitions) {
			if ((attributeDefinition.getLongName() != null)
					&& (attributeDefinition.getLongName().equals(item
							.getAttributeName()))) {
				switch (item.getDataType()) {
				case BOOLEAN:
					found = attributeDefinition instanceof AttributeDefinitionBoolean;
					break;
				case INTEGER:
					found = attributeDefinition instanceof AttributeDefinitionInteger;
					break;
				case REAL:
					found = attributeDefinition instanceof AttributeDefinitionReal;
					break;
				case DATE:
					found = attributeDefinition instanceof AttributeDefinitionDate;
					break;
				case XHTML:
					found = attributeDefinition instanceof AttributeDefinitionXHTML;
					break;
				case ENUMERATION:
					found = attributeDefinition instanceof AttributeDefinitionEnumeration;
					break;
				case STRING:
				default:
					found = attributeDefinition instanceof AttributeDefinitionString;
					break;
				}
				if (found) {
					break;
				}

			}
		}
		return found;
	}

	protected SpecObjectType createSpecObjectType(
			List<MappingItem> mappingItems, String specTypeName) {
		SpecObjectType specObjectType = FACTORY.createSpecObjectType();
		specObjectType.setLongName(specTypeName);
		for (MappingItem mappingItem : mappingItems) {
			String attributeName = mappingItem.getAttributeName();
			if (getSpecObjectAttribute(attributeName) == null) {
				DatatypeDefinition datatypeDefinition = createDatatypeDefinition(
						mappingItem.getDataType(), attributeName);
				Command command = AddCommand.create(editingDomain,
						reqIf.getCoreContent(),
						ReqIF10Package.Literals.REQ_IF_CONTENT__DATATYPES,
						Collections.singleton(datatypeDefinition));
				compoundCommand.appendAndExecute(command);
				AttributeDefinition attributeDefinition = createAttributeDefinition(
						datatypeDefinition, attributeName);
				attributeDefinition.setLongName(attributeName);
				specObjectType.getSpecAttributes().add(attributeDefinition);
			}
		}
		Command specTypecommand = AddCommand.create(editingDomain,
				reqIf.getCoreContent(),
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES,
				Collections.singleton(specObjectType));
		compoundCommand.appendAndExecute(specTypecommand);
		fillAttributeDefinitionMap(specObjectType);
		return specObjectType;
	}

	protected AttributeDefinition createAttributeDefinition(
			DatatypeDefinition datatypeDefinition, String name) {
		AttributeDefinition attributeDefinition = null;
		if (datatypeDefinition instanceof DatatypeDefinitionBoolean) {
			attributeDefinition = FACTORY.createAttributeDefinitionBoolean();
			((AttributeDefinitionBoolean) attributeDefinition)
					.setType((DatatypeDefinitionBoolean) datatypeDefinition);
		} else if (datatypeDefinition instanceof DatatypeDefinitionInteger) {
			attributeDefinition = FACTORY.createAttributeDefinitionInteger();
			((AttributeDefinitionInteger) attributeDefinition)
					.setType((DatatypeDefinitionInteger) datatypeDefinition);
		} else if (datatypeDefinition instanceof DatatypeDefinitionReal) {
			attributeDefinition = FACTORY.createAttributeDefinitionReal();
			((AttributeDefinitionReal) attributeDefinition)
					.setType((DatatypeDefinitionReal) datatypeDefinition);
		} else if (datatypeDefinition instanceof DatatypeDefinitionDate) {
			attributeDefinition = FACTORY.createAttributeDefinitionDate();
			((AttributeDefinitionDate) attributeDefinition)
					.setType((DatatypeDefinitionDate) datatypeDefinition);
		} else if (datatypeDefinition instanceof DatatypeDefinitionXHTML) {
			attributeDefinition = FACTORY.createAttributeDefinitionXHTML();
			((AttributeDefinitionXHTML) attributeDefinition)
					.setType((DatatypeDefinitionXHTML) datatypeDefinition);
		} else if (datatypeDefinition instanceof DatatypeDefinitionEnumeration) {
			attributeDefinition = FACTORY
					.createAttributeDefinitionEnumeration();
			((AttributeDefinitionEnumeration) attributeDefinition)
					.setType((DatatypeDefinitionEnumeration) datatypeDefinition);
		} else {
			attributeDefinition = FACTORY.createAttributeDefinitionString();
			((AttributeDefinitionString) attributeDefinition)
					.setType((DatatypeDefinitionString) datatypeDefinition);
		}
		attributeDefinition.setLongName(name);
		return attributeDefinition;
	}

	protected DatatypeDefinition createDatatypeDefinition(DataType dataType,
			String name) {
		DatatypeDefinition dataTypeDefinition = null;
		switch (dataType) {
		case BOOLEAN:
			dataTypeDefinition = FACTORY.createDatatypeDefinitionBoolean();
			break;
		case INTEGER:
			dataTypeDefinition = FACTORY.createDatatypeDefinitionInteger();
			break;
		case REAL:
			dataTypeDefinition = FACTORY.createDatatypeDefinitionReal();
			break;
		case DATE:
			dataTypeDefinition = FACTORY.createDatatypeDefinitionDate();
			break;
		case XHTML:
			dataTypeDefinition = FACTORY.createDatatypeDefinitionXHTML();
			break;
		case ENUMERATION:
			dataTypeDefinition = FACTORY.createDatatypeDefinitionEnumeration();
			break;
		case STRING:
		default:
			dataTypeDefinition = FACTORY.createDatatypeDefinitionString();
			break;
		}
		dataTypeDefinition.setLongName(name);
		return dataTypeDefinition;
	}

	protected EAttribute getSpecObjectAttribute(String attributeName) {
		EStructuralFeature feature = ReqIF10Package.Literals.SPEC_OBJECT
				.getEStructuralFeature(attributeName);
		if (feature instanceof EAttribute) {
			return (EAttribute) feature;
		}

		return null;
	}

	protected Map<Short, String> buildMappingMap(MappingLibrary library) {
		List<MappingItem> items = library.getItems();
		Map<Short, String> map = new HashMap<Short, String>(items.size());
		for (MappingItem columnIndexMappingItem : items) {
			map.put(Short.valueOf(columnIndexMappingItem.getColumnId()),
					columnIndexMappingItem.getAttributeName());
		}
		return map;
	}

	protected Map<Short, String> buildMappingMap(MappingLibrary library,
			List<String> columnNames) {
		List<MappingItem> items = library.getItems();
		Map<Short, String> map = new HashMap<Short, String>(items.size());
		for (MappingItem columnNameMappingItem : items) {
			String columnName = columnNameMappingItem.getColumnId();
			short columnIndex = (short) columnNames.indexOf(columnName);
			if (columnIndex != -1) {
				map.put(columnIndex, columnNameMappingItem.getAttributeName());
			}
		}
		return map;
	}

	protected String getSpecTypeName() {
		return path.substring(path.lastIndexOf(File.separator) + 1,
				path.lastIndexOf('.'));
	}
}
