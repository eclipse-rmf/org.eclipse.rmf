package org.eclipse.rmf.reqif10.tests.uc003.tc18xx;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

@SuppressWarnings("nls")
public class TC1802HISExchangeProcessModelBuilder {

	final static String NEWER_CHANGE_STRING = "2012-04-08T01:51:37.112+02:00";
	final static String LAST_CHANGE_STRING = TC1800HISExchangeProcessModelBuilder.LAST_CHANGE_STRING;
	final static String OLDER_CHANGE_STRING = "2012-04-06T01:51:37.112+02:00";
	private ReqIF reqIF;

	public TC1802HISExchangeProcessModelBuilder(ReqIF reqIF) throws Exception {
		this.reqIF = reqIF;
		modifyReqIF();
	}

	private void modifyReqIF() throws Exception {
		// No action for 01 needed
		modifySpecObject02();
		modifySpecObject03();
		// No action for 04 needed
		// No action for 05 needed
		// No action for 06 needed
		// No action for 07 needed
		// No action for 08 needed
		// No action for 09 needed
		modifySpecObject10();
	}

	private void modifySpecObject02() {
		SpecObject specObject = reqIF.getCoreContent().getSpecObjects().get(1);
		AttributeValueString value = (AttributeValueString) ReqIF10Util.getAttributeValueForLabel(specObject, "A1");
		value.setTheValue("O2.A1 once");
	}

	private void modifySpecObject03() throws Exception {
		SpecObject specObject = reqIF.getCoreContent().getSpecObjects().get(2);
		AttributeValueString value = (AttributeValueString) ReqIF10Util.getAttributeValueForLabel(specObject, "A1");
		value.setTheValue("O3.A1 once");
		specObject.setLastChange(toDate(NEWER_CHANGE_STRING));
	}

	private void modifySpecObject10() throws Exception {
		SpecObject specObject = reqIF.getCoreContent().getSpecObjects().get(7);
		AttributeValueString value = (AttributeValueString) ReqIF10Util.getAttributeValueForLabel(specObject, "A1");
		value.setTheValue("O10.A1 once");
		specObject.setLastChange(toDate(OLDER_CHANGE_STRING));
	}

	public ReqIF getReqIF() {
		return reqIF;
	}

	public XMLGregorianCalendar toDate(String date) throws DatatypeConfigurationException {
		XMLGregorianCalendar xmlGregoriaCalendar = (XMLGregorianCalendar) EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getDateTime(), date);
		return xmlGregoriaCalendar;
	}

}
