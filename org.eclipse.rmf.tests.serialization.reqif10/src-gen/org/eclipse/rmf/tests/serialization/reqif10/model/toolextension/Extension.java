/**
 */
package org.eclipse.rmf.tests.serialization.reqif10.model.toolextension;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.Extension#getSpecObjectExtensions <em>Spec Object Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.ToolextensionPackage#getExtension()
 * @model
 * @generated
 */
public interface Extension extends EObject {
	/**
	 * Returns the value of the '<em><b>Spec Object Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.SpecObjectExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Object Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Object Extensions</em>' containment reference list.
	 * @see #isSetSpecObjectExtensions()
	 * @see #unsetSpecObjectExtensions()
	 * @see org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.ToolextensionPackage#getExtension_SpecObjectExtensions()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<SpecObjectExtension> getSpecObjectExtensions();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.Extension#getSpecObjectExtensions <em>Spec Object Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecObjectExtensions()
	 * @see #getSpecObjectExtensions()
	 * @generated
	 */
	void unsetSpecObjectExtensions();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.Extension#getSpecObjectExtensions <em>Spec Object Extensions</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spec Object Extensions</em>' containment reference list is set.
	 * @see #unsetSpecObjectExtensions()
	 * @see #getSpecObjectExtensions()
	 * @generated
	 */
	boolean isSetSpecObjectExtensions();

} // Extension
