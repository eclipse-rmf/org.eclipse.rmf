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

import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;

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
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;

@SuppressWarnings("nls")
public class TC1000ModelBuilder extends SimpleModelBuilder {

	// datatypes
	DatatypeDefinitionBoolean datatypeDefinitionBoolean;
	DatatypeDefinitionInteger datatypeDefinitionInteger;
	DatatypeDefinitionString datatypeDefinitionString;
	DatatypeDefinitionReal datatypeDefinitionReal;
	DatatypeDefinitionDate datatypeDefinitionDate;
	DatatypeDefinitionEnumeration datatypeDefinitionEnumeration;
	EnumValue enumValueRed;
	EnumValue enumValueYellow;
	EnumValue enumValueGreen;

	// SpecObjectTypes
	SpecObjectType specObjectType;
	AttributeDefinitionBoolean attributeDefinitionBooleanTc1000t;
	AttributeDefinitionBoolean attributeDefinitionBooleanTc1000f;
	AttributeDefinitionInteger attributeDefinitionInteger;
	AttributeDefinitionString attributeDefinitionString;
	AttributeDefinitionReal attributeDefinitionReal;
	AttributeDefinitionDate attributeDefinitionDate;
	AttributeDefinitionEnumeration attributeDefinitionEnumeration;

	// SpecificationTypes
	SpecificationType specificationType;

	// SpecObjects
	SpecObject specObject;

	/**
	 * 
	 */
	public TC1000ModelBuilder() {
		super(new Date(), "ID_TC1000_ReqIfHeader", "TC 1000 'Simple Content'");
	}

	public TC1000ModelBuilder(Date creationTime, String identifier, String title) {
		super(creationTime, identifier, title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createDatatypes() throws Exception {
		datatypeDefinitionBoolean = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionBoolean();
		datatypeDefinitionBoolean.setIdentifier("ID_TC1000_DatatypeDefinitionBoolean");
		datatypeDefinitionBoolean.setLongName("TC1000 DatatypeDefinitionBoolean");
		datatypeDefinitionBoolean.setLastChange(getLastChangeDate());

		datatypeDefinitionInteger = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionInteger();
		datatypeDefinitionInteger.setIdentifier("ID_TC1000_DatatypeDefinitionInteger");
		datatypeDefinitionInteger.setLongName("TC1000 DatatypeDefinitionInteger");
		datatypeDefinitionInteger.setLastChange(getLastChangeDate());
		datatypeDefinitionInteger.setMin(new BigInteger("-17496"));
		datatypeDefinitionInteger.setMax(new BigInteger("5000"));

		datatypeDefinitionString = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		datatypeDefinitionString.setIdentifier("ID_TC1000_DatatypeDefinitionString");
		datatypeDefinitionString.setLongName("TC1000 DatatypeDefinitionString");
		datatypeDefinitionString.setLastChange(getLastChangeDate());
		datatypeDefinitionString.setMaxLength(new BigInteger("256"));

		datatypeDefinitionReal = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionReal();
		datatypeDefinitionReal.setIdentifier("ID_TC1000_DatatypeDefinitionReal");
		datatypeDefinitionReal.setLongName("TC1000 DatatypeDefinitionReal");
		datatypeDefinitionReal.setLastChange(getLastChangeDate());
		datatypeDefinitionReal.setMin(-1234.5678);
		datatypeDefinitionReal.setMax(1234.5678);
		datatypeDefinitionReal.setAccuracy(new BigInteger("10"));

		datatypeDefinitionDate = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionDate();
		datatypeDefinitionDate.setIdentifier("ID_TC1000_DatatypeDefinitionDate");
		datatypeDefinitionDate.setLongName("TC1000 DatatypeDefinitionDate");
		datatypeDefinitionDate.setLastChange(getLastChangeDate());

		datatypeDefinitionEnumeration = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionEnumeration();
		datatypeDefinitionEnumeration.setIdentifier("ID_TC1000_DatatypeDefinitionEnumeration");
		datatypeDefinitionEnumeration.setLongName("TC1000 DatatypeDefinitionEnumeration");
		datatypeDefinitionEnumeration.setLastChange(getLastChangeDate());
		// red
		enumValueRed = ReqIF10Factory.eINSTANCE.createEnumValue();
		enumValueRed.setIdentifier("ID_TC1000_DatatypeDefinitionEnumeration_EnumValue_Red");
		enumValueRed.setLongName("TC1000 Red");
		enumValueRed.setLastChange(getLastChangeDate());
		EmbeddedValue embeddedValueRed = ReqIF10Factory.eINSTANCE.createEmbeddedValue();
		embeddedValueRed.setKey(new BigInteger("0"));
		embeddedValueRed.setOtherContent("");
		enumValueRed.setProperties(embeddedValueRed);
		// green
		enumValueGreen = ReqIF10Factory.eINSTANCE.createEnumValue();
		enumValueGreen.setIdentifier("ID_TC1000_DatatypeDefinitionEnumeration_EnumValue_Green");
		enumValueGreen.setLongName("TC1000 Green");
		enumValueGreen.setLastChange(getLastChangeDate());
		EmbeddedValue embeddedValueGreen = ReqIF10Factory.eINSTANCE.createEmbeddedValue();
		embeddedValueGreen.setKey(new BigInteger("1"));
		embeddedValueGreen.setOtherContent("");
		enumValueGreen.setProperties(embeddedValueGreen);
		// yellow
		enumValueYellow = ReqIF10Factory.eINSTANCE.createEnumValue();
		enumValueYellow.setIdentifier("ID_TC1000_DatatypeDefinitionEnumeration_EnumValue_Yellow");
		enumValueYellow.setLongName("TC1000 Yellow");
		enumValueYellow.setLastChange(getLastChangeDate());
		EmbeddedValue embeddedValueYellow = ReqIF10Factory.eINSTANCE.createEmbeddedValue();
		embeddedValueYellow.setKey(new BigInteger("2"));
		embeddedValueYellow.setOtherContent("");
		enumValueYellow.setProperties(embeddedValueYellow);

		datatypeDefinitionEnumeration.getSpecifiedValues().add(enumValueRed);
		datatypeDefinitionEnumeration.getSpecifiedValues().add(enumValueGreen);
		datatypeDefinitionEnumeration.getSpecifiedValues().add(enumValueYellow);

		EList<DatatypeDefinition> datatypes = getReqIF().getCoreContent().getDatatypes();
		datatypes.add(datatypeDefinitionBoolean);
		datatypes.add(datatypeDefinitionInteger);
		datatypes.add(datatypeDefinitionString);
		datatypes.add(datatypeDefinitionReal);
		datatypes.add(datatypeDefinitionDate);
		datatypes.add(datatypeDefinitionEnumeration);
	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setIdentifier("ID_TC1000_SpecObjectType");
		specObjectType.setLongName("TC1000 SpecObjectType");
		System.out.println("last Change Date: " + getLastChangeDate());
		specObjectType.setLastChange(getLastChangeDate());
		System.out.println("saved Last Change Date: " + specObjectType.getLastChange());

		attributeDefinitionBooleanTc1000t = ReqIF10Factory.eINSTANCE.createAttributeDefinitionBoolean();
		attributeDefinitionBooleanTc1000t.setIdentifier("ID_TC1000_AttributeDefinitionBoolean_TC1000T");
		attributeDefinitionBooleanTc1000t.setLongName("TC1000T");
		attributeDefinitionBooleanTc1000t.setLastChange(getLastChangeDate());
		attributeDefinitionBooleanTc1000t.setType(datatypeDefinitionBoolean);

		attributeDefinitionBooleanTc1000f = ReqIF10Factory.eINSTANCE.createAttributeDefinitionBoolean();
		attributeDefinitionBooleanTc1000f.setIdentifier("ID_TC1000_AttributeDefinitionBoolean_TC1000F");
		attributeDefinitionBooleanTc1000f.setLongName("TC1000F");
		attributeDefinitionBooleanTc1000f.setLastChange(getLastChangeDate());
		attributeDefinitionBooleanTc1000f.setType(datatypeDefinitionBoolean);

		attributeDefinitionInteger = ReqIF10Factory.eINSTANCE.createAttributeDefinitionInteger();
		attributeDefinitionInteger.setIdentifier("ID_TC1000_AttributeDefinitionInteger");
		attributeDefinitionInteger.setLongName("TC1000 Integer");
		attributeDefinitionInteger.setLastChange(getLastChangeDate());
		attributeDefinitionInteger.setType(datatypeDefinitionInteger);

		attributeDefinitionString = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		attributeDefinitionString.setIdentifier("ID_TC1000_AttributeDefinitionString");
		attributeDefinitionString.setLongName("TC1000 String");
		attributeDefinitionString.setLastChange(getLastChangeDate());
		attributeDefinitionString.setType(datatypeDefinitionString);

		attributeDefinitionReal = ReqIF10Factory.eINSTANCE.createAttributeDefinitionReal();
		attributeDefinitionReal.setIdentifier("ID_TC1000_AttributeDefinitionReal");
		attributeDefinitionReal.setLongName("TC1000 Real");
		attributeDefinitionReal.setLastChange(getLastChangeDate());
		attributeDefinitionReal.setType(datatypeDefinitionReal);

		attributeDefinitionDate = ReqIF10Factory.eINSTANCE.createAttributeDefinitionDate();
		attributeDefinitionDate.setIdentifier("ID_TC1000_AttributeDefinitionDate");
		attributeDefinitionDate.setLongName("TC1000 Date");
		attributeDefinitionDate.setLastChange(getLastChangeDate());
		attributeDefinitionDate.setType(datatypeDefinitionDate);

		attributeDefinitionEnumeration = ReqIF10Factory.eINSTANCE.createAttributeDefinitionEnumeration();
		attributeDefinitionEnumeration.setIdentifier("ID_TC1000_AttributeDefinitionEnumeration");
		attributeDefinitionEnumeration.setLongName("TC1000 Enum");
		attributeDefinitionEnumeration.setLastChange(getLastChangeDate());
		attributeDefinitionEnumeration.setType(datatypeDefinitionEnumeration);
		attributeDefinitionEnumeration.setMultiValued(false);

		specObjectType.getSpecAttributes().add(attributeDefinitionBooleanTc1000t);
		specObjectType.getSpecAttributes().add(attributeDefinitionBooleanTc1000f);
		specObjectType.getSpecAttributes().add(attributeDefinitionInteger);
		specObjectType.getSpecAttributes().add(attributeDefinitionString);
		specObjectType.getSpecAttributes().add(attributeDefinitionReal);
		specObjectType.getSpecAttributes().add(attributeDefinitionDate);
		specObjectType.getSpecAttributes().add(attributeDefinitionEnumeration);

		getReqIF().getCoreContent().getSpecTypes().add(specObjectType);

	}

	@Override
	public void createSpecificationTypes() throws Exception {
		specificationType = ReqIF10Factory.eINSTANCE.createSpecificationType();
		specificationType.setIdentifier("ID_TC1000_SpecificationType");
		specificationType.setLongName("TC1000 SpecificationType");
		specificationType.setLastChange(getLastChangeDate());
		getReqIF().getCoreContent().getSpecTypes().add(specificationType);
	}

	@Override
	public void createSpecRelationGroups() throws Exception {
		// TODO Auto-generated method stub
		super.createSpecRelationGroups();
	}

	@Override
	public void createSpecifications() throws Exception {
		Specification specification = ReqIF10Factory.eINSTANCE.createSpecification();
		specification.setIdentifier("ID_TC1000_Specification");
		specification.setType(specificationType);
		specification.setLastChange(getLastChangeDate());

		SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setIdentifier("ID_TC1000_SpecHierarchy");
		specHierarchy.setLongName("TC1000 SpecHierarchy");
		specHierarchy.setLastChange(getLastChangeDate());
		specHierarchy.setObject(specObject);
		specification.getChildren().add(specHierarchy);

		getReqIF().getCoreContent().getSpecifications().add(specification);

	}

	@Override
	public void createSpecObjects() throws Exception {
		specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier("ID_TC1000_SpecObject");
		specObject.setLastChange(getLastChangeDate());
		specObject.setType(specObjectType);
		// TODO: Backlinkage should be a derived reference
		// TODO: same for Document root
		// specObject.setCoreContent(value)
		AttributeValueBoolean attributeValueBooleanTc1000t = ReqIF10Factory.eINSTANCE.createAttributeValueBoolean();
		attributeValueBooleanTc1000t.setDefinition(attributeDefinitionBooleanTc1000t);
		attributeValueBooleanTc1000t.setTheValue(true);

		AttributeValueBoolean attributeValueBooleanTc1000f = ReqIF10Factory.eINSTANCE.createAttributeValueBoolean();
		attributeValueBooleanTc1000f.setDefinition(attributeDefinitionBooleanTc1000f);
		attributeValueBooleanTc1000f.setTheValue(false);

		AttributeValueInteger attributeValueInteger = ReqIF10Factory.eINSTANCE.createAttributeValueInteger();
		attributeValueInteger.setDefinition(attributeDefinitionInteger);
		attributeValueInteger.setTheValue(new BigInteger("5000"));

		AttributeValueString attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(attributeDefinitionString);
		attributeValueString.setTheValue("Plain");

		AttributeValueReal attributeValueReal = ReqIF10Factory.eINSTANCE.createAttributeValueReal();
		attributeValueReal.setDefinition(attributeDefinitionReal);
		attributeValueReal.setTheValue(1234.5);

		AttributeValueDate attributeValueDate = ReqIF10Factory.eINSTANCE.createAttributeValueDate();
		attributeValueDate.setDefinition(attributeDefinitionDate);
		// TODO: the following expression doesn't work: parse exception
		Date date;
		try {
			// date = DateFormat.getDateInstance().parse(
			// "2002-05-30T09:30:10+06:00");

			date = new Date();

			GregorianCalendar gregorianCalendar = new GregorianCalendar();
			gregorianCalendar.setTime(date);
			attributeValueDate.setTheValue(DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AttributeValueEnumeration attributeValueEnumeration = ReqIF10Factory.eINSTANCE.createAttributeValueEnumeration();
		attributeValueEnumeration.setDefinition(attributeDefinitionEnumeration);
		attributeValueEnumeration.getValues().add(enumValueYellow);

		specObject.getValues().add(attributeValueBooleanTc1000t);
		specObject.getValues().add(attributeValueBooleanTc1000f);
		specObject.getValues().add(attributeValueInteger);
		specObject.getValues().add(attributeValueString);
		specObject.getValues().add(attributeValueReal);
		specObject.getValues().add(attributeValueDate);
		specObject.getValues().add(attributeValueEnumeration);

		getReqIF().getCoreContent().getSpecObjects().add(specObject);

	}

	public SpecObject createTC1000SpecObject(String identifier, XMLGregorianCalendar lastChangeDate, boolean tc1000t, boolean tc1000f,
			BigInteger tc1000_integer, String tc1000_text, Double tc1000_real, XMLGregorianCalendar tc1000_lastChangeDate, EnumValue tc1000_enumvalue) {
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier(identifier);
		specObject.setLastChange(tc1000_lastChangeDate);
		specObject.setType(specObjectType);

		AttributeValueBoolean attributeValueBooleanTc1000t = ReqIF10Factory.eINSTANCE.createAttributeValueBoolean();
		attributeValueBooleanTc1000t.setDefinition(attributeDefinitionBooleanTc1000t);
		attributeValueBooleanTc1000t.setTheValue(tc1000t);

		AttributeValueBoolean attributeValueBooleanTc1000f = ReqIF10Factory.eINSTANCE.createAttributeValueBoolean();
		attributeValueBooleanTc1000f.setDefinition(attributeDefinitionBooleanTc1000f);
		attributeValueBooleanTc1000f.setTheValue(tc1000f);

		AttributeValueInteger attributeValueInteger = ReqIF10Factory.eINSTANCE.createAttributeValueInteger();
		attributeValueInteger.setDefinition(attributeDefinitionInteger);
		attributeValueInteger.setTheValue(tc1000_integer);

		AttributeValueString attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(attributeDefinitionString);
		attributeValueString.setTheValue(tc1000_text);

		AttributeValueReal attributeValueReal = ReqIF10Factory.eINSTANCE.createAttributeValueReal();
		attributeValueReal.setDefinition(attributeDefinitionReal);
		attributeValueReal.setTheValue(tc1000_real);

		AttributeValueDate attributeValueDate = ReqIF10Factory.eINSTANCE.createAttributeValueDate();
		attributeValueDate.setDefinition(attributeDefinitionDate);
		attributeValueDate.setTheValue(tc1000_lastChangeDate);

		AttributeValueEnumeration attributeValueEnumeration = ReqIF10Factory.eINSTANCE.createAttributeValueEnumeration();
		attributeValueEnumeration.setDefinition(attributeDefinitionEnumeration);
		attributeValueEnumeration.getValues().add(tc1000_enumvalue);

		specObject.getValues().add(attributeValueBooleanTc1000t);
		specObject.getValues().add(attributeValueBooleanTc1000f);
		specObject.getValues().add(attributeValueInteger);
		specObject.getValues().add(attributeValueString);
		specObject.getValues().add(attributeValueReal);
		specObject.getValues().add(attributeValueDate);
		specObject.getValues().add(attributeValueEnumeration);

		return specObject;

	}

	@Override
	public void createSpecRelations() throws Exception {
		// TODO Auto-generated method stub
		super.createSpecRelations();
	}

}
