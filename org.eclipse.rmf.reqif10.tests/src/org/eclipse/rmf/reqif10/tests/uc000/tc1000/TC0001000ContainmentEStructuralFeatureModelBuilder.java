package org.eclipse.rmf.reqif10.tests.uc000.tc1000;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFHeader;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;
import org.eclipse.rmf.reqif10.tests.util.ReqIFContentModelBuilder;

@SuppressWarnings("nls")
public class TC0001000ContainmentEStructuralFeatureModelBuilder extends ReqIFContentModelBuilder {

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

	/**
	 * 08 many reference explicitly set to empty
	 */
	@Override
	public void createToolExtensions() throws Exception {
		EList<ReqIFToolExtension> toolExtensions = getReqIF().getToolExtensions();
		toolExtensions.clear();
	}

}
