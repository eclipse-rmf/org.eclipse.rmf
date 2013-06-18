/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    itemis AG - initial API and implementation
 * 
 */
package org.eclipse.rmf.tests.serialization.env.emf.myreqif;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOOLEXTENSIONS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TOOLEXTENSIONSType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TOOLEXTENSIONSType#getREQIFTOOLEXTENSION <em>REQIFTOOLEXTENSION</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getTOOLEXTENSIONSType()
 * @model extendedMetaData="name='TOOL-EXTENSIONS_._type' kind='elementOnly'"
 * @generated
 */
public interface TOOLEXTENSIONSType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getTOOLEXTENSIONSType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>REQIFTOOLEXTENSION</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFTOOLEXTENSION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>REQIFTOOLEXTENSION</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>REQIFTOOLEXTENSION</em>' containment reference list.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getTOOLEXTENSIONSType_REQIFTOOLEXTENSION()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='REQ-IF-TOOL-EXTENSION' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<REQIFTOOLEXTENSION> getREQIFTOOLEXTENSION();

} // TOOLEXTENSIONSType
