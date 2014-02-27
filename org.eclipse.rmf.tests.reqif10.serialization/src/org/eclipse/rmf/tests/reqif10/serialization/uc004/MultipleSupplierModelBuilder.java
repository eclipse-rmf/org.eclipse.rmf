package org.eclipse.rmf.tests.reqif10.serialization.uc004;

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
import org.eclipse.rmf.tests.reqif10.serialization.util.SimpleModelBuilder;

@SuppressWarnings("nls")
public class MultipleSupplierModelBuilder extends SimpleModelBuilder {

	// Convenience
	private static final ReqIF10Factory factory = ReqIF10Factory.eINSTANCE;
	private static GregorianCalendar DATE = new GregorianCalendar(2014, 1, 1);

	private DatatypeDefinitionXHTML t_comment;
	private DatatypeDefinitionEnumeration t_statusOEM;
	private DatatypeDefinitionEnumeration t_statusSupplier;
	private ReqifTool builderTool;
	private DatatypeDefinitionString t_foreignId;
	private DatatypeDefinitionXHTML t_text;

	private AttributeDefinitionString ad_foreignId;
	private AttributeDefinitionXHTML ad_text;
	private Map<ReqifTool, AttributeDefinitionEnumeration> ad_oemStatus = new HashMap<ReqifTool, AttributeDefinitionEnumeration>();
	private Map<ReqifTool, AttributeDefinitionXHTML> ad_oemComment = new HashMap<ReqifTool, AttributeDefinitionXHTML>();

	private SpecObjectType specObjecttype;
	private SpecificationType specType;;

	public MultipleSupplierModelBuilder(ReqifTool tool) throws Exception {
		super("multiple-supplier-test", "Multiple Supplier Test (" + tool + ")");
		builderTool = tool;
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
	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		specObjecttype = factory.createSpecObjectType();
		specObjecttype.setIdentifier("RequirementType");
		specObjecttype.setLastChange(DATE);
		specObjecttype.setLongName("RequirementType");

		createForeignIdDefinition();
		createTextDefinition();

		getReqIF().getCoreContent().getSpecTypes().add(specObjecttype);
		if (builderTool == ReqifTool.ALL_TOOLS) {
			for (ReqifTool tool : ReqifTool.values()) {
				if (tool != ReqifTool.ALL_TOOLS) {
					createSpecObjectTypes(tool);
				}
			}
			return;
		}
		createSpecObjectTypes(builderTool);
	}

	@Override
	public void createSpecObjects() throws Exception {
		for (ReqifTool tool : ReqifTool.values()) {
			if (tool != ReqifTool.ALL_TOOLS) {
				createSpecObject(tool);
			}
		}
	}

	private void createSpecObject(ReqifTool tool) throws Exception {
		SpecObject obj = factory.createSpecObject();
		obj.setIdentifier("SpecObject-" + tool);
		obj.setLongName("SpecObject " + tool);
		obj.setLastChange(DATE);
		obj.setType(specObjecttype);
		getReqIF().getCoreContent().getSpecObjects().add(obj);

		AttributeValueString foreignId = factory.createAttributeValueString();
		foreignId.setDefinition(ad_foreignId);
		foreignId.setTheValue(tool.getForeignId());
		obj.getValues().add(foreignId);

		AttributeValueXHTML text = factory.createAttributeValueXHTML();
		text.setDefinition(ad_text);
		XhtmlContent content = SimpleModelBuilder.createXhtmlValue(tool + " plays the supplier for this requirement.");
		text.setTheValue(content);
		obj.getValues().add(text);

		if (builderTool != ReqifTool.ALL_TOOLS) {
			addSupplierAttributes(obj, tool, builderTool);
		} else {
			for (ReqifTool columnTool : ReqifTool.values()) {
				if (columnTool != ReqifTool.ALL_TOOLS) {
					addSupplierAttributes(obj, tool, columnTool);
				}
			}
		}
	}

	private void addSupplierAttributes(SpecObject obj, ReqifTool rowTool, ReqifTool columnTool) {
		XhtmlContent content;
		AttributeValueXHTML comment = factory.createAttributeValueXHTML();
		comment.setDefinition(ad_oemComment.get(columnTool));
		obj.getValues().add(comment);

		AttributeValueEnumeration oemStatus = factory.createAttributeValueEnumeration();
		oemStatus.setDefinition(ad_oemStatus.get(columnTool));
		obj.getValues().add(oemStatus);

		if (rowTool == columnTool) {
			oemStatus.getValues().add(t_statusOEM.getSpecifiedValues().get(1));
			content = SimpleModelBuilder.createXhtmlValue("Set the Supplier Status to 'Not agreed' and the Supplier Comment to 'Not agreed'");
		} else {
			oemStatus.getValues().add(t_statusOEM.getSpecifiedValues().get(0));
			content = SimpleModelBuilder.createXhtmlValue("Ignore this requirement.");
		}
		comment.setTheValue(content);
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
