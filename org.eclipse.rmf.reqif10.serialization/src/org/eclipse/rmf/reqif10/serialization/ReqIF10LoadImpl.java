package org.eclipse.rmf.reqif10.serialization;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.PackageNotFoundException;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.sphinx.emf.serialization.internal.XMLPersistenceMappingHandler;
import org.eclipse.sphinx.emf.serialization.internal.XMLPersistenceMappingLoadImpl;
import org.xml.sax.helpers.DefaultHandler;

public class ReqIF10LoadImpl extends XMLPersistenceMappingLoadImpl {

	public ReqIF10LoadImpl(XMLHelper helper) {
		super(helper);
	}
	
	/**
	 * creates XML default handler that searches for EPackages in the registry, only.
	 * It doesn't try to find a not registered EPackage by loading the content of the namespace URI.
	 */
	@Override
	protected DefaultHandler makeDefaultHandler() {
		XMLPersistenceMappingHandler handler = new XMLPersistenceMappingHandler(resource, helper, options) {
			@Override
			protected EPackage getPackageForURI(String uriString) {
			    if (uriString == null)
			    {
			      return null;
			    }

			    EPackage ePackage = 
			      extendedMetaData == null ?
			        packageRegistry.getEPackage(uriString) :
			        extendedMetaData.getPackage(uriString);

			    if (ePackage != null && ePackage.eIsProxy())
			    {
			      ePackage = null;
			    }


			    if (ePackage == null)
			    {
			      ePackage = handleMissingPackage(uriString);
			    }

			    if (ePackage == null)
			    {
			      error
			        (new PackageNotFoundException
			           (uriString,
			            getLocation(),
			            getLineNumber(),
			            getColumnNumber()));
			    }

			    return ePackage;

			}
		};

		return handler;
	}

}
