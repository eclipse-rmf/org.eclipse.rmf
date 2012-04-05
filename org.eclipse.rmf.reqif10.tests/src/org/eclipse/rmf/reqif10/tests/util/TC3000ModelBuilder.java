/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.tests.util;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDdType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDlType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDtType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlFactory;
import org.eclipse.rmf.reqif10.xhtml.XhtmlLiType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlOlType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;
import org.eclipse.rmf.reqif10.xhtml.XhtmlTableType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlTdType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlTrType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlUlType;

/**
 * <h2>TC3000FormatedContent</h2> 
 * <h3>Purpose</h3> 
 * my purpose 
 * <h3>Description of Reference Data</h3> 
 * <h4>ReqIFHeader</h4>
 * mandatory data only
 * <h4>ReqIFToolExtension</h4> 
 * none 
 * <h4>ReqIFContent</h4>
 * <table border="1">
 *  <thead>
 * 	<tr>
 *    <th>ReqIF element name</th>
 *    <th>Multiplicity</th>
 *    <th>Description</th>
 *  </tr>
 *  </thead>
 *  <tfoot>
 *  </tfoot>
 *  <tbody>
 *  <tr>
 *    <td>SpecObjectType</td>
 *    <td>1</td>
 *    <td>one SpecObjectType with two attributes: a description and the formated text</td>
 *  </tr>
 *  <tr>
 *    <td>SpecificationType</td>
 *    <td>1</td>
 *    <td>one SpecificationType with no additional attributes</td>
 *  </tr>
 *  <tr>
 *    <td>Specification</td>
 *    <td>1</td>
 *    <td>one Specification for all SpecObjects</td>
 *  </tr>
 *  <tr>
 *    <td>SpecHierarchy</td>
 *    <td>1</td>
 *    <td>Specification is structured as a flat list</td>
 *  </tr>
 *  <tr>
 *    <td>SpecObject</td>
 *    <td>*</td>
 *    <td>one specObject per ComplexType in XHTML XML schema</td>
 *  </tr>
 *  </tbody>
 * </table>
 * <h5>SpecObjectType</h5>
 * <table border="1">
 *  <thead>
 * 	<tr>
 *    <th>Attribute Name</th>
 *    <th>Attribute Type (ReqIF AttributeDefinition...)</th>
 *    <th>Properties</th>
 *    <th>Description</th>
 *  </tr>
 *  </thead>
 *  <tfoot>
 *  </tfoot>
 *  <tbody>
 *  <tr>
 *    <td>TC3000 String</td>
 *    <td>String</td>
 *    <td>maxLength=255</td>
 *    <td>Short description of the formated text</td>
 *  </tr>
 *  <tr>
 *    <td>TC3000 XHTML</td>
 *    <td>XHTML</td>
 *    <td>&nbsp;</td>
 *    <td>The formated text</td>
 *  </tr>
 *  </tbody>
 * </table>
 * <h5>SpecObjects</h5>
 * The set of SpecObjects shall follow the following rules:
 * <ul>
 *  <li>One SpecObject per ComplexType that occurs in the XHTML XML schema. 
 *      Within this SpecObject all XHTML sub elements and attributes of the 
 *      XHTML ComplexType are set.</li>
 *  <li>If the XHTML ComplexType is a mixed type, then dummy text is added between all XML elements</li>
 *  <li>The formated text starts with an "p" element or a "div" element</li>
 *  <li>The shortest possible XML path is used</li>
 *  <li>If the XHTML XML schema enforces sub elements, then only mandatory data is set for the sub elements</li> 
 * </ul>
 */
@SuppressWarnings("nls")
public class TC3000ModelBuilder extends SimpleModelBuilder {
	int id_counter = 0;
	int specHierarchyCounter = 0;
	int specObjectCounter = 0;

	// datatypes
	DatatypeDefinitionXHTML datatypeDefinitionXHTML;
	DatatypeDefinitionString datatypeDefinitionString;

	// SpecObjectTypes
	SpecObjectType specObjectType;
	AttributeDefinitionXHTML attributeDefinitionXHTML;
	AttributeDefinitionString attributeDefinitionString;

	// SpecificationTypes
	SpecificationType specificationType;

	// SpecObjects
	SpecObject specObject;

	/**
	 * 
	 */
	public TC3000ModelBuilder() {
		super(new Date(), "ID_TC3000_ReqIfHeader", "TC 3000 'Formated Content'");
	}

	public TC3000ModelBuilder(Date creationTime, String identifier, String title) {
		super(creationTime, identifier, title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createDatatypes() throws Exception {
		// datatypeDefinitionXHTML
		datatypeDefinitionXHTML = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionXHTML();
		datatypeDefinitionXHTML.setIdentifier("ID_TC3000_DatatypeDefinitionXHTML");
		datatypeDefinitionXHTML.setLongName("TC3000 DatatypeDefinitionXHTML");
		datatypeDefinitionXHTML.setLastChange(getLastChangeDate());

		// datatypeDefinitionString
		datatypeDefinitionString = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		datatypeDefinitionString.setIdentifier("ID_TC3000_DatatypeDefinitionString");
		datatypeDefinitionString.setLongName("TC3000 DatatypeDefinitionString");
		datatypeDefinitionString.setMaxLength(new BigInteger("255"));
		datatypeDefinitionString.setLastChange(getLastChangeDate());

		EList<DatatypeDefinition> datatypes = getReqIF().getCoreContent().getDatatypes();
		datatypes.add(datatypeDefinitionXHTML);
		datatypes.add(datatypeDefinitionString);

	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		// SpecObjectType
		specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setIdentifier("ID_TC3000_SpecObjectType");
		specObjectType.setLongName("TC3000 SpecObjectType");
		specObjectType.setLastChange(getLastChangeDate());

		// AttributeDefinitionXHTML
		attributeDefinitionXHTML = ReqIF10Factory.eINSTANCE.createAttributeDefinitionXHTML();
		attributeDefinitionXHTML.setIdentifier("ID_TC3000_AttributeDefinitionXHTML");
		attributeDefinitionXHTML.setLongName("TC3000 AttributeDefinitionXHTML");
		attributeDefinitionXHTML.setLastChange(getLastChangeDate());
		attributeDefinitionXHTML.setType(datatypeDefinitionXHTML);

		// AttributeDefinitionString
		attributeDefinitionString = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		attributeDefinitionString.setIdentifier("ID_TC3000_AttributeDefinitionString");
		attributeDefinitionString.setLongName("TC3000 AttributeDefinitionString");
		attributeDefinitionString.setLastChange(getLastChangeDate());
		attributeDefinitionString.setType(datatypeDefinitionString);

		specObjectType.getSpecAttributes().add(attributeDefinitionXHTML);
		specObjectType.getSpecAttributes().add(attributeDefinitionString);
		getReqIF().getCoreContent().getSpecTypes().add(specObjectType);

	}

	@Override
	public void createSpecificationTypes() throws Exception {
		specificationType = ReqIF10Factory.eINSTANCE.createSpecificationType();
		specificationType.setIdentifier("ID_TC3000_SpecificationType");
		specificationType.setLongName("TC3000 SpecificationType");
		specificationType.setLastChange(getLastChangeDate());
		getReqIF().getCoreContent().getSpecTypes().add(specificationType);
	}

	@Override
	public void createSpecRelationGroups() throws Exception {
		// TODO Auto-generated method stub
		super.createSpecRelationGroups();
	}

	@Override
	public void createSpecifications() throws Exception {
		Specification specification = ReqIF10Factory.eINSTANCE.createSpecification();
		specification.setIdentifier("ID_TCs000_Specification");
		specification.setType(specificationType);
		specification.setLastChange(getLastChangeDate());

		SpecHierarchy specHierarchy;
		for (SpecObject specObject : getReqIF().getCoreContent().getSpecObjects()) {
			specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
			specHierarchy.setIdentifier("ID_TC3000_SpecHierarchy_" + specHierarchyCounter++);
			specHierarchy.setLastChange(getLastChangeDate());
			specHierarchy.setObject(specObject);
			specification.getChildren().add(specHierarchy);
			getReqIF().getCoreContent().getSpecifications().add(specification);
		}

	}

	@Override
	public void createSpecObjects() throws Exception {
		SpecObject specObject;
		String description;
		EObject xhtml;
		// create full XhtmlPType in XhtmlContent.p
		description = "xhtml.p.type";
		xhtml = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlPType(), true);
		specObject = createSpecObject(description, xhtml);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		// create fill XhtmlDivType in XhtmlContent.div
		description = "xhtml.div.type";
		xhtml = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDivType(), true);
		specObject = createSpecObject(description, xhtml);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

	}

	protected Map<EClass, EObject> createXhtmlEClassInstances() {
		Map<EClass, EObject> xhtmlEClassInstances = new HashMap<EClass, EObject>();
		for (EClassifier eClassifier : XhtmlPackage.eINSTANCE.getEClassifiers()) {
			if (eClassifier instanceof EClass) {
				EClass eClass = (EClass) eClassifier;
				xhtmlEClassInstances.put(eClass, createXhtmlInstance(eClass, true));
			} else {
				// do nothing, its a EDataType
			}
		}

		return xhtmlEClassInstances;
	}

	protected SpecObject createSpecObject(String text, EObject eObject) throws Exception {
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier("ID_TC3000_SpecObject_" + text);
		specObject.setLastChange(getLastChangeDate());
		specObject.setType(specObjectType);

		AttributeValueString attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(attributeDefinitionString);
		attributeValueString.setTheValue(text);
		specObject.getValues().add(attributeValueString);

		AttributeValueXHTML attributeValueXHTML = ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
		attributeValueXHTML.setDefinition(attributeDefinitionXHTML);
		XhtmlContent xhtmlContent = ReqIF10Factory.eINSTANCE.createXhtmlContent();
		attributeValueXHTML.setTheValue(xhtmlContent);

		if (eObject instanceof XhtmlDivType) {
			xhtmlContent.setDiv((XhtmlDivType) eObject);
		} else if (eObject instanceof XhtmlPType) {
			xhtmlContent.setP((XhtmlPType) eObject);
		}

		specObject.getValues().add(attributeValueXHTML);

		return specObject;
	}

	@Override
	public void createSpecRelations() throws Exception {
		// TODO Auto-generated method stub
		super.createSpecRelations();
	}

	protected SortedMap<String, EObject> getCleanedXhtml(List<EObject> list) {
		SortedMap<String, EObject> map = new TreeMap<String, EObject>();
		for (EObject eObject : list) {
			map.put(getQualifiedName(eObject), eObject);
		}

		return map;
	}

	protected EObject createXhtmlInstance(EClass eClass, boolean createAll) {
		EObject eObject = EcoreUtil.create(eClass);
		setAttributes(eObject, createAll);
		setSubElements(eObject, createAll);
		setMixedText(eObject, createAll);

		return eObject;
	}

	protected void setMixedText(EObject eObject, boolean createAll) {
		// get the mixed attribute
		EAttribute mixedAttribute = null;
		for (EAttribute eAttribute : eObject.eClass().getEAllAttributes()) {
			if ("mixed".equals(eAttribute.getName()) && EcorePackage.eINSTANCE.getEFeatureMapEntry() == eAttribute.getEAttributeType()) {
				mixedAttribute = eAttribute;
				break;
			}
		}
		if (null != mixedAttribute) {
			FeatureMap featureMap = (FeatureMap) eObject.eGet(mixedAttribute);
			int featureMapSize = featureMap.size();
			if (0 == featureMapSize) {
				featureMap.add(FeatureMapUtil.createTextEntry(eObject.eClass().getName()));
			} else {

				for (int i = 0; i < featureMapSize * 3; i = i + 3) {
					FeatureMap.Entry entry = featureMap.get(i);
					EStructuralFeature feature = entry.getEStructuralFeature();
					featureMap.add(i, FeatureMapUtil.createTextEntry("\n                    text before " + feature.getName()));
					featureMap.add(i + 2, FeatureMapUtil.createTextEntry("text after " + feature.getName()));

				}

			}
		} else {
			System.out.println("no mixed Attribute found in " + eObject);
		}
	}

	private List<EObject> getFullXhtml(EClass eClass, int level) {
		List<EObject> list = new ArrayList<EObject>();

		// get the mixed attribute
		EAttribute mixedAttribute = null;
		for (EAttribute eAttribute : eClass.getEAllAttributes()) {
			if ("mixed".equals(eAttribute.getName())) {
				mixedAttribute = eAttribute;
				break;
			}
		}

		if (0 < level) {

			// create instance of class
			EObject eObject = null;
			EClass referenceType = null;
			for (EReference eReference : eClass.getEAllContainments()) {
				referenceType = eReference.getEReferenceType();
				for (EObject referenceEObject : getFullXhtml(referenceType, level - 1)) {
					eObject = XhtmlFactory.eINSTANCE.create(eClass);
					setMandatorySubElements(eObject);
					setAttributes(eObject);

					if (eReference.isMany()) {
						((EList<Object>) eObject.eGet(eReference)).add(referenceEObject);
					} else {
						eObject.eSet(eReference, referenceEObject);
					}
					list.add(eObject);
				}
			}
		} else {
			if (XhtmlPackage.eINSTANCE.getXhtmlOlType().equals(eClass) || XhtmlPackage.eINSTANCE.getXhtmlUlType().equals(eClass)) {
				// ignore DL,OL,UL,TABLE since it would require complex inner content

			} else {
				EObject eObject = XhtmlFactory.eINSTANCE.create(eClass);
				setMandatorySubElements(eObject);
				setAttributes(eObject);
				if (null != mixedAttribute) {
					Object mixedAttributeValue = eObject.eGet(mixedAttribute);
					if (null != mixedAttributeValue && mixedAttributeValue instanceof FeatureMap) {
						FeatureMap map = (FeatureMap) mixedAttributeValue;
						map.add(FeatureMapUtil.createTextEntry("text"));
					}
				}
				list.add(eObject);
			}
		}
		return list;
	}

	protected void setMandatorySubElements(EObject eObject) {

	}

	protected void setSubElements(EObject eObject, boolean createAll) {
		if (createAll) {
			// create full set of sub elements
			for (EReference eReference : eObject.eClass().getEAllContainments()) {
				EObject subEObject = createXhtmlInstance(eReference.getEReferenceType(), false);
				if (eReference.isMany()) {
					((EList<Object>) eObject.eGet(eReference)).add(subEObject);
				} else {
					eObject.eSet(eReference, subEObject);
				}
			}
		} else {
			// create mandatory sub elements only
			if (eObject instanceof XhtmlTableType) {
				XhtmlTrType tr = XhtmlFactory.eINSTANCE.createXhtmlTrType();
				setAttributes(tr, false);
				((XhtmlTableType) eObject).getTr().add(tr);
				XhtmlTdType td = XhtmlFactory.eINSTANCE.createXhtmlTdType();
				setAttributes(td, false);
				tr.getTd().add(td);
			} else if (eObject instanceof XhtmlTbodyType) {
				XhtmlTrType tr = XhtmlFactory.eINSTANCE.createXhtmlTrType();
				setAttributes(tr, false);
				((XhtmlTbodyType) eObject).getTr().add(tr);
				XhtmlTdType td = XhtmlFactory.eINSTANCE.createXhtmlTdType();
				setAttributes(td, false);
				tr.getTd().add(td);
			} else if (eObject instanceof XhtmlDlType) {
				XhtmlDtType dt = XhtmlFactory.eINSTANCE.createXhtmlDtType();
				setAttributes(dt, false);
				XhtmlDdType dd = XhtmlFactory.eINSTANCE.createXhtmlDdType();
				setAttributes(dd, false);
				((XhtmlDlType) eObject).getDt().add(dt);
				((XhtmlDlType) eObject).getDd().add(dd);
			} else if (eObject instanceof XhtmlUlType) {
				XhtmlLiType li = XhtmlFactory.eINSTANCE.createXhtmlLiType();
				setAttributes(li, false);
				((XhtmlUlType) eObject).getLi().add(li);
			} else if (eObject instanceof XhtmlOlType) {
				XhtmlLiType li = XhtmlFactory.eINSTANCE.createXhtmlLiType();
				setAttributes(li, false);
				((XhtmlOlType) eObject).getLi().add(li);
			}
		}
	}

	protected void setAttributes(EObject eObject) {
		for (EAttribute eAttribute : eObject.eClass().getEAllAttributes()) {
			Object value = getValue(eAttribute);
			if (null != value && eAttribute.isChangeable()) {
				if (eAttribute.isMany()) {
					((EList<Object>) eObject.eGet(eAttribute)).add(value);
				} else {
					eObject.eSet(eAttribute, value);
				}
			}
		}
	}

	protected void setAttributes(EObject eObject, boolean createAll) {
		for (EAttribute eAttribute : eObject.eClass().getEAllAttributes()) {
			if (createAll || eAttribute.isRequired()) {
				Object value = getValue(eAttribute);
				if (null != value && eAttribute.isChangeable()) {
					if (eAttribute.isMany()) {
						((EList<Object>) eObject.eGet(eAttribute)).add(value);
					} else {
						eObject.eSet(eAttribute, value);
					}
				}
			}
		}
	}

	protected Object getValue(EAttribute eAttribute) {
		EDataType eDataType = eAttribute.getEAttributeType();
		String datatypeName = eDataType.getName();

		if ("class".equals(eAttribute.getName())) {
			// ReqIF never use class
			return null;
		}
		if ("style".equals(eAttribute.getName())) {
			// ReqIF only limited support
			return EcoreUtil.createFromString(eDataType, "text-decoration:underline");
		}
		if (XhtmlPackage.eINSTANCE.getXhtmlObjectType_Class() == eAttribute || XhtmlPackage.eINSTANCE.getXhtmlObjectType_Archive() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Classid() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Codebase() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Codetype() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Declare() == eAttribute || XhtmlPackage.eINSTANCE.getXhtmlObjectType_Id() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Lang() == eAttribute || XhtmlPackage.eINSTANCE.getXhtmlObjectType_Name() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Space() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Standby() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Style() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Tabindex() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Title() == eAttribute) {
			// ReqIF: only attributes data, type, width, height are allowed
			return null;
		}

		if ("String".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "text");
		}
		if ("LangType".equals(datatypeName)) {
			return null;
		}
		if ("SpaceType".equals(datatypeName)) {
			return null;
		}
		if ("ID".equals(datatypeName)) {
			return null;
			// return EcoreUtil.createFromString(eDataType, "ID" + id_counter++);
		}
		if ("CDATA".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "CDATA\"CDATA");
		}
		if ("Datetime".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "2012-04-05T02:39:33.005+02:00");
		}
		if ("URI".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "http://eclipse.org/rmf");
		}
		if ("EFeatureMapEntry".equals(datatypeName)) {
			return null;
		}
		if ("Character".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "a");
		}
		if ("LanguageCode".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "en");
		}
		if ("Number".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "1234");
		}
		if ("Charset".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "UTF-8");
		}
		if ("MimeType".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "text/html");
		}
		if ("ContentType".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "text/html");
		}
		if ("Text".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "text");
		}
		if ("Length".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "100");
		}
		if ("LinkTypes".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "LinkTypes");
		}
		if ("RulesType".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "rows");
		}
		if ("AlignType".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "left");
		}
		if ("ValignType".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "top");
		}
		if ("MultiLength".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "100");
		}
		if ("Pixels".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "100");
		}
		if ("FrameType".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "above");
		}
		if ("ValuetypeType".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "data");
		}
		if ("IDREFS".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "a123");
		}
		if ("ScopeType".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "row");
		}
		System.out.println("Not Implemented Datatype: " + datatypeName);
		return null;
	}

	/**
	 * @param eObject
	 * @return
	 */
	protected String getQualifiedName(EObject eObject) {
		String qualifiedName = "";
		if (null != eObject.eContainingFeature()) {
			qualifiedName = eObject.eContainingFeature().getName();
		}
		int contentsSize = eObject.eContents().size();
		if (0 == contentsSize) {
			// do nothing
		} else if (1 == contentsSize) {
			qualifiedName += "/" + getQualifiedName(eObject.eContents().get(0));
		} else {
			qualifiedName += "/{";
			qualifiedName += getQualifiedName(eObject.eContents().get(0));
			for (int i = 1; i < contentsSize; i++) {
				qualifiedName += ",";
				qualifiedName += getQualifiedName(eObject.eContents().get(i));
			}
			qualifiedName += "}";
		}
		return qualifiedName;
	}
}
