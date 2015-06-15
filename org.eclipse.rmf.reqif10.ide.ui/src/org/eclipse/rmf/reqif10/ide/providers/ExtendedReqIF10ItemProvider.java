package org.eclipse.rmf.reqif10.ide.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.provider.ReqIFItemProvider;

public class ExtendedReqIF10ItemProvider extends ReqIFItemProvider {

	public ExtendedReqIF10ItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		super.getChildrenFeatures(object);
		childrenFeatures
				.remove(ReqIF10Package.Literals.REQ_IF__TOOL_EXTENSIONS);
		//childrenFeatures.remove(ReqIF10Package.Literals.REQ_IF__CORE_CONTENT);
		return childrenFeatures;
	}

	@Override
	public Collection<?> getChildren(Object object) {
		List<Object> children = new ArrayList<Object>(super.getChildren(object));
		children.add(adapterFactory.adapt(object,
				TransientToolExtensionsItemProvider.class));
	/*	
		  children.add(adapterFactory.adapt(object, TransientSpecificationsItemProvider.class));
		  children.add(adapterFactory.adapt(object, TransientSpecRelationsItemProvider.class));
		  //children.add(adapterFactory.adapt(object, TransientSpecRelationGroupsItemProvider.class));
		  children.add(adapterFactory.adapt(object, TransientSpecObjectsItemProvider.class));
		  children.add(adapterFactory.adapt(object, TransientTypesItemProvider.class));
		  */
		return children;
	}

	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		return createWrappedCommand(super.createAddCommand(domain, owner,
				feature, collection, index), owner, feature);
	}

	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection) {
		return createWrappedCommand(
				super.createRemoveCommand(domain, owner, feature, collection),
				owner, feature);
	}

	protected Command createWrappedCommand(Command command,
			final EObject owner, final EStructuralFeature feature) {
		if (feature == ReqIF10Package.Literals.REQ_IF__TOOL_EXTENSIONS) {
			return new CommandWrapper(command) {
				@Override
				public Collection<?> getAffectedObjects() {
					Collection<?> affected = super.getAffectedObjects();
					if (affected.contains(owner)) {
						if (feature == ReqIF10Package.Literals.REQ_IF__TOOL_EXTENSIONS) {
							affected = Collections
									.singleton(adapterFactory
											.adapt(owner,
													TransientToolExtensionsItemProvider.class));
						}
					}
					return affected;
				}
			};
		}
		return command;
	}

	@Override
	public void notifyChanged(Notification notification) {
        updateChildren(notification);

		switch (notification.getFeatureID(ReqIF.class)) {
		case ReqIF10Package.REQ_IF__TOOL_EXTENSIONS:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, true));
			return;
		}
		super.notifyChanged(notification);
	}
}
