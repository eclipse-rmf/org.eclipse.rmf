/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.provider;

import static org.junit.Assert.*;

import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.rmf.pror.reqif10.provider.TransientReqIFItemProvider;
import org.eclipse.rmf.pror.reqif10.util.ProrUtil;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.ReqIf;
import org.eclipse.rmf.reqif10.ReqIfContent;
import org.eclipse.rmf.reqif10.Reqif10Factory;
import org.eclipse.rmf.reqif10.Reqif10Package;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.util.Reqif10Util;
import org.junit.Test;

/**
 * A test case for the model object '
 * <em><b>Spec Element With User Defined Attributes</b></em>'.
 */
public abstract class SpecElementWithAttributesTest extends IdentifiableTest {

	/**
	 * The Properties of an empty SpecElement.
	 */
	protected final static String[] STANDARD_PROPERTIES = { "Desc",
			"Identifier", "Last Change", "Long Name", "Type" };

	/**
	 * We often need a RIF for tests that has the SpecElement properly added.
	 * This method is expected to return such a RIF.
	 * 
	 * @return a RIF with a reference to the fixture.
	 */
	protected abstract void addFixtureToReqIf(ReqIf reqif);

	/**
	 * Returns the fixture for this Spec Element With User Defined Attributes
	 * test case.
	 */
	@Override
	protected SpecElementWithAttributes getFixture() {
		return (SpecElementWithAttributes) fixture;
	}

	/**
	 * Ensure that the SpecElement is notified if an AttributeValue is added.
	 */
	@Test
	public void testSpecElementNotificationValueAdded() {
		ItemProviderAdapter itemProvider = getItemProvider(getFixture());
		itemProvider.addListener(listener);
		AttributeValue av = Reqif10Factory.eINSTANCE
				.createAttributeValueString();
		getFixture().getValues().add(av);
		assertEquals(1, notifications.size());
		assertSame(getFixture(), notifications.get(0).getNotifier());
		assertEquals(
				Reqif10Package.Literals.SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES,
				notifications.get(0).getFeature());
	}

	/**
	 * Ensure that the SpecElement is notified if the AttributeValue changes.
	 */
	@Test
	public void testSpecElementNotificationValueChanged() {
		ItemProviderAdapter itemProvider = getItemProvider(getFixture());
		itemProvider.addListener(listener);
		AttributeValue av = Reqif10Factory.eINSTANCE
				.createAttributeValueString();
		getFixture().getValues().add(av);
		notifications.clear();

		ProrUtil.setTheValue(getFixture().getValues().get(0), "newDescription",
				editingDomain);
		assertEquals(1, notifications.size());
		assertSame(getFixture(), notifications.get(0).getNotifier());
		assertEquals(
				Reqif10Package.Literals.SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES,
				notifications.get(0).getFeature());
		assertEquals(Notification.SET, notifications.get(0).getEventType());
	}

	/**
	 * Upon setting of a type, the SpecElement's values must reflect the type's
	 * values. Also, a notification regarding the appearance must be generated.
	 * <p>
	 * 
	 * @throws URISyntaxException
	 */
	@Test
	public void testSpecElementTypeValuesSynced() throws URISyntaxException {
		ReqIf reqif = getTestReqif("simple.reqif");
		addFixtureToReqIf(reqif);
		assertEquals(0, getFixture().getValues().size());

		getItemProvider(getFixture()).addListener(listener);

		AttributeDefinition ad = Reqif10Factory.eINSTANCE
				.createAttributeDefinitionString();
		setSpecTypeWithAttributeOnFixture(reqif, ad);
		SpecType type = ad.getSpecType();

		assertSame(type, Reqif10Util.getSpecType(getFixture()));
		assertEquals(1, getFixture().getValues().size());

		// 1.: ADD Reference to new Value(s)
		// 2.: SET Reference to Type
		assertEquals(2, notifications.size());
		assertEquals(getFixture(), notifications.get(0).getNotifier());
		assertEquals(getFixture(), notifications.get(1).getNotifier());
	}

	/**
	 * When an aspect of the AttributeDefinition changes, the SpecElement must
	 * be informed.
	 * 
	 * @throws URISyntaxException
	 */
	@Test
	public void testSpecElementAttributeDefinitionChanged()
			throws URISyntaxException {
		ReqIf reqif = Reqif10Factory.eINSTANCE.createReqIf();
		ReqIfContent content = Reqif10Factory.eINSTANCE.createReqIfContent();
		reqif.setCoreContent(content);
		addFixtureToReqIf(reqif);
		AttributeDefinition ad = Reqif10Factory.eINSTANCE
				.createAttributeDefinitionString();
		setSpecTypeWithAttributeOnFixture(reqif, ad);
		getItemProvider(getFixture()).addListener(listener);

		assertEquals(0, notifications.size());
		setViaCommand(ad, Reqif10Package.Literals.IDENTIFIABLE__LONG_NAME,
				"New Name");
		assertEquals("New Name", ad.getLongName());
		assertEquals(1, notifications.size());
		assertEquals(getFixture(), notifications.get(0).getNotifier());
	}

	@Test
	public void testSpecTypeChangeNotifications() {
		ReqIf reqif = Reqif10Factory.eINSTANCE.createReqIf();
		ReqIfContent content = Reqif10Factory.eINSTANCE.createReqIfContent();
		reqif.setCoreContent(content);
		this.addFixtureToReqIf(reqif);
		AttributeDefinition ad = Reqif10Factory.eINSTANCE
				.createAttributeDefinitionString();
		setSpecTypeWithAttributeOnFixture(reqif, ad);
		SpecType type = ad.getSpecType();
		// At this point, we have a specElement with a type.
		ItemProviderAdapter ip = this.getItemProvider(getFixture());
		ip.addListener(listener);
		AttributeDefinition ad2 = Reqif10Factory.eINSTANCE
				.createAttributeDefinitionString();
		this.setViaCommand(type,
				Reqif10Package.Literals.SPEC_TYPE__SPEC_ATTRIBUTES, ad2);
		// First Notification: Value changed
		// Second Notification: Type changed
		assertEquals(2, this.notifications.size());
	}

	/**
	 * When there are no attributes set, we will get only the standard ones and
	 * those inherited from {@link Identifiable}. We check the names of the
	 * labels.
	 * <p>
	 */
	@Test
	public void testDefaultPropertyLabels() {
		List<IItemPropertyDescriptor> props = ProrUtil.getItemProvider(
				adapterFactory, getFixture()).getPropertyDescriptors(
				getFixture());

		// Set of actuals
		Set<String> actual = new HashSet<String>();
		for (IItemPropertyDescriptor prop : props) {
			actual.add(prop.getDisplayName(getFixture()));
		}

		// Set of expected
		assertEquals(getStandardPropertyNames(), actual);
	}

	/**
	 * We test the properties for the fixture with a type that provides one
	 * attribute. EMF requires the label for the properties to be non-null, so
	 * we ensure that this is the case.
	 */
	@Test
	public void testPropertiesOfSpecElementWithAttributeNullLabel()
			throws URISyntaxException {
		ReqIf reqif = getTestReqif("simple.reqif");
		addFixtureToReqIf(reqif);

		AttributeDefinitionString ad = Reqif10Factory.eINSTANCE
				.createAttributeDefinitionString();
		setSpecTypeWithAttributeOnFixture(reqif, ad);

		ItemProviderAdapter itemProvider = ProrUtil.getItemProvider(
				adapterFactory, getFixture());
		List<IItemPropertyDescriptor> props = itemProvider
				.getPropertyDescriptors(getFixture());

		// Set of actuals
		Set<String> actual = new HashSet<String>();
		for (IItemPropertyDescriptor prop : props) {
			actual.add(prop.getDisplayName(getFixture()));
		}

		// Set of expected
		Set<String> expected = getStandardPropertyNames();
		expected.add("UNNAMED (" + ad.getIdentifier() + ")");
		assertEquals(expected, actual);
	}

	/**
	 * We test the properties for the fixture with a type that provides one
	 * attribute.
	 */
	@Test
	public void testPropertiesOfSpecElementWithAttribute()
			throws URISyntaxException {
		ReqIf reqif = getTestReqif("simple.reqif");
		addFixtureToReqIf(reqif);

		AttributeDefinitionString ad = Reqif10Factory.eINSTANCE
				.createAttributeDefinitionString();
		ad.setLongName("Description");
		setSpecTypeWithAttributeOnFixture(reqif, ad);

		ItemProviderAdapter itemProvider = ProrUtil.getItemProvider(
				adapterFactory, getFixture());
		List<IItemPropertyDescriptor> props = itemProvider
				.getPropertyDescriptors(getFixture());

		// Set of actuals
		Set<String> actual = new HashSet<String>();
		for (IItemPropertyDescriptor prop : props) {
			actual.add(prop.getDisplayName(getFixture()));
		}

		// Set of expected
		Set<String> expected = getStandardPropertyNames();
		expected.add("Description");
		assertEquals(expected, actual);
	}

	@Test
	public void testResetTypeDeletesValues() throws URISyntaxException {
		ReqIf reqif = getTestReqif("simple.reqif");
		addFixtureToReqIf(reqif);
		AttributeDefinitionString ad = Reqif10Factory.eINSTANCE
				.createAttributeDefinitionString();
		ad.setLongName("Description");
		setSpecTypeWithAttributeOnFixture(reqif, ad);
		assertEquals(1, getFixture().getValues().size());
		setFixtureType(getFixture(), null);
		assertNull(Reqif10Util.getSpecType(getFixture()));
		assertEquals(0, getFixture().getValues().size());
	}

	@Test
	public void testCreateCommands() throws URISyntaxException {
		ReqIf reqif = getTestReqif("bare.reqif");
		// Required for generating the Virtual Element lazily.
		getItemProvider(reqif.getCoreContent()).getChildren(reqif.getCoreContent());

		addFixtureToReqIf(reqif);
		// We do it this way to get the correct Virtual ItemProvider
		TransientReqIFItemProvider ip = (TransientReqIFItemProvider) getItemProvider(
				getFixture()).getParent(getFixture());
		Collection<?> childDescriptors = ip.getNewChildDescriptors(
				getFixture(), editingDomain, null);
		assertEquals(1, childDescriptors.size());
		
		// Now we add a type
		AttributeDefinition ad = Reqif10Factory.eINSTANCE.createAttributeDefinitionString();
		setSpecTypeWithAttributeOnFixture(reqif, ad);
		childDescriptors = ip.getNewChildDescriptors(
				getFixture(), editingDomain, null);
		assertEquals(2, childDescriptors.size());
	}

	/**
	 * @return an array of property names for the given SpecElement type.
	 */
	protected abstract Set<String> getStandardPropertyNames();

	/**
	 * Sets the given Type on the given specElement.
	 */
	protected abstract void setFixtureType(
			SpecElementWithAttributes specElement, SpecType specType);

	/**
	 * Subclasses must override this. They have to:
	 * <ul>
	 * <li>Create the correct {@link SpecType}
	 * <li>Add the provided ad to the specType
	 * <li>add the specType to the reqif (with a command!)
	 * <li>set the specType on the fixture.
	 * </ul>
	 * 
	 * @param reqif
	 */
	protected abstract void setSpecTypeWithAttributeOnFixture(ReqIf reqif,
			AttributeDefinition ad);

} // SpecElementWithAttributesTest
