/**
 */
package org.eclipse.rmf.reqif10.search.criteria;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.reqif10.search.criteria.CriteriaPackage
 * @generated
 */
public interface CriteriaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CriteriaFactory eINSTANCE = org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Criterias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Criterias</em>'.
	 * @generated
	 */
	Criterias createCriterias();

	/**
	 * Returns a new object of class '<em>Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Criteria</em>'.
	 * @generated
	 */
	Criteria createCriteria();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CriteriaPackage getCriteriaPackage();

} //CriteriaFactory
