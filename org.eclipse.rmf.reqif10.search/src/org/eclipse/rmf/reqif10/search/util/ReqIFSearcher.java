/**
 * 
 */
package org.eclipse.rmf.reqif10.search.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
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

	public Collection<EObject> search(ResourceSet resourceSet,
			Collection<Criteria> criterias) {
		List<EObject> result = new ArrayList<EObject>();
		for (TreeIterator<Notifier> contents = resourceSet.getAllContents(); contents
				.hasNext();) {
			Object object = contents.next();
			if (object instanceof EObject) {
				EObject eObject = (EObject) object;
				System.out.println();
				if (isCompatibleWithCriteria(eObject, criterias) != null) {
					result.add(eObject);
				}
			}
		}
		return result;
	}

	public Collection<EObject> replace(ResourceSet resourceSet,
			Collection<Criteria> criterias) {
		List<EObject> result = new ArrayList<EObject>();
		for (TreeIterator<Notifier> contents = resourceSet.getAllContents(); contents
				.hasNext();) {
			Object object = contents.next();
			if (object instanceof EObject) {
				EObject eObject = (EObject) object;
				Entry entry = isCompatibleWithCriteria(eObject, criterias);
				if (entry != null) {
					result.add(eObject);
					setValue(entry);
				}
			}
		}
		return result;
	}

	protected Entry isCompatibleWithCriteria(EObject eObject,
			Collection<Criteria> criterias) {
		for (Criteria criteria : criterias) {
			Entry entry = getEntry(eObject, criteria);
			if (entry != null) {
				EStructuralFeature feature = entry.feature;
				if (feature instanceof EAttribute) {
					Object value = getValue(entry);
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

	protected Object getValue(Entry entry) {
		return entry.eObject.eGet(entry.feature);
	}

	protected void setValue(Entry entry) {
		Criteria criteria = entry.criteria;
		entry.eObject.eSet(entry.feature, EcoreUtil.createFromString(
				entry.feature.getEAttributeType(),
				criteria.getReplacementText()));
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
				if (eStructuralFeature != null) {
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
	}
}
