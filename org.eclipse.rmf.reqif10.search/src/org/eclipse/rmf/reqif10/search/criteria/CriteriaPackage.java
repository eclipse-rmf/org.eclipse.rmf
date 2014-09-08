/**
 */
package org.eclipse.rmf.reqif10.search.criteria;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.reqif10.search.criteria.CriteriaFactory
 * @model kind="package"
 * @generated
 */
public interface CriteriaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "criteria";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/rmf/pror/search/criteria/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "criteria";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CriteriaPackage eINSTANCE = org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.search.criteria.impl.CriteriasImpl <em>Criterias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.search.criteria.impl.CriteriasImpl
	 * @see org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaPackageImpl#getCriterias()
	 * @generated
	 */
	int CRITERIAS = 0;

	/**
	 * The feature id for the '<em><b>Criterias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS__CRITERIAS = 0;

	/**
	 * The number of structural features of the '<em>Criterias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Criterias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaImpl <em>Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaImpl
	 * @see org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaPackageImpl#getCriteria()
	 * @generated
	 */
	int CRITERIA = 1;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__FEATURE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Serached Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__SERACHED_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Sensitive Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__SENSITIVE_CASE = 3;

	/**
	 * The feature id for the '<em><b>Replacement Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__REPLACEMENT_TEXT = 4;

	/**
	 * The number of structural features of the '<em>Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.search.criteria.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.search.criteria.Operator
	 * @see org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.search.criteria.Criterias <em>Criterias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criterias</em>'.
	 * @see org.eclipse.rmf.reqif10.search.criteria.Criterias
	 * @generated
	 */
	EClass getCriterias();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.search.criteria.Criterias#getCriterias <em>Criterias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criterias</em>'.
	 * @see org.eclipse.rmf.reqif10.search.criteria.Criterias#getCriterias()
	 * @see #getCriterias()
	 * @generated
	 */
	EReference getCriterias_Criterias();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.search.criteria.Criteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criteria</em>'.
	 * @see org.eclipse.rmf.reqif10.search.criteria.Criteria
	 * @generated
	 */
	EClass getCriteria();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.search.criteria.Criteria#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclipse.rmf.reqif10.search.criteria.Criteria#getFeatureName()
	 * @see #getCriteria()
	 * @generated
	 */
	EAttribute getCriteria_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.search.criteria.Criteria#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.rmf.reqif10.search.criteria.Criteria#getOperator()
	 * @see #getCriteria()
	 * @generated
	 */
	EAttribute getCriteria_Operator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.search.criteria.Criteria#getSerachedText <em>Serached Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serached Text</em>'.
	 * @see org.eclipse.rmf.reqif10.search.criteria.Criteria#getSerachedText()
	 * @see #getCriteria()
	 * @generated
	 */
	EAttribute getCriteria_SerachedText();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.search.criteria.Criteria#isSensitiveCase <em>Sensitive Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensitive Case</em>'.
	 * @see org.eclipse.rmf.reqif10.search.criteria.Criteria#isSensitiveCase()
	 * @see #getCriteria()
	 * @generated
	 */
	EAttribute getCriteria_SensitiveCase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.search.criteria.Criteria#getReplacementText <em>Replacement Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replacement Text</em>'.
	 * @see org.eclipse.rmf.reqif10.search.criteria.Criteria#getReplacementText()
	 * @see #getCriteria()
	 * @generated
	 */
	EAttribute getCriteria_ReplacementText();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.reqif10.search.criteria.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see org.eclipse.rmf.reqif10.search.criteria.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CriteriaFactory getCriteriaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.search.criteria.impl.CriteriasImpl <em>Criterias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.search.criteria.impl.CriteriasImpl
		 * @see org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaPackageImpl#getCriterias()
		 * @generated
		 */
		EClass CRITERIAS = eINSTANCE.getCriterias();

		/**
		 * The meta object literal for the '<em><b>Criterias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERIAS__CRITERIAS = eINSTANCE.getCriterias_Criterias();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaImpl <em>Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaImpl
		 * @see org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaPackageImpl#getCriteria()
		 * @generated
		 */
		EClass CRITERIA = eINSTANCE.getCriteria();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIA__FEATURE_NAME = eINSTANCE.getCriteria_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIA__OPERATOR = eINSTANCE.getCriteria_Operator();

		/**
		 * The meta object literal for the '<em><b>Serached Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIA__SERACHED_TEXT = eINSTANCE.getCriteria_SerachedText();

		/**
		 * The meta object literal for the '<em><b>Sensitive Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIA__SENSITIVE_CASE = eINSTANCE.getCriteria_SensitiveCase();

		/**
		 * The meta object literal for the '<em><b>Replacement Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIA__REPLACEMENT_TEXT = eINSTANCE.getCriteria_ReplacementText();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.search.criteria.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.search.criteria.Operator
		 * @see org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

	}

} //CriteriaPackage
