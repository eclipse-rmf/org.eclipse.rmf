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
package org.eclipse.rmf.pror.reqif10.editor.actions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.rmf.pror.reqif10.configuration.Column;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.pror.reqif10.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.pror.reqif10.presentation.service.PresentationPluginManager;
import org.eclipse.rmf.pror.reqif10.presentation.service.PresentationService;
import org.eclipse.rmf.pror.reqif10.util.ConfigurationUtil;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.util.Reqif10Util;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Display;

/**
 * @author jastram
 * 
 */
public class SpecificationWebPrintAction extends Action {

	private final Specification spec;
	private EditingDomain editingDomain;

	/**
	 */
	public SpecificationWebPrintAction(Specification spec, EditingDomain editingDomain) {
		this.spec = spec;
		this.editingDomain = editingDomain;
	}

	@Override
	public void run() {
		ProrSpecViewConfiguration config = ConfigurationUtil
				.getSpecViewConfiguration(spec, editingDomain);

		StringBuilder html = new StringBuilder();

		try {
			File folder = File.createTempFile("pror-", "");
			folder.delete();
			folder = new File(folder.getAbsolutePath() + "/");
			folder.mkdir();

			// Draw the header
			html.append(createHtmlHeader(spec));
			html.append("<table><tr>");
			EList<Column> cols = config.getColumns();
			for (Column col : cols) {
				html.append("<td><b>" + col.getLabel() + "</b></td>");
			}
			html.append("</tr>\n");
			printRecursive(html, folder, config, 0, spec.getChildren());
			html.append("</table>");

			File htmlFile = new File(folder, "pror.html");
			FileWriter writer = new FileWriter(htmlFile);
			writer.write(html.toString());
			writer.close();
			htmlFile.deleteOnExit();
			Program.launch(htmlFile.toURI().toString());
			System.out.println("Launched: " + htmlFile.toURI());
			MessageDialog.openInformation(
					Display.getCurrent().getActiveShell(), "Output produced",
					"Switch to your web browser to see the output.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String createHtmlHeader(Specification spec2) {
		StringBuilder sb = new StringBuilder();
		String title = ConfigurationUtil.getSpecElementLabel(spec);

		sb.append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
		sb.append("<html>\n");
		sb.append("<head>\n");
		sb.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
		sb.append("<meta name=\"GENERATOR\" content=\"ProR (www.pror.org)\">\n");
		sb.append("<title>" + title + "</title>\n");
		sb.append("<style type=\"text/css\">\n");
		sb.append("body {font-family: Arial, sans-serif;}\n");
		sb.append("h1 {text-align: center;}\n");
		sb.append("table, th, td { border-bottom: 1px solid #cccccc; }\n");
		sb.append("td { padding: 2pt; }\n");
		sb.append("table { border-collapse: collapse; }");
		sb.append("</style>\n");
		sb.append("</head>\n\n");
		sb.append("<body>\n");
		sb.append("<h1>" + title + "</h1>\n");

		return sb.toString();
	}

	private void printRecursive(StringBuilder html, File folder,
			ProrSpecViewConfiguration config, int indent,
			EList<SpecHierarchy> children) {
		for (SpecHierarchy child : children) {
			if (child.getObject() != null) {
				SpecObject specObject = child.getObject();
				boolean first = true;
				html.append("<tr>");
				for (Column col : config.getColumns()) {
					html.append("<td valign='top'>");

					// Handle indenting TODO use something better than spaces.
					if (first) {
						html.append("<div style='margin-left: " + (indent * 20)
								+ ";'>");
					}
					AttributeValue av = Reqif10Util.getAttributeValueForLabel(
							specObject, col.getLabel());
					DatatypeDefinition dd = Reqif10Util.getDatatypeDefinition(av);
					ProrPresentationConfiguration configuration = ConfigurationUtil
							.getConfiguration(dd, editingDomain);
					if (configuration != null) {
						PresentationService service = PresentationPluginManager.getPresentationService(configuration);
						if (service != null)
							html.append(service.getCellRenderer(av)
								.doDrawHtmlContent(av, folder));
					} else {
						html.append(getDefaultValue(av));
					}

					if (first) {
						first = false;
						html.append("</div>");						
					}
					html.append("</td>");
				}
				html.append("</tr>\n");
			}
			printRecursive(html, folder, config, indent + 1,
					child.getChildren());
		}
	}

	/**
	 * Returns the default HTML for the given {@link AttributeValue}.
	 */
	private String getDefaultValue(AttributeValue av) {
		Object value = av == null ? null : Reqif10Util.getTheValue(av);
		String textValue;
		if (value == null) {
			textValue = "";
		} else if (value instanceof List<?>) {
			textValue = "";
			for (Iterator<?> i = ((List<?>) ((List<?>) value)).iterator(); i
					.hasNext();) {
				EnumValue enumValue = (EnumValue) i.next();
				textValue += enumValue.getLongName();
				if (i.hasNext()) {
					textValue += ", ";
				}
			}
		} else {
			textValue = value.toString();
		}
		return textValue;
	}

}
