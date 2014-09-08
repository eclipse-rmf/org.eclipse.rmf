/**
 */
package org.eclipse.rmf.reqif10.search.criteria;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.search.criteria.Criteria#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.search.criteria.Criteria#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.search.criteria.Criteria#getSerachedText <em>Serached Text</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.search.criteria.Criteria#isSensitiveCase <em>Sensitive Case</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.search.criteria.Criteria#getReplacementText <em>Replacement Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.search.criteria.CriteriaPackage#getCriteria()
 * @model
 * @generated
 */
public interface Criteria extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * The default value is <code>"identifier"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see org.eclipse.rmf.reqif10.search.criteria.CriteriaPackage#getCriteria_FeatureName()
	 * @model default="identifier" required="true"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.search.criteria.Criteria#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.reqif10.search.criteria.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.search.criteria.Operator
	 * @see #setOperator(Operator)
	 * @see org.eclipse.rmf.reqif10.search.criteria.CriteriaPackage#getCriteria_Operator()
	 * @model required="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.search.criteria.Criteria#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.search.criteria.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Serached Text</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serached Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serached Text</em>' attribute.
	 * @see #setSerachedText(String)
	 * @see org.eclipse.rmf.reqif10.search.criteria.CriteriaPackage#getCriteria_SerachedText()
	 * @model default="" required="true"
	 * @generated
	 */
	String getSerachedText();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.search.criteria.Criteria#getSerachedText <em>Serached Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serached Text</em>' attribute.
	 * @see #getSerachedText()
	 * @generated
	 */
	void setSerachedText(String value);

	/**
	 * Returns the value of the '<em><b>Sensitive Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensitive Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensitive Case</em>' attribute.
	 * @see #setSensitiveCase(boolean)
	 * @see org.eclipse.rmf.reqif10.search.criteria.CriteriaPackage#getCriteria_SensitiveCase()
	 * @model required="true"
	 * @generated
	 */
	boolean isSensitiveCase();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.search.criteria.Criteria#isSensitiveCase <em>Sensitive Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensitive Case</em>' attribute.
	 * @see #isSensitiveCase()
	 * @generated
	 */
	void setSensitiveCase(boolean value);

	/**
	 * Returns the value of the '<em><b>Replacement Text</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacement Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement Text</em>' attribute.
	 * @see #setReplacementText(String)
	 * @see org.eclipse.rmf.reqif10.search.criteria.CriteriaPackage#getCriteria_ReplacementText()
	 * @model default=""
	 * @generated
	 */
	String getReplacementText();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.search.criteria.Criteria#getReplacementText <em>Replacement Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Text</em>' attribute.
	 * @see #getReplacementText()
	 * @generated
	 */
	void setReplacementText(String value);

} // Criteria
