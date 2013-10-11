/**
 */
package org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.ToolextensionPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolextensionXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolextensionXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ToolextensionPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ToolextensionResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ToolextensionResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ToolextensionResourceFactoryImpl());
		}
		return registrations;
	}

} //ToolextensionXMLProcessor
