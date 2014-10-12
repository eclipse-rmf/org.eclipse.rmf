/**
 */
package org.eclipse.rmf.reqif10.csv.importer.mapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.MappingFactory
 * @model kind="package"
 * @generated
 */
public interface MappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingPackage eINSTANCE = org.eclipse.rmf.reqif10.csv.importer.mapping.impl.MappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.csv.importer.mapping.impl.MappingItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.impl.MappingItemImpl
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.impl.MappingPackageImpl#getMappingItem()
	 * @generated
	 */
	int MAPPING_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ITEM__ATTRIBUTE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ITEM__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Column Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ITEM__COLUMN_ID = 2;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ITEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.csv.importer.mapping.impl.MappingLibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.impl.MappingLibraryImpl
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.impl.MappingPackageImpl#getMappingLibrary()
	 * @generated
	 */
	int MAPPING_LIBRARY = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_LIBRARY__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_LIBRARY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.csv.importer.mapping.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.DataType
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.impl.MappingPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem
	 * @generated
	 */
	EClass getMappingItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem#getAttributeName()
	 * @see #getMappingItem()
	 * @generated
	 */
	EAttribute getMappingItem_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem#getDataType()
	 * @see #getMappingItem()
	 * @generated
	 */
	EAttribute getMappingItem_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem#getColumnId <em>Column Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Id</em>'.
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem#getColumnId()
	 * @see #getMappingItem()
	 * @generated
	 */
	EAttribute getMappingItem_ColumnId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.csv.importer.mapping.MappingLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.MappingLibrary
	 * @generated
	 */
	EClass getMappingLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.csv.importer.mapping.MappingLibrary#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.MappingLibrary#getItems()
	 * @see #getMappingLibrary()
	 * @generated
	 */
	EReference getMappingLibrary_Items();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.reqif10.csv.importer.mapping.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MappingFactory getMappingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.csv.importer.mapping.impl.MappingItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.impl.MappingItemImpl
		 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.impl.MappingPackageImpl#getMappingItem()
		 * @generated
		 */
		EClass MAPPING_ITEM = eINSTANCE.getMappingItem();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ITEM__ATTRIBUTE_NAME = eINSTANCE.getMappingItem_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ITEM__DATA_TYPE = eINSTANCE.getMappingItem_DataType();

		/**
		 * The meta object literal for the '<em><b>Column Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ITEM__COLUMN_ID = eINSTANCE.getMappingItem_ColumnId();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.csv.importer.mapping.impl.MappingLibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.impl.MappingLibraryImpl
		 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.impl.MappingPackageImpl#getMappingLibrary()
		 * @generated
		 */
		EClass MAPPING_LIBRARY = eINSTANCE.getMappingLibrary();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_LIBRARY__ITEMS = eINSTANCE.getMappingLibrary_Items();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.csv.importer.mapping.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.DataType
		 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.impl.MappingPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //MappingPackage
