package org.eclipse.rmf.internal.reqif10.ide;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.sphinx.emf.resource.ExtendedResource;
import org.eclipse.sphinx.emf.resource.ExtendedResourceAdapterFactory;
import org.eclipse.sphinx.emf.serialization.internal.XMLPersistenceMappingHelperImpl;
import org.eclipse.sphinx.emf.serialization.internal.XMLPersistenceMappingSaveImpl;

@SuppressWarnings("restriction")
public class ExtendedReqIFHelperImpl extends XMLPersistenceMappingHelperImpl {

	protected ExtendedResource extendedResource;

	public ExtendedReqIFHelperImpl() {
		this(null);
	}

	public ExtendedReqIFHelperImpl(XMLResource resource) {
		super(resource);

		extendedResource = ExtendedResourceAdapterFactory.INSTANCE.adapt(resource);
	}

	/*
	 * Overridden to enable delegation of actual HREF URI creation to {@link ExtendedResourceAdapter extended resource
	 * adapter} and to trim all potentially present proxy context information.
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl#getHREF(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public String getHREF(EObject obj) {
		URI objectURI;

		if (!obj.eIsProxy()) {
			Resource otherResource = obj.eResource();
			if (otherResource == null) {
				if (resource != null && resource.getID(obj) != null) {
					if (extendedResource != null) {
						objectURI = extendedResource.getHREF(obj);
					} else {
						objectURI = getHREF(resource, obj);
					}
				} else {
					objectURI = handleDanglingHREF(obj);
					if (objectURI == null) {
						return null;
					}
				}
			} else {
				if (extendedResource != null) {
					objectURI = extendedResource.getHREF(obj);
				} else {
					objectURI = getHREF(otherResource, obj);
				}
			}
		} else {
			if (extendedResource != null) {
				objectURI = extendedResource.getHREF(obj);
				objectURI = extendedResource.trimProxyContextInfo(objectURI);
			} else {
				objectURI = ((InternalEObject) obj).eProxyURI();
			}
		}

		objectURI = deresolve(objectURI);
		
		// FIXME: we should only trim the references to reqif objects
		String uriString = objectURI.toString();
		int index=uriString.lastIndexOf("#");
		if (index > -1) {
			uriString = uriString.substring(index+1);
		}

		return uriString;
	}
}
