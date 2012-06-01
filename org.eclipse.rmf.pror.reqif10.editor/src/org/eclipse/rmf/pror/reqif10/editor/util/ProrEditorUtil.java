package org.eclipse.rmf.pror.reqif10.editor.util;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.pror.reqif10.configuration.Column;
import org.eclipse.rmf.pror.reqif10.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.pror.reqif10.util.ConfigurationUtil;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.util.ReqIF10Util;

public class ProrEditorUtil {

	private static String createHtmlHeader(Specification spec) {
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
	
	private static String getDefaultValue(AttributeValue av) {
		Object value = av == null ? null : ReqIF10Util.getTheValue(av);
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

	private static void printRecursive(StringBuilder html,
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
					AttributeValue av = ReqIF10Util.getAttributeValueForLabel(
							specObject, col.getLabel());
					//TODO: enable presentation plugins
					// DatatypeDefinition dd = ReqIF10Util
					// .getDatatypeDefinition(av);
					// ProrPresentationConfiguration configuration =
					// ConfigurationUtil
					// .getConfiguration(dd, null);
					// if (configuration != null) {
					// PresentationService service = PresentationEditorManager
					// .getPresentationService(configuration);
					// if (service != null)
					// html.append(service.getCellRenderer(av)
					// .doDrawHtmlContent(av, folder));
					// } else {
					html.append(getDefaultValue(av));
					// }

					if (first) {
						first = false;
						html.append("</div>");
					}
					html.append("</td>");
				}
				html.append("</tr>\n");
			}
			printRecursive(html, config, indent + 1, child.getChildren());
		}
	}

	public static String createHtmlContent(Specification spec, EditingDomain domain) {

		ProrSpecViewConfiguration config = ConfigurationUtil
				.getSpecViewConfiguration(spec, domain);

		StringBuilder html = new StringBuilder();

		// Draw the header
		html.append(ProrEditorUtil.createHtmlHeader(spec));
		html.append("<table><tr>");
		EList<Column> cols = config.getColumns();
		for (Column col : cols) {
			html.append("<td><b>" + col.getLabel() + "</b></td>");
		}
		html.append("</tr>\n");
		printRecursive(html, config, 0, spec.getChildren());
		html.append("</table>");
		
		return html.toString();

	}
	
}
