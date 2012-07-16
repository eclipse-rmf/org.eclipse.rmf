package org.eclipse.rmf.reqif10.tests.uc003.tc18xx;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

@SuppressWarnings("nls")
public class TC1803HISExchangeProcessModelBuilder {

	final static String LAST_CHANGE_STRING_3 = "2012-04-10T01:51:37.112+02:00";
	private ReqIF reqIF;

	public TC1803HISExchangeProcessModelBuilder(ReqIF reqIF) throws Exception {
		this.reqIF = reqIF;
		modifyReqIF();
	}

	private void modifyReqIF() throws Exception {
		// No action for 01 needed
		// 02 does not exist any more
		modifySpecObject03();
		// No action for 04 needed
		createSpecObject05();
		// No action for 06 needed
		deleteSpecObject07();
		// No action for 08 needed
		moveSpecObject09();
	}

	private void modifySpecObject03() throws Exception {
		SpecObject specObject = reqIF.getCoreContent().getSpecObjects().get(1);
		AttributeValueString value = (AttributeValueString) ReqIF10Util.getAttributeValueForLabel(specObject, "A2");
		value.setTheValue("O3.A2 twice");
		specObject.setLastChange(toDate(LAST_CHANGE_STRING_3));
	}

	private void createSpecObject05() throws Exception {
		SpecObjectType specObjectType = (SpecObjectType) reqIF.getCoreContent().getSpecTypes().get(0);
		AttributeValueString attributeValueString;
		AttributeValueXHTML attributeValueXhtml;
		AttributeValueEnumeration attributeValueEnum;

		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier("ID_TC1801_SpecObject05");
		specObject.setLastChange(toDate(LAST_CHANGE_STRING_3));
		specObject.setType(specObjectType);

		attributeValueXhtml = ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
		attributeValueXhtml.setDefinition((AttributeDefinitionXHTML) specObjectType.getSpecAttributes().get(0));
		attributeValueXhtml.setTheValue(TC1800HISExchangeProcessModelBuilder.createXhtmlValue("Obj-05"));
		specObject.getValues().add(attributeValueXhtml);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition((AttributeDefinitionString) specObjectType.getSpecAttributes().get(1));
		attributeValueString.setTheValue("no change");
		specObject.getValues().add(attributeValueString);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition((AttributeDefinitionString) specObjectType.getSpecAttributes().get(2));
		attributeValueString.setTheValue("no change");
		specObject.getValues().add(attributeValueString);

		attributeValueEnum = ReqIF10Factory.eINSTANCE.createAttributeValueEnumeration();
		AttributeDefinitionEnumeration enumeration = (AttributeDefinitionEnumeration) specObjectType.getSpecAttributes().get(3);
		attributeValueEnum.setDefinition(enumeration);
		attributeValueEnum.getValues().add(enumeration.getType().getSpecifiedValues().get(0));
		specObject.getValues().add(attributeValueEnum);

		getReqIF().getCoreContent().getSpecObjects().add(3, specObject);

		SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setLastChange(toDate(LAST_CHANGE_STRING_3));
		specHierarchy.setIdentifier("ID_TC1801_SpecHierarchy-" + specObject.getIdentifier());
		specHierarchy.setObject(specObject);

		reqIF.getCoreContent().getSpecifications().get(0).getChildren().add(3, specHierarchy);
	}

	private void deleteSpecObject07() {
		reqIF.getCoreContent().getSpecObjects().remove(4);
		reqIF.getCoreContent().getSpecifications().get(0).getChildren().remove(4);
	}

	private void moveSpecObject09() throws Exception {
		// Remove from Spec 1...

		SpecObject specObject = reqIF.getCoreContent().getSpecifications().get(0).getChildren().get(4).getObject();
		reqIF.getCoreContent().getSpecifications().get(0).getChildren().remove(4);

		// ... and add to Spec 2
		SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setLastChange(toDate(LAST_CHANGE_STRING_3));
		specHierarchy.setIdentifier("ID_TC1801_SpecHierarchy-" + specObject.getIdentifier());
		specHierarchy.setObject(specObject);

		reqIF.getCoreContent().getSpecifications().get(1).getChildren().add(specHierarchy);
	}

	public ReqIF getReqIF() {
		return reqIF;
	}

	public XMLGregorianCalendar toDate(String date) throws DatatypeConfigurationException {
		XMLGregorianCalendar xmlGregoriaCalendar = (XMLGregorianCalendar) EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getDateTime(), date);
		return xmlGregoriaCalendar;
	}

}
