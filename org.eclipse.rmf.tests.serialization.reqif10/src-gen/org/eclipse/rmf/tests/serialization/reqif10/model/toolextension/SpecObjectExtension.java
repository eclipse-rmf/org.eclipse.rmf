/**
 */
package org.eclipse.rmf.tests.serialization.reqif10.model.toolextension;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.rmf.reqif10.SpecObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Object Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.SpecObjectExtension#getExtendedDesc <em>Extended Desc</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.SpecObjectExtension#getExtendedSpecObject <em>Extended Spec Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.ToolextensionPackage#getSpecObjectExtension()
 * @model
 * @generated
 */
public interface SpecObjectExtension extends EObject {
	/**
	 * Returns the value of the '<em><b>Extended Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Desc</em>' attribute.
	 * @see #setExtendedDesc(String)
	 * @see org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.ToolextensionPackage#getSpecObjectExtension_ExtendedDesc()
	 * @model
	 * @generated
	 */
	String getExtendedDesc();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.SpecObjectExtension#getExtendedDesc <em>Extended Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Desc</em>' attribute.
	 * @see #getExtendedDesc()
	 * @generated
	 */
	void setExtendedDesc(String value);

	/**
	 * Returns the value of the '<em><b>Extended Spec Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Spec Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Spec Object</em>' reference.
	 * @see #setExtendedSpecObject(SpecObject)
	 * @see org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.ToolextensionPackage#getSpecObjectExtension_ExtendedSpecObject()
	 * @model
	 * @generated
	 */
	SpecObject getExtendedSpecObject();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.SpecObjectExtension#getExtendedSpecObject <em>Extended Spec Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Spec Object</em>' reference.
	 * @see #getExtendedSpecObject()
	 * @generated
	 */
	void setExtendedSpecObject(SpecObject value);

} // SpecObjectExtension
