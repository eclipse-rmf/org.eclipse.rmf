/**
 */
package org.eclipse.rmf.tests.reqif10.serialization.model.toolextension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.ToolextensionFactory
 * @model kind="package"
 * @generated
 */
public interface ToolextensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "toolextension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/rmf/reqif10/serialization/model/toolextension.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "toolextension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToolextensionPackage eINSTANCE = org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.ToolextensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.ExtensionImpl
	 * @see org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.ToolextensionPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Spec Object Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__SPEC_OBJECT_EXTENSIONS = 0;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.SpecObjectExtensionImpl <em>Spec Object Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.SpecObjectExtensionImpl
	 * @see org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.ToolextensionPackageImpl#getSpecObjectExtension()
	 * @generated
	 */
	int SPEC_OBJECT_EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Extended Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_EXTENSION__EXTENDED_DESC = 0;

	/**
	 * The feature id for the '<em><b>Extended Spec Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_EXTENSION__EXTENDED_SPEC_OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Spec Object Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_EXTENSION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.Extension#getSpecObjectExtensions <em>Spec Object Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec Object Extensions</em>'.
	 * @see org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.Extension#getSpecObjectExtensions()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_SpecObjectExtensions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.SpecObjectExtension <em>Spec Object Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Object Extension</em>'.
	 * @see org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.SpecObjectExtension
	 * @generated
	 */
	EClass getSpecObjectExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.SpecObjectExtension#getExtendedDesc <em>Extended Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extended Desc</em>'.
	 * @see org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.SpecObjectExtension#getExtendedDesc()
	 * @see #getSpecObjectExtension()
	 * @generated
	 */
	EAttribute getSpecObjectExtension_ExtendedDesc();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.SpecObjectExtension#getExtendedSpecObject <em>Extended Spec Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extended Spec Object</em>'.
	 * @see org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.SpecObjectExtension#getExtendedSpecObject()
	 * @see #getSpecObjectExtension()
	 * @generated
	 */
	EReference getSpecObjectExtension_ExtendedSpecObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToolextensionFactory getToolextensionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.ExtensionImpl
		 * @see org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.ToolextensionPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Spec Object Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__SPEC_OBJECT_EXTENSIONS = eINSTANCE.getExtension_SpecObjectExtensions();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.SpecObjectExtensionImpl <em>Spec Object Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.SpecObjectExtensionImpl
		 * @see org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.ToolextensionPackageImpl#getSpecObjectExtension()
		 * @generated
		 */
		EClass SPEC_OBJECT_EXTENSION = eINSTANCE.getSpecObjectExtension();

		/**
		 * The meta object literal for the '<em><b>Extended Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_OBJECT_EXTENSION__EXTENDED_DESC = eINSTANCE.getSpecObjectExtension_ExtendedDesc();

		/**
		 * The meta object literal for the '<em><b>Extended Spec Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_OBJECT_EXTENSION__EXTENDED_SPEC_OBJECT = eINSTANCE.getSpecObjectExtension_ExtendedSpecObject();

	}

} //ToolextensionPackage
