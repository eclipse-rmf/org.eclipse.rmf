package org.eclipse.rmf.reqif10.tests.uc000.tc1000;

import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;
import org.eclipse.rmf.reqif10.tests.util.ReqIFContentModelBuilder;

public class TC0001000ContainmentEStructuralFeatureModelBuilder extends ReqIFContentModelBuilder {

	public TC0001000ContainmentEStructuralFeatureModelBuilder() throws Exception {
		super();
	}

	/**
	 * 04 single reference explicitly to nil value
	 */
	@Override
	public void createReqIFHeader() throws Exception {
		getReqIF().setTheHeader(null);
	}

	/**
	 * 08 many reference explicitly set to empty
	 */
	@Override
	public void createToolExtensions() throws Exception {
		ReqIFToolExtension toolExtension = ReqIF10Factory.eINSTANCE.createReqIFToolExtension();
		getReqIF().getToolExtensions().add(toolExtension);
		getReqIF().getToolExtensions().remove(toolExtension);
	}

}
