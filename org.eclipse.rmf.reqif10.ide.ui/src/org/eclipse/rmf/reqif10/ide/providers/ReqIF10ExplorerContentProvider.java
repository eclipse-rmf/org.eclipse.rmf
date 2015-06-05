package org.eclipse.rmf.reqif10.ide.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.sphinx.emf.explorer.BasicExplorerContentProvider;

public class ReqIF10ExplorerContentProvider extends BasicExplorerContentProvider {

	@Override
	protected AdapterFactory getCustomAdapterFactory() {
		return new ReqIF10ItemProviderAdapterFactory();
	}
	
}
