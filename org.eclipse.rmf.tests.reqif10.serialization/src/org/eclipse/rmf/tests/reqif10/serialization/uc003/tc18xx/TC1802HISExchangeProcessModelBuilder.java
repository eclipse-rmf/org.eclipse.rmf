package org.eclipse.rmf.tests.reqif10.serialization.uc003.tc18xx;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecObject;

@SuppressWarnings("nls")
public class TC1802HISExchangeProcessModelBuilder {

	final static String LAST_CHANGE_STRING_2 = "2012-04-09T01:51:37.112+02:00";
	private ReqIF reqIF;

	public TC1802HISExchangeProcessModelBuilder(ReqIF reqIF) throws Exception {
		this.reqIF = reqIF;
		modifyReqIF();
	}

	private void modifyReqIF() throws Exception {
		// No action for 01 needed
		// 02 does not exist any more
		modifySpecObject03();
		// No action for 04 needed
		// No action for 05 needed
		// No action for 06 needed
		// No action for 07 needed
		// No action for 08 needed
		// No action for 09 needed
	}

	private void modifySpecObject03() throws Exception {
		SpecObject specObject = reqIF.getCoreContent().getSpecObjects().get(1);
		AttributeValueString value = (AttributeValueString) ReqIFUtil.getAttributeValueForLabel(specObject, "A1");
		value.setTheValue("O3.A1 once");
		specObject.setLastChange(toDate(LAST_CHANGE_STRING_2));

		AttributeDefinitionEnumeration enumeration = (AttributeDefinitionEnumeration) specObject.getType().getSpecAttributes().get(3);
		AttributeValueEnumeration valueEnum = (AttributeValueEnumeration) ReqIFUtil.getAttributeValueForLabel(specObject, "E1");
		valueEnum.getValues().set(0, enumeration.getType().getSpecifiedValues().get(1));
	}

	public ReqIF getReqIF() {
		return reqIF;
	}

	public GregorianCalendar toDate(String date) throws DatatypeConfigurationException {
		GregorianCalendar gregorianCalendar = (GregorianCalendar) EcoreUtil.createFromString(ReqIF10Package.eINSTANCE.getDateTime(), date);
		return gregorianCalendar;
	}

}
