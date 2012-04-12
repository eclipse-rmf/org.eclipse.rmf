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

package org.eclipse.rmf.rif12.its;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rbc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.RbcType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.RbcType#getLocNote <em>Loc Note</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.RbcType#getLocNoteRef <em>Loc Note Ref</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.RbcType#getLocNoteType <em>Loc Note Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.RbcType#getTerm <em>Term</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.RbcType#getTermInfoRef <em>Term Info Ref</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.RbcType#getTranslate <em>Translate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.its.ItsPackage#getRbcType()
 * @model extendedMetaData="name='rbc_._type' kind='elementOnly'"
 * @generated
 */
public interface RbcType extends ItsRbcContent {
	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif12.its.DirType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text direction for the context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see org.eclipse.rmf.rif12.its.DirType1
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #setDir(DirType1)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getRbcType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType1 getDir();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.RbcType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see org.eclipse.rmf.rif12.its.DirType1
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #getDir()
	 * @generated
	 */
	void setDir(DirType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif12.its.RbcType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType1)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif12.its.RbcType#getDir <em>Dir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dir</em>' attribute is set.
	 * @see #unsetDir()
	 * @see #getDir()
	 * @see #setDir(DirType1)
	 * @generated
	 */
	boolean isSetDir();

	/**
	 * Returns the value of the '<em><b>Loc Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Localization note.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Note</em>' attribute.
	 * @see #setLocNote(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getRbcType_LocNote()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='locNote'"
	 * @generated
	 */
	String getLocNote();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.RbcType#getLocNote <em>Loc Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Note</em>' attribute.
	 * @see #getLocNote()
	 * @generated
	 */
	void setLocNote(String value);

	/**
	 * Returns the value of the '<em><b>Loc Note Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI referring to the location of the localization note.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Note Ref</em>' attribute.
	 * @see #setLocNoteRef(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getRbcType_LocNoteRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='locNoteRef'"
	 * @generated
	 */
	String getLocNoteRef();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.RbcType#getLocNoteRef <em>Loc Note Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Note Ref</em>' attribute.
	 * @see #getLocNoteRef()
	 * @generated
	 */
	void setLocNoteRef(String value);

	/**
	 * Returns the value of the '<em><b>Loc Note Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif12.its.LocNoteTypeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of localization note.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Note Type</em>' attribute.
	 * @see org.eclipse.rmf.rif12.its.LocNoteTypeType1
	 * @see #isSetLocNoteType()
	 * @see #unsetLocNoteType()
	 * @see #setLocNoteType(LocNoteTypeType1)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getRbcType_LocNoteType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='locNoteType'"
	 * @generated
	 */
	LocNoteTypeType1 getLocNoteType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.RbcType#getLocNoteType <em>Loc Note Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Note Type</em>' attribute.
	 * @see org.eclipse.rmf.rif12.its.LocNoteTypeType1
	 * @see #isSetLocNoteType()
	 * @see #unsetLocNoteType()
	 * @see #getLocNoteType()
	 * @generated
	 */
	void setLocNoteType(LocNoteTypeType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif12.its.RbcType#getLocNoteType <em>Loc Note Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocNoteType()
	 * @see #getLocNoteType()
	 * @see #setLocNoteType(LocNoteTypeType1)
	 * @generated
	 */
	void unsetLocNoteType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif12.its.RbcType#getLocNoteType <em>Loc Note Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Loc Note Type</em>' attribute is set.
	 * @see #unsetLocNoteType()
	 * @see #getLocNoteType()
	 * @see #setLocNoteType(LocNoteTypeType1)
	 * @generated
	 */
	boolean isSetLocNoteType();

	/**
	 * Returns the value of the '<em><b>Term</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif12.its.TermType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a term locally.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term</em>' attribute.
	 * @see org.eclipse.rmf.rif12.its.TermType1
	 * @see #isSetTerm()
	 * @see #unsetTerm()
	 * @see #setTerm(TermType1)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getRbcType_Term()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='term'"
	 * @generated
	 */
	TermType1 getTerm();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.RbcType#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' attribute.
	 * @see org.eclipse.rmf.rif12.its.TermType1
	 * @see #isSetTerm()
	 * @see #unsetTerm()
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(TermType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif12.its.RbcType#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTerm()
	 * @see #getTerm()
	 * @see #setTerm(TermType1)
	 * @generated
	 */
	void unsetTerm();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif12.its.RbcType#getTerm <em>Term</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Term</em>' attribute is set.
	 * @see #unsetTerm()
	 * @see #getTerm()
	 * @see #setTerm(TermType1)
	 * @generated
	 */
	boolean isSetTerm();

	/**
	 * Returns the value of the '<em><b>Term Info Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pointer to a resource containing
	 * 		      information about the term.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term Info Ref</em>' attribute.
	 * @see #setTermInfoRef(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getRbcType_TermInfoRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='termInfoRef'"
	 * @generated
	 */
	String getTermInfoRef();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.RbcType#getTermInfoRef <em>Term Info Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Info Ref</em>' attribute.
	 * @see #getTermInfoRef()
	 * @generated
	 */
	void setTermInfoRef(String value);

	/**
	 * Returns the value of the '<em><b>Translate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif12.its.TranslateType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Translate data category information to be attached to
	 * 		the current node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translate</em>' attribute.
	 * @see org.eclipse.rmf.rif12.its.TranslateType1
	 * @see #isSetTranslate()
	 * @see #unsetTranslate()
	 * @see #setTranslate(TranslateType1)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getRbcType_Translate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='translate'"
	 * @generated
	 */
	TranslateType1 getTranslate();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.RbcType#getTranslate <em>Translate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translate</em>' attribute.
	 * @see org.eclipse.rmf.rif12.its.TranslateType1
	 * @see #isSetTranslate()
	 * @see #unsetTranslate()
	 * @see #getTranslate()
	 * @generated
	 */
	void setTranslate(TranslateType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif12.its.RbcType#getTranslate <em>Translate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTranslate()
	 * @see #getTranslate()
	 * @see #setTranslate(TranslateType1)
	 * @generated
	 */
	void unsetTranslate();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif12.its.RbcType#getTranslate <em>Translate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Translate</em>' attribute is set.
	 * @see #unsetTranslate()
	 * @see #getTranslate()
	 * @see #setTranslate(TranslateType1)
	 * @generated
	 */
	boolean isSetTranslate();

} // RbcType
