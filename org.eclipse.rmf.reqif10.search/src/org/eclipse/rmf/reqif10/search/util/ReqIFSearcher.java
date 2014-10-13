/*******************************************************************************
 * Copyright (c) 2014 Hussein Mhanna
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hussein Mhanna - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.search.criteria.Criteria;
import org.eclipse.rmf.reqif10.search.criteria.Operator;

/**
 * @author Hussein MHANNA
 *
 */
public class ReqIFSearcher {
	/**
	 * The constructor
	 */
	public ReqIFSearcher() {
	}

	public Map<Resource, Collection<EObject>> search(IProgressMonitor monitor,
			Collection<Resource> resources, Collection<Criteria> criterias,
			boolean replace) {
		monitor.beginTask("Start Searching ...", 2 * resources.size());
		Map<Resource, Collection<EObject>> result = new HashMap<Resource, Collection<EObject>>();
		for (Resource resource : resources) {
			Collection<EObject> searchresult = search(monitor, resource,
					criterias, replace);
			result.put(resource, searchresult);
			if (monitor.isCanceled()) {
				break;
			}
			monitor.worked(2);
		}
		monitor.done();
		return result;
	}

	protected Collection<EObject> search(IProgressMonitor monitor,
			Resource resource, Collection<Criteria> criterias, boolean replace) {
		Set<EObject> result = new HashSet<EObject>();
		// we create a set of specifications to add to add the SpecHierarchy
		// having reference to found SpecObject
		Set<Specification> specifications = new HashSet<Specification>();
		for (TreeIterator<EObject> contents = resource.getAllContents(); contents
				.hasNext();) {
			EObject eObject = contents.next();
			Entry entry = isCompatibleWithCriteria(eObject, criterias);
			if (entry != null) {
				result.add(eObject);
				if (replace) {
					setValue(entry);
				}
			}
			if (eObject instanceof Specification) {
				specifications.add((Specification) eObject);
			}
		}
		// For each Specification in the resource set, we add to the result the
		// SpecHierarchy
		// having reference to found SpecObject
		for (Specification specification : specifications) {
			addSpecHierarchies(result, specification.getChildren());
		}
		return result;
	}

	private void addSpecHierarchies(Set<EObject> result,
			EList<SpecHierarchy> children) {
		for (SpecHierarchy specHierarchy : children) {
			SpecObject specObject = specHierarchy.getObject();
			if ((specObject != null) && (result.contains(specObject))) {
				result.add(specHierarchy);
				addSpecHierarchies(result, specHierarchy.getChildren());
			}
		}
	}

	protected Entry isCompatibleWithCriteria(EObject eObject,
			Collection<Criteria> criterias) {
		for (Criteria criteria : criterias) {
			Entry entry = getEntry(eObject, criteria);
			if (entry != null) {
				EStructuralFeature feature = entry.feature;
				if (feature instanceof EAttribute) {
					Object value = entry.getValue();
					Operator operator = criteria.getOperator();
					String textToSearch = criteria.getSerachedText();
					if (value != null) {
						String stringValue = value.toString();
						switch (operator) {
						case CONTAINS:
							if (stringValue.contains(textToSearch)) {
								return entry;
							}
							break;
						case NOT_CONTAINS:
							if (false == stringValue.contains(textToSearch)) {
								return entry;
							}
							break;
						case EQUALS:
							if (stringValue.contains(textToSearch)) {
								return entry;
							}
							break;
						case NOT_EQUALS:
							if (false == stringValue.equals(textToSearch)) {
								return entry;
							}
							break;
						default:
							break;
						}
					} else if (operator.equals(Operator.NOT_EQUALS)) {
						return entry;
					}
				}
			}
		}
		return null;
	}

	protected void setValue(Entry entry) {
		Criteria criteria = entry.criteria;
		EObject eObject = entry.eObject;
		EAttribute feature = entry.feature;
		String value = criteria.getReplacementText();
		if (criteria.getOperator().equals(Operator.CONTAINS)) {
			value = entry
					.getValue()
					.toString()
					.replaceAll(criteria.getSerachedText(),
							criteria.getReplacementText());
		}
		doSetValue(eObject, feature,
				EcoreUtil.createFromString(feature.getEAttributeType(), value));
	}

	protected void doSetValue(EObject eObject, EStructuralFeature feature,
			Object value) {
		eObject.eSet(feature, value);
	}

	protected Entry getEntry(EObject eObject, Criteria criteria) {
		Entry entry = null;
		String featureName = criteria.getFeatureName();
		EStructuralFeature eStructuralFeature = eObject.eClass()
				.getEStructuralFeature(featureName);
		if (eStructuralFeature instanceof EAttribute) {
			entry = new Entry(eObject, (EAttribute) eStructuralFeature,
					criteria);
		} else if (eObject instanceof SpecElementWithAttributes) {
			EList<AttributeValue> values = ((SpecElementWithAttributes) eObject)
					.getValues();
			for (AttributeValue attributeValue : values) {
				eStructuralFeature = attributeValue.eClass()
						.getEStructuralFeature(featureName);
				if (eStructuralFeature == null) {
					EStructuralFeature definitionEStructuralFeature = attributeValue
							.eClass().getEStructuralFeature("definition");
					if (definitionEStructuralFeature != null) {
						AttributeDefinition attributeDefinition = (AttributeDefinition) attributeValue
								.eGet(definitionEStructuralFeature);
						if (attributeDefinition != null
								&& attributeDefinition.getLongName() != null
								&& attributeDefinition.getLongName().equals(
										featureName)) {
							eStructuralFeature = attributeValue.eClass()
									.getEStructuralFeature("theValue");
						}
					}

				}
				// null instance of anything is always null so we do not need to
				// check if eStructuralFeature is not null
				if (eStructuralFeature instanceof EAttribute) {
					entry = new Entry(attributeValue,
							(EAttribute) eStructuralFeature, criteria);
					break;
				}
			}
		}
		return entry;
	}

	protected class Entry {
		private EObject eObject;
		private EAttribute feature;
		private Criteria criteria;

		public Entry(EObject eObject, EAttribute feature, Criteria criteria) {
			super();
			this.eObject = eObject;
			this.feature = feature;
			this.criteria = criteria;
		}

		public Criteria getCriteria() {
			return criteria;
		}

		public EObject getEObject() {
			return eObject;
		}

		public EAttribute getFeature() {
			return feature;
		}

		protected Object getValue() {
			return eObject.eGet(feature);
		}
	}
}
