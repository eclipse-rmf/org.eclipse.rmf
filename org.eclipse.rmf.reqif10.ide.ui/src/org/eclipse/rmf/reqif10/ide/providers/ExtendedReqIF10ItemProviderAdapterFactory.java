package org.eclipse.rmf.reqif10.ide.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.Disposable;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionBooleanItemProvider;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionDateItemProvider;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionEnumerationItemProvider;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionIntegerItemProvider;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionRealItemProvider;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionStringItemProvider;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionXHTMLItemProvider;
import org.eclipse.rmf.reqif10.provider.ReqIF10ItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.provider.ReqIFToolExtensionItemProvider;
import org.eclipse.sphinx.emf.edit.TransientItemProvider;

public class ExtendedReqIF10ItemProviderAdapterFactory extends
		ReqIF10ItemProviderAdapterFactory {
	
	protected Disposable disposable = new Disposable();

	@Override
	public Adapter createReqIFAdapter() {
		if (reqIFItemProvider == null) {
			reqIFItemProvider = new ExtendedReqIF10ItemProvider(this);
		}
		return reqIFItemProvider;
	}

	@Override
	public Adapter createReqIFContentAdapter() {
		if (reqIFContentItemProvider == null) {
			reqIFContentItemProvider = new ExtendedReqIFContentItemProvider(
					this);
		}
		return reqIFContentItemProvider;
	}

	@Override
	public Adapter createSpecObjectAdapter() {
		if (specObjectItemProvider == null) {
			specObjectItemProvider = new ExtendedSpecObjectItemProvider(this);
		}
		return specObjectItemProvider;
	}
	
	@Override
	public Adapter createSpecificationAdapter() {
		if (specificationItemProvider == null) {
			specificationItemProvider = new ExtendedSpecificationItemProvider(this);
		}
		return specificationItemProvider;
	}
	
	
	@Override
	public Adapter createSpecificationTypeAdapter() {
		if (specificationTypeItemProvider == null) {
			specificationTypeItemProvider = new ExtendedSpecificationTypeItemProvider(this);
		}
		return specificationTypeItemProvider;
	}
	
	@Override
	public Adapter createSpecRelationTypeAdapter() {
		if (specRelationTypeItemProvider == null) {
			specRelationTypeItemProvider = new ExtendedSpecRelationTypeItemProvider(this);
		}
		return specRelationTypeItemProvider;
	}
	
	@Override
	public Adapter createSpecRelationAdapter() {
		if (specRelationItemProvider == null) {
			specRelationItemProvider = new ExtendedSpecRelationItemProvider(this);
		}
		return specRelationItemProvider;
	}
	
	@Override
	public Adapter createSpecObjectTypeAdapter() {
		if (specObjectTypeItemProvider == null) {
			specObjectTypeItemProvider = new ExtendedSpecObjectTypeItemProvider(this);
		}
		return specObjectTypeItemProvider;	
	}
	
	@Override
	public Adapter createDatatypeDefinitionBooleanAdapter() {
		if (datatypeDefinitionBooleanItemProvider == null) {
			datatypeDefinitionBooleanItemProvider = new ExtendedDatatypeDefinitionBooleanItemProvider(this);
		}
		return datatypeDefinitionBooleanItemProvider;
	}
	
	@Override
	public Adapter createDatatypeDefinitionDateAdapter() {
		if (datatypeDefinitionDateItemProvider == null) {
			datatypeDefinitionDateItemProvider = new ExtendedDatatypeDefinitionDateItemProvider(this);
		}
		return datatypeDefinitionDateItemProvider;
	}
	
	@Override
	public Adapter createDatatypeDefinitionEnumerationAdapter() {
		if (datatypeDefinitionEnumerationItemProvider == null){
			datatypeDefinitionEnumerationItemProvider = new ExtendedDatatypeDefinitionEnumerationItemProvider(this);
		}
		return datatypeDefinitionEnumerationItemProvider;
	}
	
	@Override
	public Adapter createDatatypeDefinitionIntegerAdapter() {
		if (datatypeDefinitionIntegerItemProvider == null) {
			datatypeDefinitionIntegerItemProvider = new ExtendedDatatypeDefinitionIntegerItemProvider(this);
		}
		return datatypeDefinitionIntegerItemProvider;
		
	}
	
	@Override
	public Adapter createDatatypeDefinitionRealAdapter() {
		if (datatypeDefinitionRealItemProvider == null) {
			datatypeDefinitionRealItemProvider = new ExtendedDatatypeDefinitionRealItemProvider(this);
		}
		return datatypeDefinitionRealItemProvider;
	}
	
	@Override
	public Adapter createDatatypeDefinitionStringAdapter() {
		if (datatypeDefinitionStringItemProvider == null) {
			datatypeDefinitionStringItemProvider = new ExtendedDatatypeDefinitionStringItemProvider(this);
		}
		return datatypeDefinitionStringItemProvider;
	}

	@Override
	public Adapter createDatatypeDefinitionXHTMLAdapter() {
		if (datatypeDefinitionXHTMLItemProvider == null) {
			datatypeDefinitionXHTMLItemProvider = new ExtendedDatatypeDefinitionXHTMLItemProvider(this);
		}
		return datatypeDefinitionXHTMLItemProvider;
	}
	
	@Override
	public Adapter createReqIFToolExtensionAdapter() {
		if (reqIFToolExtensionItemProvider == null) {
			reqIFToolExtensionItemProvider = new ExtendedReqIFToolExtensionItemProvider(this);
		}
		return reqIFToolExtensionItemProvider;
	}
	@Override
	public Object adapt(Object target, Object type) {
		Object adapter = TransientItemProvider.AdapterFactoryHelper.adapt(
				target, type, this);
		if (adapter != null) {
			disposable.add(adapter);
			return adapter;
		}
		return super.adapt(target, type);
	}

	@Override
	protected Adapter createAdapter(Notifier target, Object type) {
		if (type == TransientSpecObjectsItemProvider.class) {
			return new TransientSpecObjectsItemProvider(this);
		} else if (type == TransientSpecificationsItemProvider.class) {
			return new TransientSpecificationsItemProvider(this);
		} else if (type == TransientSpecRelationsItemProvider.class) {
			return new TransientSpecRelationsItemProvider(this);
		} else if (type == TransientTypesItemProvider.class) {
			return new TransientTypesItemProvider(this);
		} else if (type == TransientToolExtensionsItemProvider.class) {
			return new TransientToolExtensionsItemProvider(this);
		}
		return super.createAdapter(target, type);
	}

	@Override
	public void dispose() {
		disposable.dispose();
		super.dispose();
	}

}
