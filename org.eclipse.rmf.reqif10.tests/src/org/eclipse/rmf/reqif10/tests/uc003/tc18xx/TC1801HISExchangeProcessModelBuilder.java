package org.eclipse.rmf.reqif10.tests.uc003.tc18xx;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

@SuppressWarnings("nls")
public class TC1801HISExchangeProcessModelBuilder {

	final static String NEWER_CHANGE_STRING = "2012-04-08T01:51:37.112+02:00";
	final static String LAST_CHANGE_STRING = TC1800HISExchangeProcessModelBuilder.LAST_CHANGE_STRING;
	final static String OLDER_CHANGE_STRING = "2012-04-06T01:51:37.112+02:00";
	private ReqIF reqIF;

	public TC1801HISExchangeProcessModelBuilder(ReqIF reqIF) throws Exception {
		this.reqIF = reqIF;
		modifyReqIF();
	}

	private void modifyReqIF() throws Exception {
		// No action for 01 needed
		modifySpecObject02();
		modifySpecObject03();
		createSpecObject04();
		// No action for 05 needed
		deleteSpecObject06();
		// No action for 07 needed
		moveSpecObject08();
		// No action for 09 needed
		modifySpecObject10();
	}

	private void modifySpecObject02() {
		SpecObject specObject = reqIF.getCoreContent().getSpecObjects().get(1);
		AttributeValueString value = (AttributeValueString) ReqIF10Util.getAttributeValueForLabel(specObject, "A2");
		value.setTheValue("O2.A2 once");
	}

	private void modifySpecObject03() throws Exception {
		SpecObject specObject = reqIF.getCoreContent().getSpecObjects().get(2);
		AttributeValueString value = (AttributeValueString) ReqIF10Util.getAttributeValueForLabel(specObject, "A2");
		value.setTheValue("O3.A2 once");
		specObject.setLastChange(toDate(NEWER_CHANGE_STRING));
	}

	private void createSpecObject04() throws Exception {
		SpecObjectType specObjectType = (SpecObjectType) reqIF.getCoreContent().getSpecTypes().get(0);
		AttributeValueString attributeValueString;

		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier("ID_TC1801_SpecObject04");
		specObject.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject.setType(specObjectType);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition((AttributeDefinitionString) specObjectType.getSpecAttributes().get(0));
		attributeValueString.setTheValue("Obj-04");
		specObject.getValues().add(attributeValueString);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition((AttributeDefinitionString) specObjectType.getSpecAttributes().get(1));
		attributeValueString.setTheValue("no change");
		specObject.getValues().add(attributeValueString);

		getReqIF().getCoreContent().getSpecObjects().add(3, specObject);

		SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy.setIdentifier("ID_TC1801_SpecHierarchy-" + specObject.getIdentifier());
		specHierarchy.setObject(specObject);

		reqIF.getCoreContent().getSpecifications().get(0).getChildren().add(3, specHierarchy);
	}

	private void deleteSpecObject06() {
		reqIF.getCoreContent().getSpecObjects().remove(4);
		reqIF.getCoreContent().getSpecifications().get(0).getChildren().remove(4);
	}

	private void moveSpecObject08() throws Exception {
		// Remove from Spec 1...

		SpecObject specObject = reqIF.getCoreContent().getSpecifications().get(0).getChildren().get(5).getObject();
		reqIF.getCoreContent().getSpecifications().get(0).getChildren().remove(5);

		// ... and add to Spec 2
		SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy.setIdentifier("ID_TC1801_SpecHierarchy-" + specObject.getIdentifier());
		specHierarchy.setObject(specObject);

		reqIF.getCoreContent().getSpecifications().get(1).getChildren().add(specHierarchy);
	}

	private void modifySpecObject10() throws Exception {
		SpecObject specObject = reqIF.getCoreContent().getSpecObjects().get(7);
		AttributeValueString value = (AttributeValueString) ReqIF10Util.getAttributeValueForLabel(specObject, "A2");
		value.setTheValue("O10.A2 once");
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
