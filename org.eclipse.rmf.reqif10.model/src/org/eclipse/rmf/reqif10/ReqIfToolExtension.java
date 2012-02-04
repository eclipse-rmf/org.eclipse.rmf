/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfToolExtension#getDocumentRoot <em>Document Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfToolExtension()
 * @model
 * @generated
 */
public interface ReqIfToolExtension extends EObject {
	/**
	 * Returns the value of the '<em><b>Document Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.ReqIf#getToolExtensions <em>Tool Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Root</em>' container reference.
	 * @see #setDocumentRoot(ReqIf)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfToolExtension_DocumentRoot()
	 * @see org.eclipse.rmf.reqif10.ReqIf#getToolExtensions
	 * @model opposite="toolExtensions" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ReqIf getDocumentRoot();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIfToolExtension#getDocumentRoot <em>Document Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Root</em>' container reference.
	 * @see #getDocumentRoot()
	 * @generated
	 */
	void setDocumentRoot(ReqIf value);

} // ReqIfToolExtension
