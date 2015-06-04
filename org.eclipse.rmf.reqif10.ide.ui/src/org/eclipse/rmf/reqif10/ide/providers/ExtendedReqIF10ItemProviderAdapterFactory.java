package org.eclipse.rmf.reqif10.ide.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.Disposable;
import org.eclipse.rmf.reqif10.provider.ReqIF10ItemProviderAdapterFactory;
import org.eclipse.sphinx.emf.edit.TransientItemProvider;

public class ExtendedReqIF10ItemProviderAdapterFactory extends
		ReqIF10ItemProviderAdapterFactory {
	protected Disposable disposable = new Disposable();

	public ExtendedReqIF10ItemProviderAdapterFactory() {
		super();
	}

	@Override
	public Adapter createReqIFAdapter() {
		if (reqIFItemProvider == null) {
			reqIFItemProvider = new ExtendedReqIFItemProvider(this);
		}
		return reqIFItemProvider;
	}
	
	@Override
	public Object adapt(Object target, Object type) {
		Object adapter = TransientItemProvider.AdapterFactoryHelper.adapt(target, type, this);
		if (adapter != null) {
			disposable.add(adapter);
			return adapter;
		}
		return super.adapt(target, type);
	}

	@Override
	protected Adapter createAdapter(Notifier target, Object type) {
		return super.createAdapter(target, type);
	}

	@Override
	public void dispose() {
		disposable.dispose();
		super.dispose();
	}
	


}
