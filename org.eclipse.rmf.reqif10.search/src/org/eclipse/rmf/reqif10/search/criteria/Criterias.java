/*******************************************************************************
 * Copyright (c) 2014 Hussein Mhanna
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hussein Mhanna - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.criteria;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.search.criteria.Criterias#getCriterias <em>Criterias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.search.criteria.CriteriaPackage#getCriterias()
 * @model
 * @generated
 */
public interface Criterias extends EObject {
	/**
	 * Returns the value of the '<em><b>Criterias</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.search.criteria.Criteria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criterias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterias</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.search.criteria.CriteriaPackage#getCriterias_Criterias()
	 * @model containment="true"
	 * @generated
	 */
	EList<Criteria> getCriterias();

} // Criterias
