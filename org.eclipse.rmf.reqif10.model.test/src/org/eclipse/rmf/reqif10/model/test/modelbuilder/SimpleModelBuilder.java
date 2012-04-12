package org.eclipse.rmf.reqif10.model.test.modelbuilder;

import java.math.BigInteger;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIf;
import org.eclipse.rmf.reqif10.ReqIfContent;
import org.eclipse.rmf.reqif10.ReqIfHeader;
import org.eclipse.rmf.reqif10.Reqif10Factory;

public class SimpleModelBuilder {
	
	private final String comment;
	private final XMLGregorianCalendar creationTime;
	private final String identifier;
	private final String repositoryId;
	private final String reqIfToolId;
	private final String reqIfVersion;
	private final String sourceToolId;
	private final String title;
	
	
	private ReqIf reqIf = null;
	
	public SimpleModelBuilder(XMLGregorianCalendar creationTime, String identifier, String title) {
		this(creationTime, identifier, "RMF - Requirements Modeling Framework (http://www.eclipse.org/rmf)", "RMF - Requirements Modeling Framework (http://www.eclipse.org/rmf)", title);
	}	
		
	/**
	 * Constructor that requires mandatory attributes only
	 * @param creationTime
	 * @param identifier
	 * @param reqIfToolId
	 * @param sourceToolId
	 * @param title
	 */
	public SimpleModelBuilder(XMLGregorianCalendar creationTime, String identifier, String reqIfToolId, String sourceToolId, String title) {
		this(null, creationTime, identifier, null, reqIfToolId, sourceToolId, title);
	}	
	
	/**
	 * Constructor for fixed reqif version number
	 * @param comment
	 * @param creationTime
	 * @param identifier
	 * @param repositoryId
	 * @param reqIfToolId
	 * @param sourceToolId
	 * @param title
	 */
	public SimpleModelBuilder(String comment, XMLGregorianCalendar creationTime, String identifier, String repositoryId, String reqIfToolId, String sourceToolId, String title) {
		this(comment, creationTime, identifier, repositoryId, reqIfToolId, "1.0", sourceToolId, title);
	}
	
	public SimpleModelBuilder(String comment, XMLGregorianCalendar creationTime, String identifier, String repositoryId, String reqIfToolId, String reqIfVersion, String sourceToolId, String title) {
		this.comment = comment;
		this.creationTime = creationTime;
		this.identifier = identifier;
		this.repositoryId = repositoryId;
		this.reqIfToolId = reqIfToolId;
		this.reqIfVersion = reqIfVersion;
		this.sourceToolId = sourceToolId;
		this.title = title;
		
		
		
		
	}
	
	public ReqIf getReqIf() {
		if (null == reqIf) {
        reqIf = Reqif10Factory.eINSTANCE.createReqIf();
		
		ReqIfContent reqIfContent = Reqif10Factory.eINSTANCE.createReqIfContent();
		reqIf.setCoreContent(reqIfContent);
		
		ReqIfHeader reqIfHeader = Reqif10Factory.eINSTANCE.createReqIfHeader();
		reqIf.setTheHeader(reqIfHeader);
		
		//if (null!= comment) 
			reqIfHeader.setComment(comment);
		if (null!= creationTime) reqIfHeader.setCreationTime(creationTime);
		if (null!= identifier) reqIfHeader.setIdentifier(identifier);
		if (null!= repositoryId) reqIfHeader.setRepositoryId(repositoryId);
		if (null!= reqIfToolId) reqIfHeader.setReqIfToolId(reqIfToolId);
		if (null!= reqIfVersion) reqIfHeader.setReqIfVersion(reqIfVersion);
		if (null!= sourceToolId) reqIfHeader.setSourceToolId(sourceToolId);
		if (null!= title) reqIfHeader.setTitle(title);	
		
		// create datatypes
		createDatatypes();
		
		// create types
		createSpecObjectTypes();
		createSpecificationTypes();
		createSpecRelationGroups();
		
		// create objects
		createSpecObjects();
		createSpecifications();
		createSpecRelations();
		} 
		return reqIf;
	}
	
	public void createDatatypes() {}
	
	public void createSpecObjectTypes() {}
	
	public void createSpecificationTypes() {}
	
	public void createSpecRelationGroups() {}
	
	public void createSpecifications() {}
	
	public void createSpecObjects() {}
	
	public void createSpecRelations() {}
	
	
	
	public DatatypeDefinitionString createDatatypeDefinitionString(String identifier, String longName, XMLGregorianCalendar lastChangeDate, BigInteger maxLength) {
		DatatypeDefinitionString datatypeDefinitionString = Reqif10Factory.eINSTANCE
				.createDatatypeDefinitionString();
		datatypeDefinitionString
				.setIdentifier(identifier);
		datatypeDefinitionString.setLongName(longName);
		datatypeDefinitionString.setLastChange(lastChangeDate);
		datatypeDefinitionString.setMaxLength(maxLength);
		return datatypeDefinitionString;	
	}
	
	public DatatypeDefinitionReal createDatatypeDefinitionReal(String identifier, String longName, XMLGregorianCalendar lastChangeDate, Double min, Double max, BigInteger accuracy ) {
		DatatypeDefinitionReal datatypeDefinitionReal = Reqif10Factory.eINSTANCE
				.createDatatypeDefinitionReal();
		datatypeDefinitionReal
				.setIdentifier(identifier);
		datatypeDefinitionReal.setLongName(longName);
		datatypeDefinitionReal.setLastChange(lastChangeDate);
		datatypeDefinitionReal.setMin(min);
		datatypeDefinitionReal.setMax(max);
		datatypeDefinitionReal.setAccuracy(accuracy);
		return datatypeDefinitionReal;
	}
	
	public DatatypeDefinitionBoolean createDatatypeDefinitionBoolean(String identifier, String longName, XMLGregorianCalendar lastChangeDate) {
		DatatypeDefinitionBoolean datatypeDefinitionBoolean = Reqif10Factory.eINSTANCE
				.createDatatypeDefinitionBoolean();
		datatypeDefinitionBoolean
				.setIdentifier(identifier);
		datatypeDefinitionBoolean
				.setLongName(longName);
		datatypeDefinitionBoolean.setLastChange(lastChangeDate);
		return datatypeDefinitionBoolean;
	}	
	
	public DatatypeDefinitionInteger createDatatypeDefinitionInteger(String identifier, String longName, XMLGregorianCalendar lastChangeDate, BigInteger min, BigInteger max) {
		DatatypeDefinitionInteger datatypeDefinitionInteger = Reqif10Factory.eINSTANCE
				.createDatatypeDefinitionInteger();
		datatypeDefinitionInteger
				.setIdentifier(identifier);
		datatypeDefinitionInteger
				.setLongName(longName);
		datatypeDefinitionInteger.setLastChange(lastChangeDate);
		datatypeDefinitionInteger.setMin(min);
		datatypeDefinitionInteger.setMax(max);
		return datatypeDefinitionInteger;
	}
	
	public AttributeDefinitionBoolean createAttributeDefinitionBoolean(String identifier, String longName, XMLGregorianCalendar lastChangeDate, DatatypeDefinitionBoolean datatypeDefinitionBoolean) {
		AttributeDefinitionBoolean attributeDefinitionBoolean = Reqif10Factory.eINSTANCE
				.createAttributeDefinitionBoolean();
		attributeDefinitionBoolean
				.setIdentifier(identifier);
		attributeDefinitionBoolean.setLongName(longName);
		attributeDefinitionBoolean.setLastChange(lastChangeDate);
		attributeDefinitionBoolean.setType(datatypeDefinitionBoolean);
		return attributeDefinitionBoolean;
	}
	
}
