/**
 */
package org.eclipse.rmf.serialization.tests.env.emf.myreqif.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MyreqifXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyreqifXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		MyreqifPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the MyreqifResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new MyreqifResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new MyreqifResourceFactoryImpl());
		}
		return registrations;
	}

} //MyreqifXMLProcessor
