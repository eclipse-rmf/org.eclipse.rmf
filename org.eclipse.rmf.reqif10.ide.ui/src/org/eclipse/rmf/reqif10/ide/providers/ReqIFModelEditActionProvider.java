package org.eclipse.rmf.reqif10.ide.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.sphinx.emf.explorer.actions.providers.BasicModelEditActionProvider;

public class ReqIFModelEditActionProvider extends BasicModelEditActionProvider {

	public ReqIFModelEditActionProvider() {
		super();
	}
	
	@Override
	protected AdapterFactory getCustomAdapterFactory() {
		return ReqIF10ItemProviderAdapterFactory.INSTANCE;
	}

}
