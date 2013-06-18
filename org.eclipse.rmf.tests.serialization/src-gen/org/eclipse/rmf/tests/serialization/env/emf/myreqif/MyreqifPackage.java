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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * <!-- begin-model-doc -->
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *     <h1>About the XML namespace</h1>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *      <p>
 *       See <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a> and
 *       <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a> for information 
 *       about this namespace.
 *      </p>
 *      <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *      <p>   
 *       See further below in this document for more information about <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a> and about <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *    
 *     <h3>Father (in any context at all)</h3> 
 * 
 *     <div class="bodytext">
 *      <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *      <blockquote>
 *        <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *      </blockquote>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow <code>xml:base</code>,
 *       <code>xml:lang</code>, <code>xml:space</code> or
 *       <code>xml:id</code> attributes on elements they define.
 *      </p>
 *      <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *      <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       or
 *      </p>
 *      <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *      <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *      <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *     <div class="bodytext">
 *      <p>
 *       In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>.
 *      </p>
 *      <p>
 *       At the date of issue it can also be found at
 *       <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>.
 *      </p>
 *      <p>
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a> 
 *       will change accordingly; the version at 
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a> 
 *       will not change.
 *      </p>
 *      <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *      <ul>
 *       <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *      </ul>
 *     </div>
 *    </div>
 *   
 * <!-- end-model-doc -->
 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifFactory
 * @model kind="package"
 * @generated
 */
public interface MyreqifPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "myreqif";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/rmf/tests/serialization/env/myreqif.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "myreqif";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyreqifPackage eINSTANCE = org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDImpl <em>ALTERNATIVEID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEID()
	 * @generated
	 */
	int ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDTypeImpl <em>ALTERNATIVEID Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE = 1;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType1Impl <em>ALTERNATIVEID Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType1Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType1()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE1 = 2;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE1__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType2Impl <em>ALTERNATIVEID Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType2Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType2()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE2 = 3;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE2__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType3Impl <em>ALTERNATIVEID Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType3Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType3()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE3 = 4;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE3__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE3_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType4Impl <em>ALTERNATIVEID Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType4Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType4()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE4 = 5;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE4__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE4_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType5Impl <em>ALTERNATIVEID Type5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType5Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType5()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE5 = 6;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE5__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE5_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType6Impl <em>ALTERNATIVEID Type6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType6Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType6()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE6 = 7;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE6__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE6_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType7Impl <em>ALTERNATIVEID Type7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType7Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType7()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE7 = 8;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE7__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE7_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType8Impl <em>ALTERNATIVEID Type8</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType8Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType8()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE8 = 9;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE8__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE8_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType9Impl <em>ALTERNATIVEID Type9</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType9Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType9()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE9 = 10;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE9__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE9_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType10Impl <em>ALTERNATIVEID Type10</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType10Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType10()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE10 = 11;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE10__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE10_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType11Impl <em>ALTERNATIVEID Type11</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType11Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType11()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE11 = 12;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE11__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE11_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType12Impl <em>ALTERNATIVEID Type12</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType12Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType12()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE12 = 13;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE12__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type12</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE12_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType13Impl <em>ALTERNATIVEID Type13</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType13Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType13()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE13 = 14;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE13__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type13</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE13_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType14Impl <em>ALTERNATIVEID Type14</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType14Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType14()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE14 = 15;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE14__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type14</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE14_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType15Impl <em>ALTERNATIVEID Type15</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType15Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType15()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE15 = 16;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE15__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type15</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE15_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType16Impl <em>ALTERNATIVEID Type16</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType16Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType16()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE16 = 17;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE16__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type16</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE16_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType17Impl <em>ALTERNATIVEID Type17</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType17Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType17()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE17 = 18;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE17__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type17</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE17_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType18Impl <em>ALTERNATIVEID Type18</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType18Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType18()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE18 = 19;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE18__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type18</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE18_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType19Impl <em>ALTERNATIVEID Type19</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType19Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType19()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE19 = 20;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE19__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type19</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE19_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType20Impl <em>ALTERNATIVEID Type20</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType20Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType20()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE20 = 21;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE20__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type20</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE20_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType21Impl <em>ALTERNATIVEID Type21</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType21Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType21()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE21 = 22;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE21__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type21</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE21_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType22Impl <em>ALTERNATIVEID Type22</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType22Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType22()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE22 = 23;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE22__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type22</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE22_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType23Impl <em>ALTERNATIVEID Type23</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType23Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType23()
	 * @generated
	 */
	int ALTERNATIVEID_TYPE23 = 24;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE23__ALTERNATIVEID = 0;

	/**
	 * The number of structural features of the '<em>ALTERNATIVEID Type23</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVEID_TYPE23_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONBOOLEANImpl <em>ATTRIBUTEDEFINITIONBOOLEAN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONBOOLEANImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEDEFINITIONBOOLEAN()
	 * @generated
	 */
	int ATTRIBUTEDEFINITIONBOOLEAN = 25;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONBOOLEAN__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>DEFAULTVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONBOOLEAN__DEFAULTVALUE = 1;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONBOOLEAN__TYPE = 2;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONBOOLEAN__DESC = 3;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONBOOLEAN__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>ISEDITABLE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONBOOLEAN__ISEDITABLE = 5;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONBOOLEAN__LASTCHANGE = 6;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONBOOLEAN__LONGNAME = 7;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEDEFINITIONBOOLEAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONBOOLEAN_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONDATEImpl <em>ATTRIBUTEDEFINITIONDATE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONDATEImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEDEFINITIONDATE()
	 * @generated
	 */
	int ATTRIBUTEDEFINITIONDATE = 26;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONDATE__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>DEFAULTVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONDATE__DEFAULTVALUE = 1;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONDATE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONDATE__DESC = 3;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONDATE__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>ISEDITABLE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONDATE__ISEDITABLE = 5;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONDATE__LASTCHANGE = 6;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONDATE__LONGNAME = 7;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEDEFINITIONDATE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONDATE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl <em>ATTRIBUTEDEFINITIONENUMERATION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	int ATTRIBUTEDEFINITIONENUMERATION = 27;

	/**
	 * The feature id for the '<em><b>DEFAULTVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION__DEFAULTVALUE = 0;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION__ALTERNATIVEID = 1;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION__TYPE = 2;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION__DESC = 3;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>ISEDITABLE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION__ISEDITABLE = 5;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION__LASTCHANGE = 6;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION__LONGNAME = 7;

	/**
	 * The feature id for the '<em><b>MULTIVALUED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION__MULTIVALUED = 8;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEDEFINITIONENUMERATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONINTEGERImpl <em>ATTRIBUTEDEFINITIONINTEGER</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONINTEGERImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEDEFINITIONINTEGER()
	 * @generated
	 */
	int ATTRIBUTEDEFINITIONINTEGER = 28;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONINTEGER__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>DEFAULTVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONINTEGER__DEFAULTVALUE = 1;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONINTEGER__TYPE = 2;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONINTEGER__DESC = 3;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONINTEGER__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>ISEDITABLE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONINTEGER__ISEDITABLE = 5;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONINTEGER__LASTCHANGE = 6;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONINTEGER__LONGNAME = 7;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEDEFINITIONINTEGER</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONINTEGER_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONREALImpl <em>ATTRIBUTEDEFINITIONREAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONREALImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEDEFINITIONREAL()
	 * @generated
	 */
	int ATTRIBUTEDEFINITIONREAL = 29;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONREAL__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>DEFAULTVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONREAL__DEFAULTVALUE = 1;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONREAL__TYPE = 2;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONREAL__DESC = 3;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONREAL__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>ISEDITABLE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONREAL__ISEDITABLE = 5;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONREAL__LASTCHANGE = 6;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONREAL__LONGNAME = 7;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEDEFINITIONREAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONREAL_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONSTRINGImpl <em>ATTRIBUTEDEFINITIONSTRING</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONSTRINGImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEDEFINITIONSTRING()
	 * @generated
	 */
	int ATTRIBUTEDEFINITIONSTRING = 30;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONSTRING__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>DEFAULTVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONSTRING__DEFAULTVALUE = 1;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONSTRING__TYPE = 2;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONSTRING__DESC = 3;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONSTRING__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>ISEDITABLE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONSTRING__ISEDITABLE = 5;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONSTRING__LASTCHANGE = 6;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONSTRING__LONGNAME = 7;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEDEFINITIONSTRING</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONSTRING_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONXHTMLImpl <em>ATTRIBUTEDEFINITIONXHTML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONXHTMLImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEDEFINITIONXHTML()
	 * @generated
	 */
	int ATTRIBUTEDEFINITIONXHTML = 31;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONXHTML__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>DEFAULTVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONXHTML__DEFAULTVALUE = 1;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONXHTML__TYPE = 2;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONXHTML__DESC = 3;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONXHTML__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>ISEDITABLE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONXHTML__ISEDITABLE = 5;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONXHTML__LASTCHANGE = 6;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONXHTML__LONGNAME = 7;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEDEFINITIONXHTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONXHTML_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEBOOLEANImpl <em>ATTRIBUTEVALUEBOOLEAN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEBOOLEANImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEVALUEBOOLEAN()
	 * @generated
	 */
	int ATTRIBUTEVALUEBOOLEAN = 32;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEBOOLEAN__DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>THEVALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEBOOLEAN__THEVALUE = 1;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEVALUEBOOLEAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEBOOLEAN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEDATEImpl <em>ATTRIBUTEVALUEDATE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEDATEImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEVALUEDATE()
	 * @generated
	 */
	int ATTRIBUTEVALUEDATE = 33;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEDATE__DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>THEVALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEDATE__THEVALUE = 1;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEVALUEDATE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEDATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEENUMERATIONImpl <em>ATTRIBUTEVALUEENUMERATION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEENUMERATIONImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEVALUEENUMERATION()
	 * @generated
	 */
	int ATTRIBUTEVALUEENUMERATION = 34;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEENUMERATION__DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>VALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEENUMERATION__VALUES = 1;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEVALUEENUMERATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEENUMERATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEINTEGERImpl <em>ATTRIBUTEVALUEINTEGER</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEINTEGERImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEVALUEINTEGER()
	 * @generated
	 */
	int ATTRIBUTEVALUEINTEGER = 35;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEINTEGER__DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>THEVALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEINTEGER__THEVALUE = 1;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEVALUEINTEGER</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEINTEGER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEREALImpl <em>ATTRIBUTEVALUEREAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEREALImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEVALUEREAL()
	 * @generated
	 */
	int ATTRIBUTEVALUEREAL = 36;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEREAL__DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>THEVALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEREAL__THEVALUE = 1;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEVALUEREAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEREAL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUESTRINGImpl <em>ATTRIBUTEVALUESTRING</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUESTRINGImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEVALUESTRING()
	 * @generated
	 */
	int ATTRIBUTEVALUESTRING = 37;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUESTRING__DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>THEVALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUESTRING__THEVALUE = 1;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEVALUESTRING</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUESTRING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEXHTMLImpl <em>ATTRIBUTEVALUEXHTML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEXHTMLImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEVALUEXHTML()
	 * @generated
	 */
	int ATTRIBUTEVALUEXHTML = 38;

	/**
	 * The feature id for the '<em><b>THEVALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEXHTML__THEVALUE = 0;

	/**
	 * The feature id for the '<em><b>THEORIGINALVALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEXHTML__THEORIGINALVALUE = 1;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEXHTML__DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>ISSIMPLIFIED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEXHTML__ISSIMPLIFIED = 3;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEVALUEXHTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEXHTML_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.CHILDRENTypeImpl <em>CHILDREN Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.CHILDRENTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getCHILDRENType()
	 * @generated
	 */
	int CHILDREN_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHY</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_TYPE__SPECHIERARCHY = 1;

	/**
	 * The number of structural features of the '<em>CHILDREN Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.CHILDRENType1Impl <em>CHILDREN Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.CHILDRENType1Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getCHILDRENType1()
	 * @generated
	 */
	int CHILDREN_TYPE1 = 40;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHY</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_TYPE1__SPECHIERARCHY = 1;

	/**
	 * The number of structural features of the '<em>CHILDREN Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.CORECONTENTTypeImpl <em>CORECONTENT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.CORECONTENTTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getCORECONTENTType()
	 * @generated
	 */
	int CORECONTENT_TYPE = 41;

	/**
	 * The feature id for the '<em><b>REQIFCONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORECONTENT_TYPE__REQIFCONTENT = 0;

	/**
	 * The number of structural features of the '<em>CORECONTENT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORECONTENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONBOOLEANImpl <em>DATATYPEDEFINITIONBOOLEAN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONBOOLEANImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDATATYPEDEFINITIONBOOLEAN()
	 * @generated
	 */
	int DATATYPEDEFINITIONBOOLEAN = 42;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBOOLEAN__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBOOLEAN__DESC = 1;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBOOLEAN__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBOOLEAN__LASTCHANGE = 3;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBOOLEAN__LONGNAME = 4;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONBOOLEAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBOOLEAN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONDATEImpl <em>DATATYPEDEFINITIONDATE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONDATEImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDATATYPEDEFINITIONDATE()
	 * @generated
	 */
	int DATATYPEDEFINITIONDATE = 43;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDATE__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDATE__DESC = 1;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDATE__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDATE__LASTCHANGE = 3;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDATE__LONGNAME = 4;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONDATE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDATE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONENUMERATIONImpl <em>DATATYPEDEFINITIONENUMERATION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONENUMERATIONImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDATATYPEDEFINITIONENUMERATION()
	 * @generated
	 */
	int DATATYPEDEFINITIONENUMERATION = 44;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONENUMERATION__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>SPECIFIEDVALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONENUMERATION__SPECIFIEDVALUES = 1;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONENUMERATION__DESC = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONENUMERATION__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONENUMERATION__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONENUMERATION__LONGNAME = 5;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONENUMERATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONENUMERATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONINTEGERImpl <em>DATATYPEDEFINITIONINTEGER</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONINTEGERImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDATATYPEDEFINITIONINTEGER()
	 * @generated
	 */
	int DATATYPEDEFINITIONINTEGER = 45;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONINTEGER__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONINTEGER__DESC = 1;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONINTEGER__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONINTEGER__LASTCHANGE = 3;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONINTEGER__LONGNAME = 4;

	/**
	 * The feature id for the '<em><b>MAX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONINTEGER__MAX = 5;

	/**
	 * The feature id for the '<em><b>MIN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONINTEGER__MIN = 6;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONINTEGER</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONINTEGER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONREALImpl <em>DATATYPEDEFINITIONREAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONREALImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	int DATATYPEDEFINITIONREAL = 46;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>ACCURACY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL__ACCURACY = 1;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL__DESC = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL__LONGNAME = 5;

	/**
	 * The feature id for the '<em><b>MAX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL__MAX = 6;

	/**
	 * The feature id for the '<em><b>MIN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL__MIN = 7;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONREAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONSTRINGImpl <em>DATATYPEDEFINITIONSTRING</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONSTRINGImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDATATYPEDEFINITIONSTRING()
	 * @generated
	 */
	int DATATYPEDEFINITIONSTRING = 47;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONSTRING__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONSTRING__DESC = 1;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONSTRING__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONSTRING__LASTCHANGE = 3;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONSTRING__LONGNAME = 4;

	/**
	 * The feature id for the '<em><b>MAXLENGTH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONSTRING__MAXLENGTH = 5;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONSTRING</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONSTRING_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONXHTMLImpl <em>DATATYPEDEFINITIONXHTML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONXHTMLImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDATATYPEDEFINITIONXHTML()
	 * @generated
	 */
	int DATATYPEDEFINITIONXHTML = 48;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONXHTML__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONXHTML__DESC = 1;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONXHTML__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONXHTML__LASTCHANGE = 3;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONXHTML__LONGNAME = 4;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONXHTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONXHTML_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPESTypeImpl <em>DATATYPES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPESTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDATATYPESType()
	 * @generated
	 */
	int DATATYPES_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONBOOLEAN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__DATATYPEDEFINITIONBOOLEAN = 1;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONDATE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__DATATYPEDEFINITIONDATE = 2;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__DATATYPEDEFINITIONENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONINTEGER</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__DATATYPEDEFINITIONINTEGER = 4;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONREAL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__DATATYPEDEFINITIONREAL = 5;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONSTRING</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__DATATYPEDEFINITIONSTRING = 6;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONXHTML</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__DATATYPEDEFINITIONXHTML = 7;

	/**
	 * The number of structural features of the '<em>DATATYPES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUETypeImpl <em>DEFAULTVALUE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUETypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFAULTVALUEType()
	 * @generated
	 */
	int DEFAULTVALUE_TYPE = 50;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEDATE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE__ATTRIBUTEVALUEDATE = 0;

	/**
	 * The number of structural features of the '<em>DEFAULTVALUE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType1Impl <em>DEFAULTVALUE Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType1Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFAULTVALUEType1()
	 * @generated
	 */
	int DEFAULTVALUE_TYPE1 = 51;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE1__ATTRIBUTEVALUEENUMERATION = 0;

	/**
	 * The number of structural features of the '<em>DEFAULTVALUE Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType2Impl <em>DEFAULTVALUE Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType2Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFAULTVALUEType2()
	 * @generated
	 */
	int DEFAULTVALUE_TYPE2 = 52;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEINTEGER</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEINTEGER = 0;

	/**
	 * The number of structural features of the '<em>DEFAULTVALUE Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType3Impl <em>DEFAULTVALUE Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType3Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFAULTVALUEType3()
	 * @generated
	 */
	int DEFAULTVALUE_TYPE3 = 53;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEREAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE3__ATTRIBUTEVALUEREAL = 0;

	/**
	 * The number of structural features of the '<em>DEFAULTVALUE Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE3_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType4Impl <em>DEFAULTVALUE Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType4Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFAULTVALUEType4()
	 * @generated
	 */
	int DEFAULTVALUE_TYPE4 = 54;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE4__ATTRIBUTEVALUESTRING = 0;

	/**
	 * The number of structural features of the '<em>DEFAULTVALUE Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE4_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType5Impl <em>DEFAULTVALUE Type5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType5Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFAULTVALUEType5()
	 * @generated
	 */
	int DEFAULTVALUE_TYPE5 = 55;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXHTML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE5__ATTRIBUTEVALUEXHTML = 0;

	/**
	 * The number of structural features of the '<em>DEFAULTVALUE Type5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE5_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType6Impl <em>DEFAULTVALUE Type6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType6Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFAULTVALUEType6()
	 * @generated
	 */
	int DEFAULTVALUE_TYPE6 = 56;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEBOOLEAN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE6__ATTRIBUTEVALUEBOOLEAN = 0;

	/**
	 * The number of structural features of the '<em>DEFAULTVALUE Type6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE6_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONTypeImpl <em>DEFINITION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFINITIONType()
	 * @generated
	 */
	int DEFINITION_TYPE = 57;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF = 0;

	/**
	 * The number of structural features of the '<em>DEFINITION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType1Impl <em>DEFINITION Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType1Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFINITIONType1()
	 * @generated
	 */
	int DEFINITION_TYPE1 = 58;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONDATEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE1__ATTRIBUTEDEFINITIONDATEREF = 0;

	/**
	 * The number of structural features of the '<em>DEFINITION Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType2Impl <em>DEFINITION Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType2Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFINITIONType2()
	 * @generated
	 */
	int DEFINITION_TYPE2 = 59;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONSTRINGREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE2__ATTRIBUTEDEFINITIONSTRINGREF = 0;

	/**
	 * The number of structural features of the '<em>DEFINITION Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType3Impl <em>DEFINITION Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType3Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFINITIONType3()
	 * @generated
	 */
	int DEFINITION_TYPE3 = 60;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONXHTMLREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE3__ATTRIBUTEDEFINITIONXHTMLREF = 0;

	/**
	 * The number of structural features of the '<em>DEFINITION Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE3_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType4Impl <em>DEFINITION Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType4Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFINITIONType4()
	 * @generated
	 */
	int DEFINITION_TYPE4 = 61;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONREALREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE4__ATTRIBUTEDEFINITIONREALREF = 0;

	/**
	 * The number of structural features of the '<em>DEFINITION Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE4_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType5Impl <em>DEFINITION Type5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType5Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFINITIONType5()
	 * @generated
	 */
	int DEFINITION_TYPE5 = 62;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONINTEGERREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE5__ATTRIBUTEDEFINITIONINTEGERREF = 0;

	/**
	 * The number of structural features of the '<em>DEFINITION Type5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE5_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType6Impl <em>DEFINITION Type6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType6Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFINITIONType6()
	 * @generated
	 */
	int DEFINITION_TYPE6 = 63;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONBOOLEANREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE6__ATTRIBUTEDEFINITIONBOOLEANREF = 0;

	/**
	 * The number of structural features of the '<em>DEFINITION Type6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE6_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DocumentRootImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 64;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>REQIF</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQIF = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.EDITABLEATTSTypeImpl <em>EDITABLEATTS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.EDITABLEATTSTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getEDITABLEATTSType()
	 * @generated
	 */
	int EDITABLEATTS_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLEATTS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONBOOLEANREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONBOOLEANREF = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONDATEREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONDATEREF = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONINTEGERREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONINTEGERREF = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONREALREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONREALREF = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONSTRINGREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONSTRINGREF = 6;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONXHTMLREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONXHTMLREF = 7;

	/**
	 * The number of structural features of the '<em>EDITABLEATTS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITABLEATTS_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.EMBEDDEDVALUEImpl <em>EMBEDDEDVALUE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.EMBEDDEDVALUEImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getEMBEDDEDVALUE()
	 * @generated
	 */
	int EMBEDDEDVALUE = 66;

	/**
	 * The feature id for the '<em><b>KEY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDEDVALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>OTHERCONTENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDEDVALUE__OTHERCONTENT = 1;

	/**
	 * The number of structural features of the '<em>EMBEDDEDVALUE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDEDVALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ENUMVALUEImpl <em>ENUMVALUE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ENUMVALUEImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getENUMVALUE()
	 * @generated
	 */
	int ENUMVALUE = 67;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMVALUE__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>PROPERTIES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMVALUE__PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMVALUE__DESC = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMVALUE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMVALUE__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMVALUE__LONGNAME = 5;

	/**
	 * The number of structural features of the '<em>ENUMVALUE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMVALUE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.OBJECTTypeImpl <em>OBJECT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.OBJECTTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getOBJECTType()
	 * @generated
	 */
	int OBJECT_TYPE = 68;

	/**
	 * The feature id for the '<em><b>SPECOBJECTREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__SPECOBJECTREF = 0;

	/**
	 * The number of structural features of the '<em>OBJECT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.PROPERTIESTypeImpl <em>PROPERTIES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.PROPERTIESTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getPROPERTIESType()
	 * @generated
	 */
	int PROPERTIES_TYPE = 69;

	/**
	 * The feature id for the '<em><b>EMBEDDEDVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__EMBEDDEDVALUE = 0;

	/**
	 * The number of structural features of the '<em>PROPERTIES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.RELATIONGROUPImpl <em>RELATIONGROUP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.RELATIONGROUPImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getRELATIONGROUP()
	 * @generated
	 */
	int RELATIONGROUP = 70;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>SOURCESPECIFICATION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP__SOURCESPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>SPECRELATIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP__SPECRELATIONS = 2;

	/**
	 * The feature id for the '<em><b>TARGETSPECIFICATION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP__TARGETSPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP__TYPE = 4;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP__DESC = 5;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP__LASTCHANGE = 7;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP__LONGNAME = 8;

	/**
	 * The number of structural features of the '<em>RELATIONGROUP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.RELATIONGROUPTYPEImpl <em>RELATIONGROUPTYPE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.RELATIONGROUPTYPEImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getRELATIONGROUPTYPE()
	 * @generated
	 */
	int RELATIONGROUPTYPE = 71;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUPTYPE__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>SPECATTRIBUTES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUPTYPE__SPECATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUPTYPE__DESC = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUPTYPE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUPTYPE__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUPTYPE__LONGNAME = 5;

	/**
	 * The number of structural features of the '<em>RELATIONGROUPTYPE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUPTYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFImpl <em>REQIF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getREQIF()
	 * @generated
	 */
	int REQIF = 72;

	/**
	 * The feature id for the '<em><b>THEHEADER</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIF__THEHEADER = 0;

	/**
	 * The feature id for the '<em><b>CORECONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIF__CORECONTENT = 1;

	/**
	 * The feature id for the '<em><b>TOOLEXTENSIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIF__TOOLEXTENSIONS = 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIF__LANG = 3;

	/**
	 * The number of structural features of the '<em>REQIF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIF_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFCONTENTImpl <em>REQIFCONTENT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFCONTENTImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getREQIFCONTENT()
	 * @generated
	 */
	int REQIFCONTENT = 73;

	/**
	 * The feature id for the '<em><b>DATATYPES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFCONTENT__DATATYPES = 0;

	/**
	 * The feature id for the '<em><b>SPECTYPES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFCONTENT__SPECTYPES = 1;

	/**
	 * The feature id for the '<em><b>SPECOBJECTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFCONTENT__SPECOBJECTS = 2;

	/**
	 * The feature id for the '<em><b>SPECRELATIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFCONTENT__SPECRELATIONS = 3;

	/**
	 * The feature id for the '<em><b>SPECIFICATIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFCONTENT__SPECIFICATIONS = 4;

	/**
	 * The feature id for the '<em><b>SPECRELATIONGROUPS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFCONTENT__SPECRELATIONGROUPS = 5;

	/**
	 * The number of structural features of the '<em>REQIFCONTENT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFCONTENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFHEADERImpl <em>REQIFHEADER</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFHEADERImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getREQIFHEADER()
	 * @generated
	 */
	int REQIFHEADER = 74;

	/**
	 * The feature id for the '<em><b>COMMENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFHEADER__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>CREATIONTIME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFHEADER__CREATIONTIME = 1;

	/**
	 * The feature id for the '<em><b>REPOSITORYID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFHEADER__REPOSITORYID = 2;

	/**
	 * The feature id for the '<em><b>REQIFTOOLID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFHEADER__REQIFTOOLID = 3;

	/**
	 * The feature id for the '<em><b>REQIFVERSION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFHEADER__REQIFVERSION = 4;

	/**
	 * The feature id for the '<em><b>SOURCETOOLID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFHEADER__SOURCETOOLID = 5;

	/**
	 * The feature id for the '<em><b>TITLE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFHEADER__TITLE = 6;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFHEADER__IDENTIFIER = 7;

	/**
	 * The number of structural features of the '<em>REQIFHEADER</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFHEADER_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFTOOLEXTENSIONImpl <em>REQIFTOOLEXTENSION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFTOOLEXTENSIONImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getREQIFTOOLEXTENSION()
	 * @generated
	 */
	int REQIFTOOLEXTENSION = 75;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFTOOLEXTENSION__ANY = 0;

	/**
	 * The number of structural features of the '<em>REQIFTOOLEXTENSION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQIFTOOLEXTENSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SOURCESPECIFICATIONTypeImpl <em>SOURCESPECIFICATION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SOURCESPECIFICATIONTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSOURCESPECIFICATIONType()
	 * @generated
	 */
	int SOURCESPECIFICATION_TYPE = 76;

	/**
	 * The feature id for the '<em><b>SPECIFICATIONREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCESPECIFICATION_TYPE__SPECIFICATIONREF = 0;

	/**
	 * The number of structural features of the '<em>SOURCESPECIFICATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCESPECIFICATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SOURCETypeImpl <em>SOURCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SOURCETypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSOURCEType()
	 * @generated
	 */
	int SOURCE_TYPE = 77;

	/**
	 * The feature id for the '<em><b>SPECOBJECTREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__SPECOBJECTREF = 0;

	/**
	 * The number of structural features of the '<em>SOURCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESTypeImpl <em>SPECATTRIBUTES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECATTRIBUTESType()
	 * @generated
	 */
	int SPECATTRIBUTES_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONBOOLEAN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONBOOLEAN = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONDATE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONDATE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONINTEGER</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONINTEGER = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONREAL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONREAL = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONSTRING</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONSTRING = 6;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONXHTML</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONXHTML = 7;

	/**
	 * The number of structural features of the '<em>SPECATTRIBUTES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType1Impl <em>SPECATTRIBUTES Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType1Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECATTRIBUTESType1()
	 * @generated
	 */
	int SPECATTRIBUTES_TYPE1 = 79;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONBOOLEAN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONBOOLEAN = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONDATE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONDATE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONINTEGER</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONINTEGER = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONREAL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONREAL = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONSTRING</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONSTRING = 6;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONXHTML</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONXHTML = 7;

	/**
	 * The number of structural features of the '<em>SPECATTRIBUTES Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE1_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType2Impl <em>SPECATTRIBUTES Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType2Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECATTRIBUTESType2()
	 * @generated
	 */
	int SPECATTRIBUTES_TYPE2 = 80;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE2__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONBOOLEAN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONBOOLEAN = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONDATE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONDATE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONINTEGER</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONINTEGER = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONREAL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONREAL = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONSTRING</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONSTRING = 6;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONXHTML</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONXHTML = 7;

	/**
	 * The number of structural features of the '<em>SPECATTRIBUTES Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE2_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType3Impl <em>SPECATTRIBUTES Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType3Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECATTRIBUTESType3()
	 * @generated
	 */
	int SPECATTRIBUTES_TYPE3 = 81;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE3__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONBOOLEAN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONBOOLEAN = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONDATE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONDATE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONINTEGER</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONINTEGER = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONREAL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONREAL = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONSTRING</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONSTRING = 6;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONXHTML</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONXHTML = 7;

	/**
	 * The number of structural features of the '<em>SPECATTRIBUTES Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE3_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECHIERARCHYImpl <em>SPECHIERARCHY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECHIERARCHYImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECHIERARCHY()
	 * @generated
	 */
	int SPECHIERARCHY = 82;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>CHILDREN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY__CHILDREN = 1;

	/**
	 * The feature id for the '<em><b>EDITABLEATTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY__EDITABLEATTS = 2;

	/**
	 * The feature id for the '<em><b>OBJECT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY__OBJECT = 3;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY__DESC = 4;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>ISEDITABLE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY__ISEDITABLE = 6;

	/**
	 * The feature id for the '<em><b>ISTABLEINTERNAL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY__ISTABLEINTERNAL = 7;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY__LASTCHANGE = 8;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY__LONGNAME = 9;

	/**
	 * The number of structural features of the '<em>SPECHIERARCHY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFICATIONImpl <em>SPECIFICATION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFICATIONImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECIFICATION()
	 * @generated
	 */
	int SPECIFICATION = 83;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>VALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__VALUES = 1;

	/**
	 * The feature id for the '<em><b>CHILDREN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CHILDREN = 2;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__TYPE = 3;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DESC = 4;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__LASTCHANGE = 6;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__LONGNAME = 7;

	/**
	 * The number of structural features of the '<em>SPECIFICATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFICATIONSTypeImpl <em>SPECIFICATIONS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFICATIONSTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECIFICATIONSType()
	 * @generated
	 */
	int SPECIFICATIONS_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECIFICATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONS_TYPE__SPECIFICATION = 1;

	/**
	 * The number of structural features of the '<em>SPECIFICATIONS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFICATIONTYPEImpl <em>SPECIFICATIONTYPE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFICATIONTYPEImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECIFICATIONTYPE()
	 * @generated
	 */
	int SPECIFICATIONTYPE = 85;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONTYPE__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>SPECATTRIBUTES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONTYPE__SPECATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONTYPE__DESC = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONTYPE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONTYPE__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONTYPE__LONGNAME = 5;

	/**
	 * The number of structural features of the '<em>SPECIFICATIONTYPE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONTYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFIEDVALUESTypeImpl <em>SPECIFIEDVALUES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFIEDVALUESTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECIFIEDVALUESType()
	 * @generated
	 */
	int SPECIFIEDVALUES_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIEDVALUES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ENUMVALUE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIEDVALUES_TYPE__ENUMVALUE = 1;

	/**
	 * The number of structural features of the '<em>SPECIFIEDVALUES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIEDVALUES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECOBJECTImpl <em>SPECOBJECT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECOBJECTImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECOBJECT()
	 * @generated
	 */
	int SPECOBJECT = 87;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECT__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>VALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECT__VALUES = 1;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECT__DESC = 3;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECT__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECT__LASTCHANGE = 5;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECT__LONGNAME = 6;

	/**
	 * The number of structural features of the '<em>SPECOBJECT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECOBJECTSTypeImpl <em>SPECOBJECTS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECOBJECTSTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECOBJECTSType()
	 * @generated
	 */
	int SPECOBJECTS_TYPE = 88;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECOBJECT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTS_TYPE__SPECOBJECT = 1;

	/**
	 * The number of structural features of the '<em>SPECOBJECTS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECOBJECTTYPEImpl <em>SPECOBJECTTYPE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECOBJECTTYPEImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECOBJECTTYPE()
	 * @generated
	 */
	int SPECOBJECTTYPE = 89;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTTYPE__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>SPECATTRIBUTES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTTYPE__SPECATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTTYPE__DESC = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTTYPE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTTYPE__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTTYPE__LONGNAME = 5;

	/**
	 * The number of structural features of the '<em>SPECOBJECTTYPE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTTYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONImpl <em>SPECRELATION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECRELATION()
	 * @generated
	 */
	int SPECRELATION = 90;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>VALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__VALUES = 1;

	/**
	 * The feature id for the '<em><b>SOURCE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>TARGET</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__TARGET = 3;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__TYPE = 4;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__DESC = 5;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__LASTCHANGE = 7;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__LONGNAME = 8;

	/**
	 * The number of structural features of the '<em>SPECRELATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONGROUPSTypeImpl <em>SPECRELATIONGROUPS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONGROUPSTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECRELATIONGROUPSType()
	 * @generated
	 */
	int SPECRELATIONGROUPS_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONGROUPS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>RELATIONGROUP</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONGROUPS_TYPE__RELATIONGROUP = 1;

	/**
	 * The number of structural features of the '<em>SPECRELATIONGROUPS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONGROUPS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONSTypeImpl <em>SPECRELATIONS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONSTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECRELATIONSType()
	 * @generated
	 */
	int SPECRELATIONS_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECRELATIONREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONS_TYPE__SPECRELATIONREF = 1;

	/**
	 * The number of structural features of the '<em>SPECRELATIONS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONSType1Impl <em>SPECRELATIONS Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONSType1Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECRELATIONSType1()
	 * @generated
	 */
	int SPECRELATIONS_TYPE1 = 93;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONS_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECRELATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONS_TYPE1__SPECRELATION = 1;

	/**
	 * The number of structural features of the '<em>SPECRELATIONS Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONS_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONTYPEImpl <em>SPECRELATIONTYPE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONTYPEImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECRELATIONTYPE()
	 * @generated
	 */
	int SPECRELATIONTYPE = 94;

	/**
	 * The feature id for the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONTYPE__ALTERNATIVEID = 0;

	/**
	 * The feature id for the '<em><b>SPECATTRIBUTES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONTYPE__SPECATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONTYPE__DESC = 2;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONTYPE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONTYPE__LASTCHANGE = 4;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONTYPE__LONGNAME = 5;

	/**
	 * The number of structural features of the '<em>SPECRELATIONTYPE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONTYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECTYPESTypeImpl <em>SPECTYPES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECTYPESTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECTYPESType()
	 * @generated
	 */
	int SPECTYPES_TYPE = 95;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>RELATIONGROUPTYPE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPES_TYPE__RELATIONGROUPTYPE = 1;

	/**
	 * The feature id for the '<em><b>SPECOBJECTTYPE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPES_TYPE__SPECOBJECTTYPE = 2;

	/**
	 * The feature id for the '<em><b>SPECRELATIONTYPE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPES_TYPE__SPECRELATIONTYPE = 3;

	/**
	 * The feature id for the '<em><b>SPECIFICATIONTYPE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPES_TYPE__SPECIFICATIONTYPE = 4;

	/**
	 * The number of structural features of the '<em>SPECTYPES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPES_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TARGETSPECIFICATIONTypeImpl <em>TARGETSPECIFICATION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TARGETSPECIFICATIONTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTARGETSPECIFICATIONType()
	 * @generated
	 */
	int TARGETSPECIFICATION_TYPE = 96;

	/**
	 * The feature id for the '<em><b>SPECIFICATIONREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETSPECIFICATION_TYPE__SPECIFICATIONREF = 0;

	/**
	 * The number of structural features of the '<em>TARGETSPECIFICATION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETSPECIFICATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TARGETTypeImpl <em>TARGET Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TARGETTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTARGETType()
	 * @generated
	 */
	int TARGET_TYPE = 97;

	/**
	 * The feature id for the '<em><b>SPECOBJECTREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__SPECOBJECTREF = 0;

	/**
	 * The number of structural features of the '<em>TARGET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.THEHEADERTypeImpl <em>THEHEADER Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.THEHEADERTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTHEHEADERType()
	 * @generated
	 */
	int THEHEADER_TYPE = 98;

	/**
	 * The feature id for the '<em><b>REQIFHEADER</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEHEADER_TYPE__REQIFHEADER = 0;

	/**
	 * The number of structural features of the '<em>THEHEADER Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEHEADER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TOOLEXTENSIONSTypeImpl <em>TOOLEXTENSIONS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TOOLEXTENSIONSTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTOOLEXTENSIONSType()
	 * @generated
	 */
	int TOOLEXTENSIONS_TYPE = 99;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLEXTENSIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>REQIFTOOLEXTENSION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLEXTENSIONS_TYPE__REQIFTOOLEXTENSION = 1;

	/**
	 * The number of structural features of the '<em>TOOLEXTENSIONS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLEXTENSIONS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPETypeImpl <em>TYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPETypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType()
	 * @generated
	 */
	int TYPE_TYPE = 100;

	/**
	 * The feature id for the '<em><b>RELATIONGROUPTYPEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE__RELATIONGROUPTYPEREF = 0;

	/**
	 * The number of structural features of the '<em>TYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType1Impl <em>TYPE Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType1Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType1()
	 * @generated
	 */
	int TYPE_TYPE1 = 101;

	/**
	 * The feature id for the '<em><b>SPECIFICATIONTYPEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE1__SPECIFICATIONTYPEREF = 0;

	/**
	 * The number of structural features of the '<em>TYPE Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType2Impl <em>TYPE Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType2Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType2()
	 * @generated
	 */
	int TYPE_TYPE2 = 102;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONINTEGERREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE2__DATATYPEDEFINITIONINTEGERREF = 0;

	/**
	 * The number of structural features of the '<em>TYPE Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType3Impl <em>TYPE Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType3Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType3()
	 * @generated
	 */
	int TYPE_TYPE3 = 103;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONSTRINGREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE3__DATATYPEDEFINITIONSTRINGREF = 0;

	/**
	 * The number of structural features of the '<em>TYPE Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE3_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType4Impl <em>TYPE Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType4Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType4()
	 * @generated
	 */
	int TYPE_TYPE4 = 104;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONREALREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE4__DATATYPEDEFINITIONREALREF = 0;

	/**
	 * The number of structural features of the '<em>TYPE Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE4_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType5Impl <em>TYPE Type5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType5Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType5()
	 * @generated
	 */
	int TYPE_TYPE5 = 105;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONXHTMLREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE5__DATATYPEDEFINITIONXHTMLREF = 0;

	/**
	 * The number of structural features of the '<em>TYPE Type5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE5_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType6Impl <em>TYPE Type6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType6Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType6()
	 * @generated
	 */
	int TYPE_TYPE6 = 106;

	/**
	 * The feature id for the '<em><b>SPECOBJECTTYPEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE6__SPECOBJECTTYPEREF = 0;

	/**
	 * The number of structural features of the '<em>TYPE Type6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE6_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType7Impl <em>TYPE Type7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType7Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType7()
	 * @generated
	 */
	int TYPE_TYPE7 = 107;

	/**
	 * The feature id for the '<em><b>SPECRELATIONTYPEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE7__SPECRELATIONTYPEREF = 0;

	/**
	 * The number of structural features of the '<em>TYPE Type7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE7_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType8Impl <em>TYPE Type8</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType8Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType8()
	 * @generated
	 */
	int TYPE_TYPE8 = 108;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONDATEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE8__DATATYPEDEFINITIONDATEREF = 0;

	/**
	 * The number of structural features of the '<em>TYPE Type8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE8_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType9Impl <em>TYPE Type9</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType9Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType9()
	 * @generated
	 */
	int TYPE_TYPE9 = 109;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONENUMERATIONREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE9__DATATYPEDEFINITIONENUMERATIONREF = 0;

	/**
	 * The number of structural features of the '<em>TYPE Type9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE9_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType10Impl <em>TYPE Type10</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType10Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType10()
	 * @generated
	 */
	int TYPE_TYPE10 = 110;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONBOOLEANREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE10__DATATYPEDEFINITIONBOOLEANREF = 0;

	/**
	 * The number of structural features of the '<em>TYPE Type10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE10_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESTypeImpl <em>VALUES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESTypeImpl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getVALUESType()
	 * @generated
	 */
	int VALUES_TYPE = 111;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEBOOLEAN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__ATTRIBUTEVALUEBOOLEAN = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEDATE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__ATTRIBUTEVALUEDATE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__ATTRIBUTEVALUEENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEINTEGER</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__ATTRIBUTEVALUEINTEGER = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEREAL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__ATTRIBUTEVALUEREAL = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESTRING</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__ATTRIBUTEVALUESTRING = 6;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXHTML</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__ATTRIBUTEVALUEXHTML = 7;

	/**
	 * The number of structural features of the '<em>VALUES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESType1Impl <em>VALUES Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESType1Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getVALUESType1()
	 * @generated
	 */
	int VALUES_TYPE1 = 112;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEBOOLEAN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1__ATTRIBUTEVALUEBOOLEAN = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEDATE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1__ATTRIBUTEVALUEDATE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1__ATTRIBUTEVALUEENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEINTEGER</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1__ATTRIBUTEVALUEINTEGER = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEREAL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1__ATTRIBUTEVALUEREAL = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESTRING</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1__ATTRIBUTEVALUESTRING = 6;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXHTML</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1__ATTRIBUTEVALUEXHTML = 7;

	/**
	 * The number of structural features of the '<em>VALUES Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESType2Impl <em>VALUES Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESType2Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getVALUESType2()
	 * @generated
	 */
	int VALUES_TYPE2 = 113;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEBOOLEAN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2__ATTRIBUTEVALUEBOOLEAN = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEDATE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2__ATTRIBUTEVALUEDATE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2__ATTRIBUTEVALUEENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEINTEGER</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2__ATTRIBUTEVALUEINTEGER = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEREAL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2__ATTRIBUTEVALUEREAL = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESTRING</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2__ATTRIBUTEVALUESTRING = 6;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXHTML</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2__ATTRIBUTEVALUEXHTML = 7;

	/**
	 * The number of structural features of the '<em>VALUES Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESType3Impl <em>VALUES Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESType3Impl
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getVALUESType3()
	 * @generated
	 */
	int VALUES_TYPE3 = 114;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE3__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ENUMVALUEREF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE3__ENUMVALUEREF = 1;

	/**
	 * The number of structural features of the '<em>VALUES Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE3_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '<em>GLOBALREF</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getGLOBALREF()
	 * @generated
	 */
	int GLOBALREF = 115;

	/**
	 * The meta object id for the '<em>LOCALREF</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getLOCALREF()
	 * @generated
	 */
	int LOCALREF = 116;

	/**
	 * The meta object id for the '<em>XHTMLCONTENT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getXHTMLCONTENT()
	 * @generated
	 */
	int XHTMLCONTENT = 117;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEID
	 * @generated
	 */
	EClass getALTERNATIVEID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEID#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEID#getIDENTIFIER()
	 * @see #getALTERNATIVEID()
	 * @generated
	 */
	EAttribute getALTERNATIVEID_IDENTIFIER();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType <em>ALTERNATIVEID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType
	 * @generated
	 */
	EClass getALTERNATIVEIDType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType()
	 * @generated
	 */
	EReference getALTERNATIVEIDType_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType1 <em>ALTERNATIVEID Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type1</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType1
	 * @generated
	 */
	EClass getALTERNATIVEIDType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType1#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType1#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType1()
	 * @generated
	 */
	EReference getALTERNATIVEIDType1_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType2 <em>ALTERNATIVEID Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type2</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType2
	 * @generated
	 */
	EClass getALTERNATIVEIDType2();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType2#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType2#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType2()
	 * @generated
	 */
	EReference getALTERNATIVEIDType2_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType3 <em>ALTERNATIVEID Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type3</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType3
	 * @generated
	 */
	EClass getALTERNATIVEIDType3();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType3#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType3#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType3()
	 * @generated
	 */
	EReference getALTERNATIVEIDType3_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType4 <em>ALTERNATIVEID Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type4</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType4
	 * @generated
	 */
	EClass getALTERNATIVEIDType4();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType4#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType4#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType4()
	 * @generated
	 */
	EReference getALTERNATIVEIDType4_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType5 <em>ALTERNATIVEID Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type5</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType5
	 * @generated
	 */
	EClass getALTERNATIVEIDType5();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType5#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType5#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType5()
	 * @generated
	 */
	EReference getALTERNATIVEIDType5_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType6 <em>ALTERNATIVEID Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type6</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType6
	 * @generated
	 */
	EClass getALTERNATIVEIDType6();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType6#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType6#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType6()
	 * @generated
	 */
	EReference getALTERNATIVEIDType6_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType7 <em>ALTERNATIVEID Type7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type7</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType7
	 * @generated
	 */
	EClass getALTERNATIVEIDType7();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType7#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType7#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType7()
	 * @generated
	 */
	EReference getALTERNATIVEIDType7_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType8 <em>ALTERNATIVEID Type8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type8</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType8
	 * @generated
	 */
	EClass getALTERNATIVEIDType8();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType8#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType8#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType8()
	 * @generated
	 */
	EReference getALTERNATIVEIDType8_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType9 <em>ALTERNATIVEID Type9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type9</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType9
	 * @generated
	 */
	EClass getALTERNATIVEIDType9();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType9#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType9#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType9()
	 * @generated
	 */
	EReference getALTERNATIVEIDType9_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType10 <em>ALTERNATIVEID Type10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type10</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType10
	 * @generated
	 */
	EClass getALTERNATIVEIDType10();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType10#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType10#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType10()
	 * @generated
	 */
	EReference getALTERNATIVEIDType10_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType11 <em>ALTERNATIVEID Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type11</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType11
	 * @generated
	 */
	EClass getALTERNATIVEIDType11();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType11#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType11#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType11()
	 * @generated
	 */
	EReference getALTERNATIVEIDType11_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType12 <em>ALTERNATIVEID Type12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type12</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType12
	 * @generated
	 */
	EClass getALTERNATIVEIDType12();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType12#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType12#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType12()
	 * @generated
	 */
	EReference getALTERNATIVEIDType12_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType13 <em>ALTERNATIVEID Type13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type13</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType13
	 * @generated
	 */
	EClass getALTERNATIVEIDType13();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType13#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType13#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType13()
	 * @generated
	 */
	EReference getALTERNATIVEIDType13_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType14 <em>ALTERNATIVEID Type14</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type14</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType14
	 * @generated
	 */
	EClass getALTERNATIVEIDType14();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType14#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType14#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType14()
	 * @generated
	 */
	EReference getALTERNATIVEIDType14_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType15 <em>ALTERNATIVEID Type15</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type15</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType15
	 * @generated
	 */
	EClass getALTERNATIVEIDType15();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType15#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType15#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType15()
	 * @generated
	 */
	EReference getALTERNATIVEIDType15_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType16 <em>ALTERNATIVEID Type16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type16</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType16
	 * @generated
	 */
	EClass getALTERNATIVEIDType16();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType16#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType16#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType16()
	 * @generated
	 */
	EReference getALTERNATIVEIDType16_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType17 <em>ALTERNATIVEID Type17</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type17</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType17
	 * @generated
	 */
	EClass getALTERNATIVEIDType17();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType17#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType17#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType17()
	 * @generated
	 */
	EReference getALTERNATIVEIDType17_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType18 <em>ALTERNATIVEID Type18</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type18</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType18
	 * @generated
	 */
	EClass getALTERNATIVEIDType18();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType18#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType18#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType18()
	 * @generated
	 */
	EReference getALTERNATIVEIDType18_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType19 <em>ALTERNATIVEID Type19</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type19</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType19
	 * @generated
	 */
	EClass getALTERNATIVEIDType19();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType19#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType19#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType19()
	 * @generated
	 */
	EReference getALTERNATIVEIDType19_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType20 <em>ALTERNATIVEID Type20</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type20</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType20
	 * @generated
	 */
	EClass getALTERNATIVEIDType20();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType20#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType20#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType20()
	 * @generated
	 */
	EReference getALTERNATIVEIDType20_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType21 <em>ALTERNATIVEID Type21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type21</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType21
	 * @generated
	 */
	EClass getALTERNATIVEIDType21();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType21#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType21#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType21()
	 * @generated
	 */
	EReference getALTERNATIVEIDType21_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType22 <em>ALTERNATIVEID Type22</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type22</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType22
	 * @generated
	 */
	EClass getALTERNATIVEIDType22();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType22#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType22#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType22()
	 * @generated
	 */
	EReference getALTERNATIVEIDType22_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType23 <em>ALTERNATIVEID Type23</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALTERNATIVEID Type23</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType23
	 * @generated
	 */
	EClass getALTERNATIVEIDType23();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType23#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType23#getALTERNATIVEID()
	 * @see #getALTERNATIVEIDType23()
	 * @generated
	 */
	EReference getALTERNATIVEIDType23_ALTERNATIVEID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN <em>ATTRIBUTEDEFINITIONBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEDEFINITIONBOOLEAN</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN
	 * @generated
	 */
	EClass getATTRIBUTEDEFINITIONBOOLEAN();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN#getALTERNATIVEID()
	 * @see #getATTRIBUTEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONBOOLEAN_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFAULTVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN#getDEFAULTVALUE()
	 * @see #getATTRIBUTEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONBOOLEAN_DEFAULTVALUE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN#getTYPE()
	 * @see #getATTRIBUTEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONBOOLEAN_TYPE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN#getDESC()
	 * @see #getATTRIBUTEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONBOOLEAN_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN#getIDENTIFIER()
	 * @see #getATTRIBUTEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONBOOLEAN_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN#isISEDITABLE <em>ISEDITABLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISEDITABLE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN#isISEDITABLE()
	 * @see #getATTRIBUTEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONBOOLEAN_ISEDITABLE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN#getLASTCHANGE()
	 * @see #getATTRIBUTEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONBOOLEAN_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN#getLONGNAME()
	 * @see #getATTRIBUTEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONBOOLEAN_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE <em>ATTRIBUTEDEFINITIONDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEDEFINITIONDATE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE
	 * @generated
	 */
	EClass getATTRIBUTEDEFINITIONDATE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE#getALTERNATIVEID()
	 * @see #getATTRIBUTEDEFINITIONDATE()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONDATE_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFAULTVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE#getDEFAULTVALUE()
	 * @see #getATTRIBUTEDEFINITIONDATE()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONDATE_DEFAULTVALUE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE#getTYPE()
	 * @see #getATTRIBUTEDEFINITIONDATE()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONDATE_TYPE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE#getDESC()
	 * @see #getATTRIBUTEDEFINITIONDATE()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONDATE_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE#getIDENTIFIER()
	 * @see #getATTRIBUTEDEFINITIONDATE()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONDATE_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE#isISEDITABLE <em>ISEDITABLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISEDITABLE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE#isISEDITABLE()
	 * @see #getATTRIBUTEDEFINITIONDATE()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONDATE_ISEDITABLE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE#getLASTCHANGE()
	 * @see #getATTRIBUTEDEFINITIONDATE()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONDATE_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE#getLONGNAME()
	 * @see #getATTRIBUTEDEFINITIONDATE()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONDATE_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEDEFINITIONENUMERATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION
	 * @generated
	 */
	EClass getATTRIBUTEDEFINITIONENUMERATION();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFAULTVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#getDEFAULTVALUE()
	 * @see #getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONENUMERATION_DEFAULTVALUE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#getALTERNATIVEID()
	 * @see #getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONENUMERATION_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#getTYPE()
	 * @see #getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONENUMERATION_TYPE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#getDESC()
	 * @see #getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONENUMERATION_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#getIDENTIFIER()
	 * @see #getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONENUMERATION_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#isISEDITABLE <em>ISEDITABLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISEDITABLE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#isISEDITABLE()
	 * @see #getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONENUMERATION_ISEDITABLE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#getLASTCHANGE()
	 * @see #getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONENUMERATION_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#getLONGNAME()
	 * @see #getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONENUMERATION_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#isMULTIVALUED <em>MULTIVALUED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MULTIVALUED</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION#isMULTIVALUED()
	 * @see #getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONENUMERATION_MULTIVALUED();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER <em>ATTRIBUTEDEFINITIONINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEDEFINITIONINTEGER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER
	 * @generated
	 */
	EClass getATTRIBUTEDEFINITIONINTEGER();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getALTERNATIVEID()
	 * @see #getATTRIBUTEDEFINITIONINTEGER()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONINTEGER_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFAULTVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getDEFAULTVALUE()
	 * @see #getATTRIBUTEDEFINITIONINTEGER()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONINTEGER_DEFAULTVALUE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getTYPE()
	 * @see #getATTRIBUTEDEFINITIONINTEGER()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONINTEGER_TYPE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getDESC()
	 * @see #getATTRIBUTEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONINTEGER_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getIDENTIFIER()
	 * @see #getATTRIBUTEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONINTEGER_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#isISEDITABLE <em>ISEDITABLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISEDITABLE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#isISEDITABLE()
	 * @see #getATTRIBUTEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONINTEGER_ISEDITABLE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getLASTCHANGE()
	 * @see #getATTRIBUTEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONINTEGER_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER#getLONGNAME()
	 * @see #getATTRIBUTEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONINTEGER_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL <em>ATTRIBUTEDEFINITIONREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEDEFINITIONREAL</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL
	 * @generated
	 */
	EClass getATTRIBUTEDEFINITIONREAL();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL#getALTERNATIVEID()
	 * @see #getATTRIBUTEDEFINITIONREAL()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONREAL_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFAULTVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL#getDEFAULTVALUE()
	 * @see #getATTRIBUTEDEFINITIONREAL()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONREAL_DEFAULTVALUE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL#getTYPE()
	 * @see #getATTRIBUTEDEFINITIONREAL()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONREAL_TYPE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL#getDESC()
	 * @see #getATTRIBUTEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONREAL_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL#getIDENTIFIER()
	 * @see #getATTRIBUTEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONREAL_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL#isISEDITABLE <em>ISEDITABLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISEDITABLE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL#isISEDITABLE()
	 * @see #getATTRIBUTEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONREAL_ISEDITABLE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL#getLASTCHANGE()
	 * @see #getATTRIBUTEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONREAL_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL#getLONGNAME()
	 * @see #getATTRIBUTEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONREAL_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING <em>ATTRIBUTEDEFINITIONSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEDEFINITIONSTRING</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING
	 * @generated
	 */
	EClass getATTRIBUTEDEFINITIONSTRING();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING#getALTERNATIVEID()
	 * @see #getATTRIBUTEDEFINITIONSTRING()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONSTRING_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFAULTVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING#getDEFAULTVALUE()
	 * @see #getATTRIBUTEDEFINITIONSTRING()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONSTRING_DEFAULTVALUE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING#getTYPE()
	 * @see #getATTRIBUTEDEFINITIONSTRING()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONSTRING_TYPE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING#getDESC()
	 * @see #getATTRIBUTEDEFINITIONSTRING()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONSTRING_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING#getIDENTIFIER()
	 * @see #getATTRIBUTEDEFINITIONSTRING()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONSTRING_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING#isISEDITABLE <em>ISEDITABLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISEDITABLE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING#isISEDITABLE()
	 * @see #getATTRIBUTEDEFINITIONSTRING()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONSTRING_ISEDITABLE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING#getLASTCHANGE()
	 * @see #getATTRIBUTEDEFINITIONSTRING()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONSTRING_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING#getLONGNAME()
	 * @see #getATTRIBUTEDEFINITIONSTRING()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONSTRING_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML <em>ATTRIBUTEDEFINITIONXHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEDEFINITIONXHTML</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML
	 * @generated
	 */
	EClass getATTRIBUTEDEFINITIONXHTML();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML#getALTERNATIVEID()
	 * @see #getATTRIBUTEDEFINITIONXHTML()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONXHTML_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFAULTVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML#getDEFAULTVALUE()
	 * @see #getATTRIBUTEDEFINITIONXHTML()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONXHTML_DEFAULTVALUE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML#getTYPE()
	 * @see #getATTRIBUTEDEFINITIONXHTML()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONXHTML_TYPE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML#getDESC()
	 * @see #getATTRIBUTEDEFINITIONXHTML()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONXHTML_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML#getIDENTIFIER()
	 * @see #getATTRIBUTEDEFINITIONXHTML()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONXHTML_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML#isISEDITABLE <em>ISEDITABLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISEDITABLE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML#isISEDITABLE()
	 * @see #getATTRIBUTEDEFINITIONXHTML()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONXHTML_ISEDITABLE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML#getLASTCHANGE()
	 * @see #getATTRIBUTEDEFINITIONXHTML()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONXHTML_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML#getLONGNAME()
	 * @see #getATTRIBUTEDEFINITIONXHTML()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONXHTML_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEBOOLEAN <em>ATTRIBUTEVALUEBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEVALUEBOOLEAN</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEBOOLEAN
	 * @generated
	 */
	EClass getATTRIBUTEVALUEBOOLEAN();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEBOOLEAN#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEBOOLEAN#getDEFINITION()
	 * @see #getATTRIBUTEVALUEBOOLEAN()
	 * @generated
	 */
	EReference getATTRIBUTEVALUEBOOLEAN_DEFINITION();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEBOOLEAN#isTHEVALUE <em>THEVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>THEVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEBOOLEAN#isTHEVALUE()
	 * @see #getATTRIBUTEVALUEBOOLEAN()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEBOOLEAN_THEVALUE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEDATE <em>ATTRIBUTEVALUEDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEVALUEDATE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEDATE
	 * @generated
	 */
	EClass getATTRIBUTEVALUEDATE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEDATE#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEDATE#getDEFINITION()
	 * @see #getATTRIBUTEVALUEDATE()
	 * @generated
	 */
	EReference getATTRIBUTEVALUEDATE_DEFINITION();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEDATE#getTHEVALUE <em>THEVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>THEVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEDATE#getTHEVALUE()
	 * @see #getATTRIBUTEVALUEDATE()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEDATE_THEVALUE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEENUMERATION
	 * @generated
	 */
	EClass getATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEENUMERATION#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEENUMERATION#getDEFINITION()
	 * @see #getATTRIBUTEVALUEENUMERATION()
	 * @generated
	 */
	EReference getATTRIBUTEVALUEENUMERATION_DEFINITION();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEENUMERATION#getVALUES <em>VALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VALUES</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEENUMERATION#getVALUES()
	 * @see #getATTRIBUTEVALUEENUMERATION()
	 * @generated
	 */
	EReference getATTRIBUTEVALUEENUMERATION_VALUES();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEINTEGER <em>ATTRIBUTEVALUEINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEVALUEINTEGER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEINTEGER
	 * @generated
	 */
	EClass getATTRIBUTEVALUEINTEGER();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEINTEGER#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEINTEGER#getDEFINITION()
	 * @see #getATTRIBUTEVALUEINTEGER()
	 * @generated
	 */
	EReference getATTRIBUTEVALUEINTEGER_DEFINITION();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEINTEGER#getTHEVALUE <em>THEVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>THEVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEINTEGER#getTHEVALUE()
	 * @see #getATTRIBUTEVALUEINTEGER()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEINTEGER_THEVALUE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEREAL <em>ATTRIBUTEVALUEREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEVALUEREAL</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEREAL
	 * @generated
	 */
	EClass getATTRIBUTEVALUEREAL();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEREAL#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEREAL#getDEFINITION()
	 * @see #getATTRIBUTEVALUEREAL()
	 * @generated
	 */
	EReference getATTRIBUTEVALUEREAL_DEFINITION();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEREAL#getTHEVALUE <em>THEVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>THEVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEREAL#getTHEVALUE()
	 * @see #getATTRIBUTEVALUEREAL()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEREAL_THEVALUE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUESTRING <em>ATTRIBUTEVALUESTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEVALUESTRING</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUESTRING
	 * @generated
	 */
	EClass getATTRIBUTEVALUESTRING();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUESTRING#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUESTRING#getDEFINITION()
	 * @see #getATTRIBUTEVALUESTRING()
	 * @generated
	 */
	EReference getATTRIBUTEVALUESTRING_DEFINITION();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUESTRING#getTHEVALUE <em>THEVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>THEVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUESTRING#getTHEVALUE()
	 * @see #getATTRIBUTEVALUESTRING()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUESTRING_THEVALUE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML <em>ATTRIBUTEVALUEXHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEVALUEXHTML</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML
	 * @generated
	 */
	EClass getATTRIBUTEVALUEXHTML();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#getTHEVALUE <em>THEVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>THEVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#getTHEVALUE()
	 * @see #getATTRIBUTEVALUEXHTML()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEXHTML_THEVALUE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#getTHEORIGINALVALUE <em>THEORIGINALVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>THEORIGINALVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#getTHEORIGINALVALUE()
	 * @see #getATTRIBUTEVALUEXHTML()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEXHTML_THEORIGINALVALUE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#getDEFINITION()
	 * @see #getATTRIBUTEVALUEXHTML()
	 * @generated
	 */
	EReference getATTRIBUTEVALUEXHTML_DEFINITION();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#isISSIMPLIFIED <em>ISSIMPLIFIED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISSIMPLIFIED</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#isISSIMPLIFIED()
	 * @see #getATTRIBUTEVALUEXHTML()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEXHTML_ISSIMPLIFIED();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.CHILDRENType <em>CHILDREN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CHILDREN Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.CHILDRENType
	 * @generated
	 */
	EClass getCHILDRENType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.CHILDRENType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.CHILDRENType#getGroup()
	 * @see #getCHILDRENType()
	 * @generated
	 */
	EAttribute getCHILDRENType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.CHILDRENType#getSPECHIERARCHY <em>SPECHIERARCHY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECHIERARCHY</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.CHILDRENType#getSPECHIERARCHY()
	 * @see #getCHILDRENType()
	 * @generated
	 */
	EReference getCHILDRENType_SPECHIERARCHY();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.CHILDRENType1 <em>CHILDREN Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CHILDREN Type1</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.CHILDRENType1
	 * @generated
	 */
	EClass getCHILDRENType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.CHILDRENType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.CHILDRENType1#getGroup()
	 * @see #getCHILDRENType1()
	 * @generated
	 */
	EAttribute getCHILDRENType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.CHILDRENType1#getSPECHIERARCHY <em>SPECHIERARCHY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECHIERARCHY</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.CHILDRENType1#getSPECHIERARCHY()
	 * @see #getCHILDRENType1()
	 * @generated
	 */
	EReference getCHILDRENType1_SPECHIERARCHY();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.CORECONTENTType <em>CORECONTENT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CORECONTENT Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.CORECONTENTType
	 * @generated
	 */
	EClass getCORECONTENTType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.CORECONTENTType#getREQIFCONTENT <em>REQIFCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>REQIFCONTENT</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.CORECONTENTType#getREQIFCONTENT()
	 * @see #getCORECONTENTType()
	 * @generated
	 */
	EReference getCORECONTENTType_REQIFCONTENT();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN <em>DATATYPEDEFINITIONBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONBOOLEAN</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONBOOLEAN();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN#getALTERNATIVEID()
	 * @see #getDATATYPEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONBOOLEAN_ALTERNATIVEID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN#getDESC()
	 * @see #getDATATYPEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBOOLEAN_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN#getIDENTIFIER()
	 * @see #getDATATYPEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBOOLEAN_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN#getLASTCHANGE()
	 * @see #getDATATYPEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBOOLEAN_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN#getLONGNAME()
	 * @see #getDATATYPEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBOOLEAN_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE <em>DATATYPEDEFINITIONDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONDATE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONDATE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE#getALTERNATIVEID()
	 * @see #getDATATYPEDEFINITIONDATE()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONDATE_ALTERNATIVEID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE#getDESC()
	 * @see #getDATATYPEDEFINITIONDATE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONDATE_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE#getIDENTIFIER()
	 * @see #getDATATYPEDEFINITIONDATE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONDATE_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE#getLASTCHANGE()
	 * @see #getDATATYPEDEFINITIONDATE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONDATE_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE#getLONGNAME()
	 * @see #getDATATYPEDEFINITIONDATE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONDATE_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION <em>DATATYPEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONENUMERATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONENUMERATION();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION#getALTERNATIVEID()
	 * @see #getDATATYPEDEFINITIONENUMERATION()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONENUMERATION_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION#getSPECIFIEDVALUES <em>SPECIFIEDVALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECIFIEDVALUES</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION#getSPECIFIEDVALUES()
	 * @see #getDATATYPEDEFINITIONENUMERATION()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONENUMERATION_SPECIFIEDVALUES();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION#getDESC()
	 * @see #getDATATYPEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONENUMERATION_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION#getIDENTIFIER()
	 * @see #getDATATYPEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONENUMERATION_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION#getLASTCHANGE()
	 * @see #getDATATYPEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONENUMERATION_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION#getLONGNAME()
	 * @see #getDATATYPEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONENUMERATION_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER <em>DATATYPEDEFINITIONINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONINTEGER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONINTEGER();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER#getALTERNATIVEID()
	 * @see #getDATATYPEDEFINITIONINTEGER()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONINTEGER_ALTERNATIVEID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER#getDESC()
	 * @see #getDATATYPEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONINTEGER_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER#getIDENTIFIER()
	 * @see #getDATATYPEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONINTEGER_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER#getLASTCHANGE()
	 * @see #getDATATYPEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONINTEGER_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER#getLONGNAME()
	 * @see #getDATATYPEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONINTEGER_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER#getMAX <em>MAX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAX</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER#getMAX()
	 * @see #getDATATYPEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONINTEGER_MAX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER#getMIN <em>MIN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MIN</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER#getMIN()
	 * @see #getDATATYPEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONINTEGER_MIN();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL <em>DATATYPEDEFINITIONREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONREAL</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONREAL();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getALTERNATIVEID()
	 * @see #getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONREAL_ALTERNATIVEID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getACCURACY <em>ACCURACY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ACCURACY</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getACCURACY()
	 * @see #getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONREAL_ACCURACY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getDESC()
	 * @see #getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONREAL_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getIDENTIFIER()
	 * @see #getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONREAL_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getLASTCHANGE()
	 * @see #getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONREAL_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getLONGNAME()
	 * @see #getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONREAL_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getMAX <em>MAX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAX</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getMAX()
	 * @see #getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONREAL_MAX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getMIN <em>MIN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MIN</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getMIN()
	 * @see #getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONREAL_MIN();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING <em>DATATYPEDEFINITIONSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONSTRING</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONSTRING();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING#getALTERNATIVEID()
	 * @see #getDATATYPEDEFINITIONSTRING()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONSTRING_ALTERNATIVEID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING#getDESC()
	 * @see #getDATATYPEDEFINITIONSTRING()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONSTRING_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING#getIDENTIFIER()
	 * @see #getDATATYPEDEFINITIONSTRING()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONSTRING_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING#getLASTCHANGE()
	 * @see #getDATATYPEDEFINITIONSTRING()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONSTRING_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING#getLONGNAME()
	 * @see #getDATATYPEDEFINITIONSTRING()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONSTRING_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING#getMAXLENGTH <em>MAXLENGTH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXLENGTH</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING#getMAXLENGTH()
	 * @see #getDATATYPEDEFINITIONSTRING()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONSTRING_MAXLENGTH();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML <em>DATATYPEDEFINITIONXHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONXHTML</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONXHTML();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML#getALTERNATIVEID()
	 * @see #getDATATYPEDEFINITIONXHTML()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONXHTML_ALTERNATIVEID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML#getDESC()
	 * @see #getDATATYPEDEFINITIONXHTML()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONXHTML_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML#getIDENTIFIER()
	 * @see #getDATATYPEDEFINITIONXHTML()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONXHTML_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML#getLASTCHANGE()
	 * @see #getDATATYPEDEFINITIONXHTML()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONXHTML_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML#getLONGNAME()
	 * @see #getDATATYPEDEFINITIONXHTML()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONXHTML_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType <em>DATATYPES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPES Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType
	 * @generated
	 */
	EClass getDATATYPESType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType#getGroup()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EAttribute getDATATYPESType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType#getDATATYPEDEFINITIONBOOLEAN <em>DATATYPEDEFINITIONBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONBOOLEAN</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType#getDATATYPEDEFINITIONBOOLEAN()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EReference getDATATYPESType_DATATYPEDEFINITIONBOOLEAN();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType#getDATATYPEDEFINITIONDATE <em>DATATYPEDEFINITIONDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONDATE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType#getDATATYPEDEFINITIONDATE()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EReference getDATATYPESType_DATATYPEDEFINITIONDATE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType#getDATATYPEDEFINITIONENUMERATION <em>DATATYPEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONENUMERATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType#getDATATYPEDEFINITIONENUMERATION()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EReference getDATATYPESType_DATATYPEDEFINITIONENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType#getDATATYPEDEFINITIONINTEGER <em>DATATYPEDEFINITIONINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONINTEGER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType#getDATATYPEDEFINITIONINTEGER()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EReference getDATATYPESType_DATATYPEDEFINITIONINTEGER();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType#getDATATYPEDEFINITIONREAL <em>DATATYPEDEFINITIONREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONREAL</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType#getDATATYPEDEFINITIONREAL()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EReference getDATATYPESType_DATATYPEDEFINITIONREAL();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType#getDATATYPEDEFINITIONSTRING <em>DATATYPEDEFINITIONSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONSTRING</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType#getDATATYPEDEFINITIONSTRING()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EReference getDATATYPESType_DATATYPEDEFINITIONSTRING();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType#getDATATYPEDEFINITIONXHTML <em>DATATYPEDEFINITIONXHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONXHTML</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType#getDATATYPEDEFINITIONXHTML()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EReference getDATATYPESType_DATATYPEDEFINITIONXHTML();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType <em>DEFAULTVALUE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFAULTVALUE Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType
	 * @generated
	 */
	EClass getDEFAULTVALUEType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType#getATTRIBUTEVALUEDATE <em>ATTRIBUTEVALUEDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEDATE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType#getATTRIBUTEVALUEDATE()
	 * @see #getDEFAULTVALUEType()
	 * @generated
	 */
	EReference getDEFAULTVALUEType_ATTRIBUTEVALUEDATE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType1 <em>DEFAULTVALUE Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFAULTVALUE Type1</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType1
	 * @generated
	 */
	EClass getDEFAULTVALUEType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType1#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType1#getATTRIBUTEVALUEENUMERATION()
	 * @see #getDEFAULTVALUEType1()
	 * @generated
	 */
	EReference getDEFAULTVALUEType1_ATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType2 <em>DEFAULTVALUE Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFAULTVALUE Type2</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType2
	 * @generated
	 */
	EClass getDEFAULTVALUEType2();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType2#getATTRIBUTEVALUEINTEGER <em>ATTRIBUTEVALUEINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEINTEGER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType2#getATTRIBUTEVALUEINTEGER()
	 * @see #getDEFAULTVALUEType2()
	 * @generated
	 */
	EReference getDEFAULTVALUEType2_ATTRIBUTEVALUEINTEGER();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType3 <em>DEFAULTVALUE Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFAULTVALUE Type3</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType3
	 * @generated
	 */
	EClass getDEFAULTVALUEType3();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType3#getATTRIBUTEVALUEREAL <em>ATTRIBUTEVALUEREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEREAL</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType3#getATTRIBUTEVALUEREAL()
	 * @see #getDEFAULTVALUEType3()
	 * @generated
	 */
	EReference getDEFAULTVALUEType3_ATTRIBUTEVALUEREAL();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType4 <em>DEFAULTVALUE Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFAULTVALUE Type4</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType4
	 * @generated
	 */
	EClass getDEFAULTVALUEType4();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType4#getATTRIBUTEVALUESTRING <em>ATTRIBUTEVALUESTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUESTRING</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType4#getATTRIBUTEVALUESTRING()
	 * @see #getDEFAULTVALUEType4()
	 * @generated
	 */
	EReference getDEFAULTVALUEType4_ATTRIBUTEVALUESTRING();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType5 <em>DEFAULTVALUE Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFAULTVALUE Type5</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType5
	 * @generated
	 */
	EClass getDEFAULTVALUEType5();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType5#getATTRIBUTEVALUEXHTML <em>ATTRIBUTEVALUEXHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEXHTML</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType5#getATTRIBUTEVALUEXHTML()
	 * @see #getDEFAULTVALUEType5()
	 * @generated
	 */
	EReference getDEFAULTVALUEType5_ATTRIBUTEVALUEXHTML();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType6 <em>DEFAULTVALUE Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFAULTVALUE Type6</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType6
	 * @generated
	 */
	EClass getDEFAULTVALUEType6();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType6#getATTRIBUTEVALUEBOOLEAN <em>ATTRIBUTEVALUEBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEBOOLEAN</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType6#getATTRIBUTEVALUEBOOLEAN()
	 * @see #getDEFAULTVALUEType6()
	 * @generated
	 */
	EReference getDEFAULTVALUEType6_ATTRIBUTEVALUEBOOLEAN();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType <em>DEFINITION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFINITION Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType
	 * @generated
	 */
	EClass getDEFINITIONType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType#getATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @see #getDEFINITIONType()
	 * @generated
	 */
	EAttribute getDEFINITIONType_ATTRIBUTEDEFINITIONENUMERATIONREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType1 <em>DEFINITION Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFINITION Type1</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType1
	 * @generated
	 */
	EClass getDEFINITIONType1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType1#getATTRIBUTEDEFINITIONDATEREF <em>ATTRIBUTEDEFINITIONDATEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ATTRIBUTEDEFINITIONDATEREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType1#getATTRIBUTEDEFINITIONDATEREF()
	 * @see #getDEFINITIONType1()
	 * @generated
	 */
	EAttribute getDEFINITIONType1_ATTRIBUTEDEFINITIONDATEREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType2 <em>DEFINITION Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFINITION Type2</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType2
	 * @generated
	 */
	EClass getDEFINITIONType2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType2#getATTRIBUTEDEFINITIONSTRINGREF <em>ATTRIBUTEDEFINITIONSTRINGREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ATTRIBUTEDEFINITIONSTRINGREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType2#getATTRIBUTEDEFINITIONSTRINGREF()
	 * @see #getDEFINITIONType2()
	 * @generated
	 */
	EAttribute getDEFINITIONType2_ATTRIBUTEDEFINITIONSTRINGREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType3 <em>DEFINITION Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFINITION Type3</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType3
	 * @generated
	 */
	EClass getDEFINITIONType3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType3#getATTRIBUTEDEFINITIONXHTMLREF <em>ATTRIBUTEDEFINITIONXHTMLREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ATTRIBUTEDEFINITIONXHTMLREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType3#getATTRIBUTEDEFINITIONXHTMLREF()
	 * @see #getDEFINITIONType3()
	 * @generated
	 */
	EAttribute getDEFINITIONType3_ATTRIBUTEDEFINITIONXHTMLREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType4 <em>DEFINITION Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFINITION Type4</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType4
	 * @generated
	 */
	EClass getDEFINITIONType4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType4#getATTRIBUTEDEFINITIONREALREF <em>ATTRIBUTEDEFINITIONREALREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ATTRIBUTEDEFINITIONREALREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType4#getATTRIBUTEDEFINITIONREALREF()
	 * @see #getDEFINITIONType4()
	 * @generated
	 */
	EAttribute getDEFINITIONType4_ATTRIBUTEDEFINITIONREALREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType5 <em>DEFINITION Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFINITION Type5</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType5
	 * @generated
	 */
	EClass getDEFINITIONType5();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType5#getATTRIBUTEDEFINITIONINTEGERREF <em>ATTRIBUTEDEFINITIONINTEGERREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ATTRIBUTEDEFINITIONINTEGERREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType5#getATTRIBUTEDEFINITIONINTEGERREF()
	 * @see #getDEFINITIONType5()
	 * @generated
	 */
	EAttribute getDEFINITIONType5_ATTRIBUTEDEFINITIONINTEGERREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType6 <em>DEFINITION Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFINITION Type6</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType6
	 * @generated
	 */
	EClass getDEFINITIONType6();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType6#getATTRIBUTEDEFINITIONBOOLEANREF <em>ATTRIBUTEDEFINITIONBOOLEANREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ATTRIBUTEDEFINITIONBOOLEANREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType6#getATTRIBUTEDEFINITIONBOOLEANREF()
	 * @see #getDEFINITIONType6()
	 * @generated
	 */
	EAttribute getDEFINITIONType6_ATTRIBUTEDEFINITIONBOOLEANREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DocumentRoot#getREQIF <em>REQIF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>REQIF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.DocumentRoot#getREQIF()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_REQIF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType <em>EDITABLEATTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDITABLEATTS Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType
	 * @generated
	 */
	EClass getEDITABLEATTSType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getGroup()
	 * @see #getEDITABLEATTSType()
	 * @generated
	 */
	EAttribute getEDITABLEATTSType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONBOOLEANREF <em>ATTRIBUTEDEFINITIONBOOLEANREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ATTRIBUTEDEFINITIONBOOLEANREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONBOOLEANREF()
	 * @see #getEDITABLEATTSType()
	 * @generated
	 */
	EAttribute getEDITABLEATTSType_ATTRIBUTEDEFINITIONBOOLEANREF();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONDATEREF <em>ATTRIBUTEDEFINITIONDATEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ATTRIBUTEDEFINITIONDATEREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONDATEREF()
	 * @see #getEDITABLEATTSType()
	 * @generated
	 */
	EAttribute getEDITABLEATTSType_ATTRIBUTEDEFINITIONDATEREF();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @see #getEDITABLEATTSType()
	 * @generated
	 */
	EAttribute getEDITABLEATTSType_ATTRIBUTEDEFINITIONENUMERATIONREF();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONINTEGERREF <em>ATTRIBUTEDEFINITIONINTEGERREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ATTRIBUTEDEFINITIONINTEGERREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONINTEGERREF()
	 * @see #getEDITABLEATTSType()
	 * @generated
	 */
	EAttribute getEDITABLEATTSType_ATTRIBUTEDEFINITIONINTEGERREF();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONREALREF <em>ATTRIBUTEDEFINITIONREALREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ATTRIBUTEDEFINITIONREALREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONREALREF()
	 * @see #getEDITABLEATTSType()
	 * @generated
	 */
	EAttribute getEDITABLEATTSType_ATTRIBUTEDEFINITIONREALREF();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONSTRINGREF <em>ATTRIBUTEDEFINITIONSTRINGREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ATTRIBUTEDEFINITIONSTRINGREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONSTRINGREF()
	 * @see #getEDITABLEATTSType()
	 * @generated
	 */
	EAttribute getEDITABLEATTSType_ATTRIBUTEDEFINITIONSTRINGREF();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONXHTMLREF <em>ATTRIBUTEDEFINITIONXHTMLREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ATTRIBUTEDEFINITIONXHTMLREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONXHTMLREF()
	 * @see #getEDITABLEATTSType()
	 * @generated
	 */
	EAttribute getEDITABLEATTSType_ATTRIBUTEDEFINITIONXHTMLREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EMBEDDEDVALUE <em>EMBEDDEDVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMBEDDEDVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.EMBEDDEDVALUE
	 * @generated
	 */
	EClass getEMBEDDEDVALUE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EMBEDDEDVALUE#getKEY <em>KEY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KEY</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.EMBEDDEDVALUE#getKEY()
	 * @see #getEMBEDDEDVALUE()
	 * @generated
	 */
	EAttribute getEMBEDDEDVALUE_KEY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EMBEDDEDVALUE#getOTHERCONTENT <em>OTHERCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OTHERCONTENT</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.EMBEDDEDVALUE#getOTHERCONTENT()
	 * @see #getEMBEDDEDVALUE()
	 * @generated
	 */
	EAttribute getEMBEDDEDVALUE_OTHERCONTENT();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE <em>ENUMVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENUMVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE
	 * @generated
	 */
	EClass getENUMVALUE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE#getALTERNATIVEID()
	 * @see #getENUMVALUE()
	 * @generated
	 */
	EReference getENUMVALUE_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE#getPROPERTIES <em>PROPERTIES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PROPERTIES</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE#getPROPERTIES()
	 * @see #getENUMVALUE()
	 * @generated
	 */
	EReference getENUMVALUE_PROPERTIES();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE#getDESC()
	 * @see #getENUMVALUE()
	 * @generated
	 */
	EAttribute getENUMVALUE_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE#getIDENTIFIER()
	 * @see #getENUMVALUE()
	 * @generated
	 */
	EAttribute getENUMVALUE_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE#getLASTCHANGE()
	 * @see #getENUMVALUE()
	 * @generated
	 */
	EAttribute getENUMVALUE_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE#getLONGNAME()
	 * @see #getENUMVALUE()
	 * @generated
	 */
	EAttribute getENUMVALUE_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.OBJECTType <em>OBJECT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OBJECT Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.OBJECTType
	 * @generated
	 */
	EClass getOBJECTType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.OBJECTType#getSPECOBJECTREF <em>SPECOBJECTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECOBJECTREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.OBJECTType#getSPECOBJECTREF()
	 * @see #getOBJECTType()
	 * @generated
	 */
	EAttribute getOBJECTType_SPECOBJECTREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.PROPERTIESType <em>PROPERTIES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PROPERTIES Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.PROPERTIESType
	 * @generated
	 */
	EClass getPROPERTIESType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.PROPERTIESType#getEMBEDDEDVALUE <em>EMBEDDEDVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EMBEDDEDVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.PROPERTIESType#getEMBEDDEDVALUE()
	 * @see #getPROPERTIESType()
	 * @generated
	 */
	EReference getPROPERTIESType_EMBEDDEDVALUE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP <em>RELATIONGROUP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RELATIONGROUP</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP
	 * @generated
	 */
	EClass getRELATIONGROUP();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getALTERNATIVEID()
	 * @see #getRELATIONGROUP()
	 * @generated
	 */
	EReference getRELATIONGROUP_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getSOURCESPECIFICATION <em>SOURCESPECIFICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SOURCESPECIFICATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getSOURCESPECIFICATION()
	 * @see #getRELATIONGROUP()
	 * @generated
	 */
	EReference getRELATIONGROUP_SOURCESPECIFICATION();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getSPECRELATIONS <em>SPECRELATIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECRELATIONS</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getSPECRELATIONS()
	 * @see #getRELATIONGROUP()
	 * @generated
	 */
	EReference getRELATIONGROUP_SPECRELATIONS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getTARGETSPECIFICATION <em>TARGETSPECIFICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TARGETSPECIFICATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getTARGETSPECIFICATION()
	 * @see #getRELATIONGROUP()
	 * @generated
	 */
	EReference getRELATIONGROUP_TARGETSPECIFICATION();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getTYPE()
	 * @see #getRELATIONGROUP()
	 * @generated
	 */
	EReference getRELATIONGROUP_TYPE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getDESC()
	 * @see #getRELATIONGROUP()
	 * @generated
	 */
	EAttribute getRELATIONGROUP_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getIDENTIFIER()
	 * @see #getRELATIONGROUP()
	 * @generated
	 */
	EAttribute getRELATIONGROUP_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getLASTCHANGE()
	 * @see #getRELATIONGROUP()
	 * @generated
	 */
	EAttribute getRELATIONGROUP_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP#getLONGNAME()
	 * @see #getRELATIONGROUP()
	 * @generated
	 */
	EAttribute getRELATIONGROUP_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE <em>RELATIONGROUPTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RELATIONGROUPTYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE
	 * @generated
	 */
	EClass getRELATIONGROUPTYPE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE#getALTERNATIVEID()
	 * @see #getRELATIONGROUPTYPE()
	 * @generated
	 */
	EReference getRELATIONGROUPTYPE_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE#getSPECATTRIBUTES <em>SPECATTRIBUTES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECATTRIBUTES</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE#getSPECATTRIBUTES()
	 * @see #getRELATIONGROUPTYPE()
	 * @generated
	 */
	EReference getRELATIONGROUPTYPE_SPECATTRIBUTES();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE#getDESC()
	 * @see #getRELATIONGROUPTYPE()
	 * @generated
	 */
	EAttribute getRELATIONGROUPTYPE_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE#getIDENTIFIER()
	 * @see #getRELATIONGROUPTYPE()
	 * @generated
	 */
	EAttribute getRELATIONGROUPTYPE_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE#getLASTCHANGE()
	 * @see #getRELATIONGROUPTYPE()
	 * @generated
	 */
	EAttribute getRELATIONGROUPTYPE_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE#getLONGNAME()
	 * @see #getRELATIONGROUPTYPE()
	 * @generated
	 */
	EAttribute getRELATIONGROUPTYPE_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF <em>REQIF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REQIF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF
	 * @generated
	 */
	EClass getREQIF();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF#getTHEHEADER <em>THEHEADER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>THEHEADER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF#getTHEHEADER()
	 * @see #getREQIF()
	 * @generated
	 */
	EReference getREQIF_THEHEADER();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF#getCORECONTENT <em>CORECONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CORECONTENT</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF#getCORECONTENT()
	 * @see #getREQIF()
	 * @generated
	 */
	EReference getREQIF_CORECONTENT();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF#getTOOLEXTENSIONS <em>TOOLEXTENSIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TOOLEXTENSIONS</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF#getTOOLEXTENSIONS()
	 * @see #getREQIF()
	 * @generated
	 */
	EReference getREQIF_TOOLEXTENSIONS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF#getLang()
	 * @see #getREQIF()
	 * @generated
	 */
	EAttribute getREQIF_Lang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT <em>REQIFCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REQIFCONTENT</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT
	 * @generated
	 */
	EClass getREQIFCONTENT();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getDATATYPES <em>DATATYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DATATYPES</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getDATATYPES()
	 * @see #getREQIFCONTENT()
	 * @generated
	 */
	EReference getREQIFCONTENT_DATATYPES();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECTYPES <em>SPECTYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECTYPES</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECTYPES()
	 * @see #getREQIFCONTENT()
	 * @generated
	 */
	EReference getREQIFCONTENT_SPECTYPES();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECOBJECTS <em>SPECOBJECTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECOBJECTS</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECOBJECTS()
	 * @see #getREQIFCONTENT()
	 * @generated
	 */
	EReference getREQIFCONTENT_SPECOBJECTS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECRELATIONS <em>SPECRELATIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECRELATIONS</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECRELATIONS()
	 * @see #getREQIFCONTENT()
	 * @generated
	 */
	EReference getREQIFCONTENT_SPECRELATIONS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECIFICATIONS <em>SPECIFICATIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECIFICATIONS</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECIFICATIONS()
	 * @see #getREQIFCONTENT()
	 * @generated
	 */
	EReference getREQIFCONTENT_SPECIFICATIONS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECRELATIONGROUPS <em>SPECRELATIONGROUPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECRELATIONGROUPS</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECRELATIONGROUPS()
	 * @see #getREQIFCONTENT()
	 * @generated
	 */
	EReference getREQIFCONTENT_SPECRELATIONGROUPS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER <em>REQIFHEADER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REQIFHEADER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER
	 * @generated
	 */
	EClass getREQIFHEADER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getCOMMENT <em>COMMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>COMMENT</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getCOMMENT()
	 * @see #getREQIFHEADER()
	 * @generated
	 */
	EAttribute getREQIFHEADER_COMMENT();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getCREATIONTIME <em>CREATIONTIME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CREATIONTIME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getCREATIONTIME()
	 * @see #getREQIFHEADER()
	 * @generated
	 */
	EAttribute getREQIFHEADER_CREATIONTIME();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getREPOSITORYID <em>REPOSITORYID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>REPOSITORYID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getREPOSITORYID()
	 * @see #getREQIFHEADER()
	 * @generated
	 */
	EAttribute getREQIFHEADER_REPOSITORYID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getREQIFTOOLID <em>REQIFTOOLID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>REQIFTOOLID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getREQIFTOOLID()
	 * @see #getREQIFHEADER()
	 * @generated
	 */
	EAttribute getREQIFHEADER_REQIFTOOLID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getREQIFVERSION <em>REQIFVERSION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>REQIFVERSION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getREQIFVERSION()
	 * @see #getREQIFHEADER()
	 * @generated
	 */
	EAttribute getREQIFHEADER_REQIFVERSION();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getSOURCETOOLID <em>SOURCETOOLID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SOURCETOOLID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getSOURCETOOLID()
	 * @see #getREQIFHEADER()
	 * @generated
	 */
	EAttribute getREQIFHEADER_SOURCETOOLID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getTITLE <em>TITLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TITLE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getTITLE()
	 * @see #getREQIFHEADER()
	 * @generated
	 */
	EAttribute getREQIFHEADER_TITLE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getIDENTIFIER()
	 * @see #getREQIFHEADER()
	 * @generated
	 */
	EAttribute getREQIFHEADER_IDENTIFIER();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFTOOLEXTENSION <em>REQIFTOOLEXTENSION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REQIFTOOLEXTENSION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFTOOLEXTENSION
	 * @generated
	 */
	EClass getREQIFTOOLEXTENSION();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFTOOLEXTENSION#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFTOOLEXTENSION#getAny()
	 * @see #getREQIFTOOLEXTENSION()
	 * @generated
	 */
	EAttribute getREQIFTOOLEXTENSION_Any();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SOURCESPECIFICATIONType <em>SOURCESPECIFICATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SOURCESPECIFICATION Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SOURCESPECIFICATIONType
	 * @generated
	 */
	EClass getSOURCESPECIFICATIONType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SOURCESPECIFICATIONType#getSPECIFICATIONREF <em>SPECIFICATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECIFICATIONREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SOURCESPECIFICATIONType#getSPECIFICATIONREF()
	 * @see #getSOURCESPECIFICATIONType()
	 * @generated
	 */
	EAttribute getSOURCESPECIFICATIONType_SPECIFICATIONREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SOURCEType <em>SOURCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SOURCE Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SOURCEType
	 * @generated
	 */
	EClass getSOURCEType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SOURCEType#getSPECOBJECTREF <em>SPECOBJECTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECOBJECTREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SOURCEType#getSPECOBJECTREF()
	 * @see #getSOURCEType()
	 * @generated
	 */
	EAttribute getSOURCEType_SPECOBJECTREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType <em>SPECATTRIBUTES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECATTRIBUTES Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType
	 * @generated
	 */
	EClass getSPECATTRIBUTESType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType#getGroup()
	 * @see #getSPECATTRIBUTESType()
	 * @generated
	 */
	EAttribute getSPECATTRIBUTESType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONBOOLEAN <em>ATTRIBUTEDEFINITIONBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONBOOLEAN</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONBOOLEAN()
	 * @see #getSPECATTRIBUTESType()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONBOOLEAN();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONDATE <em>ATTRIBUTEDEFINITIONDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONDATE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONDATE()
	 * @see #getSPECATTRIBUTESType()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONDATE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONENUMERATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONENUMERATION()
	 * @see #getSPECATTRIBUTESType()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONINTEGER <em>ATTRIBUTEDEFINITIONINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONINTEGER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONINTEGER()
	 * @see #getSPECATTRIBUTESType()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONINTEGER();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONREAL <em>ATTRIBUTEDEFINITIONREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONREAL</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONREAL()
	 * @see #getSPECATTRIBUTESType()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONREAL();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONSTRING <em>ATTRIBUTEDEFINITIONSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONSTRING</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONSTRING()
	 * @see #getSPECATTRIBUTESType()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONSTRING();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONXHTML <em>ATTRIBUTEDEFINITIONXHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONXHTML</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONXHTML()
	 * @see #getSPECATTRIBUTESType()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONXHTML();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1 <em>SPECATTRIBUTES Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECATTRIBUTES Type1</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1
	 * @generated
	 */
	EClass getSPECATTRIBUTESType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1#getGroup()
	 * @see #getSPECATTRIBUTESType1()
	 * @generated
	 */
	EAttribute getSPECATTRIBUTESType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1#getATTRIBUTEDEFINITIONBOOLEAN <em>ATTRIBUTEDEFINITIONBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONBOOLEAN</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1#getATTRIBUTEDEFINITIONBOOLEAN()
	 * @see #getSPECATTRIBUTESType1()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONBOOLEAN();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1#getATTRIBUTEDEFINITIONDATE <em>ATTRIBUTEDEFINITIONDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONDATE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1#getATTRIBUTEDEFINITIONDATE()
	 * @see #getSPECATTRIBUTESType1()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONDATE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1#getATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONENUMERATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1#getATTRIBUTEDEFINITIONENUMERATION()
	 * @see #getSPECATTRIBUTESType1()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1#getATTRIBUTEDEFINITIONINTEGER <em>ATTRIBUTEDEFINITIONINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONINTEGER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1#getATTRIBUTEDEFINITIONINTEGER()
	 * @see #getSPECATTRIBUTESType1()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONINTEGER();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1#getATTRIBUTEDEFINITIONREAL <em>ATTRIBUTEDEFINITIONREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONREAL</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1#getATTRIBUTEDEFINITIONREAL()
	 * @see #getSPECATTRIBUTESType1()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONREAL();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1#getATTRIBUTEDEFINITIONSTRING <em>ATTRIBUTEDEFINITIONSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONSTRING</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1#getATTRIBUTEDEFINITIONSTRING()
	 * @see #getSPECATTRIBUTESType1()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONSTRING();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1#getATTRIBUTEDEFINITIONXHTML <em>ATTRIBUTEDEFINITIONXHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONXHTML</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1#getATTRIBUTEDEFINITIONXHTML()
	 * @see #getSPECATTRIBUTESType1()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONXHTML();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2 <em>SPECATTRIBUTES Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECATTRIBUTES Type2</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2
	 * @generated
	 */
	EClass getSPECATTRIBUTESType2();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2#getGroup()
	 * @see #getSPECATTRIBUTESType2()
	 * @generated
	 */
	EAttribute getSPECATTRIBUTESType2_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2#getATTRIBUTEDEFINITIONBOOLEAN <em>ATTRIBUTEDEFINITIONBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONBOOLEAN</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2#getATTRIBUTEDEFINITIONBOOLEAN()
	 * @see #getSPECATTRIBUTESType2()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONBOOLEAN();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2#getATTRIBUTEDEFINITIONDATE <em>ATTRIBUTEDEFINITIONDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONDATE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2#getATTRIBUTEDEFINITIONDATE()
	 * @see #getSPECATTRIBUTESType2()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONDATE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2#getATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONENUMERATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2#getATTRIBUTEDEFINITIONENUMERATION()
	 * @see #getSPECATTRIBUTESType2()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2#getATTRIBUTEDEFINITIONINTEGER <em>ATTRIBUTEDEFINITIONINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONINTEGER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2#getATTRIBUTEDEFINITIONINTEGER()
	 * @see #getSPECATTRIBUTESType2()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONINTEGER();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2#getATTRIBUTEDEFINITIONREAL <em>ATTRIBUTEDEFINITIONREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONREAL</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2#getATTRIBUTEDEFINITIONREAL()
	 * @see #getSPECATTRIBUTESType2()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONREAL();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2#getATTRIBUTEDEFINITIONSTRING <em>ATTRIBUTEDEFINITIONSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONSTRING</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2#getATTRIBUTEDEFINITIONSTRING()
	 * @see #getSPECATTRIBUTESType2()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONSTRING();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2#getATTRIBUTEDEFINITIONXHTML <em>ATTRIBUTEDEFINITIONXHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONXHTML</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2#getATTRIBUTEDEFINITIONXHTML()
	 * @see #getSPECATTRIBUTESType2()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONXHTML();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3 <em>SPECATTRIBUTES Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECATTRIBUTES Type3</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3
	 * @generated
	 */
	EClass getSPECATTRIBUTESType3();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3#getGroup()
	 * @see #getSPECATTRIBUTESType3()
	 * @generated
	 */
	EAttribute getSPECATTRIBUTESType3_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3#getATTRIBUTEDEFINITIONBOOLEAN <em>ATTRIBUTEDEFINITIONBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONBOOLEAN</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3#getATTRIBUTEDEFINITIONBOOLEAN()
	 * @see #getSPECATTRIBUTESType3()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONBOOLEAN();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3#getATTRIBUTEDEFINITIONDATE <em>ATTRIBUTEDEFINITIONDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONDATE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3#getATTRIBUTEDEFINITIONDATE()
	 * @see #getSPECATTRIBUTESType3()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONDATE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3#getATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONENUMERATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3#getATTRIBUTEDEFINITIONENUMERATION()
	 * @see #getSPECATTRIBUTESType3()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3#getATTRIBUTEDEFINITIONINTEGER <em>ATTRIBUTEDEFINITIONINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONINTEGER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3#getATTRIBUTEDEFINITIONINTEGER()
	 * @see #getSPECATTRIBUTESType3()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONINTEGER();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3#getATTRIBUTEDEFINITIONREAL <em>ATTRIBUTEDEFINITIONREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONREAL</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3#getATTRIBUTEDEFINITIONREAL()
	 * @see #getSPECATTRIBUTESType3()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONREAL();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3#getATTRIBUTEDEFINITIONSTRING <em>ATTRIBUTEDEFINITIONSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONSTRING</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3#getATTRIBUTEDEFINITIONSTRING()
	 * @see #getSPECATTRIBUTESType3()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONSTRING();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3#getATTRIBUTEDEFINITIONXHTML <em>ATTRIBUTEDEFINITIONXHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONXHTML</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3#getATTRIBUTEDEFINITIONXHTML()
	 * @see #getSPECATTRIBUTESType3()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONXHTML();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY <em>SPECHIERARCHY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECHIERARCHY</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY
	 * @generated
	 */
	EClass getSPECHIERARCHY();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#getALTERNATIVEID()
	 * @see #getSPECHIERARCHY()
	 * @generated
	 */
	EReference getSPECHIERARCHY_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#getCHILDREN <em>CHILDREN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CHILDREN</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#getCHILDREN()
	 * @see #getSPECHIERARCHY()
	 * @generated
	 */
	EReference getSPECHIERARCHY_CHILDREN();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#getEDITABLEATTS <em>EDITABLEATTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EDITABLEATTS</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#getEDITABLEATTS()
	 * @see #getSPECHIERARCHY()
	 * @generated
	 */
	EReference getSPECHIERARCHY_EDITABLEATTS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#getOBJECT <em>OBJECT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>OBJECT</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#getOBJECT()
	 * @see #getSPECHIERARCHY()
	 * @generated
	 */
	EReference getSPECHIERARCHY_OBJECT();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#getDESC()
	 * @see #getSPECHIERARCHY()
	 * @generated
	 */
	EAttribute getSPECHIERARCHY_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#getIDENTIFIER()
	 * @see #getSPECHIERARCHY()
	 * @generated
	 */
	EAttribute getSPECHIERARCHY_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#isISEDITABLE <em>ISEDITABLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISEDITABLE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#isISEDITABLE()
	 * @see #getSPECHIERARCHY()
	 * @generated
	 */
	EAttribute getSPECHIERARCHY_ISEDITABLE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#isISTABLEINTERNAL <em>ISTABLEINTERNAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISTABLEINTERNAL</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#isISTABLEINTERNAL()
	 * @see #getSPECHIERARCHY()
	 * @generated
	 */
	EAttribute getSPECHIERARCHY_ISTABLEINTERNAL();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#getLASTCHANGE()
	 * @see #getSPECHIERARCHY()
	 * @generated
	 */
	EAttribute getSPECHIERARCHY_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY#getLONGNAME()
	 * @see #getSPECHIERARCHY()
	 * @generated
	 */
	EAttribute getSPECHIERARCHY_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION <em>SPECIFICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECIFICATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION
	 * @generated
	 */
	EClass getSPECIFICATION();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION#getALTERNATIVEID()
	 * @see #getSPECIFICATION()
	 * @generated
	 */
	EReference getSPECIFICATION_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION#getVALUES <em>VALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VALUES</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION#getVALUES()
	 * @see #getSPECIFICATION()
	 * @generated
	 */
	EReference getSPECIFICATION_VALUES();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION#getCHILDREN <em>CHILDREN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CHILDREN</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION#getCHILDREN()
	 * @see #getSPECIFICATION()
	 * @generated
	 */
	EReference getSPECIFICATION_CHILDREN();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION#getTYPE()
	 * @see #getSPECIFICATION()
	 * @generated
	 */
	EReference getSPECIFICATION_TYPE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION#getDESC()
	 * @see #getSPECIFICATION()
	 * @generated
	 */
	EAttribute getSPECIFICATION_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION#getIDENTIFIER()
	 * @see #getSPECIFICATION()
	 * @generated
	 */
	EAttribute getSPECIFICATION_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION#getLASTCHANGE()
	 * @see #getSPECIFICATION()
	 * @generated
	 */
	EAttribute getSPECIFICATION_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION#getLONGNAME()
	 * @see #getSPECIFICATION()
	 * @generated
	 */
	EAttribute getSPECIFICATION_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONSType <em>SPECIFICATIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECIFICATIONS Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONSType
	 * @generated
	 */
	EClass getSPECIFICATIONSType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONSType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONSType#getGroup()
	 * @see #getSPECIFICATIONSType()
	 * @generated
	 */
	EAttribute getSPECIFICATIONSType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONSType#getSPECIFICATION <em>SPECIFICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECIFICATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONSType#getSPECIFICATION()
	 * @see #getSPECIFICATIONSType()
	 * @generated
	 */
	EReference getSPECIFICATIONSType_SPECIFICATION();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE <em>SPECIFICATIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECIFICATIONTYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE
	 * @generated
	 */
	EClass getSPECIFICATIONTYPE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE#getALTERNATIVEID()
	 * @see #getSPECIFICATIONTYPE()
	 * @generated
	 */
	EReference getSPECIFICATIONTYPE_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE#getSPECATTRIBUTES <em>SPECATTRIBUTES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECATTRIBUTES</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE#getSPECATTRIBUTES()
	 * @see #getSPECIFICATIONTYPE()
	 * @generated
	 */
	EReference getSPECIFICATIONTYPE_SPECATTRIBUTES();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE#getDESC()
	 * @see #getSPECIFICATIONTYPE()
	 * @generated
	 */
	EAttribute getSPECIFICATIONTYPE_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE#getIDENTIFIER()
	 * @see #getSPECIFICATIONTYPE()
	 * @generated
	 */
	EAttribute getSPECIFICATIONTYPE_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE#getLASTCHANGE()
	 * @see #getSPECIFICATIONTYPE()
	 * @generated
	 */
	EAttribute getSPECIFICATIONTYPE_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE#getLONGNAME()
	 * @see #getSPECIFICATIONTYPE()
	 * @generated
	 */
	EAttribute getSPECIFICATIONTYPE_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFIEDVALUESType <em>SPECIFIEDVALUES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECIFIEDVALUES Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFIEDVALUESType
	 * @generated
	 */
	EClass getSPECIFIEDVALUESType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFIEDVALUESType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFIEDVALUESType#getGroup()
	 * @see #getSPECIFIEDVALUESType()
	 * @generated
	 */
	EAttribute getSPECIFIEDVALUESType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFIEDVALUESType#getENUMVALUE <em>ENUMVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ENUMVALUE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFIEDVALUESType#getENUMVALUE()
	 * @see #getSPECIFIEDVALUESType()
	 * @generated
	 */
	EReference getSPECIFIEDVALUESType_ENUMVALUE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT <em>SPECOBJECT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECOBJECT</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT
	 * @generated
	 */
	EClass getSPECOBJECT();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT#getALTERNATIVEID()
	 * @see #getSPECOBJECT()
	 * @generated
	 */
	EReference getSPECOBJECT_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT#getVALUES <em>VALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VALUES</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT#getVALUES()
	 * @see #getSPECOBJECT()
	 * @generated
	 */
	EReference getSPECOBJECT_VALUES();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT#getTYPE()
	 * @see #getSPECOBJECT()
	 * @generated
	 */
	EReference getSPECOBJECT_TYPE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT#getDESC()
	 * @see #getSPECOBJECT()
	 * @generated
	 */
	EAttribute getSPECOBJECT_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT#getIDENTIFIER()
	 * @see #getSPECOBJECT()
	 * @generated
	 */
	EAttribute getSPECOBJECT_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT#getLASTCHANGE()
	 * @see #getSPECOBJECT()
	 * @generated
	 */
	EAttribute getSPECOBJECT_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT#getLONGNAME()
	 * @see #getSPECOBJECT()
	 * @generated
	 */
	EAttribute getSPECOBJECT_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTSType <em>SPECOBJECTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECOBJECTS Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTSType
	 * @generated
	 */
	EClass getSPECOBJECTSType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTSType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTSType#getGroup()
	 * @see #getSPECOBJECTSType()
	 * @generated
	 */
	EAttribute getSPECOBJECTSType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTSType#getSPECOBJECT <em>SPECOBJECT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECOBJECT</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTSType#getSPECOBJECT()
	 * @see #getSPECOBJECTSType()
	 * @generated
	 */
	EReference getSPECOBJECTSType_SPECOBJECT();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE <em>SPECOBJECTTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECOBJECTTYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE
	 * @generated
	 */
	EClass getSPECOBJECTTYPE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE#getALTERNATIVEID()
	 * @see #getSPECOBJECTTYPE()
	 * @generated
	 */
	EReference getSPECOBJECTTYPE_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE#getSPECATTRIBUTES <em>SPECATTRIBUTES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECATTRIBUTES</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE#getSPECATTRIBUTES()
	 * @see #getSPECOBJECTTYPE()
	 * @generated
	 */
	EReference getSPECOBJECTTYPE_SPECATTRIBUTES();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE#getDESC()
	 * @see #getSPECOBJECTTYPE()
	 * @generated
	 */
	EAttribute getSPECOBJECTTYPE_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE#getIDENTIFIER()
	 * @see #getSPECOBJECTTYPE()
	 * @generated
	 */
	EAttribute getSPECOBJECTTYPE_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE#getLASTCHANGE()
	 * @see #getSPECOBJECTTYPE()
	 * @generated
	 */
	EAttribute getSPECOBJECTTYPE_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE#getLONGNAME()
	 * @see #getSPECOBJECTTYPE()
	 * @generated
	 */
	EAttribute getSPECOBJECTTYPE_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION <em>SPECRELATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECRELATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION
	 * @generated
	 */
	EClass getSPECRELATION();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getALTERNATIVEID()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EReference getSPECRELATION_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getVALUES <em>VALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VALUES</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getVALUES()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EReference getSPECRELATION_VALUES();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getSOURCE <em>SOURCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SOURCE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getSOURCE()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EReference getSPECRELATION_SOURCE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getTARGET <em>TARGET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TARGET</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getTARGET()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EReference getSPECRELATION_TARGET();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getTYPE()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EReference getSPECRELATION_TYPE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getDESC()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EAttribute getSPECRELATION_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getIDENTIFIER()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EAttribute getSPECRELATION_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getLASTCHANGE()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EAttribute getSPECRELATION_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION#getLONGNAME()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EAttribute getSPECRELATION_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONGROUPSType <em>SPECRELATIONGROUPS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECRELATIONGROUPS Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONGROUPSType
	 * @generated
	 */
	EClass getSPECRELATIONGROUPSType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONGROUPSType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONGROUPSType#getGroup()
	 * @see #getSPECRELATIONGROUPSType()
	 * @generated
	 */
	EAttribute getSPECRELATIONGROUPSType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONGROUPSType#getRELATIONGROUP <em>RELATIONGROUP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RELATIONGROUP</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONGROUPSType#getRELATIONGROUP()
	 * @see #getSPECRELATIONGROUPSType()
	 * @generated
	 */
	EReference getSPECRELATIONGROUPSType_RELATIONGROUP();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONSType <em>SPECRELATIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECRELATIONS Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONSType
	 * @generated
	 */
	EClass getSPECRELATIONSType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONSType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONSType#getGroup()
	 * @see #getSPECRELATIONSType()
	 * @generated
	 */
	EAttribute getSPECRELATIONSType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONSType#getSPECRELATIONREF <em>SPECRELATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>SPECRELATIONREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONSType#getSPECRELATIONREF()
	 * @see #getSPECRELATIONSType()
	 * @generated
	 */
	EAttribute getSPECRELATIONSType_SPECRELATIONREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONSType1 <em>SPECRELATIONS Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECRELATIONS Type1</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONSType1
	 * @generated
	 */
	EClass getSPECRELATIONSType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONSType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONSType1#getGroup()
	 * @see #getSPECRELATIONSType1()
	 * @generated
	 */
	EAttribute getSPECRELATIONSType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONSType1#getSPECRELATION <em>SPECRELATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECRELATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONSType1#getSPECRELATION()
	 * @see #getSPECRELATIONSType1()
	 * @generated
	 */
	EReference getSPECRELATIONSType1_SPECRELATION();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE <em>SPECRELATIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECRELATIONTYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE
	 * @generated
	 */
	EClass getSPECRELATIONTYPE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE#getALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ALTERNATIVEID</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE#getALTERNATIVEID()
	 * @see #getSPECRELATIONTYPE()
	 * @generated
	 */
	EReference getSPECRELATIONTYPE_ALTERNATIVEID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE#getSPECATTRIBUTES <em>SPECATTRIBUTES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECATTRIBUTES</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE#getSPECATTRIBUTES()
	 * @see #getSPECRELATIONTYPE()
	 * @generated
	 */
	EReference getSPECRELATIONTYPE_SPECATTRIBUTES();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE#getDESC()
	 * @see #getSPECRELATIONTYPE()
	 * @generated
	 */
	EAttribute getSPECRELATIONTYPE_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE#getIDENTIFIER()
	 * @see #getSPECRELATIONTYPE()
	 * @generated
	 */
	EAttribute getSPECRELATIONTYPE_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE#getLASTCHANGE()
	 * @see #getSPECRELATIONTYPE()
	 * @generated
	 */
	EAttribute getSPECRELATIONTYPE_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE#getLONGNAME()
	 * @see #getSPECRELATIONTYPE()
	 * @generated
	 */
	EAttribute getSPECRELATIONTYPE_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType <em>SPECTYPES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECTYPES Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType
	 * @generated
	 */
	EClass getSPECTYPESType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType#getGroup()
	 * @see #getSPECTYPESType()
	 * @generated
	 */
	EAttribute getSPECTYPESType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType#getRELATIONGROUPTYPE <em>RELATIONGROUPTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RELATIONGROUPTYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType#getRELATIONGROUPTYPE()
	 * @see #getSPECTYPESType()
	 * @generated
	 */
	EReference getSPECTYPESType_RELATIONGROUPTYPE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType#getSPECOBJECTTYPE <em>SPECOBJECTTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECOBJECTTYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType#getSPECOBJECTTYPE()
	 * @see #getSPECTYPESType()
	 * @generated
	 */
	EReference getSPECTYPESType_SPECOBJECTTYPE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType#getSPECRELATIONTYPE <em>SPECRELATIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECRELATIONTYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType#getSPECRELATIONTYPE()
	 * @see #getSPECTYPESType()
	 * @generated
	 */
	EReference getSPECTYPESType_SPECRELATIONTYPE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType#getSPECIFICATIONTYPE <em>SPECIFICATIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECIFICATIONTYPE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType#getSPECIFICATIONTYPE()
	 * @see #getSPECTYPESType()
	 * @generated
	 */
	EReference getSPECTYPESType_SPECIFICATIONTYPE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TARGETSPECIFICATIONType <em>TARGETSPECIFICATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TARGETSPECIFICATION Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TARGETSPECIFICATIONType
	 * @generated
	 */
	EClass getTARGETSPECIFICATIONType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TARGETSPECIFICATIONType#getSPECIFICATIONREF <em>SPECIFICATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECIFICATIONREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TARGETSPECIFICATIONType#getSPECIFICATIONREF()
	 * @see #getTARGETSPECIFICATIONType()
	 * @generated
	 */
	EAttribute getTARGETSPECIFICATIONType_SPECIFICATIONREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TARGETType <em>TARGET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TARGET Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TARGETType
	 * @generated
	 */
	EClass getTARGETType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TARGETType#getSPECOBJECTREF <em>SPECOBJECTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECOBJECTREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TARGETType#getSPECOBJECTREF()
	 * @see #getTARGETType()
	 * @generated
	 */
	EAttribute getTARGETType_SPECOBJECTREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.THEHEADERType <em>THEHEADER Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>THEHEADER Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.THEHEADERType
	 * @generated
	 */
	EClass getTHEHEADERType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.THEHEADERType#getREQIFHEADER <em>REQIFHEADER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>REQIFHEADER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.THEHEADERType#getREQIFHEADER()
	 * @see #getTHEHEADERType()
	 * @generated
	 */
	EReference getTHEHEADERType_REQIFHEADER();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TOOLEXTENSIONSType <em>TOOLEXTENSIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOOLEXTENSIONS Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TOOLEXTENSIONSType
	 * @generated
	 */
	EClass getTOOLEXTENSIONSType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TOOLEXTENSIONSType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TOOLEXTENSIONSType#getGroup()
	 * @see #getTOOLEXTENSIONSType()
	 * @generated
	 */
	EAttribute getTOOLEXTENSIONSType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TOOLEXTENSIONSType#getREQIFTOOLEXTENSION <em>REQIFTOOLEXTENSION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>REQIFTOOLEXTENSION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TOOLEXTENSIONSType#getREQIFTOOLEXTENSION()
	 * @see #getTOOLEXTENSIONSType()
	 * @generated
	 */
	EReference getTOOLEXTENSIONSType_REQIFTOOLEXTENSION();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType <em>TYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType
	 * @generated
	 */
	EClass getTYPEType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType#getRELATIONGROUPTYPEREF <em>RELATIONGROUPTYPEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RELATIONGROUPTYPEREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType#getRELATIONGROUPTYPEREF()
	 * @see #getTYPEType()
	 * @generated
	 */
	EAttribute getTYPEType_RELATIONGROUPTYPEREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType1 <em>TYPE Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type1</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType1
	 * @generated
	 */
	EClass getTYPEType1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType1#getSPECIFICATIONTYPEREF <em>SPECIFICATIONTYPEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECIFICATIONTYPEREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType1#getSPECIFICATIONTYPEREF()
	 * @see #getTYPEType1()
	 * @generated
	 */
	EAttribute getTYPEType1_SPECIFICATIONTYPEREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType2 <em>TYPE Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type2</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType2
	 * @generated
	 */
	EClass getTYPEType2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType2#getDATATYPEDEFINITIONINTEGERREF <em>DATATYPEDEFINITIONINTEGERREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATATYPEDEFINITIONINTEGERREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType2#getDATATYPEDEFINITIONINTEGERREF()
	 * @see #getTYPEType2()
	 * @generated
	 */
	EAttribute getTYPEType2_DATATYPEDEFINITIONINTEGERREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType3 <em>TYPE Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type3</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType3
	 * @generated
	 */
	EClass getTYPEType3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType3#getDATATYPEDEFINITIONSTRINGREF <em>DATATYPEDEFINITIONSTRINGREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATATYPEDEFINITIONSTRINGREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType3#getDATATYPEDEFINITIONSTRINGREF()
	 * @see #getTYPEType3()
	 * @generated
	 */
	EAttribute getTYPEType3_DATATYPEDEFINITIONSTRINGREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType4 <em>TYPE Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type4</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType4
	 * @generated
	 */
	EClass getTYPEType4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType4#getDATATYPEDEFINITIONREALREF <em>DATATYPEDEFINITIONREALREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATATYPEDEFINITIONREALREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType4#getDATATYPEDEFINITIONREALREF()
	 * @see #getTYPEType4()
	 * @generated
	 */
	EAttribute getTYPEType4_DATATYPEDEFINITIONREALREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType5 <em>TYPE Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type5</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType5
	 * @generated
	 */
	EClass getTYPEType5();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType5#getDATATYPEDEFINITIONXHTMLREF <em>DATATYPEDEFINITIONXHTMLREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATATYPEDEFINITIONXHTMLREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType5#getDATATYPEDEFINITIONXHTMLREF()
	 * @see #getTYPEType5()
	 * @generated
	 */
	EAttribute getTYPEType5_DATATYPEDEFINITIONXHTMLREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType6 <em>TYPE Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type6</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType6
	 * @generated
	 */
	EClass getTYPEType6();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType6#getSPECOBJECTTYPEREF <em>SPECOBJECTTYPEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECOBJECTTYPEREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType6#getSPECOBJECTTYPEREF()
	 * @see #getTYPEType6()
	 * @generated
	 */
	EAttribute getTYPEType6_SPECOBJECTTYPEREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType7 <em>TYPE Type7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type7</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType7
	 * @generated
	 */
	EClass getTYPEType7();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType7#getSPECRELATIONTYPEREF <em>SPECRELATIONTYPEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SPECRELATIONTYPEREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType7#getSPECRELATIONTYPEREF()
	 * @see #getTYPEType7()
	 * @generated
	 */
	EAttribute getTYPEType7_SPECRELATIONTYPEREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType8 <em>TYPE Type8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type8</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType8
	 * @generated
	 */
	EClass getTYPEType8();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType8#getDATATYPEDEFINITIONDATEREF <em>DATATYPEDEFINITIONDATEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATATYPEDEFINITIONDATEREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType8#getDATATYPEDEFINITIONDATEREF()
	 * @see #getTYPEType8()
	 * @generated
	 */
	EAttribute getTYPEType8_DATATYPEDEFINITIONDATEREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType9 <em>TYPE Type9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type9</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType9
	 * @generated
	 */
	EClass getTYPEType9();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType9#getDATATYPEDEFINITIONENUMERATIONREF <em>DATATYPEDEFINITIONENUMERATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATATYPEDEFINITIONENUMERATIONREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType9#getDATATYPEDEFINITIONENUMERATIONREF()
	 * @see #getTYPEType9()
	 * @generated
	 */
	EAttribute getTYPEType9_DATATYPEDEFINITIONENUMERATIONREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType10 <em>TYPE Type10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type10</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType10
	 * @generated
	 */
	EClass getTYPEType10();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType10#getDATATYPEDEFINITIONBOOLEANREF <em>DATATYPEDEFINITIONBOOLEANREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATATYPEDEFINITIONBOOLEANREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType10#getDATATYPEDEFINITIONBOOLEANREF()
	 * @see #getTYPEType10()
	 * @generated
	 */
	EAttribute getTYPEType10_DATATYPEDEFINITIONBOOLEANREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType <em>VALUES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VALUES Type</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType
	 * @generated
	 */
	EClass getVALUESType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType#getGroup()
	 * @see #getVALUESType()
	 * @generated
	 */
	EAttribute getVALUESType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEBOOLEAN <em>ATTRIBUTEVALUEBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEBOOLEAN</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEBOOLEAN()
	 * @see #getVALUESType()
	 * @generated
	 */
	EReference getVALUESType_ATTRIBUTEVALUEBOOLEAN();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEDATE <em>ATTRIBUTEVALUEDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEDATE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEDATE()
	 * @see #getVALUESType()
	 * @generated
	 */
	EReference getVALUESType_ATTRIBUTEVALUEDATE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEENUMERATION()
	 * @see #getVALUESType()
	 * @generated
	 */
	EReference getVALUESType_ATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEINTEGER <em>ATTRIBUTEVALUEINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEINTEGER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEINTEGER()
	 * @see #getVALUESType()
	 * @generated
	 */
	EReference getVALUESType_ATTRIBUTEVALUEINTEGER();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEREAL <em>ATTRIBUTEVALUEREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEREAL</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEREAL()
	 * @see #getVALUESType()
	 * @generated
	 */
	EReference getVALUESType_ATTRIBUTEVALUEREAL();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType#getATTRIBUTEVALUESTRING <em>ATTRIBUTEVALUESTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUESTRING</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType#getATTRIBUTEVALUESTRING()
	 * @see #getVALUESType()
	 * @generated
	 */
	EReference getVALUESType_ATTRIBUTEVALUESTRING();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEXHTML <em>ATTRIBUTEVALUEXHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEXHTML</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEXHTML()
	 * @see #getVALUESType()
	 * @generated
	 */
	EReference getVALUESType_ATTRIBUTEVALUEXHTML();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1 <em>VALUES Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VALUES Type1</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1
	 * @generated
	 */
	EClass getVALUESType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1#getGroup()
	 * @see #getVALUESType1()
	 * @generated
	 */
	EAttribute getVALUESType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1#getATTRIBUTEVALUEBOOLEAN <em>ATTRIBUTEVALUEBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEBOOLEAN</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1#getATTRIBUTEVALUEBOOLEAN()
	 * @see #getVALUESType1()
	 * @generated
	 */
	EReference getVALUESType1_ATTRIBUTEVALUEBOOLEAN();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1#getATTRIBUTEVALUEDATE <em>ATTRIBUTEVALUEDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEDATE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1#getATTRIBUTEVALUEDATE()
	 * @see #getVALUESType1()
	 * @generated
	 */
	EReference getVALUESType1_ATTRIBUTEVALUEDATE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1#getATTRIBUTEVALUEENUMERATION()
	 * @see #getVALUESType1()
	 * @generated
	 */
	EReference getVALUESType1_ATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1#getATTRIBUTEVALUEINTEGER <em>ATTRIBUTEVALUEINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEINTEGER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1#getATTRIBUTEVALUEINTEGER()
	 * @see #getVALUESType1()
	 * @generated
	 */
	EReference getVALUESType1_ATTRIBUTEVALUEINTEGER();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1#getATTRIBUTEVALUEREAL <em>ATTRIBUTEVALUEREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEREAL</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1#getATTRIBUTEVALUEREAL()
	 * @see #getVALUESType1()
	 * @generated
	 */
	EReference getVALUESType1_ATTRIBUTEVALUEREAL();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1#getATTRIBUTEVALUESTRING <em>ATTRIBUTEVALUESTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUESTRING</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1#getATTRIBUTEVALUESTRING()
	 * @see #getVALUESType1()
	 * @generated
	 */
	EReference getVALUESType1_ATTRIBUTEVALUESTRING();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1#getATTRIBUTEVALUEXHTML <em>ATTRIBUTEVALUEXHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEXHTML</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1#getATTRIBUTEVALUEXHTML()
	 * @see #getVALUESType1()
	 * @generated
	 */
	EReference getVALUESType1_ATTRIBUTEVALUEXHTML();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2 <em>VALUES Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VALUES Type2</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2
	 * @generated
	 */
	EClass getVALUESType2();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2#getGroup()
	 * @see #getVALUESType2()
	 * @generated
	 */
	EAttribute getVALUESType2_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2#getATTRIBUTEVALUEBOOLEAN <em>ATTRIBUTEVALUEBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEBOOLEAN</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2#getATTRIBUTEVALUEBOOLEAN()
	 * @see #getVALUESType2()
	 * @generated
	 */
	EReference getVALUESType2_ATTRIBUTEVALUEBOOLEAN();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2#getATTRIBUTEVALUEDATE <em>ATTRIBUTEVALUEDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEDATE</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2#getATTRIBUTEVALUEDATE()
	 * @see #getVALUESType2()
	 * @generated
	 */
	EReference getVALUESType2_ATTRIBUTEVALUEDATE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2#getATTRIBUTEVALUEENUMERATION()
	 * @see #getVALUESType2()
	 * @generated
	 */
	EReference getVALUESType2_ATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2#getATTRIBUTEVALUEINTEGER <em>ATTRIBUTEVALUEINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEINTEGER</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2#getATTRIBUTEVALUEINTEGER()
	 * @see #getVALUESType2()
	 * @generated
	 */
	EReference getVALUESType2_ATTRIBUTEVALUEINTEGER();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2#getATTRIBUTEVALUEREAL <em>ATTRIBUTEVALUEREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEREAL</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2#getATTRIBUTEVALUEREAL()
	 * @see #getVALUESType2()
	 * @generated
	 */
	EReference getVALUESType2_ATTRIBUTEVALUEREAL();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2#getATTRIBUTEVALUESTRING <em>ATTRIBUTEVALUESTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUESTRING</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2#getATTRIBUTEVALUESTRING()
	 * @see #getVALUESType2()
	 * @generated
	 */
	EReference getVALUESType2_ATTRIBUTEVALUESTRING();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2#getATTRIBUTEVALUEXHTML <em>ATTRIBUTEVALUEXHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEXHTML</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2#getATTRIBUTEVALUEXHTML()
	 * @see #getVALUESType2()
	 * @generated
	 */
	EReference getVALUESType2_ATTRIBUTEVALUEXHTML();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType3 <em>VALUES Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VALUES Type3</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType3
	 * @generated
	 */
	EClass getVALUESType3();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType3#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType3#getGroup()
	 * @see #getVALUESType3()
	 * @generated
	 */
	EAttribute getVALUESType3_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType3#getENUMVALUEREF <em>ENUMVALUEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ENUMVALUEREF</em>'.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType3#getENUMVALUEREF()
	 * @see #getVALUESType3()
	 * @generated
	 */
	EAttribute getVALUESType3_ENUMVALUEREF();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>GLOBALREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GLOBALREF</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='GLOBAL-REF' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getGLOBALREF();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>LOCALREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>LOCALREF</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LOCAL-REF' baseType='http://www.eclipse.org/emf/2003/XMLType#IDREF'"
	 * @generated
	 */
	EDataType getLOCALREF();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>XHTMLCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XHTMLCONTENT</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='XHTML-CONTENT' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getXHTMLCONTENT();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MyreqifFactory getMyreqifFactory();

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
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDImpl <em>ALTERNATIVEID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEID()
		 * @generated
		 */
		EClass ALTERNATIVEID = eINSTANCE.getALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTERNATIVEID__IDENTIFIER = eINSTANCE.getALTERNATIVEID_IDENTIFIER();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDTypeImpl <em>ALTERNATIVEID Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE = eINSTANCE.getALTERNATIVEIDType();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType1Impl <em>ALTERNATIVEID Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType1Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType1()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE1 = eINSTANCE.getALTERNATIVEIDType1();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE1__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType1_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType2Impl <em>ALTERNATIVEID Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType2Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType2()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE2 = eINSTANCE.getALTERNATIVEIDType2();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE2__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType2_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType3Impl <em>ALTERNATIVEID Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType3Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType3()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE3 = eINSTANCE.getALTERNATIVEIDType3();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE3__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType3_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType4Impl <em>ALTERNATIVEID Type4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType4Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType4()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE4 = eINSTANCE.getALTERNATIVEIDType4();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE4__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType4_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType5Impl <em>ALTERNATIVEID Type5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType5Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType5()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE5 = eINSTANCE.getALTERNATIVEIDType5();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE5__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType5_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType6Impl <em>ALTERNATIVEID Type6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType6Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType6()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE6 = eINSTANCE.getALTERNATIVEIDType6();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE6__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType6_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType7Impl <em>ALTERNATIVEID Type7</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType7Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType7()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE7 = eINSTANCE.getALTERNATIVEIDType7();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE7__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType7_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType8Impl <em>ALTERNATIVEID Type8</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType8Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType8()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE8 = eINSTANCE.getALTERNATIVEIDType8();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE8__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType8_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType9Impl <em>ALTERNATIVEID Type9</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType9Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType9()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE9 = eINSTANCE.getALTERNATIVEIDType9();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE9__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType9_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType10Impl <em>ALTERNATIVEID Type10</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType10Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType10()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE10 = eINSTANCE.getALTERNATIVEIDType10();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE10__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType10_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType11Impl <em>ALTERNATIVEID Type11</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType11Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType11()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE11 = eINSTANCE.getALTERNATIVEIDType11();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE11__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType11_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType12Impl <em>ALTERNATIVEID Type12</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType12Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType12()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE12 = eINSTANCE.getALTERNATIVEIDType12();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE12__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType12_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType13Impl <em>ALTERNATIVEID Type13</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType13Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType13()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE13 = eINSTANCE.getALTERNATIVEIDType13();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE13__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType13_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType14Impl <em>ALTERNATIVEID Type14</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType14Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType14()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE14 = eINSTANCE.getALTERNATIVEIDType14();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE14__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType14_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType15Impl <em>ALTERNATIVEID Type15</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType15Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType15()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE15 = eINSTANCE.getALTERNATIVEIDType15();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE15__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType15_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType16Impl <em>ALTERNATIVEID Type16</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType16Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType16()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE16 = eINSTANCE.getALTERNATIVEIDType16();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE16__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType16_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType17Impl <em>ALTERNATIVEID Type17</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType17Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType17()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE17 = eINSTANCE.getALTERNATIVEIDType17();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE17__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType17_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType18Impl <em>ALTERNATIVEID Type18</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType18Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType18()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE18 = eINSTANCE.getALTERNATIVEIDType18();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE18__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType18_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType19Impl <em>ALTERNATIVEID Type19</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType19Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType19()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE19 = eINSTANCE.getALTERNATIVEIDType19();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE19__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType19_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType20Impl <em>ALTERNATIVEID Type20</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType20Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType20()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE20 = eINSTANCE.getALTERNATIVEIDType20();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE20__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType20_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType21Impl <em>ALTERNATIVEID Type21</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType21Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType21()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE21 = eINSTANCE.getALTERNATIVEIDType21();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE21__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType21_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType22Impl <em>ALTERNATIVEID Type22</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType22Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType22()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE22 = eINSTANCE.getALTERNATIVEIDType22();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE22__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType22_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType23Impl <em>ALTERNATIVEID Type23</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ALTERNATIVEIDType23Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getALTERNATIVEIDType23()
		 * @generated
		 */
		EClass ALTERNATIVEID_TYPE23 = eINSTANCE.getALTERNATIVEIDType23();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVEID_TYPE23__ALTERNATIVEID = eINSTANCE.getALTERNATIVEIDType23_ALTERNATIVEID();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONBOOLEANImpl <em>ATTRIBUTEDEFINITIONBOOLEAN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONBOOLEANImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEDEFINITIONBOOLEAN()
		 * @generated
		 */
		EClass ATTRIBUTEDEFINITIONBOOLEAN = eINSTANCE.getATTRIBUTEDEFINITIONBOOLEAN();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONBOOLEAN__ALTERNATIVEID = eINSTANCE.getATTRIBUTEDEFINITIONBOOLEAN_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>DEFAULTVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONBOOLEAN__DEFAULTVALUE = eINSTANCE.getATTRIBUTEDEFINITIONBOOLEAN_DEFAULTVALUE();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONBOOLEAN__TYPE = eINSTANCE.getATTRIBUTEDEFINITIONBOOLEAN_TYPE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONBOOLEAN__DESC = eINSTANCE.getATTRIBUTEDEFINITIONBOOLEAN_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONBOOLEAN__IDENTIFIER = eINSTANCE.getATTRIBUTEDEFINITIONBOOLEAN_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>ISEDITABLE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONBOOLEAN__ISEDITABLE = eINSTANCE.getATTRIBUTEDEFINITIONBOOLEAN_ISEDITABLE();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONBOOLEAN__LASTCHANGE = eINSTANCE.getATTRIBUTEDEFINITIONBOOLEAN_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONBOOLEAN__LONGNAME = eINSTANCE.getATTRIBUTEDEFINITIONBOOLEAN_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONDATEImpl <em>ATTRIBUTEDEFINITIONDATE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONDATEImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEDEFINITIONDATE()
		 * @generated
		 */
		EClass ATTRIBUTEDEFINITIONDATE = eINSTANCE.getATTRIBUTEDEFINITIONDATE();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONDATE__ALTERNATIVEID = eINSTANCE.getATTRIBUTEDEFINITIONDATE_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>DEFAULTVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONDATE__DEFAULTVALUE = eINSTANCE.getATTRIBUTEDEFINITIONDATE_DEFAULTVALUE();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONDATE__TYPE = eINSTANCE.getATTRIBUTEDEFINITIONDATE_TYPE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONDATE__DESC = eINSTANCE.getATTRIBUTEDEFINITIONDATE_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONDATE__IDENTIFIER = eINSTANCE.getATTRIBUTEDEFINITIONDATE_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>ISEDITABLE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONDATE__ISEDITABLE = eINSTANCE.getATTRIBUTEDEFINITIONDATE_ISEDITABLE();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONDATE__LASTCHANGE = eINSTANCE.getATTRIBUTEDEFINITIONDATE_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONDATE__LONGNAME = eINSTANCE.getATTRIBUTEDEFINITIONDATE_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl <em>ATTRIBUTEDEFINITIONENUMERATION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEDEFINITIONENUMERATION()
		 * @generated
		 */
		EClass ATTRIBUTEDEFINITIONENUMERATION = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION();

		/**
		 * The meta object literal for the '<em><b>DEFAULTVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONENUMERATION__DEFAULTVALUE = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION_DEFAULTVALUE();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONENUMERATION__ALTERNATIVEID = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONENUMERATION__TYPE = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION_TYPE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONENUMERATION__DESC = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONENUMERATION__IDENTIFIER = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>ISEDITABLE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONENUMERATION__ISEDITABLE = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION_ISEDITABLE();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONENUMERATION__LASTCHANGE = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONENUMERATION__LONGNAME = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>MULTIVALUED</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONENUMERATION__MULTIVALUED = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION_MULTIVALUED();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONINTEGERImpl <em>ATTRIBUTEDEFINITIONINTEGER</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONINTEGERImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEDEFINITIONINTEGER()
		 * @generated
		 */
		EClass ATTRIBUTEDEFINITIONINTEGER = eINSTANCE.getATTRIBUTEDEFINITIONINTEGER();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONINTEGER__ALTERNATIVEID = eINSTANCE.getATTRIBUTEDEFINITIONINTEGER_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>DEFAULTVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONINTEGER__DEFAULTVALUE = eINSTANCE.getATTRIBUTEDEFINITIONINTEGER_DEFAULTVALUE();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONINTEGER__TYPE = eINSTANCE.getATTRIBUTEDEFINITIONINTEGER_TYPE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONINTEGER__DESC = eINSTANCE.getATTRIBUTEDEFINITIONINTEGER_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONINTEGER__IDENTIFIER = eINSTANCE.getATTRIBUTEDEFINITIONINTEGER_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>ISEDITABLE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONINTEGER__ISEDITABLE = eINSTANCE.getATTRIBUTEDEFINITIONINTEGER_ISEDITABLE();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONINTEGER__LASTCHANGE = eINSTANCE.getATTRIBUTEDEFINITIONINTEGER_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONINTEGER__LONGNAME = eINSTANCE.getATTRIBUTEDEFINITIONINTEGER_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONREALImpl <em>ATTRIBUTEDEFINITIONREAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONREALImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEDEFINITIONREAL()
		 * @generated
		 */
		EClass ATTRIBUTEDEFINITIONREAL = eINSTANCE.getATTRIBUTEDEFINITIONREAL();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONREAL__ALTERNATIVEID = eINSTANCE.getATTRIBUTEDEFINITIONREAL_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>DEFAULTVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONREAL__DEFAULTVALUE = eINSTANCE.getATTRIBUTEDEFINITIONREAL_DEFAULTVALUE();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONREAL__TYPE = eINSTANCE.getATTRIBUTEDEFINITIONREAL_TYPE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONREAL__DESC = eINSTANCE.getATTRIBUTEDEFINITIONREAL_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONREAL__IDENTIFIER = eINSTANCE.getATTRIBUTEDEFINITIONREAL_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>ISEDITABLE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONREAL__ISEDITABLE = eINSTANCE.getATTRIBUTEDEFINITIONREAL_ISEDITABLE();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONREAL__LASTCHANGE = eINSTANCE.getATTRIBUTEDEFINITIONREAL_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONREAL__LONGNAME = eINSTANCE.getATTRIBUTEDEFINITIONREAL_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONSTRINGImpl <em>ATTRIBUTEDEFINITIONSTRING</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONSTRINGImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEDEFINITIONSTRING()
		 * @generated
		 */
		EClass ATTRIBUTEDEFINITIONSTRING = eINSTANCE.getATTRIBUTEDEFINITIONSTRING();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONSTRING__ALTERNATIVEID = eINSTANCE.getATTRIBUTEDEFINITIONSTRING_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>DEFAULTVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONSTRING__DEFAULTVALUE = eINSTANCE.getATTRIBUTEDEFINITIONSTRING_DEFAULTVALUE();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONSTRING__TYPE = eINSTANCE.getATTRIBUTEDEFINITIONSTRING_TYPE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONSTRING__DESC = eINSTANCE.getATTRIBUTEDEFINITIONSTRING_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONSTRING__IDENTIFIER = eINSTANCE.getATTRIBUTEDEFINITIONSTRING_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>ISEDITABLE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONSTRING__ISEDITABLE = eINSTANCE.getATTRIBUTEDEFINITIONSTRING_ISEDITABLE();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONSTRING__LASTCHANGE = eINSTANCE.getATTRIBUTEDEFINITIONSTRING_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONSTRING__LONGNAME = eINSTANCE.getATTRIBUTEDEFINITIONSTRING_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONXHTMLImpl <em>ATTRIBUTEDEFINITIONXHTML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONXHTMLImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEDEFINITIONXHTML()
		 * @generated
		 */
		EClass ATTRIBUTEDEFINITIONXHTML = eINSTANCE.getATTRIBUTEDEFINITIONXHTML();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONXHTML__ALTERNATIVEID = eINSTANCE.getATTRIBUTEDEFINITIONXHTML_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>DEFAULTVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONXHTML__DEFAULTVALUE = eINSTANCE.getATTRIBUTEDEFINITIONXHTML_DEFAULTVALUE();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONXHTML__TYPE = eINSTANCE.getATTRIBUTEDEFINITIONXHTML_TYPE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONXHTML__DESC = eINSTANCE.getATTRIBUTEDEFINITIONXHTML_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONXHTML__IDENTIFIER = eINSTANCE.getATTRIBUTEDEFINITIONXHTML_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>ISEDITABLE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONXHTML__ISEDITABLE = eINSTANCE.getATTRIBUTEDEFINITIONXHTML_ISEDITABLE();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONXHTML__LASTCHANGE = eINSTANCE.getATTRIBUTEDEFINITIONXHTML_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONXHTML__LONGNAME = eINSTANCE.getATTRIBUTEDEFINITIONXHTML_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEBOOLEANImpl <em>ATTRIBUTEVALUEBOOLEAN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEBOOLEANImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEVALUEBOOLEAN()
		 * @generated
		 */
		EClass ATTRIBUTEVALUEBOOLEAN = eINSTANCE.getATTRIBUTEVALUEBOOLEAN();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUEBOOLEAN__DEFINITION = eINSTANCE.getATTRIBUTEVALUEBOOLEAN_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>THEVALUE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEBOOLEAN__THEVALUE = eINSTANCE.getATTRIBUTEVALUEBOOLEAN_THEVALUE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEDATEImpl <em>ATTRIBUTEVALUEDATE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEDATEImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEVALUEDATE()
		 * @generated
		 */
		EClass ATTRIBUTEVALUEDATE = eINSTANCE.getATTRIBUTEVALUEDATE();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUEDATE__DEFINITION = eINSTANCE.getATTRIBUTEVALUEDATE_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>THEVALUE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEDATE__THEVALUE = eINSTANCE.getATTRIBUTEVALUEDATE_THEVALUE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEENUMERATIONImpl <em>ATTRIBUTEVALUEENUMERATION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEENUMERATIONImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEVALUEENUMERATION()
		 * @generated
		 */
		EClass ATTRIBUTEVALUEENUMERATION = eINSTANCE.getATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUEENUMERATION__DEFINITION = eINSTANCE.getATTRIBUTEVALUEENUMERATION_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>VALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUEENUMERATION__VALUES = eINSTANCE.getATTRIBUTEVALUEENUMERATION_VALUES();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEINTEGERImpl <em>ATTRIBUTEVALUEINTEGER</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEINTEGERImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEVALUEINTEGER()
		 * @generated
		 */
		EClass ATTRIBUTEVALUEINTEGER = eINSTANCE.getATTRIBUTEVALUEINTEGER();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUEINTEGER__DEFINITION = eINSTANCE.getATTRIBUTEVALUEINTEGER_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>THEVALUE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEINTEGER__THEVALUE = eINSTANCE.getATTRIBUTEVALUEINTEGER_THEVALUE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEREALImpl <em>ATTRIBUTEVALUEREAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEREALImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEVALUEREAL()
		 * @generated
		 */
		EClass ATTRIBUTEVALUEREAL = eINSTANCE.getATTRIBUTEVALUEREAL();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUEREAL__DEFINITION = eINSTANCE.getATTRIBUTEVALUEREAL_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>THEVALUE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEREAL__THEVALUE = eINSTANCE.getATTRIBUTEVALUEREAL_THEVALUE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUESTRINGImpl <em>ATTRIBUTEVALUESTRING</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUESTRINGImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEVALUESTRING()
		 * @generated
		 */
		EClass ATTRIBUTEVALUESTRING = eINSTANCE.getATTRIBUTEVALUESTRING();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUESTRING__DEFINITION = eINSTANCE.getATTRIBUTEVALUESTRING_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>THEVALUE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUESTRING__THEVALUE = eINSTANCE.getATTRIBUTEVALUESTRING_THEVALUE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEXHTMLImpl <em>ATTRIBUTEVALUEXHTML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEXHTMLImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getATTRIBUTEVALUEXHTML()
		 * @generated
		 */
		EClass ATTRIBUTEVALUEXHTML = eINSTANCE.getATTRIBUTEVALUEXHTML();

		/**
		 * The meta object literal for the '<em><b>THEVALUE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEXHTML__THEVALUE = eINSTANCE.getATTRIBUTEVALUEXHTML_THEVALUE();

		/**
		 * The meta object literal for the '<em><b>THEORIGINALVALUE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEXHTML__THEORIGINALVALUE = eINSTANCE.getATTRIBUTEVALUEXHTML_THEORIGINALVALUE();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUEXHTML__DEFINITION = eINSTANCE.getATTRIBUTEVALUEXHTML_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>ISSIMPLIFIED</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEXHTML__ISSIMPLIFIED = eINSTANCE.getATTRIBUTEVALUEXHTML_ISSIMPLIFIED();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.CHILDRENTypeImpl <em>CHILDREN Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.CHILDRENTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getCHILDRENType()
		 * @generated
		 */
		EClass CHILDREN_TYPE = eINSTANCE.getCHILDRENType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHILDREN_TYPE__GROUP = eINSTANCE.getCHILDRENType_Group();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHY</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILDREN_TYPE__SPECHIERARCHY = eINSTANCE.getCHILDRENType_SPECHIERARCHY();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.CHILDRENType1Impl <em>CHILDREN Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.CHILDRENType1Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getCHILDRENType1()
		 * @generated
		 */
		EClass CHILDREN_TYPE1 = eINSTANCE.getCHILDRENType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHILDREN_TYPE1__GROUP = eINSTANCE.getCHILDRENType1_Group();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHY</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILDREN_TYPE1__SPECHIERARCHY = eINSTANCE.getCHILDRENType1_SPECHIERARCHY();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.CORECONTENTTypeImpl <em>CORECONTENT Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.CORECONTENTTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getCORECONTENTType()
		 * @generated
		 */
		EClass CORECONTENT_TYPE = eINSTANCE.getCORECONTENTType();

		/**
		 * The meta object literal for the '<em><b>REQIFCONTENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORECONTENT_TYPE__REQIFCONTENT = eINSTANCE.getCORECONTENTType_REQIFCONTENT();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONBOOLEANImpl <em>DATATYPEDEFINITIONBOOLEAN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONBOOLEANImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDATATYPEDEFINITIONBOOLEAN()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONBOOLEAN = eINSTANCE.getDATATYPEDEFINITIONBOOLEAN();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONBOOLEAN__ALTERNATIVEID = eINSTANCE.getDATATYPEDEFINITIONBOOLEAN_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBOOLEAN__DESC = eINSTANCE.getDATATYPEDEFINITIONBOOLEAN_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBOOLEAN__IDENTIFIER = eINSTANCE.getDATATYPEDEFINITIONBOOLEAN_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBOOLEAN__LASTCHANGE = eINSTANCE.getDATATYPEDEFINITIONBOOLEAN_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBOOLEAN__LONGNAME = eINSTANCE.getDATATYPEDEFINITIONBOOLEAN_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONDATEImpl <em>DATATYPEDEFINITIONDATE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONDATEImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDATATYPEDEFINITIONDATE()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONDATE = eINSTANCE.getDATATYPEDEFINITIONDATE();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONDATE__ALTERNATIVEID = eINSTANCE.getDATATYPEDEFINITIONDATE_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONDATE__DESC = eINSTANCE.getDATATYPEDEFINITIONDATE_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONDATE__IDENTIFIER = eINSTANCE.getDATATYPEDEFINITIONDATE_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONDATE__LASTCHANGE = eINSTANCE.getDATATYPEDEFINITIONDATE_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONDATE__LONGNAME = eINSTANCE.getDATATYPEDEFINITIONDATE_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONENUMERATIONImpl <em>DATATYPEDEFINITIONENUMERATION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONENUMERATIONImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDATATYPEDEFINITIONENUMERATION()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONENUMERATION = eINSTANCE.getDATATYPEDEFINITIONENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONENUMERATION__ALTERNATIVEID = eINSTANCE.getDATATYPEDEFINITIONENUMERATION_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>SPECIFIEDVALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONENUMERATION__SPECIFIEDVALUES = eINSTANCE.getDATATYPEDEFINITIONENUMERATION_SPECIFIEDVALUES();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONENUMERATION__DESC = eINSTANCE.getDATATYPEDEFINITIONENUMERATION_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONENUMERATION__IDENTIFIER = eINSTANCE.getDATATYPEDEFINITIONENUMERATION_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONENUMERATION__LASTCHANGE = eINSTANCE.getDATATYPEDEFINITIONENUMERATION_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONENUMERATION__LONGNAME = eINSTANCE.getDATATYPEDEFINITIONENUMERATION_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONINTEGERImpl <em>DATATYPEDEFINITIONINTEGER</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONINTEGERImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDATATYPEDEFINITIONINTEGER()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONINTEGER = eINSTANCE.getDATATYPEDEFINITIONINTEGER();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONINTEGER__ALTERNATIVEID = eINSTANCE.getDATATYPEDEFINITIONINTEGER_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONINTEGER__DESC = eINSTANCE.getDATATYPEDEFINITIONINTEGER_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONINTEGER__IDENTIFIER = eINSTANCE.getDATATYPEDEFINITIONINTEGER_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONINTEGER__LASTCHANGE = eINSTANCE.getDATATYPEDEFINITIONINTEGER_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONINTEGER__LONGNAME = eINSTANCE.getDATATYPEDEFINITIONINTEGER_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>MAX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONINTEGER__MAX = eINSTANCE.getDATATYPEDEFINITIONINTEGER_MAX();

		/**
		 * The meta object literal for the '<em><b>MIN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONINTEGER__MIN = eINSTANCE.getDATATYPEDEFINITIONINTEGER_MIN();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONREALImpl <em>DATATYPEDEFINITIONREAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONREALImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDATATYPEDEFINITIONREAL()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONREAL = eINSTANCE.getDATATYPEDEFINITIONREAL();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONREAL__ALTERNATIVEID = eINSTANCE.getDATATYPEDEFINITIONREAL_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>ACCURACY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONREAL__ACCURACY = eINSTANCE.getDATATYPEDEFINITIONREAL_ACCURACY();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONREAL__DESC = eINSTANCE.getDATATYPEDEFINITIONREAL_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONREAL__IDENTIFIER = eINSTANCE.getDATATYPEDEFINITIONREAL_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONREAL__LASTCHANGE = eINSTANCE.getDATATYPEDEFINITIONREAL_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONREAL__LONGNAME = eINSTANCE.getDATATYPEDEFINITIONREAL_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>MAX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONREAL__MAX = eINSTANCE.getDATATYPEDEFINITIONREAL_MAX();

		/**
		 * The meta object literal for the '<em><b>MIN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONREAL__MIN = eINSTANCE.getDATATYPEDEFINITIONREAL_MIN();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONSTRINGImpl <em>DATATYPEDEFINITIONSTRING</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONSTRINGImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDATATYPEDEFINITIONSTRING()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONSTRING = eINSTANCE.getDATATYPEDEFINITIONSTRING();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONSTRING__ALTERNATIVEID = eINSTANCE.getDATATYPEDEFINITIONSTRING_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONSTRING__DESC = eINSTANCE.getDATATYPEDEFINITIONSTRING_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONSTRING__IDENTIFIER = eINSTANCE.getDATATYPEDEFINITIONSTRING_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONSTRING__LASTCHANGE = eINSTANCE.getDATATYPEDEFINITIONSTRING_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONSTRING__LONGNAME = eINSTANCE.getDATATYPEDEFINITIONSTRING_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>MAXLENGTH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONSTRING__MAXLENGTH = eINSTANCE.getDATATYPEDEFINITIONSTRING_MAXLENGTH();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONXHTMLImpl <em>DATATYPEDEFINITIONXHTML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPEDEFINITIONXHTMLImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDATATYPEDEFINITIONXHTML()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONXHTML = eINSTANCE.getDATATYPEDEFINITIONXHTML();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONXHTML__ALTERNATIVEID = eINSTANCE.getDATATYPEDEFINITIONXHTML_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONXHTML__DESC = eINSTANCE.getDATATYPEDEFINITIONXHTML_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONXHTML__IDENTIFIER = eINSTANCE.getDATATYPEDEFINITIONXHTML_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONXHTML__LASTCHANGE = eINSTANCE.getDATATYPEDEFINITIONXHTML_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONXHTML__LONGNAME = eINSTANCE.getDATATYPEDEFINITIONXHTML_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPESTypeImpl <em>DATATYPES Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DATATYPESTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDATATYPESType()
		 * @generated
		 */
		EClass DATATYPES_TYPE = eINSTANCE.getDATATYPESType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPES_TYPE__GROUP = eINSTANCE.getDATATYPESType_Group();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONBOOLEAN</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES_TYPE__DATATYPEDEFINITIONBOOLEAN = eINSTANCE.getDATATYPESType_DATATYPEDEFINITIONBOOLEAN();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONDATE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES_TYPE__DATATYPEDEFINITIONDATE = eINSTANCE.getDATATYPESType_DATATYPEDEFINITIONDATE();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES_TYPE__DATATYPEDEFINITIONENUMERATION = eINSTANCE.getDATATYPESType_DATATYPEDEFINITIONENUMERATION();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONINTEGER</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES_TYPE__DATATYPEDEFINITIONINTEGER = eINSTANCE.getDATATYPESType_DATATYPEDEFINITIONINTEGER();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONREAL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES_TYPE__DATATYPEDEFINITIONREAL = eINSTANCE.getDATATYPESType_DATATYPEDEFINITIONREAL();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONSTRING</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES_TYPE__DATATYPEDEFINITIONSTRING = eINSTANCE.getDATATYPESType_DATATYPEDEFINITIONSTRING();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONXHTML</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES_TYPE__DATATYPEDEFINITIONXHTML = eINSTANCE.getDATATYPESType_DATATYPEDEFINITIONXHTML();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUETypeImpl <em>DEFAULTVALUE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUETypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFAULTVALUEType()
		 * @generated
		 */
		EClass DEFAULTVALUE_TYPE = eINSTANCE.getDEFAULTVALUEType();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEDATE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULTVALUE_TYPE__ATTRIBUTEVALUEDATE = eINSTANCE.getDEFAULTVALUEType_ATTRIBUTEVALUEDATE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType1Impl <em>DEFAULTVALUE Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType1Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFAULTVALUEType1()
		 * @generated
		 */
		EClass DEFAULTVALUE_TYPE1 = eINSTANCE.getDEFAULTVALUEType1();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULTVALUE_TYPE1__ATTRIBUTEVALUEENUMERATION = eINSTANCE.getDEFAULTVALUEType1_ATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType2Impl <em>DEFAULTVALUE Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType2Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFAULTVALUEType2()
		 * @generated
		 */
		EClass DEFAULTVALUE_TYPE2 = eINSTANCE.getDEFAULTVALUEType2();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEINTEGER</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEINTEGER = eINSTANCE.getDEFAULTVALUEType2_ATTRIBUTEVALUEINTEGER();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType3Impl <em>DEFAULTVALUE Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType3Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFAULTVALUEType3()
		 * @generated
		 */
		EClass DEFAULTVALUE_TYPE3 = eINSTANCE.getDEFAULTVALUEType3();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEREAL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULTVALUE_TYPE3__ATTRIBUTEVALUEREAL = eINSTANCE.getDEFAULTVALUEType3_ATTRIBUTEVALUEREAL();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType4Impl <em>DEFAULTVALUE Type4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType4Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFAULTVALUEType4()
		 * @generated
		 */
		EClass DEFAULTVALUE_TYPE4 = eINSTANCE.getDEFAULTVALUEType4();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESTRING</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULTVALUE_TYPE4__ATTRIBUTEVALUESTRING = eINSTANCE.getDEFAULTVALUEType4_ATTRIBUTEVALUESTRING();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType5Impl <em>DEFAULTVALUE Type5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType5Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFAULTVALUEType5()
		 * @generated
		 */
		EClass DEFAULTVALUE_TYPE5 = eINSTANCE.getDEFAULTVALUEType5();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXHTML</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULTVALUE_TYPE5__ATTRIBUTEVALUEXHTML = eINSTANCE.getDEFAULTVALUEType5_ATTRIBUTEVALUEXHTML();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType6Impl <em>DEFAULTVALUE Type6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType6Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFAULTVALUEType6()
		 * @generated
		 */
		EClass DEFAULTVALUE_TYPE6 = eINSTANCE.getDEFAULTVALUEType6();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEBOOLEAN</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULTVALUE_TYPE6__ATTRIBUTEVALUEBOOLEAN = eINSTANCE.getDEFAULTVALUEType6_ATTRIBUTEVALUEBOOLEAN();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONTypeImpl <em>DEFINITION Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFINITIONType()
		 * @generated
		 */
		EClass DEFINITION_TYPE = eINSTANCE.getDEFINITIONType();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF = eINSTANCE.getDEFINITIONType_ATTRIBUTEDEFINITIONENUMERATIONREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType1Impl <em>DEFINITION Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType1Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFINITIONType1()
		 * @generated
		 */
		EClass DEFINITION_TYPE1 = eINSTANCE.getDEFINITIONType1();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONDATEREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_TYPE1__ATTRIBUTEDEFINITIONDATEREF = eINSTANCE.getDEFINITIONType1_ATTRIBUTEDEFINITIONDATEREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType2Impl <em>DEFINITION Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType2Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFINITIONType2()
		 * @generated
		 */
		EClass DEFINITION_TYPE2 = eINSTANCE.getDEFINITIONType2();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONSTRINGREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_TYPE2__ATTRIBUTEDEFINITIONSTRINGREF = eINSTANCE.getDEFINITIONType2_ATTRIBUTEDEFINITIONSTRINGREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType3Impl <em>DEFINITION Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType3Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFINITIONType3()
		 * @generated
		 */
		EClass DEFINITION_TYPE3 = eINSTANCE.getDEFINITIONType3();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONXHTMLREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_TYPE3__ATTRIBUTEDEFINITIONXHTMLREF = eINSTANCE.getDEFINITIONType3_ATTRIBUTEDEFINITIONXHTMLREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType4Impl <em>DEFINITION Type4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType4Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFINITIONType4()
		 * @generated
		 */
		EClass DEFINITION_TYPE4 = eINSTANCE.getDEFINITIONType4();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONREALREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_TYPE4__ATTRIBUTEDEFINITIONREALREF = eINSTANCE.getDEFINITIONType4_ATTRIBUTEDEFINITIONREALREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType5Impl <em>DEFINITION Type5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType5Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFINITIONType5()
		 * @generated
		 */
		EClass DEFINITION_TYPE5 = eINSTANCE.getDEFINITIONType5();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONINTEGERREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_TYPE5__ATTRIBUTEDEFINITIONINTEGERREF = eINSTANCE.getDEFINITIONType5_ATTRIBUTEDEFINITIONINTEGERREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType6Impl <em>DEFINITION Type6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType6Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDEFINITIONType6()
		 * @generated
		 */
		EClass DEFINITION_TYPE6 = eINSTANCE.getDEFINITIONType6();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONBOOLEANREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_TYPE6__ATTRIBUTEDEFINITIONBOOLEANREF = eINSTANCE.getDEFINITIONType6_ATTRIBUTEDEFINITIONBOOLEANREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DocumentRootImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>REQIF</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQIF = eINSTANCE.getDocumentRoot_REQIF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.EDITABLEATTSTypeImpl <em>EDITABLEATTS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.EDITABLEATTSTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getEDITABLEATTSType()
		 * @generated
		 */
		EClass EDITABLEATTS_TYPE = eINSTANCE.getEDITABLEATTSType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITABLEATTS_TYPE__GROUP = eINSTANCE.getEDITABLEATTSType_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONBOOLEANREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONBOOLEANREF = eINSTANCE.getEDITABLEATTSType_ATTRIBUTEDEFINITIONBOOLEANREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONDATEREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONDATEREF = eINSTANCE.getEDITABLEATTSType_ATTRIBUTEDEFINITIONDATEREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF = eINSTANCE.getEDITABLEATTSType_ATTRIBUTEDEFINITIONENUMERATIONREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONINTEGERREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONINTEGERREF = eINSTANCE.getEDITABLEATTSType_ATTRIBUTEDEFINITIONINTEGERREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONREALREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONREALREF = eINSTANCE.getEDITABLEATTSType_ATTRIBUTEDEFINITIONREALREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONSTRINGREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONSTRINGREF = eINSTANCE.getEDITABLEATTSType_ATTRIBUTEDEFINITIONSTRINGREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONXHTMLREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONXHTMLREF = eINSTANCE.getEDITABLEATTSType_ATTRIBUTEDEFINITIONXHTMLREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.EMBEDDEDVALUEImpl <em>EMBEDDEDVALUE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.EMBEDDEDVALUEImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getEMBEDDEDVALUE()
		 * @generated
		 */
		EClass EMBEDDEDVALUE = eINSTANCE.getEMBEDDEDVALUE();

		/**
		 * The meta object literal for the '<em><b>KEY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDEDVALUE__KEY = eINSTANCE.getEMBEDDEDVALUE_KEY();

		/**
		 * The meta object literal for the '<em><b>OTHERCONTENT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDEDVALUE__OTHERCONTENT = eINSTANCE.getEMBEDDEDVALUE_OTHERCONTENT();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ENUMVALUEImpl <em>ENUMVALUE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ENUMVALUEImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getENUMVALUE()
		 * @generated
		 */
		EClass ENUMVALUE = eINSTANCE.getENUMVALUE();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMVALUE__ALTERNATIVEID = eINSTANCE.getENUMVALUE_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>PROPERTIES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMVALUE__PROPERTIES = eINSTANCE.getENUMVALUE_PROPERTIES();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMVALUE__DESC = eINSTANCE.getENUMVALUE_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMVALUE__IDENTIFIER = eINSTANCE.getENUMVALUE_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMVALUE__LASTCHANGE = eINSTANCE.getENUMVALUE_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMVALUE__LONGNAME = eINSTANCE.getENUMVALUE_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.OBJECTTypeImpl <em>OBJECT Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.OBJECTTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getOBJECTType()
		 * @generated
		 */
		EClass OBJECT_TYPE = eINSTANCE.getOBJECTType();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__SPECOBJECTREF = eINSTANCE.getOBJECTType_SPECOBJECTREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.PROPERTIESTypeImpl <em>PROPERTIES Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.PROPERTIESTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getPROPERTIESType()
		 * @generated
		 */
		EClass PROPERTIES_TYPE = eINSTANCE.getPROPERTIESType();

		/**
		 * The meta object literal for the '<em><b>EMBEDDEDVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_TYPE__EMBEDDEDVALUE = eINSTANCE.getPROPERTIESType_EMBEDDEDVALUE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.RELATIONGROUPImpl <em>RELATIONGROUP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.RELATIONGROUPImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getRELATIONGROUP()
		 * @generated
		 */
		EClass RELATIONGROUP = eINSTANCE.getRELATIONGROUP();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONGROUP__ALTERNATIVEID = eINSTANCE.getRELATIONGROUP_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>SOURCESPECIFICATION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONGROUP__SOURCESPECIFICATION = eINSTANCE.getRELATIONGROUP_SOURCESPECIFICATION();

		/**
		 * The meta object literal for the '<em><b>SPECRELATIONS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONGROUP__SPECRELATIONS = eINSTANCE.getRELATIONGROUP_SPECRELATIONS();

		/**
		 * The meta object literal for the '<em><b>TARGETSPECIFICATION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONGROUP__TARGETSPECIFICATION = eINSTANCE.getRELATIONGROUP_TARGETSPECIFICATION();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONGROUP__TYPE = eINSTANCE.getRELATIONGROUP_TYPE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONGROUP__DESC = eINSTANCE.getRELATIONGROUP_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONGROUP__IDENTIFIER = eINSTANCE.getRELATIONGROUP_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONGROUP__LASTCHANGE = eINSTANCE.getRELATIONGROUP_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONGROUP__LONGNAME = eINSTANCE.getRELATIONGROUP_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.RELATIONGROUPTYPEImpl <em>RELATIONGROUPTYPE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.RELATIONGROUPTYPEImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getRELATIONGROUPTYPE()
		 * @generated
		 */
		EClass RELATIONGROUPTYPE = eINSTANCE.getRELATIONGROUPTYPE();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONGROUPTYPE__ALTERNATIVEID = eINSTANCE.getRELATIONGROUPTYPE_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>SPECATTRIBUTES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONGROUPTYPE__SPECATTRIBUTES = eINSTANCE.getRELATIONGROUPTYPE_SPECATTRIBUTES();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONGROUPTYPE__DESC = eINSTANCE.getRELATIONGROUPTYPE_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONGROUPTYPE__IDENTIFIER = eINSTANCE.getRELATIONGROUPTYPE_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONGROUPTYPE__LASTCHANGE = eINSTANCE.getRELATIONGROUPTYPE_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONGROUPTYPE__LONGNAME = eINSTANCE.getRELATIONGROUPTYPE_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFImpl <em>REQIF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getREQIF()
		 * @generated
		 */
		EClass REQIF = eINSTANCE.getREQIF();

		/**
		 * The meta object literal for the '<em><b>THEHEADER</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQIF__THEHEADER = eINSTANCE.getREQIF_THEHEADER();

		/**
		 * The meta object literal for the '<em><b>CORECONTENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQIF__CORECONTENT = eINSTANCE.getREQIF_CORECONTENT();

		/**
		 * The meta object literal for the '<em><b>TOOLEXTENSIONS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQIF__TOOLEXTENSIONS = eINSTANCE.getREQIF_TOOLEXTENSIONS();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQIF__LANG = eINSTANCE.getREQIF_Lang();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFCONTENTImpl <em>REQIFCONTENT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFCONTENTImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getREQIFCONTENT()
		 * @generated
		 */
		EClass REQIFCONTENT = eINSTANCE.getREQIFCONTENT();

		/**
		 * The meta object literal for the '<em><b>DATATYPES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQIFCONTENT__DATATYPES = eINSTANCE.getREQIFCONTENT_DATATYPES();

		/**
		 * The meta object literal for the '<em><b>SPECTYPES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQIFCONTENT__SPECTYPES = eINSTANCE.getREQIFCONTENT_SPECTYPES();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQIFCONTENT__SPECOBJECTS = eINSTANCE.getREQIFCONTENT_SPECOBJECTS();

		/**
		 * The meta object literal for the '<em><b>SPECRELATIONS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQIFCONTENT__SPECRELATIONS = eINSTANCE.getREQIFCONTENT_SPECRELATIONS();

		/**
		 * The meta object literal for the '<em><b>SPECIFICATIONS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQIFCONTENT__SPECIFICATIONS = eINSTANCE.getREQIFCONTENT_SPECIFICATIONS();

		/**
		 * The meta object literal for the '<em><b>SPECRELATIONGROUPS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQIFCONTENT__SPECRELATIONGROUPS = eINSTANCE.getREQIFCONTENT_SPECRELATIONGROUPS();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFHEADERImpl <em>REQIFHEADER</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFHEADERImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getREQIFHEADER()
		 * @generated
		 */
		EClass REQIFHEADER = eINSTANCE.getREQIFHEADER();

		/**
		 * The meta object literal for the '<em><b>COMMENT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQIFHEADER__COMMENT = eINSTANCE.getREQIFHEADER_COMMENT();

		/**
		 * The meta object literal for the '<em><b>CREATIONTIME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQIFHEADER__CREATIONTIME = eINSTANCE.getREQIFHEADER_CREATIONTIME();

		/**
		 * The meta object literal for the '<em><b>REPOSITORYID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQIFHEADER__REPOSITORYID = eINSTANCE.getREQIFHEADER_REPOSITORYID();

		/**
		 * The meta object literal for the '<em><b>REQIFTOOLID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQIFHEADER__REQIFTOOLID = eINSTANCE.getREQIFHEADER_REQIFTOOLID();

		/**
		 * The meta object literal for the '<em><b>REQIFVERSION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQIFHEADER__REQIFVERSION = eINSTANCE.getREQIFHEADER_REQIFVERSION();

		/**
		 * The meta object literal for the '<em><b>SOURCETOOLID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQIFHEADER__SOURCETOOLID = eINSTANCE.getREQIFHEADER_SOURCETOOLID();

		/**
		 * The meta object literal for the '<em><b>TITLE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQIFHEADER__TITLE = eINSTANCE.getREQIFHEADER_TITLE();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQIFHEADER__IDENTIFIER = eINSTANCE.getREQIFHEADER_IDENTIFIER();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFTOOLEXTENSIONImpl <em>REQIFTOOLEXTENSION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFTOOLEXTENSIONImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getREQIFTOOLEXTENSION()
		 * @generated
		 */
		EClass REQIFTOOLEXTENSION = eINSTANCE.getREQIFTOOLEXTENSION();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQIFTOOLEXTENSION__ANY = eINSTANCE.getREQIFTOOLEXTENSION_Any();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SOURCESPECIFICATIONTypeImpl <em>SOURCESPECIFICATION Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SOURCESPECIFICATIONTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSOURCESPECIFICATIONType()
		 * @generated
		 */
		EClass SOURCESPECIFICATION_TYPE = eINSTANCE.getSOURCESPECIFICATIONType();

		/**
		 * The meta object literal for the '<em><b>SPECIFICATIONREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCESPECIFICATION_TYPE__SPECIFICATIONREF = eINSTANCE.getSOURCESPECIFICATIONType_SPECIFICATIONREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SOURCETypeImpl <em>SOURCE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SOURCETypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSOURCEType()
		 * @generated
		 */
		EClass SOURCE_TYPE = eINSTANCE.getSOURCEType();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__SPECOBJECTREF = eINSTANCE.getSOURCEType_SPECOBJECTREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESTypeImpl <em>SPECATTRIBUTES Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECATTRIBUTESType()
		 * @generated
		 */
		EClass SPECATTRIBUTES_TYPE = eINSTANCE.getSPECATTRIBUTESType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECATTRIBUTES_TYPE__GROUP = eINSTANCE.getSPECATTRIBUTESType_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONBOOLEAN</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONBOOLEAN = eINSTANCE.getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONBOOLEAN();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONDATE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONDATE = eINSTANCE.getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONDATE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONENUMERATION = eINSTANCE.getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONINTEGER</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONINTEGER = eINSTANCE.getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONINTEGER();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONREAL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONREAL = eINSTANCE.getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONREAL();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONSTRING</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONSTRING = eINSTANCE.getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONSTRING();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONXHTML</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONXHTML = eINSTANCE.getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONXHTML();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType1Impl <em>SPECATTRIBUTES Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType1Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECATTRIBUTESType1()
		 * @generated
		 */
		EClass SPECATTRIBUTES_TYPE1 = eINSTANCE.getSPECATTRIBUTESType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECATTRIBUTES_TYPE1__GROUP = eINSTANCE.getSPECATTRIBUTESType1_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONBOOLEAN</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONBOOLEAN = eINSTANCE.getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONBOOLEAN();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONDATE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONDATE = eINSTANCE.getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONDATE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONENUMERATION = eINSTANCE.getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONINTEGER</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONINTEGER = eINSTANCE.getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONINTEGER();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONREAL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONREAL = eINSTANCE.getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONREAL();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONSTRING</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONSTRING = eINSTANCE.getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONSTRING();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONXHTML</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONXHTML = eINSTANCE.getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONXHTML();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType2Impl <em>SPECATTRIBUTES Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType2Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECATTRIBUTESType2()
		 * @generated
		 */
		EClass SPECATTRIBUTES_TYPE2 = eINSTANCE.getSPECATTRIBUTESType2();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECATTRIBUTES_TYPE2__GROUP = eINSTANCE.getSPECATTRIBUTESType2_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONBOOLEAN</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONBOOLEAN = eINSTANCE.getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONBOOLEAN();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONDATE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONDATE = eINSTANCE.getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONDATE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONENUMERATION = eINSTANCE.getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONINTEGER</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONINTEGER = eINSTANCE.getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONINTEGER();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONREAL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONREAL = eINSTANCE.getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONREAL();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONSTRING</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONSTRING = eINSTANCE.getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONSTRING();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONXHTML</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONXHTML = eINSTANCE.getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONXHTML();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType3Impl <em>SPECATTRIBUTES Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType3Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECATTRIBUTESType3()
		 * @generated
		 */
		EClass SPECATTRIBUTES_TYPE3 = eINSTANCE.getSPECATTRIBUTESType3();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECATTRIBUTES_TYPE3__GROUP = eINSTANCE.getSPECATTRIBUTESType3_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONBOOLEAN</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONBOOLEAN = eINSTANCE.getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONBOOLEAN();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONDATE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONDATE = eINSTANCE.getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONDATE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONENUMERATION = eINSTANCE.getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONINTEGER</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONINTEGER = eINSTANCE.getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONINTEGER();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONREAL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONREAL = eINSTANCE.getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONREAL();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONSTRING</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONSTRING = eINSTANCE.getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONSTRING();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONXHTML</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONXHTML = eINSTANCE.getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONXHTML();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECHIERARCHYImpl <em>SPECHIERARCHY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECHIERARCHYImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECHIERARCHY()
		 * @generated
		 */
		EClass SPECHIERARCHY = eINSTANCE.getSPECHIERARCHY();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECHIERARCHY__ALTERNATIVEID = eINSTANCE.getSPECHIERARCHY_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>CHILDREN</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECHIERARCHY__CHILDREN = eINSTANCE.getSPECHIERARCHY_CHILDREN();

		/**
		 * The meta object literal for the '<em><b>EDITABLEATTS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECHIERARCHY__EDITABLEATTS = eINSTANCE.getSPECHIERARCHY_EDITABLEATTS();

		/**
		 * The meta object literal for the '<em><b>OBJECT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECHIERARCHY__OBJECT = eINSTANCE.getSPECHIERARCHY_OBJECT();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHY__DESC = eINSTANCE.getSPECHIERARCHY_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHY__IDENTIFIER = eINSTANCE.getSPECHIERARCHY_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>ISEDITABLE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHY__ISEDITABLE = eINSTANCE.getSPECHIERARCHY_ISEDITABLE();

		/**
		 * The meta object literal for the '<em><b>ISTABLEINTERNAL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHY__ISTABLEINTERNAL = eINSTANCE.getSPECHIERARCHY_ISTABLEINTERNAL();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHY__LASTCHANGE = eINSTANCE.getSPECHIERARCHY_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHY__LONGNAME = eINSTANCE.getSPECHIERARCHY_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFICATIONImpl <em>SPECIFICATION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFICATIONImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECIFICATION()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSPECIFICATION();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__ALTERNATIVEID = eINSTANCE.getSPECIFICATION_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>VALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__VALUES = eINSTANCE.getSPECIFICATION_VALUES();

		/**
		 * The meta object literal for the '<em><b>CHILDREN</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__CHILDREN = eINSTANCE.getSPECIFICATION_CHILDREN();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__TYPE = eINSTANCE.getSPECIFICATION_TYPE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__DESC = eINSTANCE.getSPECIFICATION_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__IDENTIFIER = eINSTANCE.getSPECIFICATION_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__LASTCHANGE = eINSTANCE.getSPECIFICATION_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__LONGNAME = eINSTANCE.getSPECIFICATION_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFICATIONSTypeImpl <em>SPECIFICATIONS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFICATIONSTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECIFICATIONSType()
		 * @generated
		 */
		EClass SPECIFICATIONS_TYPE = eINSTANCE.getSPECIFICATIONSType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATIONS_TYPE__GROUP = eINSTANCE.getSPECIFICATIONSType_Group();

		/**
		 * The meta object literal for the '<em><b>SPECIFICATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATIONS_TYPE__SPECIFICATION = eINSTANCE.getSPECIFICATIONSType_SPECIFICATION();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFICATIONTYPEImpl <em>SPECIFICATIONTYPE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFICATIONTYPEImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECIFICATIONTYPE()
		 * @generated
		 */
		EClass SPECIFICATIONTYPE = eINSTANCE.getSPECIFICATIONTYPE();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATIONTYPE__ALTERNATIVEID = eINSTANCE.getSPECIFICATIONTYPE_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>SPECATTRIBUTES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATIONTYPE__SPECATTRIBUTES = eINSTANCE.getSPECIFICATIONTYPE_SPECATTRIBUTES();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATIONTYPE__DESC = eINSTANCE.getSPECIFICATIONTYPE_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATIONTYPE__IDENTIFIER = eINSTANCE.getSPECIFICATIONTYPE_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATIONTYPE__LASTCHANGE = eINSTANCE.getSPECIFICATIONTYPE_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATIONTYPE__LONGNAME = eINSTANCE.getSPECIFICATIONTYPE_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFIEDVALUESTypeImpl <em>SPECIFIEDVALUES Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFIEDVALUESTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECIFIEDVALUESType()
		 * @generated
		 */
		EClass SPECIFIEDVALUES_TYPE = eINSTANCE.getSPECIFIEDVALUESType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIEDVALUES_TYPE__GROUP = eINSTANCE.getSPECIFIEDVALUESType_Group();

		/**
		 * The meta object literal for the '<em><b>ENUMVALUE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIEDVALUES_TYPE__ENUMVALUE = eINSTANCE.getSPECIFIEDVALUESType_ENUMVALUE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECOBJECTImpl <em>SPECOBJECT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECOBJECTImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECOBJECT()
		 * @generated
		 */
		EClass SPECOBJECT = eINSTANCE.getSPECOBJECT();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECOBJECT__ALTERNATIVEID = eINSTANCE.getSPECOBJECT_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>VALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECOBJECT__VALUES = eINSTANCE.getSPECOBJECT_VALUES();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECOBJECT__TYPE = eINSTANCE.getSPECOBJECT_TYPE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECOBJECT__DESC = eINSTANCE.getSPECOBJECT_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECOBJECT__IDENTIFIER = eINSTANCE.getSPECOBJECT_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECOBJECT__LASTCHANGE = eINSTANCE.getSPECOBJECT_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECOBJECT__LONGNAME = eINSTANCE.getSPECOBJECT_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECOBJECTSTypeImpl <em>SPECOBJECTS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECOBJECTSTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECOBJECTSType()
		 * @generated
		 */
		EClass SPECOBJECTS_TYPE = eINSTANCE.getSPECOBJECTSType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECOBJECTS_TYPE__GROUP = eINSTANCE.getSPECOBJECTSType_Group();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECOBJECTS_TYPE__SPECOBJECT = eINSTANCE.getSPECOBJECTSType_SPECOBJECT();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECOBJECTTYPEImpl <em>SPECOBJECTTYPE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECOBJECTTYPEImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECOBJECTTYPE()
		 * @generated
		 */
		EClass SPECOBJECTTYPE = eINSTANCE.getSPECOBJECTTYPE();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECOBJECTTYPE__ALTERNATIVEID = eINSTANCE.getSPECOBJECTTYPE_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>SPECATTRIBUTES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECOBJECTTYPE__SPECATTRIBUTES = eINSTANCE.getSPECOBJECTTYPE_SPECATTRIBUTES();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECOBJECTTYPE__DESC = eINSTANCE.getSPECOBJECTTYPE_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECOBJECTTYPE__IDENTIFIER = eINSTANCE.getSPECOBJECTTYPE_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECOBJECTTYPE__LASTCHANGE = eINSTANCE.getSPECOBJECTTYPE_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECOBJECTTYPE__LONGNAME = eINSTANCE.getSPECOBJECTTYPE_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONImpl <em>SPECRELATION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECRELATION()
		 * @generated
		 */
		EClass SPECRELATION = eINSTANCE.getSPECRELATION();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECRELATION__ALTERNATIVEID = eINSTANCE.getSPECRELATION_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>VALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECRELATION__VALUES = eINSTANCE.getSPECRELATION_VALUES();

		/**
		 * The meta object literal for the '<em><b>SOURCE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECRELATION__SOURCE = eINSTANCE.getSPECRELATION_SOURCE();

		/**
		 * The meta object literal for the '<em><b>TARGET</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECRELATION__TARGET = eINSTANCE.getSPECRELATION_TARGET();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECRELATION__TYPE = eINSTANCE.getSPECRELATION_TYPE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATION__DESC = eINSTANCE.getSPECRELATION_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATION__IDENTIFIER = eINSTANCE.getSPECRELATION_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATION__LASTCHANGE = eINSTANCE.getSPECRELATION_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATION__LONGNAME = eINSTANCE.getSPECRELATION_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONGROUPSTypeImpl <em>SPECRELATIONGROUPS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONGROUPSTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECRELATIONGROUPSType()
		 * @generated
		 */
		EClass SPECRELATIONGROUPS_TYPE = eINSTANCE.getSPECRELATIONGROUPSType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATIONGROUPS_TYPE__GROUP = eINSTANCE.getSPECRELATIONGROUPSType_Group();

		/**
		 * The meta object literal for the '<em><b>RELATIONGROUP</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECRELATIONGROUPS_TYPE__RELATIONGROUP = eINSTANCE.getSPECRELATIONGROUPSType_RELATIONGROUP();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONSTypeImpl <em>SPECRELATIONS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONSTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECRELATIONSType()
		 * @generated
		 */
		EClass SPECRELATIONS_TYPE = eINSTANCE.getSPECRELATIONSType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATIONS_TYPE__GROUP = eINSTANCE.getSPECRELATIONSType_Group();

		/**
		 * The meta object literal for the '<em><b>SPECRELATIONREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATIONS_TYPE__SPECRELATIONREF = eINSTANCE.getSPECRELATIONSType_SPECRELATIONREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONSType1Impl <em>SPECRELATIONS Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONSType1Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECRELATIONSType1()
		 * @generated
		 */
		EClass SPECRELATIONS_TYPE1 = eINSTANCE.getSPECRELATIONSType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATIONS_TYPE1__GROUP = eINSTANCE.getSPECRELATIONSType1_Group();

		/**
		 * The meta object literal for the '<em><b>SPECRELATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECRELATIONS_TYPE1__SPECRELATION = eINSTANCE.getSPECRELATIONSType1_SPECRELATION();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONTYPEImpl <em>SPECRELATIONTYPE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECRELATIONTYPEImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECRELATIONTYPE()
		 * @generated
		 */
		EClass SPECRELATIONTYPE = eINSTANCE.getSPECRELATIONTYPE();

		/**
		 * The meta object literal for the '<em><b>ALTERNATIVEID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECRELATIONTYPE__ALTERNATIVEID = eINSTANCE.getSPECRELATIONTYPE_ALTERNATIVEID();

		/**
		 * The meta object literal for the '<em><b>SPECATTRIBUTES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECRELATIONTYPE__SPECATTRIBUTES = eINSTANCE.getSPECRELATIONTYPE_SPECATTRIBUTES();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATIONTYPE__DESC = eINSTANCE.getSPECRELATIONTYPE_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATIONTYPE__IDENTIFIER = eINSTANCE.getSPECRELATIONTYPE_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATIONTYPE__LASTCHANGE = eINSTANCE.getSPECRELATIONTYPE_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATIONTYPE__LONGNAME = eINSTANCE.getSPECRELATIONTYPE_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECTYPESTypeImpl <em>SPECTYPES Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECTYPESTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getSPECTYPESType()
		 * @generated
		 */
		EClass SPECTYPES_TYPE = eINSTANCE.getSPECTYPESType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECTYPES_TYPE__GROUP = eINSTANCE.getSPECTYPESType_Group();

		/**
		 * The meta object literal for the '<em><b>RELATIONGROUPTYPE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECTYPES_TYPE__RELATIONGROUPTYPE = eINSTANCE.getSPECTYPESType_RELATIONGROUPTYPE();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTTYPE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECTYPES_TYPE__SPECOBJECTTYPE = eINSTANCE.getSPECTYPESType_SPECOBJECTTYPE();

		/**
		 * The meta object literal for the '<em><b>SPECRELATIONTYPE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECTYPES_TYPE__SPECRELATIONTYPE = eINSTANCE.getSPECTYPESType_SPECRELATIONTYPE();

		/**
		 * The meta object literal for the '<em><b>SPECIFICATIONTYPE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECTYPES_TYPE__SPECIFICATIONTYPE = eINSTANCE.getSPECTYPESType_SPECIFICATIONTYPE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TARGETSPECIFICATIONTypeImpl <em>TARGETSPECIFICATION Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TARGETSPECIFICATIONTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTARGETSPECIFICATIONType()
		 * @generated
		 */
		EClass TARGETSPECIFICATION_TYPE = eINSTANCE.getTARGETSPECIFICATIONType();

		/**
		 * The meta object literal for the '<em><b>SPECIFICATIONREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGETSPECIFICATION_TYPE__SPECIFICATIONREF = eINSTANCE.getTARGETSPECIFICATIONType_SPECIFICATIONREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TARGETTypeImpl <em>TARGET Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TARGETTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTARGETType()
		 * @generated
		 */
		EClass TARGET_TYPE = eINSTANCE.getTARGETType();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_TYPE__SPECOBJECTREF = eINSTANCE.getTARGETType_SPECOBJECTREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.THEHEADERTypeImpl <em>THEHEADER Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.THEHEADERTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTHEHEADERType()
		 * @generated
		 */
		EClass THEHEADER_TYPE = eINSTANCE.getTHEHEADERType();

		/**
		 * The meta object literal for the '<em><b>REQIFHEADER</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEHEADER_TYPE__REQIFHEADER = eINSTANCE.getTHEHEADERType_REQIFHEADER();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TOOLEXTENSIONSTypeImpl <em>TOOLEXTENSIONS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TOOLEXTENSIONSTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTOOLEXTENSIONSType()
		 * @generated
		 */
		EClass TOOLEXTENSIONS_TYPE = eINSTANCE.getTOOLEXTENSIONSType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLEXTENSIONS_TYPE__GROUP = eINSTANCE.getTOOLEXTENSIONSType_Group();

		/**
		 * The meta object literal for the '<em><b>REQIFTOOLEXTENSION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOLEXTENSIONS_TYPE__REQIFTOOLEXTENSION = eINSTANCE.getTOOLEXTENSIONSType_REQIFTOOLEXTENSION();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPETypeImpl <em>TYPE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPETypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType()
		 * @generated
		 */
		EClass TYPE_TYPE = eINSTANCE.getTYPEType();

		/**
		 * The meta object literal for the '<em><b>RELATIONGROUPTYPEREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TYPE__RELATIONGROUPTYPEREF = eINSTANCE.getTYPEType_RELATIONGROUPTYPEREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType1Impl <em>TYPE Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType1Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType1()
		 * @generated
		 */
		EClass TYPE_TYPE1 = eINSTANCE.getTYPEType1();

		/**
		 * The meta object literal for the '<em><b>SPECIFICATIONTYPEREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TYPE1__SPECIFICATIONTYPEREF = eINSTANCE.getTYPEType1_SPECIFICATIONTYPEREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType2Impl <em>TYPE Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType2Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType2()
		 * @generated
		 */
		EClass TYPE_TYPE2 = eINSTANCE.getTYPEType2();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONINTEGERREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TYPE2__DATATYPEDEFINITIONINTEGERREF = eINSTANCE.getTYPEType2_DATATYPEDEFINITIONINTEGERREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType3Impl <em>TYPE Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType3Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType3()
		 * @generated
		 */
		EClass TYPE_TYPE3 = eINSTANCE.getTYPEType3();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONSTRINGREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TYPE3__DATATYPEDEFINITIONSTRINGREF = eINSTANCE.getTYPEType3_DATATYPEDEFINITIONSTRINGREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType4Impl <em>TYPE Type4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType4Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType4()
		 * @generated
		 */
		EClass TYPE_TYPE4 = eINSTANCE.getTYPEType4();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONREALREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TYPE4__DATATYPEDEFINITIONREALREF = eINSTANCE.getTYPEType4_DATATYPEDEFINITIONREALREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType5Impl <em>TYPE Type5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType5Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType5()
		 * @generated
		 */
		EClass TYPE_TYPE5 = eINSTANCE.getTYPEType5();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONXHTMLREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TYPE5__DATATYPEDEFINITIONXHTMLREF = eINSTANCE.getTYPEType5_DATATYPEDEFINITIONXHTMLREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType6Impl <em>TYPE Type6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType6Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType6()
		 * @generated
		 */
		EClass TYPE_TYPE6 = eINSTANCE.getTYPEType6();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTTYPEREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TYPE6__SPECOBJECTTYPEREF = eINSTANCE.getTYPEType6_SPECOBJECTTYPEREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType7Impl <em>TYPE Type7</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType7Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType7()
		 * @generated
		 */
		EClass TYPE_TYPE7 = eINSTANCE.getTYPEType7();

		/**
		 * The meta object literal for the '<em><b>SPECRELATIONTYPEREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TYPE7__SPECRELATIONTYPEREF = eINSTANCE.getTYPEType7_SPECRELATIONTYPEREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType8Impl <em>TYPE Type8</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType8Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType8()
		 * @generated
		 */
		EClass TYPE_TYPE8 = eINSTANCE.getTYPEType8();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONDATEREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TYPE8__DATATYPEDEFINITIONDATEREF = eINSTANCE.getTYPEType8_DATATYPEDEFINITIONDATEREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType9Impl <em>TYPE Type9</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType9Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType9()
		 * @generated
		 */
		EClass TYPE_TYPE9 = eINSTANCE.getTYPEType9();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONENUMERATIONREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TYPE9__DATATYPEDEFINITIONENUMERATIONREF = eINSTANCE.getTYPEType9_DATATYPEDEFINITIONENUMERATIONREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType10Impl <em>TYPE Type10</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType10Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getTYPEType10()
		 * @generated
		 */
		EClass TYPE_TYPE10 = eINSTANCE.getTYPEType10();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONBOOLEANREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TYPE10__DATATYPEDEFINITIONBOOLEANREF = eINSTANCE.getTYPEType10_DATATYPEDEFINITIONBOOLEANREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESTypeImpl <em>VALUES Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESTypeImpl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getVALUESType()
		 * @generated
		 */
		EClass VALUES_TYPE = eINSTANCE.getVALUESType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES_TYPE__GROUP = eINSTANCE.getVALUESType_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEBOOLEAN</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE__ATTRIBUTEVALUEBOOLEAN = eINSTANCE.getVALUESType_ATTRIBUTEVALUEBOOLEAN();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEDATE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE__ATTRIBUTEVALUEDATE = eINSTANCE.getVALUESType_ATTRIBUTEVALUEDATE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE__ATTRIBUTEVALUEENUMERATION = eINSTANCE.getVALUESType_ATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEINTEGER</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE__ATTRIBUTEVALUEINTEGER = eINSTANCE.getVALUESType_ATTRIBUTEVALUEINTEGER();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEREAL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE__ATTRIBUTEVALUEREAL = eINSTANCE.getVALUESType_ATTRIBUTEVALUEREAL();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESTRING</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE__ATTRIBUTEVALUESTRING = eINSTANCE.getVALUESType_ATTRIBUTEVALUESTRING();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXHTML</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE__ATTRIBUTEVALUEXHTML = eINSTANCE.getVALUESType_ATTRIBUTEVALUEXHTML();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESType1Impl <em>VALUES Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESType1Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getVALUESType1()
		 * @generated
		 */
		EClass VALUES_TYPE1 = eINSTANCE.getVALUESType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES_TYPE1__GROUP = eINSTANCE.getVALUESType1_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEBOOLEAN</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE1__ATTRIBUTEVALUEBOOLEAN = eINSTANCE.getVALUESType1_ATTRIBUTEVALUEBOOLEAN();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEDATE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE1__ATTRIBUTEVALUEDATE = eINSTANCE.getVALUESType1_ATTRIBUTEVALUEDATE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE1__ATTRIBUTEVALUEENUMERATION = eINSTANCE.getVALUESType1_ATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEINTEGER</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE1__ATTRIBUTEVALUEINTEGER = eINSTANCE.getVALUESType1_ATTRIBUTEVALUEINTEGER();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEREAL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE1__ATTRIBUTEVALUEREAL = eINSTANCE.getVALUESType1_ATTRIBUTEVALUEREAL();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESTRING</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE1__ATTRIBUTEVALUESTRING = eINSTANCE.getVALUESType1_ATTRIBUTEVALUESTRING();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXHTML</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE1__ATTRIBUTEVALUEXHTML = eINSTANCE.getVALUESType1_ATTRIBUTEVALUEXHTML();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESType2Impl <em>VALUES Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESType2Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getVALUESType2()
		 * @generated
		 */
		EClass VALUES_TYPE2 = eINSTANCE.getVALUESType2();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES_TYPE2__GROUP = eINSTANCE.getVALUESType2_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEBOOLEAN</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE2__ATTRIBUTEVALUEBOOLEAN = eINSTANCE.getVALUESType2_ATTRIBUTEVALUEBOOLEAN();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEDATE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE2__ATTRIBUTEVALUEDATE = eINSTANCE.getVALUESType2_ATTRIBUTEVALUEDATE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE2__ATTRIBUTEVALUEENUMERATION = eINSTANCE.getVALUESType2_ATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEINTEGER</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE2__ATTRIBUTEVALUEINTEGER = eINSTANCE.getVALUESType2_ATTRIBUTEVALUEINTEGER();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEREAL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE2__ATTRIBUTEVALUEREAL = eINSTANCE.getVALUESType2_ATTRIBUTEVALUEREAL();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESTRING</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE2__ATTRIBUTEVALUESTRING = eINSTANCE.getVALUESType2_ATTRIBUTEVALUESTRING();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXHTML</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE2__ATTRIBUTEVALUEXHTML = eINSTANCE.getVALUESType2_ATTRIBUTEVALUEXHTML();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESType3Impl <em>VALUES Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESType3Impl
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getVALUESType3()
		 * @generated
		 */
		EClass VALUES_TYPE3 = eINSTANCE.getVALUESType3();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES_TYPE3__GROUP = eINSTANCE.getVALUESType3_Group();

		/**
		 * The meta object literal for the '<em><b>ENUMVALUEREF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES_TYPE3__ENUMVALUEREF = eINSTANCE.getVALUESType3_ENUMVALUEREF();

		/**
		 * The meta object literal for the '<em>GLOBALREF</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getGLOBALREF()
		 * @generated
		 */
		EDataType GLOBALREF = eINSTANCE.getGLOBALREF();

		/**
		 * The meta object literal for the '<em>LOCALREF</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getLOCALREF()
		 * @generated
		 */
		EDataType LOCALREF = eINSTANCE.getLOCALREF();

		/**
		 * The meta object literal for the '<em>XHTMLCONTENT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.MyreqifPackageImpl#getXHTMLCONTENT()
		 * @generated
		 */
		EDataType XHTMLCONTENT = eINSTANCE.getXHTMLCONTENT();

	}

} //MyreqifPackage
