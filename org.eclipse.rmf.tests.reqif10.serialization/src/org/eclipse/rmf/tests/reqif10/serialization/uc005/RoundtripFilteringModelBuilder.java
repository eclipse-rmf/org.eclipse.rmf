package org.eclipse.rmf.tests.reqif10.serialization.uc005;

import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML;
import org.eclipse.rmf.reqif10.EmbeddedValue;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.tests.reqif10.serialization.uc004.ReqifTool;
import org.eclipse.rmf.tests.reqif10.serialization.util.SimpleModelBuilder;

@SuppressWarnings("nls")
public class RoundtripFilteringModelBuilder extends SimpleModelBuilder {

	// Convenience
	private static final ReqIF10Factory factory = ReqIF10Factory.eINSTANCE;
	private static GregorianCalendar DATE = new GregorianCalendar(2014, 1, 1);

	private DatatypeDefinitionXHTML t_comment;
	private DatatypeDefinitionEnumeration t_statusOEM;
	private DatatypeDefinitionEnumeration t_statusSupplier;
	private DatatypeDefinitionString t_foreignId;
	private DatatypeDefinitionXHTML t_text;
	private DatatypeDefinitionEnumeration t_variant;

	private AttributeDefinitionString ad_foreignId;
	private AttributeDefinitionXHTML ad_text;
	private Map<ReqifTool, AttributeDefinitionEnumeration> ad_oemStatus = new HashMap<ReqifTool, AttributeDefinitionEnumeration>();
	private Map<ReqifTool, AttributeDefinitionXHTML> ad_oemComment = new HashMap<ReqifTool, AttributeDefinitionXHTML>();

	private SpecObjectType specObjecttype;
	private SpecificationType specType;
	private AttributeDefinitionEnumeration ad_variant;
	private AttributeDefinitionXHTML ad_internal;;

	public RoundtripFilteringModelBuilder() throws Exception {
		super("multiple-supplier-test", "Roundtrip Filtering Test");
		getReqIF().getTheHeader().setCreationTime(DATE);
	}

	/**
	 * Two datatypes: Enumeration and XHTML
	 */
	@Override
	public void createDatatypes() throws Exception {
		createDatatypeComment();
		createDatatypeText();
		createDatatypeForeignId();
		createDatatypeStatusOEM();
		createDatatypeStatusSupplier();
		createDatatypeVariant();
	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		specObjecttype = factory.createSpecObjectType();
		specObjecttype.setIdentifier("RequirementType");
		specObjecttype.setLastChange(DATE);
		specObjecttype.setLongName("RequirementType");

		createForeignIdDefinition();
		createTextDefinition();
		createVariantDefinition();
		createInternalDefinition();

		getReqIF().getCoreContent().getSpecTypes().add(specObjecttype);
		for (ReqifTool tool : ReqifTool.values()) {
			if (tool != ReqifTool.ALL_TOOLS) {
				createSpecObjectTypes(tool);
			}
		}
		return;
	}

	@Override
	public void createSpecObjects() throws Exception {
		createSpecObject("REQ-1", "Steering Wheel Spec", 0b111, null);
		createSpecObject("REQ-2", "The diameter of the steering wheel must be 320mm", 0b111,
				"320mm is optimal according to our newest top secret study");
		createSpecObject("REQ-3", "The steering wheel will have an airbag. Carry-Over-Part Nr: 0012.444.WHL.AB", 0b111, null);
		createSpecObject("REQ-4", "The rim cover has to be constructed out of plastics", 0b001, "Supplier xy fails to reach the quality we need");
		createSpecObject("REQ-5", "The rim cover must be a leather wrapping", 0b010, null);
		createSpecObject("REQ-6", "The rim cover must be a leather wrapping and wooden veener on top and bottom", 0b100, null);
		createSpecObject("REQ-7", "Audio and display functions must be controllable via buttons on the steering wheel", 0b110, null);
	}

	private void createSpecObject(String id, String desc, int variant, String internalKnowHow) throws Exception {
		SpecObject obj = factory.createSpecObject();
		obj.setIdentifier(id);
		obj.setLongName("SpecObject " + id);
		obj.setLastChange(DATE);
		obj.setType(specObjecttype);
		getReqIF().getCoreContent().getSpecObjects().add(obj);

		AttributeValueString foreignId = factory.createAttributeValueString();
		foreignId.setDefinition(ad_foreignId);
		foreignId.setTheValue(id);
		obj.getValues().add(foreignId);

		AttributeValueXHTML text = factory.createAttributeValueXHTML();
		text.setDefinition(ad_text);
		XhtmlContent content = SimpleModelBuilder.createXhtmlValue(desc);
		text.setTheValue(content);
		obj.getValues().add(text);

		if (internalKnowHow != null) {
			AttributeValueXHTML internal = factory.createAttributeValueXHTML();
			internal.setDefinition(ad_internal);
			content = SimpleModelBuilder.createXhtmlValue(internalKnowHow);
			internal.setTheValue(content);
			obj.getValues().add(internal);
		}

		AttributeValueEnumeration v = factory.createAttributeValueEnumeration();
		v.setDefinition(ad_variant);
		obj.getValues().add(v);
		for (int i = 0; i < 3; i++) {
			int bit = variant >> i & 0b1;
			if (bit == 1) {
				v.getValues().add(t_variant.getSpecifiedValues().get(i));
			}
		}

	}

	@Override
	public void createSpecifications() throws Exception {
		Specification spec = factory.createSpecification();
		spec.setIdentifier("specification");
		spec.setLongName("specification");
		spec.setLastChange(DATE);
		spec.setType(specType);
		getReqIF().getCoreContent().getSpecifications().add(spec);

		for (SpecObject object : getReqIF().getCoreContent().getSpecObjects()) {
			SpecHierarchy sh = factory.createSpecHierarchy();
			sh.setObject(object);
			sh.setIdentifier("sh-" + object.getIdentifier());
			sh.setLongName("sh-" + object.getIdentifier());
			sh.setLastChange(DATE);
			spec.getChildren().add(sh);
		}
	}

	private void createDatatypeComment() throws Exception {
		t_comment = factory.createDatatypeDefinitionXHTML();
		t_comment.setLongName("T_Comment");
		t_comment.setIdentifier("T_Comment");
		t_comment.setLastChange(DATE);
		getReqIF().getCoreContent().getDatatypes().add(t_comment);
	}

	private void createDatatypeText() throws Exception {
		t_text = factory.createDatatypeDefinitionXHTML();
		t_text.setLongName("T_Text");
		t_text.setIdentifier("T_Text");
		t_text.setLastChange(DATE);
		getReqIF().getCoreContent().getDatatypes().add(t_text);
	}

	private void createDatatypeForeignId() throws Exception {
		t_foreignId = factory.createDatatypeDefinitionString();
		t_foreignId.setLongName("T_ForeignId");
		t_foreignId.setIdentifier("T_ForeignId");
		t_foreignId.setLastChange(DATE);
		t_foreignId.setMaxLength(BigInteger.valueOf(255));
		getReqIF().getCoreContent().getDatatypes().add(t_foreignId);
	}

	private void createDatatypeStatusOEM() throws Exception {
		t_statusOEM = factory.createDatatypeDefinitionEnumeration();
		t_statusOEM.setLongName("T_Status_OEM");
		t_statusOEM.setIdentifier("T_Status_OEM");
		t_statusOEM.setLastChange(DATE);
		addEnum(t_statusOEM, 10, "Not to evaluate");
		addEnum(t_statusOEM, 11, "To evaluate");
		addEnum(t_statusOEM, 12, "Accepted");
		addEnum(t_statusOEM, 13, "Not accepted");
		getReqIF().getCoreContent().getDatatypes().add(t_statusOEM);
	}

	private void createDatatypeStatusSupplier() throws Exception {
		t_statusSupplier = factory.createDatatypeDefinitionEnumeration();
		t_statusSupplier.setLongName("T_Status_Supplier");
		t_statusSupplier.setIdentifier("T_Status_Supplier");
		t_statusSupplier.setLastChange(DATE);
		addEnum(t_statusSupplier, 20, "To be clarified");
		addEnum(t_statusSupplier, 21, "Agreed");
		addEnum(t_statusSupplier, 22, "Not agreed");
		addEnum(t_statusSupplier, 23, "Partly agreed");
		getReqIF().getCoreContent().getDatatypes().add(t_statusSupplier);
	}

	private void createDatatypeVariant() throws Exception {
		t_variant = factory.createDatatypeDefinitionEnumeration();
		t_variant.setLongName("T_Variant");
		t_variant.setIdentifier("T_Variant");
		t_variant.setLastChange(DATE);
		addEnum(t_variant, 30, "LO");
		addEnum(t_variant, 31, "MID");
		addEnum(t_variant, 32, "HI");
		getReqIF().getCoreContent().getDatatypes().add(t_variant);
	}

	private void addEnum(DatatypeDefinitionEnumeration enumeration, long key, String value) {
		EnumValue enumValue = factory.createEnumValue();
		enumValue.setIdentifier("id-" + key);
		enumValue.setLongName(value);
		enumValue.setLastChange(DATE);
		EmbeddedValue embeddedValue = factory.createEmbeddedValue();
		embeddedValue.setKey(BigInteger.valueOf(key));
		embeddedValue.setOtherContent("otherContent-" + key);
		enumValue.setProperties(embeddedValue);
		enumeration.getSpecifiedValues().add(enumValue);
	}

	private void createTextDefinition() {
		ad_text = factory.createAttributeDefinitionXHTML();
		ad_text.setLongName("ReqIF.Text");
		ad_text.setIdentifier("ReqIF.Text");
		ad_text.setLastChange(DATE);
		ad_text.setType(t_text);
		specObjecttype.getSpecAttributes().add(ad_text);
	}

	private void createInternalDefinition() {
		ad_internal = factory.createAttributeDefinitionXHTML();
		ad_internal.setLongName("Internal Know-How");
		ad_internal.setIdentifier("InternalKnowHow");
		ad_internal.setLastChange(DATE);
		ad_internal.setType(t_text);
		specObjecttype.getSpecAttributes().add(ad_internal);
	}

	private void createVariantDefinition() {
		ad_variant = factory.createAttributeDefinitionEnumeration();
		ad_variant.setLongName("Variant");
		ad_variant.setIdentifier("Variant");
		ad_variant.setLastChange(DATE);
		ad_variant.setType(t_variant);
		ad_variant.setMultiValued(true);
		specObjecttype.getSpecAttributes().add(ad_variant);
	}

	private void createForeignIdDefinition() {
		ad_foreignId = factory.createAttributeDefinitionString();
		ad_foreignId.setLongName("ReqIF.ForeignID");
		ad_foreignId.setIdentifier("ReqIF.ForeignID");
		ad_foreignId.setLastChange(DATE);
		ad_foreignId.setType(t_foreignId);
		specObjecttype.getSpecAttributes().add(ad_foreignId);
	}

	private void createSpecObjectTypes(ReqifTool tool) throws Exception {
		AttributeDefinitionEnumeration oem_status = factory.createAttributeDefinitionEnumeration();
		oem_status.setLastChange(DATE);
		oem_status.setIdentifier("oem-status-" + tool);
		oem_status.setLongName("OEM Status " + tool);
		oem_status.setType(t_statusOEM);
		oem_status.setMultiValued(false);
		specObjecttype.getSpecAttributes().add(oem_status);
		ad_oemStatus.put(tool, oem_status);

		AttributeDefinitionXHTML oem_comment = factory.createAttributeDefinitionXHTML();
		oem_comment.setLastChange(DATE);
		oem_comment.setIdentifier("oem-comment-" + tool);
		oem_comment.setLongName("OEM Comment " + tool);
		oem_comment.setType(t_comment);
		specObjecttype.getSpecAttributes().add(oem_comment);
		ad_oemComment.put(tool, oem_comment);

		AttributeDefinitionEnumeration supplier_status = factory.createAttributeDefinitionEnumeration();
		supplier_status.setLastChange(DATE);
		supplier_status.setIdentifier("supplier-status-" + tool);
		supplier_status.setLongName("Supplier Status " + tool);
		supplier_status.setType(t_statusSupplier);
		supplier_status.setMultiValued(false);
		specObjecttype.getSpecAttributes().add(supplier_status);

		AttributeDefinitionXHTML supplier_comment = factory.createAttributeDefinitionXHTML();
		supplier_comment.setLastChange(DATE);
		supplier_comment.setIdentifier("supplier-comment-" + tool);
		supplier_comment.setLongName("Supplier Comment " + tool);
		supplier_comment.setType(t_comment);
		specObjecttype.getSpecAttributes().add(supplier_comment);
	}

	@Override
	public void createSpecificationTypes() throws Exception {
		specType = factory.createSpecificationType();
		specType.setIdentifier("specType");
		specType.setLongName("specType");
		specType.setLastChange(DATE);
		getReqIF().getCoreContent().getSpecTypes().add(specType);
	}
}
