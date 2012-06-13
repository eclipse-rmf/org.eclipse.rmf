package org.eclipse.rmf.reqif10.tests.uc000.tc1000;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFHeader;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.tests.util.ReqIFContentModelBuilder;

@SuppressWarnings("nls")
public class TC0001000ContainmentEStructuralFeatureModelBuilder extends ReqIFContentModelBuilder {

	DatatypeDefinitionBoolean datatypeDefinitionBoolean;

	public TC0001000ContainmentEStructuralFeatureModelBuilder() throws Exception {
		super();
	}

	/**
	 * 
	 */
	@Override
	public void createReqIFHeader() throws Exception {
		ReqIFHeader reqIFHeader = ReqIF10Factory.eINSTANCE.createReqIFHeader();
		// ID=10, attribute, isMany=false, isSet=false, isDefault=true
		// don't set comment

		// ID=11, attribute, isMany=false, isSet=true, isDefault=false
		reqIFHeader.setIdentifier("identifier");

		// ID=12, attribute, isMany=false, isSet=true, isDefault=true
		reqIFHeader.setTitle(null);

		// ID=3, reference, isMany=false, isSet=true, isDefault=false
		getReqIF().setTheHeader(reqIFHeader);
	}

	@Override
	public void createToolExtensions() throws Exception {
		EList<ReqIFToolExtension> toolExtensions = getReqIF().getToolExtensions();
		// ID=8, reference, isMany=true, isSet=true, isDefault=true
		toolExtensions.clear();
	}

	@Override
	public void createDatatypes() throws Exception {
		datatypeDefinitionBoolean = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionBoolean();
		datatypeDefinitionBoolean.setIdentifier("datatypeDefinitionBoolean");
		getReqIF().getCoreContent().getDatatypes().add(datatypeDefinitionBoolean);
	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		SpecObjectType specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setIdentifier("specObjectType");

		AttributeDefinitionBoolean attributeDefinitionBooleanWithoutDefault = ReqIF10Factory.eINSTANCE.createAttributeDefinitionBoolean();
		attributeDefinitionBooleanWithoutDefault.setIdentifier("attributeDefinitionBooleanWithoutDefault");
		attributeDefinitionBooleanWithoutDefault.setType(datatypeDefinitionBoolean);
		specObjectType.getSpecAttributes().add(attributeDefinitionBooleanWithoutDefault);

		AttributeDefinitionBoolean attributeDefinitionBooleanWithDefault = ReqIF10Factory.eINSTANCE.createAttributeDefinitionBoolean();
		attributeDefinitionBooleanWithDefault.setIdentifier("attributeDefinitionBooleanWithDefault");
		attributeDefinitionBooleanWithDefault.setType(datatypeDefinitionBoolean);
		attributeDefinitionBooleanWithDefault.setDefaultValue(null);
		specObjectType.getSpecAttributes().add(attributeDefinitionBooleanWithDefault);

		getReqIF().getCoreContent().getSpecTypes().add(specObjectType);
	}
}
