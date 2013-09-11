package org.eclipse.rmf.tests.reqif10.serialization.uc000.tc1002;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFHeader;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.impl.ReqIF10FactoryImpl;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlFactory;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;
import org.eclipse.rmf.tests.reqif10.serialization.util.ReqIFContentModelBuilder;

@SuppressWarnings("nls")
public class TC0001002XhtmlModelBuilder extends ReqIFContentModelBuilder {

	DatatypeDefinitionBoolean datatypeDefinitionBoolean;

	public TC0001002XhtmlModelBuilder() throws Exception {
		super();
	}

	/**
	 * 
	 */
	@Override
	public void createReqIFHeader() throws Exception {
		ReqIFHeader reqIFHeader = ReqIF10Factory.eINSTANCE.createReqIFHeader();
		getReqIF().setTheHeader(reqIFHeader);
	}

	@Override
	public void createSpecObjects() throws Exception {
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier("specObject");
		
		AttributeValueXHTML valueXhtml = ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
		XhtmlContent xhtmlContent = ReqIF10Factory.eINSTANCE.createXhtmlContent();
		XhtmlDivType div = XhtmlFactory.eINSTANCE.createXhtmlDivType();
		
		FeatureMap featureMap = div.getMixed();
		FeatureMapUtil.addText(featureMap, "text before h1");
		XhtmlH1Type h1 = XhtmlFactory.eINSTANCE.createXhtmlH1Type();
		div.getH1().add(h1);
		FeatureMapUtil.addText(featureMap, "text after h1");
		
		xhtmlContent.setXhtml(div);
		valueXhtml.setTheValue(xhtmlContent);
		specObject.getValues().add(valueXhtml);
		
		getReqIF().getCoreContent().getSpecObjects().add(specObject);
	}
}
