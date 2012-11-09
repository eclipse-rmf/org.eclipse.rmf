package org.eclipse.rmf.reqif10.tests.uc001.tc1250;

import java.math.BigInteger;

import javax.xml.datatype.DatatypeConfigurationException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.tests.util.SimpleModelBuilder;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlFactory;
import org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType;

@SuppressWarnings("nls")
public class TC1250ExternalFilesBuilder extends SimpleModelBuilder {
	final static String LAST_CHANGE_STRING = "2012-04-07T01:51:37.112+02:00";
	final static String TEST_CASE_ID = "TC1700";

	// datatypes
	DatatypeDefinitionXHTML datatypeDefinitionXhtml;

	// SpecObjectTypes
	SpecObjectType specObjectType;
	AttributeDefinitionXHTML attributeDefinitionXhtml;

	// SpecificationTypes
	SpecificationType specificationType;

	// SpecObjects
	SpecObject specObject1;
	SpecObject specObject2;
	SpecObject specObject3;
	SpecObject specObject4;
	SpecObject specObject5;
	SpecObject specObject6;
	SpecObject specObject7;

	// Specifications
	Specification specification;

	public TC1250ExternalFilesBuilder() throws Exception {
		super("ID_TC1250_ExternalFiles", "TC 1250 'External Files'");
	}

	@Override
	public void createDatatypes() throws Exception {
		datatypeDefinitionXhtml = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionXHTML();
		datatypeDefinitionXhtml.setIdentifier("ID_TC1250_DatatypeDefinitionXhtml");
		datatypeDefinitionXhtml.setLongName("ReqIF.Name");
		datatypeDefinitionXhtml.setLastChange(toDate(LAST_CHANGE_STRING));

		EList<DatatypeDefinition> datatypes = getReqIF().getCoreContent().getDatatypes();
		datatypes.add(datatypeDefinitionXhtml);

	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setIdentifier("ID_TC1250_SpecObjectType");
		specObjectType.setLongName("TC1250 SpecObjectType");
		specObjectType.setLastChange(toDate(LAST_CHANGE_STRING));

		attributeDefinitionXhtml = ReqIF10Factory.eINSTANCE.createAttributeDefinitionXHTML();
		attributeDefinitionXhtml.setIdentifier("ID_TC1250_AttributeDefinitionXhtml");
		attributeDefinitionXhtml.setLongName("TC1250 XHTML");
		attributeDefinitionXhtml.setLastChange(toDate(LAST_CHANGE_STRING));
		attributeDefinitionXhtml.setType(datatypeDefinitionXhtml);

		specObjectType.getSpecAttributes().add(attributeDefinitionXhtml);

		getReqIF().getCoreContent().getSpecTypes().add(specObjectType);

	}

	@Override
	public void createSpecificationTypes() throws Exception {
		specificationType = ReqIF10Factory.eINSTANCE.createSpecificationType();
		specificationType.setIdentifier("ID_TC1250_SpecificationType");
		specificationType.setLongName("TC1250 SpecificationType");
		specificationType.setLastChange(toDate(LAST_CHANGE_STRING));
		getReqIF().getCoreContent().getSpecTypes().add(specificationType);
	}

	@Override
	public void createSpecifications() throws Exception {
		specification = ReqIF10Factory.eINSTANCE.createSpecification();
		specification.setIdentifier("ID_TC1250_Specification");
		specification.setType(specificationType);
		specification.setLastChange(toDate(LAST_CHANGE_STRING));
		getReqIF().getCoreContent().getSpecifications().add(specification);

		// TODO: Build the 7 elements
		addSpecHierarchy(specObject1);
		addSpecHierarchy(specObject2);
		addSpecHierarchy(specObject3);
		addSpecHierarchy(specObject4);
		addSpecHierarchy(specObject5);
		addSpecHierarchy(specObject6);
		addSpecHierarchy(specObject7);
	}

	private SpecHierarchy addSpecHierarchy(SpecObject specObject) throws DatatypeConfigurationException {
		SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setIdentifier("sh-for-" + specObject.getIdentifier());
		specHierarchy.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy.setObject(specObject);
		specification.getChildren().add(specHierarchy);
		return specHierarchy;
	}

	@Override
	public void createSpecObjects() throws Exception {
		specObject1 = buildImage(1, "rmf-logo-300.png", 300, 131);
		specObject2 = buildSpecObject(2, "Microsoft Word", "word", ".doc", "application/msword");
		specObject3 = buildSpecObject(3, "Microsoft Word", "word", ".docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
		specObject4 = buildSpecObject(4, "Microsoft Excel", "excel", ".xls", "application/vnd.ms-excel");
		specObject5 = buildSpecObject(5, "Microsoft Excel", "excel", ".xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		specObject6 = buildSpecObject(6, "Microsoft Powerpoint", "powerpoint", ".ppt", "application/vnd.ms-powerpoint");
		specObject7 = buildSpecObject(7, "Microsoft Powerpoint", "powerpoint", ".pptx",
				"application/vnd.openxmlformats-officedocument.presentationml.presentation");
	}

	private SpecObject buildImage(int i, String filename, int width, int height) throws Exception {
		// specObject
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier("ID_TC1250_SpecObject" + i);
		specObject.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject.setType(specObjectType);

		AttributeValueXHTML attributeValueXhtml = ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
		attributeValueXhtml.setDefinition(attributeDefinitionXhtml);
		specObject.getValues().add(attributeValueXhtml);

		XhtmlContent xhtmlContent = ReqIF10Factory.eINSTANCE.createXhtmlContent();
		XhtmlDivType div = XhtmlFactory.eINSTANCE.createXhtmlDivType();

		XhtmlObjectType img = XhtmlFactory.eINSTANCE.createXhtmlObjectType();
		img.setType("image/png");
		img.setData("files/" + filename);
		img.setWidth(new BigInteger(width + ""));
		img.setHeight(new BigInteger(height + ""));
		div.getObject().add(img);

		xhtmlContent.setDiv(div);
		attributeValueXhtml.setTheValue(xhtmlContent);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		return specObject;
	}

	private SpecObject buildSpecObject(int i, String fullName, String baseFileName, String extension, String type) throws Exception {

		// specObject
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier("ID_TC1250_SpecObject" + i);
		specObject.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject.setType(specObjectType);

		AttributeValueXHTML attributeValueXhtml = ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
		attributeValueXhtml.setDefinition(attributeDefinitionXhtml);
		specObject.getValues().add(attributeValueXhtml);

		XhtmlContent xhtmlContent = ReqIF10Factory.eINSTANCE.createXhtmlContent();
		XhtmlDivType div = XhtmlFactory.eINSTANCE.createXhtmlDivType();
		div.getDiv().add(makeLabel("START", fullName, extension));

		// The actual Object
		XhtmlObjectType obj = XhtmlFactory.eINSTANCE.createXhtmlObjectType();
		obj.setType(type);
		obj.setData("files/" + baseFileName + extension);
		obj.setWidth(new BigInteger("96"));
		obj.setHeight(new BigInteger("96"));
		div.getObject().add(obj);

		// The Object's screenshot and alt text
		XhtmlObjectType img = XhtmlFactory.eINSTANCE.createXhtmlObjectType();
		img.setType("image/png");
		img.setData("files/" + baseFileName + ".png");
		img.setWidth(new BigInteger("96"));
		img.setHeight(new BigInteger("96"));
		img.getMixed().add(FeatureMapUtil.createTextEntry("This text is shown if altenative image can't be shown:" + baseFileName + extension));
		obj.getObject().add(img);

		div.getDiv().add(makeLabel("END", fullName, extension));

		xhtmlContent.setDiv(div);
		attributeValueXhtml.setTheValue(xhtmlContent);

		getReqIF().getCoreContent().getSpecObjects().add(specObject);
		return specObject;
	}

	private XhtmlDivType makeLabel(String label, String name, String extension) {
		XhtmlStrongType strong = XhtmlFactory.eINSTANCE.createXhtmlStrongType();
		strong.getXhtmlInlineMix().add(FeatureMapUtil.createTextEntry(name + "(" + extension + ")"));

		XhtmlDivType div = XhtmlFactory.eINSTANCE.createXhtmlDivType();
		div.getXhtmlFlowMix().add(FeatureMapUtil.createTextEntry(label + " -- "));
		div.getStrong().add(strong);
		div.getXhtmlFlowMix().add(FeatureMapUtil.createTextEntry(" -- " + label));
		return div;
	}
}
