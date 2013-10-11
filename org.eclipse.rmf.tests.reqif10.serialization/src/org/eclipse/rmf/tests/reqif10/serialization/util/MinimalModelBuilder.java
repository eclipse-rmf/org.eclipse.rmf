/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.tests.reqif10.serialization.util;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;

public class MinimalModelBuilder {
	private ReqIF reqIF;

	public MinimalModelBuilder() throws Exception {
		super();
	}

	public final void createReqIF() throws Exception {
		reqIF = ReqIF10Factory.eINSTANCE.createReqIF();

		// create header
		createReqIFHeader();

		// create core contents
		createReqIFContent();

		// create tool extensions
		createToolExtensions();

		// final optins
		postProcessing();
	}

	public void createReqIFHeader() throws Exception {
	}

	public void createReqIFContent() throws Exception {
	}

	public void createToolExtensions() throws Exception {
	}

	public void postProcessing() throws Exception {
	}

	public GregorianCalendar getCurrentDate() throws DatatypeConfigurationException {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(new Date());
		return calendar;
	}

	public GregorianCalendar toDate(String date) throws DatatypeConfigurationException {
		GregorianCalendar gregorianCalendar = (GregorianCalendar) EcoreUtil.createFromString(ReqIF10Package.eINSTANCE.getDateTime(), date);
		return gregorianCalendar;
	}

	public ReqIF getReqIF() throws Exception {
		if (null == reqIF) {
			createReqIF();
		}
		return reqIF;
	}

}
