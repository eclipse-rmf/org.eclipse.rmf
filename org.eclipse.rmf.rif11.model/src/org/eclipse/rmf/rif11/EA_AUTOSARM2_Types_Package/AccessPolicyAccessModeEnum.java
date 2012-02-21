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

package org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Access Policy Access Mode Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.EA_AUTOSARM2_Types_PackagePackage#getAccessPolicyAccessModeEnum()
 * @model
 * @generated
 */
public enum AccessPolicyAccessModeEnum implements Enumerator {
	/**
	 * The '<em><b>EDIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDIT_VALUE
	 * @generated
	 * @ordered
	 */
	EDIT(0, "EDIT", "EDIT"),

	/**
	 * The '<em><b>DELETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(1, "DELETE", "DELETE"),

	/**
	 * The '<em><b>CREATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE(2, "CREATE", "CREATE");

	/**
	 * The '<em><b>EDIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EDIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EDIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EDIT_VALUE = 0;

	/**
	 * The '<em><b>DELETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELETE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 1;

	/**
	 * The '<em><b>CREATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CREATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Access Policy Access Mode Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AccessPolicyAccessModeEnum[] VALUES_ARRAY =
		new AccessPolicyAccessModeEnum[] {
			EDIT,
			DELETE,
			CREATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Access Policy Access Mode Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AccessPolicyAccessModeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Access Policy Access Mode Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessPolicyAccessModeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessPolicyAccessModeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Policy Access Mode Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessPolicyAccessModeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessPolicyAccessModeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Policy Access Mode Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessPolicyAccessModeEnum get(int value) {
		switch (value) {
			case EDIT_VALUE: return EDIT;
			case DELETE_VALUE: return DELETE;
			case CREATE_VALUE: return CREATE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AccessPolicyAccessModeEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AccessPolicyAccessModeEnum
