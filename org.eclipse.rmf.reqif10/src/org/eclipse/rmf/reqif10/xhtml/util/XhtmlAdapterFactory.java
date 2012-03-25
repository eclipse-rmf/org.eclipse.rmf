/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.xhtml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.rmf.reqif10.xhtml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage
 * @generated
 */
public class XhtmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XhtmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XhtmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XhtmlSwitch<Adapter> modelSwitch =
		new XhtmlSwitch<Adapter>() {
			@Override
			public Adapter caseXhtmlAbbrType(XhtmlAbbrType object) {
				return createXhtmlAbbrTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlAcronymType(XhtmlAcronymType object) {
				return createXhtmlAcronymTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlAddressType(XhtmlAddressType object) {
				return createXhtmlAddressTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlAType(XhtmlAType object) {
				return createXhtmlATypeAdapter();
			}
			@Override
			public Adapter caseXhtmlBlockquoteType(XhtmlBlockquoteType object) {
				return createXhtmlBlockquoteTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlBrType(XhtmlBrType object) {
				return createXhtmlBrTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlCaptionType(XhtmlCaptionType object) {
				return createXhtmlCaptionTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlCiteType(XhtmlCiteType object) {
				return createXhtmlCiteTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlCodeType(XhtmlCodeType object) {
				return createXhtmlCodeTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlColgroupType(XhtmlColgroupType object) {
				return createXhtmlColgroupTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlColType(XhtmlColType object) {
				return createXhtmlColTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlDdType(XhtmlDdType object) {
				return createXhtmlDdTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlDfnType(XhtmlDfnType object) {
				return createXhtmlDfnTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlDivType(XhtmlDivType object) {
				return createXhtmlDivTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlDlType(XhtmlDlType object) {
				return createXhtmlDlTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlDtType(XhtmlDtType object) {
				return createXhtmlDtTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlEditType(XhtmlEditType object) {
				return createXhtmlEditTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlEmType(XhtmlEmType object) {
				return createXhtmlEmTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlH1Type(XhtmlH1Type object) {
				return createXhtmlH1TypeAdapter();
			}
			@Override
			public Adapter caseXhtmlH2Type(XhtmlH2Type object) {
				return createXhtmlH2TypeAdapter();
			}
			@Override
			public Adapter caseXhtmlH3Type(XhtmlH3Type object) {
				return createXhtmlH3TypeAdapter();
			}
			@Override
			public Adapter caseXhtmlH4Type(XhtmlH4Type object) {
				return createXhtmlH4TypeAdapter();
			}
			@Override
			public Adapter caseXhtmlH5Type(XhtmlH5Type object) {
				return createXhtmlH5TypeAdapter();
			}
			@Override
			public Adapter caseXhtmlH6Type(XhtmlH6Type object) {
				return createXhtmlH6TypeAdapter();
			}
			@Override
			public Adapter caseXhtmlHeadingType(XhtmlHeadingType object) {
				return createXhtmlHeadingTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlHrType(XhtmlHrType object) {
				return createXhtmlHrTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlInlPresType(XhtmlInlPresType object) {
				return createXhtmlInlPresTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlKbdType(XhtmlKbdType object) {
				return createXhtmlKbdTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlLiType(XhtmlLiType object) {
				return createXhtmlLiTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlObjectType(XhtmlObjectType object) {
				return createXhtmlObjectTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlOlType(XhtmlOlType object) {
				return createXhtmlOlTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlParamType(XhtmlParamType object) {
				return createXhtmlParamTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlPreType(XhtmlPreType object) {
				return createXhtmlPreTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlPType(XhtmlPType object) {
				return createXhtmlPTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlQType(XhtmlQType object) {
				return createXhtmlQTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlSampType(XhtmlSampType object) {
				return createXhtmlSampTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlSpanType(XhtmlSpanType object) {
				return createXhtmlSpanTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlStrongType(XhtmlStrongType object) {
				return createXhtmlStrongTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlTableType(XhtmlTableType object) {
				return createXhtmlTableTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlTbodyType(XhtmlTbodyType object) {
				return createXhtmlTbodyTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlTdType(XhtmlTdType object) {
				return createXhtmlTdTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlTfootType(XhtmlTfootType object) {
				return createXhtmlTfootTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlTheadType(XhtmlTheadType object) {
				return createXhtmlTheadTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlThType(XhtmlThType object) {
				return createXhtmlThTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlTrType(XhtmlTrType object) {
				return createXhtmlTrTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlUlType(XhtmlUlType object) {
				return createXhtmlUlTypeAdapter();
			}
			@Override
			public Adapter caseXhtmlVarType(XhtmlVarType object) {
				return createXhtmlVarTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType <em>Abbr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType
	 * @generated
	 */
	public Adapter createXhtmlAbbrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType <em>Acronym Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType
	 * @generated
	 */
	public Adapter createXhtmlAcronymTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType
	 * @generated
	 */
	public Adapter createXhtmlAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType <em>AType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType
	 * @generated
	 */
	public Adapter createXhtmlATypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType <em>Blockquote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType
	 * @generated
	 */
	public Adapter createXhtmlBlockquoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBrType <em>Br Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBrType
	 * @generated
	 */
	public Adapter createXhtmlBrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType <em>Caption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType
	 * @generated
	 */
	public Adapter createXhtmlCaptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType <em>Cite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType
	 * @generated
	 */
	public Adapter createXhtmlCiteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType
	 * @generated
	 */
	public Adapter createXhtmlCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType <em>Colgroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType
	 * @generated
	 */
	public Adapter createXhtmlColgroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColType <em>Col Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColType
	 * @generated
	 */
	public Adapter createXhtmlColTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType <em>Dd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType
	 * @generated
	 */
	public Adapter createXhtmlDdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType <em>Dfn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType
	 * @generated
	 */
	public Adapter createXhtmlDfnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType <em>Div Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType
	 * @generated
	 */
	public Adapter createXhtmlDivTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDlType <em>Dl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDlType
	 * @generated
	 */
	public Adapter createXhtmlDlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType <em>Dt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType
	 * @generated
	 */
	public Adapter createXhtmlDtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType <em>Edit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType
	 * @generated
	 */
	public Adapter createXhtmlEditTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType <em>Em Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType
	 * @generated
	 */
	public Adapter createXhtmlEmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type <em>H1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type
	 * @generated
	 */
	public Adapter createXhtmlH1TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type <em>H2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type
	 * @generated
	 */
	public Adapter createXhtmlH2TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type <em>H3 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type
	 * @generated
	 */
	public Adapter createXhtmlH3TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type <em>H4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type
	 * @generated
	 */
	public Adapter createXhtmlH4TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type <em>H5 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type
	 * @generated
	 */
	public Adapter createXhtmlH5TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type <em>H6 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type
	 * @generated
	 */
	public Adapter createXhtmlH6TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType <em>Heading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType
	 * @generated
	 */
	public Adapter createXhtmlHeadingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHrType <em>Hr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHrType
	 * @generated
	 */
	public Adapter createXhtmlHrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType <em>Inl Pres Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType
	 * @generated
	 */
	public Adapter createXhtmlInlPresTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType <em>Kbd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType
	 * @generated
	 */
	public Adapter createXhtmlKbdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType <em>Li Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType
	 * @generated
	 */
	public Adapter createXhtmlLiTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType
	 * @generated
	 */
	public Adapter createXhtmlObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlOlType <em>Ol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlOlType
	 * @generated
	 */
	public Adapter createXhtmlOlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlParamType
	 * @generated
	 */
	public Adapter createXhtmlParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType <em>Pre Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType
	 * @generated
	 */
	public Adapter createXhtmlPreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType <em>PType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType
	 * @generated
	 */
	public Adapter createXhtmlPTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType <em>QType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType
	 * @generated
	 */
	public Adapter createXhtmlQTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType <em>Samp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType
	 * @generated
	 */
	public Adapter createXhtmlSampTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType <em>Span Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType
	 * @generated
	 */
	public Adapter createXhtmlSpanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType <em>Strong Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType
	 * @generated
	 */
	public Adapter createXhtmlStrongTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType
	 * @generated
	 */
	public Adapter createXhtmlTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType <em>Tbody Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType
	 * @generated
	 */
	public Adapter createXhtmlTbodyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType <em>Td Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType
	 * @generated
	 */
	public Adapter createXhtmlTdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType <em>Tfoot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType
	 * @generated
	 */
	public Adapter createXhtmlTfootTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType <em>Thead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType
	 * @generated
	 */
	public Adapter createXhtmlTheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType <em>Th Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType
	 * @generated
	 */
	public Adapter createXhtmlThTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTrType <em>Tr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTrType
	 * @generated
	 */
	public Adapter createXhtmlTrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlUlType <em>Ul Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlUlType
	 * @generated
	 */
	public Adapter createXhtmlUlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType
	 * @generated
	 */
	public Adapter createXhtmlVarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xhtml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xhtml.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XhtmlAdapterFactory
