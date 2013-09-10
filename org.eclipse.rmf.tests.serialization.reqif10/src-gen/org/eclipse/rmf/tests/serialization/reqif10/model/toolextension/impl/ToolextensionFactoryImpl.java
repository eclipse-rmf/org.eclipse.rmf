/**
 */
package org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolextensionFactoryImpl extends EFactoryImpl implements ToolextensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToolextensionFactory init() {
		try {
			ToolextensionFactory theToolextensionFactory = (ToolextensionFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/rmf/serialization/model/toolextension.ecore"); 
			if (theToolextensionFactory != null) {
				return theToolextensionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToolextensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolextensionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ToolextensionPackage.EXTENSION: return createExtension();
			case ToolextensionPackage.SPEC_OBJECT_EXTENSION: return createSpecObjectExtension();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecObjectExtension createSpecObjectExtension() {
		SpecObjectExtensionImpl specObjectExtension = new SpecObjectExtensionImpl();
		return specObjectExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolextensionPackage getToolextensionPackage() {
		return (ToolextensionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToolextensionPackage getPackage() {
		return ToolextensionPackage.eINSTANCE;
	}

} //ToolextensionFactoryImpl
