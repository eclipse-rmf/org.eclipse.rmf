package org.eclipse.rmf.tests.reqif10.serialization.uc006;

import java.io.IOException;
import java.math.BigInteger;
import java.util.GregorianCalendar;

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
import org.eclipse.rmf.reqif10.common.util.ReqIF10XHtmlContentAdapter;
import org.eclipse.rmf.reqif10.common.util.ReqIF10XHtmlContentAdapterFactory;
import org.eclipse.rmf.tests.reqif10.serialization.util.SimpleModelBuilder;

@SuppressWarnings("nls")
public class RichTextModelBuilder extends SimpleModelBuilder {

	// Convenience
	private static final ReqIF10Factory factory = ReqIF10Factory.eINSTANCE;
	private static GregorianCalendar DATE = new GregorianCalendar(2014, 8, 1);

	private DatatypeDefinitionString t_kind;
	private DatatypeDefinitionXHTML t_xhtml;
	private DatatypeDefinitionEnumeration t_recommended;
	private DatatypeDefinitionString t_description;

	private AttributeDefinitionString ad_kind;
	private AttributeDefinitionXHTML ad_xhtml;
	private AttributeDefinitionEnumeration ad_recommended;
	private AttributeDefinitionString ad_description;

	private SpecObjectType specObjecttype;
	private SpecificationType specType;

	public RichTextModelBuilder() throws Exception {
		super("rich-test", "XHTML Test");
		getReqIF().getTheHeader().setCreationTime(DATE);
	}

	/**
	 * Two datatypes: Enumeration and XHTML
	 */
	@Override
	public void createDatatypes() throws Exception {
		createDatatypeKind();
		createDatatypeXHTML();
		createDatatypeRecommended();
		createDatatypeDescription();
	}

	private void createDatatypeKind() throws Exception {
		t_kind = factory.createDatatypeDefinitionString();
		t_kind.setLongName("T_Kind");
		t_kind.setIdentifier("T_Kind");
		t_kind.setLastChange(DATE);
		t_kind.setMaxLength(new BigInteger("1000"));
		getReqIF().getCoreContent().getDatatypes().add(t_kind);
	}

	private void createDatatypeXHTML() throws Exception {
		t_xhtml = factory.createDatatypeDefinitionXHTML();
		t_xhtml.setLongName("T_Xhtml");
		t_xhtml.setIdentifier("T_Xhtml");
		t_xhtml.setLastChange(DATE);
		getReqIF().getCoreContent().getDatatypes().add(t_xhtml);
	}

	private void createDatatypeRecommended() throws Exception {
		t_recommended = factory.createDatatypeDefinitionEnumeration();
		t_recommended.setLongName("T_Recommended");
		t_recommended.setIdentifier("T_Recommended");
		t_recommended.setLastChange(DATE);
		addEnum(t_recommended, 1, "Recommended");
		addEnum(t_recommended, 2, "Not Recommended");
		getReqIF().getCoreContent().getDatatypes().add(t_recommended);
	}

	private void createDatatypeDescription() throws Exception {
		t_description = factory.createDatatypeDefinitionString();
		t_description.setLongName("T_Description");
		t_description.setIdentifier("T_Description");
		t_description.setLastChange(DATE);
		t_description.setMaxLength(new BigInteger("1000"));
		getReqIF().getCoreContent().getDatatypes().add(t_description);
	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		specObjecttype = factory.createSpecObjectType();
		specObjecttype.setIdentifier("RequirementType");
		specObjecttype.setLastChange(DATE);
		specObjecttype.setLongName("RequirementType");

		createKindDefinition();
		createXhtmlDefinition();
		createRecommendedDefinition();
		createDescriptionDefinition();

		getReqIF().getCoreContent().getSpecTypes().add(specObjecttype);
	}

	private void createKindDefinition() {
		ad_kind = factory.createAttributeDefinitionString();
		ad_kind.setLongName("Kind");
		ad_kind.setIdentifier("Kind");
		ad_kind.setLastChange(DATE);
		ad_kind.setType(t_kind);
		specObjecttype.getSpecAttributes().add(ad_kind);
	}

	private void createXhtmlDefinition() {
		ad_xhtml = factory.createAttributeDefinitionXHTML();
		ad_xhtml.setLongName("ReqIF.Text");
		ad_xhtml.setIdentifier("ReqIF.Text");
		ad_xhtml.setLastChange(DATE);
		ad_xhtml.setType(t_xhtml);
		specObjecttype.getSpecAttributes().add(ad_xhtml);
	}

	private void createRecommendedDefinition() {
		ad_recommended = factory.createAttributeDefinitionEnumeration();
		ad_recommended.setLongName("Recommended");
		ad_recommended.setIdentifier("Recommended");
		ad_recommended.setLastChange(DATE);
		ad_recommended.setType(t_recommended);
		ad_recommended.setMultiValued(false);
		specObjecttype.getSpecAttributes().add(ad_recommended);
	}

	private void createDescriptionDefinition() {
		ad_description = factory.createAttributeDefinitionString();
		ad_description.setLongName("Description");
		ad_description.setIdentifier("Description");
		ad_description.setLastChange(DATE);
		ad_description.setType(t_description);
		specObjecttype.getSpecAttributes().add(ad_description);
	}

	@Override
	public void createSpecObjects() throws Exception {
		createSpecObject("so-01", "Bold Text", getXhtmlContent("<div><b>Bold</b></div>"), true,
				"(standard element for bold in XHTML). Represented by using the <b> element.");
	}

	private void createSpecObject(String id, String kind, XhtmlContent xhtml, boolean recommended, String description) throws Exception {
		SpecObject obj = factory.createSpecObject();
		obj.setIdentifier(id);
		obj.setLongName("SpecObject: " + id);
		obj.setLastChange(DATE);
		obj.setType(specObjecttype);
		getReqIF().getCoreContent().getSpecObjects().add(obj);

		AttributeValueString kindAV = factory.createAttributeValueString();
		kindAV.setDefinition(ad_kind);
		kindAV.setTheValue(kind);
		obj.getValues().add(kindAV);

		AttributeValueXHTML xhtmlAV = factory.createAttributeValueXHTML();
		xhtmlAV.setDefinition(ad_xhtml);
		xhtmlAV.setTheValue(xhtml);
		obj.getValues().add(xhtmlAV);

		AttributeValueEnumeration recommendedAV = factory.createAttributeValueEnumeration();
		recommendedAV.setDefinition(ad_recommended);
		if (recommended) {
			recommendedAV.getValues().add(t_recommended.getSpecifiedValues().get(0));
		} else {
			recommendedAV.getValues().add(t_recommended.getSpecifiedValues().get(1));
		}
		obj.getValues().add(recommendedAV);

		AttributeValueString descriptionAV = factory.createAttributeValueString();
		descriptionAV.setDefinition(ad_description);
		descriptionAV.setTheValue(description);
		obj.getValues().add(descriptionAV);
	}

	@Override
	public void createSpecificationTypes() throws Exception {
		specType = factory.createSpecificationType();
		specType.setIdentifier("specType");
		specType.setLongName("specType");
		specType.setLastChange(DATE);
		getReqIF().getCoreContent().getSpecTypes().add(specType);
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

	public static XhtmlContent getXhtmlContent(String html) throws IOException {
		ReqIF10XHtmlContentAdapterFactory factory = new ReqIF10XHtmlContentAdapterFactory();
		XhtmlContent xhtmlContent = ReqIF10Factory.eINSTANCE.createXhtmlContent();
		ReqIF10XHtmlContentAdapter adapter = (ReqIF10XHtmlContentAdapter) factory.adapt(xhtmlContent, ReqIF10XHtmlContentAdapter.class);
		adapter.setXhtmlString(html);
		return xhtmlContent;
	}

}
