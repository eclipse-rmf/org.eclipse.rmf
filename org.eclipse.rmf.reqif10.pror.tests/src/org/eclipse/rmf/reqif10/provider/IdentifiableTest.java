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

import java.net.URISyntaxException;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Identifiable</b></em>'.
 */
public abstract class IdentifiableTest extends AbstractItemProviderTest {

	/**
	 * The fixture for this Identifiable test case.
	 */
	protected Identifiable fixture = null;

	/**
	 * Sets the fixture for this Identifiable test case.
	 */
	protected void setFixture(Identifiable fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Identifiable test case.
	 */
	protected Identifiable getFixture() {
		return fixture;
	}
	
	/**
	 * Make sure Notifications are generated for all fields.
	 */
	@Test 
	public void testBasicNotifications() throws DatatypeConfigurationException {
		ItemProviderAdapter ip = ProrUtil.getItemProvider(adapterFactory, getFixture());
		ip.addListener(listener);
		getFixture().setDesc("new Description");
		Assert.assertEquals(1, notifications.size());
		getFixture().setIdentifier("new id");
		Assert.assertEquals(2, notifications.size());
		getFixture().setLastChange(DatatypeFactory.newInstance().newXMLGregorianCalendar());
		Assert.assertEquals(3, notifications.size());
		getFixture().setLongName("new Long Name");
		Assert.assertEquals(4, notifications.size());
	}
	
	/**
	 * Make sure that the lastChanged attribute is set after creating the
	 * object.
	 * 
	 * @throws URISyntaxException
	 */
	@Test
	public void testSetLastChangeAfterCreation() throws URISyntaxException {
		EObject parent = getParent();
		EStructuralFeature parentFeature = getParentFeature();
		Identifiable id = getFixture();
		setViaCommand(parent, parentFeature, id);
		Assert.assertNotNull(id.getLastChange());
	}
	
	protected abstract EStructuralFeature getParentFeature();
	
	protected abstract EObject getParent();
	
} //IdentifiableTest
