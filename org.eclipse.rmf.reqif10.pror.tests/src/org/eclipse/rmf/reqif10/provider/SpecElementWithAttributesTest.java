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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.provider.TransientReqIFItemProvider;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
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
	protected abstract void addFixtureToReqIf(ReqIF reqif);

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
		AttributeValue av = ReqIF10Factory.eINSTANCE
				.createAttributeValueString();
		getFixture().getValues().add(av);
		assertEquals(1, notifications.size());
		assertSame(getFixture(), notifications.get(0).getNotifier());
		assertEquals(
				ReqIF10Package.Literals.SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES,
				notifications.get(0).getFeature());
	}

	/**
	 * Ensure that the SpecElement is notified if the AttributeValue changes.
	 */
	@Test
	public void testSpecElementNotificationValueChanged() {
		ItemProviderAdapter itemProvider = getItemProvider(getFixture());
		itemProvider.addListener(listener);
		AttributeValue av = ReqIF10Factory.eINSTANCE
				.createAttributeValueString();
		getFixture().getValues().add(av);
		notifications.clear();

		ProrUtil.setTheValue(getFixture().getValues().get(0), "newDescription",
				editingDomain);
		assertEquals(2, notifications.size());
		assertSame(getFixture(), notifications.get(0).getNotifier());
		assertEquals(
				ReqIF10Package.Literals.SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES,
				notifications.get(0).getFeature());
		assertEquals(Notification.SET, notifications.get(0).getEventType());
	}

	/**
	 * Upon setting of a type, the SpecElement's values will not reflect the
	 * type's values. Also, a notification regarding the appearance must be
	 * generated.
	 * <p>
	 * 
	 * @throws URISyntaxException
	 */
	@Test
	public void testSpecElementTypeValuesSynced() throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		addFixtureToReqIf(reqif);
		assertEquals(0, getFixture().getValues().size());

		getItemProvider(getFixture()).addListener(listener);

		AttributeDefinition ad = ReqIF10Factory.eINSTANCE
				.createAttributeDefinitionString();
		setSpecTypeWithAttributeOnFixture(reqif, ad);
		SpecType type = ReqIF10Util.getSpecType(ad);

		assertSame(type, ReqIF10Util.getSpecType(getFixture()));
		assertEquals(0, getFixture().getValues().size());

		// 1.: SET Reference to Type
		assertEquals(1, notifications.size());
		assertEquals(getFixture(), notifications.get(0).getNotifier());
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
		ReqIF reqif = ReqIF10Factory.eINSTANCE.createReqIF();
		ReqIFContent content = ReqIF10Factory.eINSTANCE.createReqIFContent();
		reqif.setCoreContent(content);
		addFixtureToReqIf(reqif);
		AttributeDefinition ad = ReqIF10Factory.eINSTANCE
				.createAttributeDefinitionString();
		setSpecTypeWithAttributeOnFixture(reqif, ad);
		getItemProvider(getFixture()).addListener(listener);

		assertEquals(0, notifications.size());
		setViaCommand(ad, ReqIF10Package.Literals.IDENTIFIABLE__LONG_NAME,
				"New Name");
		assertEquals("New Name", ad.getLongName());
		assertEquals(1, notifications.size());
		assertEquals(getFixture(), notifications.get(0).getNotifier());
	}

	@Test
	public void testSpecTypeChangeNotifications() {
		ReqIF reqif = ReqIF10Factory.eINSTANCE.createReqIF();
		ReqIFContent content = ReqIF10Factory.eINSTANCE.createReqIFContent();
		reqif.setCoreContent(content);
		this.addFixtureToReqIf(reqif);
		AttributeDefinition ad = ReqIF10Factory.eINSTANCE
				.createAttributeDefinitionString();
		setSpecTypeWithAttributeOnFixture(reqif, ad);
		SpecType type = ReqIF10Util.getSpecType(ad);
		// At this point, we have a specElement with a type.
		ItemProviderAdapter ip = this.getItemProvider(getFixture());
		ip.addListener(listener);
		AttributeDefinition ad2 = ReqIF10Factory.eINSTANCE
				.createAttributeDefinitionString();
		this.setViaCommand(type,
				ReqIF10Package.Literals.SPEC_TYPE__SPEC_ATTRIBUTES, ad2);
		// First Notification: Type changed
		assertEquals(1, this.notifications.size());
	}

	@Test
	public void testSpecElementTypeChangedWithoutAttributes() {
		ReqIF reqif = ReqIF10Factory.eINSTANCE.createReqIF();
		ReqIFContent content = ReqIF10Factory.eINSTANCE.createReqIFContent();
		reqif.setCoreContent(content);
		this.addFixtureToReqIf(reqif);

		ItemProviderAdapter ip = this.getItemProvider(getFixture());
		ip.addListener(listener);

		SpecType specTypeExpected = setSpecTypeWithoutAttributeOnFixture(reqif);
		SpecType specTypeActual = ReqIF10Util.getSpecType(getFixture());
		assertSame(specTypeExpected, specTypeActual);
		assertEquals(1, notifications.size());
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
		ReqIF reqif = getTestReqif("simple.reqif");
		addFixtureToReqIf(reqif);

		AttributeDefinitionString ad = ReqIF10Factory.eINSTANCE
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
		ReqIF reqif = getTestReqif("simple.reqif");
		addFixtureToReqIf(reqif);

		AttributeDefinitionString ad = ReqIF10Factory.eINSTANCE
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
		ReqIF reqif = getTestReqif("simple.reqif");
		addFixtureToReqIf(reqif);
		AttributeDefinitionString ad = ReqIF10Factory.eINSTANCE
				.createAttributeDefinitionString();
		ad.setLongName("Description");
		setSpecTypeWithAttributeOnFixture(reqif, ad);
		AttributeValue av = ReqIF10Util.createAttributeValue(ad);
		getFixture().getValues().add(av);
		assertEquals(1, getFixture().getValues().size());
		setFixtureType(getFixture(), null);
		assertNull(ReqIF10Util.getSpecType(getFixture()));
		assertEquals(0, getFixture().getValues().size());
	}

	@Test
	public void testCreateCommands() throws URISyntaxException {
		ReqIF reqif = getTestReqif("bare.reqif");
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
		AttributeDefinition ad = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		setSpecTypeWithAttributeOnFixture(reqif, ad);
		childDescriptors = ip.getNewChildDescriptors(
				getFixture(), editingDomain, null);
		assertEquals(2, childDescriptors.size());
	}

	/**
	 * @return an array of property names for the given SpecElement type.
	 */
	protected abstract Set<String> getStandardPropertyNames();

	protected void setSpecTypeWithAttributeOnFixture(ReqIF reqif,
			AttributeDefinition ad) {
		SpecType type = getSpecTypeInstance();
		setViaCommand(type, ReqIF10Package.Literals.SPEC_TYPE__SPEC_ATTRIBUTES, ad);
		setViaCommand(reqif.getCoreContent(), ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES, type);
		setFixtureType(getFixture(), type);
	}

	protected SpecType setSpecTypeWithoutAttributeOnFixture(ReqIF reqif) {
		SpecType type = getSpecTypeInstance();
		setViaCommand(reqif.getCoreContent(),
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES, type);
		setFixtureType(getFixture(), type);
		return type;
	}

	/**
	 * SpecType and AttributeValues can be out of sync (which is bad). If they
	 * are, what matters? Answer: The type. This is what we test here.
	 * 
	 * @throws URISyntaxException
	 */
	@Test
	public void testThatSpecTypeMattersForPropertyValues()
			throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		setSpecTypeWithoutAttributeOnFixture(reqif);
		ItemProviderAdapter provider = getItemProvider(getFixture());

		int oldCount = provider.getPropertyDescriptors(getFixture()).size();

		// Add a Value that should not be reported via Properties
		AttributeValueString value = ReqIF10Factory.eINSTANCE
				.createAttributeValueString();
		value.setDefinition((AttributeDefinitionString) reqif.getCoreContent()
				.getSpecTypes().get(0).getSpecAttributes().get(0));
		 getFixture().getValues().add(value);
		List<IItemPropertyDescriptor> descriptors = provider
				.getPropertyDescriptors(getFixture());
		// There are 5 standard
		assertEquals(oldCount, descriptors.size());
	}

	/**
	 * Sets the given Type on the given specElement.
	 */
	protected abstract void setFixtureType(
			SpecElementWithAttributes specElement, SpecType specType);

	/**
	 * 
	 * Subclasses must override this. They have to return their corresponding
	 * {@link SpecType}.
	 * 
	 * @return the {@link SpecType} of the inherited class.
	 */
	protected abstract SpecType getSpecTypeInstance();

	@Override
	protected EObject getParent() {
		return ReqIF10Factory.eINSTANCE.createReqIFContent();
	}
	
} // SpecElementWithAttributesTest
