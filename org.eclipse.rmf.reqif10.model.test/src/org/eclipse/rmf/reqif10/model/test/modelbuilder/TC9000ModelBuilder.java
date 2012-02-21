package org.eclipse.rmf.reqif10.model.test.modelbuilder;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.EmbeddedValue;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.Reqif10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;

public class TC9000ModelBuilder extends TC1000ModelBuilder {

	final int numberOfSpecObjects;
		
	public TC9000ModelBuilder(XMLGregorianCalendar lastChangeDate, String identifier, String longName, int numberOfSpecObjects) {
		super (lastChangeDate, identifier, longName);
		this.numberOfSpecObjects = numberOfSpecObjects;
	}
	

	@Override
	public void createSpecObjects() {
		for (int i=0 ; i<numberOfSpecObjects ; i++) {
		SpecObject specObject = createTC1000SpecObject("ID_TC1000_SpecObject"+i, lastChangeDate, true, false,new BigInteger("5000"), "Plain", 1234.5, lastChangeDate, enumValueYellow );
				
		getReqIf().getCoreContent().getSpecObjects().add(specObject);
		}
	}

	@Override
	public void createSpecRelations() {
		// TODO Auto-generated method stub
		super.createSpecRelations();
	}

}
