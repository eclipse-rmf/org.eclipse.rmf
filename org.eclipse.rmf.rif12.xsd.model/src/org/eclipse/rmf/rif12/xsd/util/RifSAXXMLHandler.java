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
package org.eclipse.rmf.rif12.xsd.util;

import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;

public class RifSAXXMLHandler extends SAXXMLHandler {

	public RifSAXXMLHandler(XMLResource xmiResource, XMLHelper helper,
			Map<?, ?> options) {
		super(xmiResource, helper, options);
	}
	
	@Override
	protected void setValueFromId(EObject object, EReference eReference,
			String ids) {
	    StringTokenizer st = new StringTokenizer(ids);

	    boolean isFirstID = true;
	    boolean mustAdd = deferIDREFResolution;
	    boolean mustAddOrNotOppositeIsMany = false;

	    int size = 0;
	    String qName = null;
	    int position = 0;
	    while (st.hasMoreTokens())
	    {
	      String id = st.nextToken();
	      int index = id.indexOf('#', 0);
	      if (index != -1)
	      {
	  /*      if (index == 0)
	        {
	          id = id.substring(1);
	        }
	        else*/
	    
	        {
	          Object oldAttributes = setAttributes(null);
	          // Create a proxy in the correct way and pop it.
	          //
	          InternalEObject proxy =
	            (InternalEObject)
	              (qName == null ?
	                 createObjectFromFeatureType(object, eReference) :
	                 createObjectFromTypeName(object, qName, eReference));
	          setAttributes(oldAttributes);
	          if (proxy != null)
	          {
	            handleProxy(proxy, id);
	          }
	          objects.pop();
	          types.pop();
	          mixedTargets.pop();

	          qName = null;
	          ++position;
	          continue;
	        }
	      }
	      else if (id.indexOf(':', 0) != -1)
	      {
	        qName = id;
	        continue;
	      }

	      // Ensure that references corresponding to repeating elements are always deferred and processed in order at the end.
	      //
	      if (isFirstID && extendedMetaData != null && eReference.isMany() && extendedMetaData.getFeatureKind(eReference) == ExtendedMetaData.ELEMENT_FEATURE)
	      {
	        SingleReference ref = new SingleReference
	                                   (object,
	                                    eReference,
	                                    id,
	                                    -1,
	                                    getLineNumber(),
	                                    getColumnNumber());
	        forwardSingleReferences.add(ref);
	        return;
	      }

	      if (!deferIDREFResolution)
	      {
	        if (isFirstID)
	        {
	          EReference eOpposite = eReference.getEOpposite();
	          if (eOpposite == null)
	          {
	            mustAdd = true;
	            mustAddOrNotOppositeIsMany = true;
	          }
	          else
	          {
	            mustAdd = eOpposite.isTransient() || eReference.isMany();
	            mustAddOrNotOppositeIsMany = mustAdd || !eOpposite.isMany();
	          }
	          isFirstID = false;
	        }
	  
	        if (mustAddOrNotOppositeIsMany)
	        {
	          EObject resolvedEObject = xmlResource.getEObject(id);
	          if (resolvedEObject != null)
	          {
	            setFeatureValue(object, eReference, resolvedEObject);
	            qName = null;
	            ++position;
	            continue;
	          }
	        }
	      } 

	      if (mustAdd)
	      {
	        if (size == capacity)
	          growArrays();

	        identifiers[size] = id;
	        positions[size]   = position;
	        ++size;
	      }
	      qName = null;
	      ++position;
	    }

	    if (position == 0)
	    {
	      setFeatureValue(object, eReference, null, -2);
	    }
	    else if (size <= REFERENCE_THRESHOLD)
	    {
	      for (int i = 0; i < size; i++)
	      {
	        SingleReference ref = new SingleReference
	                                   (object,
	                                    eReference,
	                                    identifiers[i],
	                                    positions[i],
	                                    getLineNumber(),
	                                    getColumnNumber());
	        forwardSingleReferences.add(ref);
	      }
	    }
	    else
	    {
	      Object[] values = new Object[size];
	      int[] currentPositions = new int[size];
	      System.arraycopy(identifiers, 0, values, 0, size);
	      System.arraycopy(positions, 0, currentPositions, 0, size);

	      ManyReference ref = new ManyReference
	                                 (object,
	                                  eReference,
	                                  values,
	                                  currentPositions,
	                                  getLineNumber(),
	                                  getColumnNumber());
	      forwardManyReferences.add(ref);
	    }
	  }

}
