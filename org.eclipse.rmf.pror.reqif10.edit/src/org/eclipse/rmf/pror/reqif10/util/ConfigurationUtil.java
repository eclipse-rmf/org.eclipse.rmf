/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.pror.reqif10.util;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.pror.reqif10.configuration.Column;
import org.eclipse.rmf.pror.reqif10.configuration.ConfigFactory;
import org.eclipse.rmf.pror.reqif10.configuration.LabelConfiguration;
import org.eclipse.rmf.pror.reqif10.configuration.ProrGeneralConfiguration;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfigurations;
import org.eclipse.rmf.pror.reqif10.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.pror.reqif10.configuration.ProrToolExtension;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.ReqIf;
import org.eclipse.rmf.reqif10.ReqIfToolExtension;
import org.eclipse.rmf.reqif10.Reqif10Package;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.util.Reqif10Util;

public class ConfigurationUtil {
	
	/**
	 * @return The Configuration element for the given
	 *         {@link DatatypeDefinition} or null if none is configured.
	 */
	public static ProrPresentationConfiguration getConfiguration(
			DatatypeDefinition datatypeDefinition) {
		ReqIf reqif = Reqif10Util.getReqIf(datatypeDefinition);
		if (reqif == null)
			return null;
		ProrPresentationConfigurations extensions = getProrToolExtension(reqif)
				.getPresentationConfigurations();
		if (extensions == null)
			return null;
		for (ProrPresentationConfiguration config : extensions
				.getPresentationConfigurations()) {
			if (datatypeDefinition.equals(config.getDatatype()))
				return config;
		}
		return null;
	}
	
	/**
	 * Returns the {@link ProrToolExtension} associated with this
	 * {@link ReqIF}.  If it doesn't exist yet, null is returned.
	 * <p>
	 */
	public static ProrToolExtension getProrToolExtension(ReqIf reqif) {
		EList<ReqIfToolExtension> extensions = reqif.getToolExtensions();
		for (ReqIfToolExtension extension : extensions) {
			if (extension instanceof ProrToolExtension) {
				return (ProrToolExtension) extension;
			}
		}
		return null;
	}

	/**
	 * Returns the {@link ProrToolExtension} associated with this
	 * {@link ReqIF}.  If it doesn't exist yet, it is created.
	 * <p>
	 */
	static ProrToolExtension getProrToolExtension(ReqIf reqif, EditingDomain domain) {
		ProrToolExtension extension = getProrToolExtension(reqif);
		if (extension != null) return extension;
		
		extension = ConfigFactory.eINSTANCE.createProrToolExtension();
		domain.getCommandStack().execute(
				AddCommand.create(domain, reqif,
						Reqif10Package.Literals.REQ_IF__TOOL_EXTENSIONS,
						extension));		
		return extension;
	}
	
	/**
	 * Finds the best labels, according to what is set in the preferences.
	 * 
	 * @param specElement
	 * @return
	 */
	public static String getSpecElementLabel(
			SpecElementWithAttributes specElement) {
		
		List<String> labels = getDefaultLabels(Reqif10Util.getReqIf(specElement));

		// Iterate over the list of labels requested
		for (String label : labels) {
			
			for (AttributeValue value : specElement.getValues()) {
				// TODO eventually should also work for non-simple attributes
				AttributeDefinition ad = Reqif10Util.getAttributeDefinition(value);
				if (ad == null)
					continue;

				if (label.equals(ad.getLongName())) {

					String customLabel = getCustomLabel(value);
					if (customLabel != null) {
						return customLabel;
					}

					Object result = Reqif10Util.getTheValue(value);
					if (result != null) {
						return result.toString();
					}
				}
			}
		}
		return specElement.getIdentifier();
	}

	/**
	 * Returns the list of default Label names.
	 * 
	 * @return always a list, sometimes empty.
	 */
	static List<String> getDefaultLabels(
			ReqIf reqif) {
		ProrToolExtension extension = getProrToolExtension(reqif);
		if (extension == null) {
			return Collections.emptyList();
		}
		ProrGeneralConfiguration generalConfig = extension.getGeneralConfiguration();
		if (generalConfig == null) {
			return Collections.emptyList();
		}

		LabelConfiguration labelConfig = generalConfig.getLabelConfiguration();
		if (labelConfig == null) {
			return Collections.emptyList();
		}
		
		return labelConfig.getDefaultLabel();
	}

	private static String getCustomLabel(AttributeValue value) {
		// TODO request custom label from PresentationPluginManager
		return null;
		// See whether we have a custom label renderer
//		DatatypeDefinition dd = Reqif10Util.getDatatypeDefinition(value);
//		ProrPresentationConfiguration manager = PresentationManager
//				.getConfiguration(dd);
//		if (manager != null) {
//			PresentationService service = PresentationPluginManager
//					.getPresentationService(manager);
//			if (service != null) {
//				String customLabel = service.getLabel(value);
//				if (customLabel != null) {
//					return customLabel;
//				}
//			}
//		}
//		return null;
	}

	/**
	 * Retrieves the {@link ProrSpecViewConfiguration} for the given
	 * {@link SpecHierarchyRoot}.
	 * <p>
	 * 
	 * TODO should create a new config if it doesn't exist yet.
	 * 
	 * @param specification
	 * @return
	 */
	public static ProrSpecViewConfiguration getSpecViewConfiguration(
			Specification specification, EditingDomain domain) {
		ProrToolExtension extension = getProrToolExtension(Reqif10Util.getReqIf(specification), domain);
	
		EList<ProrSpecViewConfiguration> configs = extension
				.getSpecViewConfigurations();
		for (ProrSpecViewConfiguration config : configs) {
			if (config.getSpecification().equals(specification)) {
				return config;
			}
		}
	
		// None found, let's build a new one.
		ProrSpecViewConfiguration specViewConfig = ConfigFactory.eINSTANCE
				.createProrSpecViewConfiguration();
		specViewConfig.setSpecification(specification);
		Column column = ConfigFactory.eINSTANCE.createColumn();
		column.setWidth(100);
		column.setLabel("Description");
		specViewConfig.getColumns().add(column);
		extension.getSpecViewConfigurations().add(specViewConfig);
		return specViewConfig;
	}

	/**
	 * Gets the {@link ProrSpecViewConfiguration} for the given spec. If it
	 * doesn't exist, one is created.
	 */
	private static ProrSpecViewConfiguration getConfiguration(Specification spec, EditingDomain domain) {
		ReqIf reqif = Reqif10Util.getReqIf(spec);
		ProrToolExtension extension = getProrToolExtension(reqif, domain);
		for (ProrSpecViewConfiguration config : extension
				.getSpecViewConfigurations()) {
			if (spec.equals(config.getSpecification()))
				return config;
		}
		// None found: Create a new one
		ProrSpecViewConfiguration specConfig = ConfigFactory.eINSTANCE
				.createProrSpecViewConfiguration();
		specConfig.setSpecification(spec);
		extension.getSpecViewConfigurations().add(specConfig);
		return specConfig;
	}

	public static ProrPresentationConfiguration getPresentationConfig(AttributeValue value, EditingDomain domain) {
		DatatypeDefinition dd = Reqif10Util.getDatatypeDefinition(value);
		ProrPresentationConfiguration config = getConfiguration(dd);
		return config;
	}

}
