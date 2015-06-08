package org.eclipse.rmf.reqif10.ide.providers;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

public class ReqIF10ItemProviderAdapterFactory extends ComposedAdapterFactory {

	/**
	 * Singleton instance.
	 */
	public static final ReqIF10ItemProviderAdapterFactory INSTANCE = new ReqIF10ItemProviderAdapterFactory();

	public ReqIF10ItemProviderAdapterFactory() {
		super(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		addAdapterFactory(new ExtendedReqIF10ItemProviderAdapterFactory());
	}

}
