/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.configuration;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.reqif10.Specification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pror Spec View Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getLeftHeaderColumn <em>Left Header Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrSpecViewConfiguration()
 * @model
 * @generated
 */
public interface ProrSpecViewConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(Specification)
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrSpecViewConfiguration_Specification()
	 * @model required="true"
	 * @generated
	 */
	Specification getSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Specification value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.pror.configuration.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrSpecViewConfiguration_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Left Header Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Header Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Header Column</em>' containment reference.
	 * @see #setLeftHeaderColumn(Column)
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrSpecViewConfiguration_LeftHeaderColumn()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Column getLeftHeaderColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration#getLeftHeaderColumn <em>Left Header Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Header Column</em>' containment reference.
	 * @see #getLeftHeaderColumn()
	 * @generated
	 */
	void setLeftHeaderColumn(Column value);

} // ProrSpecViewConfiguration
