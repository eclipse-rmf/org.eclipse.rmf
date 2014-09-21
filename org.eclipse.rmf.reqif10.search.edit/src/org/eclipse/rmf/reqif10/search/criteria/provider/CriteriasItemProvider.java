/**
 */
package org.eclipse.rmf.reqif10.search.criteria.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.search.criteria.Criteria;
import org.eclipse.rmf.reqif10.search.criteria.CriteriaFactory;
import org.eclipse.rmf.reqif10.search.criteria.CriteriaPackage;
import org.eclipse.rmf.reqif10.search.criteria.Criterias;

/**
 * This is the item provider adapter for a
 * {@link org.eclipse.rmf.reqif10.search.criteria.Criterias} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CriteriasItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	private static final List<String> featureNames = new ArrayList<String>();
	static {
		featureNames.add(ReqIF10Package.Literals.IDENTIFIABLE__IDENTIFIER
				.getName());
		featureNames.add(ReqIF10Package.Literals.IDENTIFIABLE__LONG_NAME
				.getName());
		featureNames.add(ReqIF10Package.Literals.IDENTIFIABLE__DESC.getName());
		featureNames.add(ReqIF10Package.Literals.IDENTIFIABLE__LAST_CHANGE
				.getName());
		featureNames
				.add(ReqIF10Package.Literals.ATTRIBUTE_VALUE_BOOLEAN__THE_VALUE
						.getName());
	}

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CriteriasItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to
	 * deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in
	 * {@link #createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CriteriaPackage.Literals.CRITERIAS__CRITERIAS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper
		// feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Criterias.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Criterias"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Criterias_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Criterias.class)) {
		case CriteriaPackage.CRITERIAS__CRITERIAS:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
		for (String featureName : featureNames) {
			newChildDescriptors.add(createChildParameter(
					CriteriaPackage.Literals.CRITERIAS__CRITERIAS,
					CriteriaFactory.eINSTANCE.createCriteria(featureName)));

		}
		newChildDescriptors.add(createChildParameter(
				CriteriaPackage.Literals.CRITERIAS__CRITERIAS,
				CriteriaFactory.eINSTANCE.createCriteria()));
	}

	@Override
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection<?> selection) {
		if (child instanceof Criteria) {
			Criteria criteria = (Criteria) child;
			if (false == criteria.getFeatureName().isEmpty()) {
				return criteria.getFeatureName();
			} else {
				return "Custom Criteria";
			}
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CriteriaEditPlugin.INSTANCE;
	}

}
