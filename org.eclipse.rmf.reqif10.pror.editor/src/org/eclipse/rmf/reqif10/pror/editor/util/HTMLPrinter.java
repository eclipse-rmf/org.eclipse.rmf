/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.common.util.ProrXhtmlSimplifiedHelper;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.common.util.ReqIF10XhtmlUtil;
import org.eclipse.rmf.reqif10.pror.configuration.Column;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.UnifiedColumn;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.PresentationEditorInterface;
import org.eclipse.rmf.reqif10.pror.util.ConfigurationUtil;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.google.common.io.Files;

/**
 * Once instantiated, it can produce a folder with HTML for the given
 * Specification.
 * 
 * @author jastram
 * @author weigelt
 */
public class HTMLPrinter {

	private Specification spec;
	private AdapterFactory adapterFactory;
	private File sourceFolder;
	private ProrSpecViewConfiguration config;
	private File targetFolder;
	private ReqIF reqif;
	
	private boolean exportIncomingSpecRelations = false;
	private boolean exportOutgoingSpecRelations = false;
		
	private Map<SpecObject, List<SpecRelation>> outgoingSpecRelationsCache;
	private Map<SpecObject, List<SpecRelation>> incomingSpecRelationsCache;
	
	

	/**
	 * Constructs an HTMLPriter..
	 */
	public HTMLPrinter(Specification spec, EditingDomain domain,
			AdapterFactory adapterFactory) {
		this.spec = spec;
		this.adapterFactory = adapterFactory;

		this.sourceFolder = new File(CommonPlugin.resolve(spec.eResource().getURI())
				.trimSegments(1).toFileString());
		this.config = ConfigurationUtil.createSpecViewConfiguration(spec,
				domain);
	}
	
	
	private void buildSpecRelationsCache(){
		outgoingSpecRelationsCache = new HashMap<SpecObject, List<SpecRelation>>();
		incomingSpecRelationsCache = new HashMap<SpecObject, List<SpecRelation>>();
		
		EList<SpecRelation> relations = reqif.getCoreContent().getSpecRelations();
		for (SpecRelation sr : relations) {
			SpecObject source = sr.getSource();
			List<SpecRelation> outgoingList = outgoingSpecRelationsCache.get(source);
			if (outgoingList == null){
				outgoingList = new LinkedList<SpecRelation>();
			}
			outgoingList.add(sr);
			outgoingSpecRelationsCache.put(source, outgoingList);
			
			
			SpecObject target = sr.getTarget();
			List<SpecRelation> incomingList = incomingSpecRelationsCache.get(target);
			if (incomingList == null){
				incomingList = new LinkedList<SpecRelation>();
			}
			incomingList.add(sr);
			incomingSpecRelationsCache.put(target, incomingList);			
		}
		
	}

	/**
	 * Produces a File representing the spec that this object was constructed with, 
	 * located in a temporary folder that also contains related images, if any.
	 */
	public File print() throws IOException {
		
		if (exportIncomingSpecRelations || exportOutgoingSpecRelations){
			EObject eContainer = spec.eContainer().eContainer();
			if (eContainer instanceof ReqIF) {
				reqif = (ReqIF) eContainer;
				buildSpecRelationsCache();
			}
		}
		

		targetFolder = createTempFolder();

		// Build the HTML
		StringBuilder html = new StringBuilder();
		createHtmlHeader(html);
		html.append("<table>");
		createRowHeader(html);

		printRecursive(html, 0, spec.getChildren());
		html.append("</table>");

		// Write the HTML
		File htmlFile = new File(targetFolder, spec.getIdentifier() + ".html");
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(htmlFile),Charset.forName("UTF-8").newEncoder());
		writer.write(html.toString());
		writer.close();
		htmlFile.deleteOnExit();

		return htmlFile;
	}

	/**
	 * Builds the header row.
	 * @return
	 */
	private void createRowHeader(StringBuilder html) {
		
		html.append("<tr>");
		EList<Column> cols = config.getColumns();
		for (Column col : cols) {
			html.append("<td><b>" + col.getLabel() + "</b></td>");
		}
		if (exportIncomingSpecRelations || exportOutgoingSpecRelations){
			html.append("<td><b>Link</b></td>\n");
		}
		html.append("</tr>\n");
	}

	/**
	 * Creates a temporary folder for the spec.  Note that currently there is no cleanup.
	 */
	private File createTempFolder() throws IOException {
		File targetFolder = File.createTempFile("pror-", "");
		targetFolder.delete();
		targetFolder = new File(targetFolder.getAbsolutePath() + "/");
		targetFolder.mkdir();
		return targetFolder;
	}

	private void createHtmlHeader(StringBuilder html) {
		String title = ConfigurationUtil.getSpecElementLabel(spec,
				adapterFactory);
		html.append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
		html.append("<html>\n");
		html.append("<head>\n");
		html.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
		html.append("<meta name=\"GENERATOR\" content=\"ProR (www.pror.org)\">\n");
		html.append("<title>" + title + "</title>\n");
		html.append("<style type=\"text/css\">\n");
		html.append("body {font-family: Arial, sans-serif;}\n");
		html.append("h1 {text-align: center;}\n");
		html.append("table, th, td { border-bottom: 1px solid #cccccc; }\n");
		html.append("td { padding: 2pt; }\n");
		html.append("table { border-collapse: collapse; }");
		html.append("</style>\n");
		html.append("</head>\n\n");
		html.append("<body>\n");
		html.append("<h1>" + title + "</h1>\n");
	}

	private void printRecursive(StringBuilder html, int indent,
			EList<SpecHierarchy> children) {
		for (SpecHierarchy child : children) {
			if (child.getObject() != null) {
				SpecObject specObject = child.getObject();
				boolean first = true;
				html.append("<tr>");
				for (Column col : config.getColumns()) {
					html.append("<td valign='top'>");

					// Handle indenting
					if (first) {
						html.append("<div style='margin-left: " + (indent * 20)
								+ "px;'>");
					}

					AttributeValue av;
					if (col instanceof UnifiedColumn) {
						av = ReqIF10Util.getAttributeValueForLabel(specObject,
								"ReqIF.Text");
						if (av == null || ReqIF10Util.getTheValue(av) == null) {
							av = ReqIF10Util.getAttributeValueForLabel(
									specObject, "ReqIF.ChapterName");
						}
					} else {
						av = ReqIF10Util.getAttributeValueForLabel(specObject,
								col.getLabel());
					}
					
					String cellString = attributeValueToString(av);
					html.append(cellString);

					if (first) {
						first = false;
						html.append("</div>");
					}
					html.append("</td>");
				}
				if (exportIncomingSpecRelations || exportOutgoingSpecRelations){
					createSpecRelationsCell(html, specObject);
				}
				html.append("</tr>\n");
			}
			printRecursive(html, indent + 1, child.getChildren());
		}
	}

	
	/* 
	 * Helper to convert an attribute to a String. Using a CellRenderer if possible
	 */
	private String attributeValueToString(AttributeValue av){
		DatatypeDefinition dd = ReqIF10Util
				.getDatatypeDefinition(av);
		ProrPresentationConfiguration configuration = ConfigurationUtil
				.getPresentationConfiguration(dd);

		Object itemProvider = ProrUtil.getItemProvider(
				adapterFactory, configuration);

		if (itemProvider instanceof PresentationEditorInterface) {
			PresentationEditorInterface presentationEditor = (PresentationEditorInterface) itemProvider;
			IProrCellRenderer renderer = presentationEditor
					.getCellRenderer(av);
			if (renderer != null) {
				String content = renderer.doDrawHtmlContent(av);
				if (content != null) {
					return content;
				} else {
					return getValueAsString(av);
				}
			}else{
				// ????
				return getValueAsString(av);		
			}

		} else {
			return getValueAsString(av);
		}
		
		
	}
	

	private void createSpecRelationsCell(StringBuilder html, SpecObject specObject) {
		html.append("<td>");
		
		if (exportOutgoingSpecRelations){
			List<String> specRelationLabels = collectSpecRelationLabels(outgoingSpecRelationsCache.get(specObject));
		
			for (String string : specRelationLabels) {
				html.append("&#9655;&nbsp;"); // outgoing link symbol
				html.append(String.join(", ", string));
				html.append("<br>\n");
			}
		}
		
		if (exportIncomingSpecRelations){
			List<String> specRelationLabels = collectSpecRelationLabels(incomingSpecRelationsCache.get(specObject));
			
			for (String string : specRelationLabels) {
				html.append("&#9665;&nbsp;"); // outgoing link symbol
				html.append(String.join(", ", string));
				html.append("<br>\n");
			}	
		}
		
		html.append("</td>");
	}
	

	/**
	 * Finds and renders a suitable label for each SpecRelation
	 * 
	 * The label is a concatenation of the attributeValues defined by the
	 * ProrSpecViewConfiguration including the UnifiedColumn.
	 * If no suitable attribute is found, the Identifier is used. 
	 * 
	 * @param relations
	 * @return a List<String> of rendered labels
	 */
	private List<String> collectSpecRelationLabels(List<SpecRelation> relations ) {
		List<String> specRelations = new LinkedList<String>();
		if (relations != null){
			for (SpecRelation specRelation : relations) {
				List<String> labels = new ArrayList<String>(config.getColumns().size()); 
				for (Column column : config.getColumns()) {
					
					//AttributeValue av = ReqIF10Util.getAttributeValueForLabel(specRelation, column.getLabel());
					// with unified Columns:
					AttributeValue av;
					if (column instanceof UnifiedColumn) {
						av = ReqIF10Util.getAttributeValueForLabel(specRelation,
								"ReqIF.Text");
						if (av == null || ReqIF10Util.getTheValue(av) == null) {
							av = ReqIF10Util.getAttributeValueForLabel(
									specRelation, "ReqIF.ChapterName");
						}
					} else {
						av = ReqIF10Util.getAttributeValueForLabel(specRelation,
								column.getLabel());
					}
					// END with unified Columns:
					
					
					
					String label = attributeValueToString(av);
					if (label != null && !label.isEmpty()){
						labels.add(label); 
					}
				}
				if (labels.isEmpty()){
					labels.add("<i>" + specRelation.getIdentifier() + "</i>");					
				}
				specRelations.add(String.join(", ", labels));
			}
		}
		
		return specRelations;
	}


	private String getValueAsString(AttributeValue av) {
		Object value = av == null ? null : ReqIF10Util.getTheValue(av);
		if (value == null) {
			return "";
		} else if (value instanceof List<?>) {
			return listAsString(value);
		} else if (value instanceof XhtmlContent) {
			return xhtmlAsString((XhtmlContent)value);
		} else if (value instanceof GregorianCalendar) {
			GregorianCalendar cal = (GregorianCalendar) value;
			SimpleDateFormat formatter = new SimpleDateFormat(
					"yyyy-MMM-dd hh:mm:ss z");
			return formatter.format(cal.getTime());
		} else {
			return value.toString();
		}
	}

	private String xhtmlAsString(XhtmlContent xhtmlContent) {
		String textValue = ProrXhtmlSimplifiedHelper
				.xhtmlToSimplifiedString(xhtmlContent);
		try {
			String xhtmlString = ReqIF10XhtmlUtil
					.getXhtmlString(xhtmlContent);
			xhtmlString = xhtmlString.replace("<xhtml:", "<");
			xhtmlString = xhtmlString.replace("</xhtml:", "</");
			textValue = xhtmlString;
			
			// Find and extract embedded images.
			Document dom = ReqIF10XhtmlUtil.getXhtmlDom(xhtmlContent);
			NodeList tags = dom.getElementsByTagName("xhtml:object");
			for (int i = 0; i < tags.getLength(); i++) {
				Node xhtmlNode = tags.item(i);
				Node dataNode = xhtmlNode.getAttributes().getNamedItem("data");
				if (dataNode != null) {
					String filename = dataNode.getTextContent();
					System.out.println("Found: " + filename);
					filename = URLDecoder.decode(filename, "UTF-8");
					System.out.println("Decoded: " + filename);
					copyEmbeddedObject(filename);
				}
			}
			
			
		} catch (IOException e) {
		}
		return textValue;
	}

	/**
	 * Copy the source file identified by the given filename. This method may
	 * fail silently to prevent interuption of the HTML printing.
	 */
	private void copyEmbeddedObject(String filename) {
		File fullSourceFolder = sourceFolder;
		File fullTargetFolder = targetFolder;

		StringTokenizer st = new StringTokenizer(filename, "/");
		String token = null;
		while (st.hasMoreTokens()) {
			token = st.nextToken();
			if (! st.hasMoreTokens()) break;
			fullSourceFolder = new File (fullSourceFolder, token);
			fullTargetFolder = new File(fullTargetFolder, token);
			fullTargetFolder.mkdir();
		}
		
		File source = new File(fullSourceFolder, token);
		File target = new File(fullTargetFolder, token);
		try {
			Files.copy(source, target);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String listAsString(Object value) {
		String textValue = "";
		for (Iterator<?> i = ((List<?>) ((List<?>) value)).iterator(); i
				.hasNext();) {
			EnumValue enumValue = (EnumValue) i.next();
			textValue += enumValue.getLongName();
			if (i.hasNext()) {
				textValue += ", ";
			}
		}
		return textValue;
	}


	public void setExportOutgoingSpecRelations(boolean b) {
		exportOutgoingSpecRelations = b;
	}
	
	public void setExportIncomingSpecRelations(boolean b) {
		exportIncomingSpecRelations = b;
	}
}
