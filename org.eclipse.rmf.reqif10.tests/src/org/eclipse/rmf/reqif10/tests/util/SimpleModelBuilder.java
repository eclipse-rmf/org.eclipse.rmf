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
package org.eclipse.rmf.reqif10.tests.util;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFHeader;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.xhtml.XhtmlFactory;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPType;

@SuppressWarnings("nls")
public class SimpleModelBuilder extends ReqIFContentModelBuilder {
	private final String comment;
	private final XMLGregorianCalendar creationTime;
	private final String identifier;
	private final String repositoryId;
	private final String reqIfToolId;
	private final String reqIfVersion;
	private final String sourceToolId;
	private final String title;

	public SimpleModelBuilder(String identifier, String title) throws Exception {
		this(null, identifier, title);
	}

	public SimpleModelBuilder(String creationTimeString, String identifier, String title) throws Exception {
		this(creationTimeString, identifier, "RMF - Requirements Modeling Framework (http://www.eclipse.org/rmf)",
				"RMF - Requirements Modeling Framework (http://www.eclipse.org/rmf)", title);
	}

	/**
	 * Constructor that requires mandatory attributes only
	 * 
	 * @param creationTime
	 * @param identifier
	 * @param reqIfToolId
	 * @param sourceToolId
	 * @param title
	 * @throws Exception 
	 */
	public SimpleModelBuilder(String creationTimeString, String identifier, String reqIfToolId, String sourceToolId, String title) throws Exception {
		this(null, creationTimeString, identifier, null, reqIfToolId, sourceToolId, title);
	}

	/**
	 * Constructor for fixed reqif version number
	 * 
	 * @param comment
	 * @param creationTime
	 * @param identifier
	 * @param repositoryId
	 * @param reqIfToolId
	 * @param sourceToolId
	 * @param title
	 * @throws Exception 
	 */
	public SimpleModelBuilder(String comment, String creationTimeString, String identifier, String repositoryId, String reqIfToolId,
			String sourceToolId, String title) throws Exception {
		this(comment, creationTimeString, identifier, repositoryId, reqIfToolId, "1.0", sourceToolId, title);
	}

	public SimpleModelBuilder(String comment, String creationTimeString, String identifier, String repositoryId, String reqIfToolId,
			String reqIfVersion, String sourceToolId, String title) throws Exception {
		super();
		this.comment = comment;
		creationTime = toDate(creationTimeString);
		this.identifier = identifier;
		this.repositoryId = repositoryId;
		this.reqIfToolId = reqIfToolId;
		this.reqIfVersion = reqIfVersion;
		this.sourceToolId = sourceToolId;
		this.title = title;
	}

	@Override
	public void createReqIFHeader() throws Exception {
		ReqIFHeader reqIfHeader = ReqIF10Factory.eINSTANCE.createReqIFHeader();
		getReqIF().setTheHeader(reqIfHeader);

		if (null != comment) {
			reqIfHeader.setComment(comment);
		}
		if (null != creationTime) {
			reqIfHeader.setCreationTime(creationTime);
		} else {
			reqIfHeader.setCreationTime(getCurrentDate());
		}
		if (null != identifier) {
			reqIfHeader.setIdentifier(identifier);
		}
		if (null != repositoryId) {
			reqIfHeader.setRepositoryId(repositoryId);
		}
		if (null != reqIfToolId) {
			reqIfHeader.setReqIFToolId(reqIfToolId);
		}
		if (null != reqIfVersion) {
			reqIfHeader.setReqIFVersion(reqIfVersion);
		}
		if (null != sourceToolId) {
			reqIfHeader.setSourceToolId(sourceToolId);
		}
		if (null != title) {
			reqIfHeader.setTitle(title);
		}
	}

	@Override
	public void createDatatypes() throws Exception {
	}

	@Override
	public void createSpecObjectTypes() throws Exception {
	}

	@Override
	public void createSpecificationTypes() throws Exception {
	}

	@Override
	public void createRelationGroups() throws Exception {
	}

	@Override
	public void createRelationGroupTypes() throws Exception {
	}

	@Override
	public void createSpecifications() throws Exception {
	}

	@Override
	public void createSpecObjects() throws Exception {
	}

	@Override
	public void createSpecRelations() throws Exception {
	}

	@Override
	public void createSpecRelationTypes() throws Exception {
	}

	@Override
	public void createToolExtensions() throws Exception {
	}

	@Override
	public XMLGregorianCalendar getCurrentDate() throws DatatypeConfigurationException {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(new Date());
		XMLGregorianCalendar xmlGregoriaCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
		return xmlGregoriaCalendar;
	}

	@Override
	public XMLGregorianCalendar toDate(String date) throws DatatypeConfigurationException {
		XMLGregorianCalendar xmlGregoriaCalendar = (XMLGregorianCalendar) EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getDateTime(), date);
		return xmlGregoriaCalendar;
	}

	public static XhtmlContent createXhtmlValue(String value) {
		XhtmlContent xhtmlContent = ReqIF10Factory.eINSTANCE.createXhtmlContent();
		XhtmlPType p = XhtmlFactory.eINSTANCE.createXhtmlPType();
		p.getXhtmlInlineMix().add(FeatureMapUtil.createTextEntry(value));
		xhtmlContent.setP(p);
		return xhtmlContent;
	}

}
