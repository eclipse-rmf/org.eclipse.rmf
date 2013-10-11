/**
 */
package org.eclipse.rmf.tests.reqif10.serialization.model.toolextension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.ToolextensionPackage
 * @generated
 */
public interface ToolextensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToolextensionFactory eINSTANCE = org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.ToolextensionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension</em>'.
	 * @generated
	 */
	Extension createExtension();

	/**
	 * Returns a new object of class '<em>Spec Object Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Object Extension</em>'.
	 * @generated
	 */
	SpecObjectExtension createSpecObjectExtension();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ToolextensionPackage getToolextensionPackage();

} //ToolextensionFactory
