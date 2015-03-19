/**
 */
package org.eclipse.rmf.reqif10.pror.configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.LabelConfiguration#getDefaultLabel <em>Default Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getLabelConfiguration()
 * @model
 * @generated
 */
public interface LabelConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Label</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Label</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Label</em>' attribute list.
	 * @see #isSetDefaultLabel()
	 * @see #unsetDefaultLabel()
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getLabelConfiguration_DefaultLabel()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<String> getDefaultLabel();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.LabelConfiguration#getDefaultLabel <em>Default Label</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultLabel()
	 * @see #getDefaultLabel()
	 * @generated
	 */
	void unsetDefaultLabel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.LabelConfiguration#getDefaultLabel <em>Default Label</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Label</em>' attribute list is set.
	 * @see #unsetDefaultLabel()
	 * @see #getDefaultLabel()
	 * @generated
	 */
	boolean isSetDefaultLabel();

} // LabelConfiguration
