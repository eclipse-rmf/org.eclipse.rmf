package org.eclipse.rmf.reqif10.ide.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.sphinx.emf.explorer.BasicExplorerLabelProvider;

public class ReqIFExplorerLabelProvider extends BasicExplorerLabelProvider {

	public ReqIFExplorerLabelProvider() {
	}
	

	@Override
	protected AdapterFactory getCustomAdapterFactory() {
		return ReqIF10ItemProviderAdapterFactory.INSTANCE;
	}

}
