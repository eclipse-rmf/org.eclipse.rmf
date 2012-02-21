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

public class TC1000ModelBuilder extends SimpleModelBuilder {

     // set to fixed Date
	XMLGregorianCalendar lastChangeDate;

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
		super(getLastChangeDate(), "ID_TC1000_ReqIfHeader", "TC 1000 'Simple Content'");
		this.lastChangeDate = getLastChangeDate();
	}
	
	public TC1000ModelBuilder(XMLGregorianCalendar lastChangeDate, String identifier, String longName) {
		super (lastChangeDate, identifier, longName);
	}

	/**
	 * 
	 */
	public static XMLGregorianCalendar getLastChangeDate() {
		try {
			XMLGregorianCalendar lastChangeDate = DatatypeFactory.newInstance().newXMLGregorianCalendar();
			lastChangeDate.setYear(2011);
			lastChangeDate.setMonth(12);
			lastChangeDate.setDay(1);
			lastChangeDate.setTime(23,59,59);
			return lastChangeDate;
		} catch (Exception e) {
			return null;
		}
	}
	

	
	
	@Override
	public void createDatatypes() {
		datatypeDefinitionBoolean = createDatatypeDefinitionBoolean("ID_TC1000_DatatypeDefinitionBoolean", "TC1000 DatatypeDefinitionBoolean", lastChangeDate);		
		datatypeDefinitionInteger = createDatatypeDefinitionInteger("ID_TC1000_DatatypeDefinitionInteger", "TC1000 DatatypeDefinitionInteger", lastChangeDate, new BigInteger("-17496"), new BigInteger("5000"));
		datatypeDefinitionString = createDatatypeDefinitionString("ID_TC1000_DatatypeDefinitionString", "TC1000 DatatypeDefinitionString", lastChangeDate, new BigInteger("256"));
		datatypeDefinitionReal = createDatatypeDefinitionReal("ID_TC1000_DatatypeDefinitionReal", "TC1000 DatatypeDefinitionReal", lastChangeDate, -1234.5678, 1234.5678, new BigInteger("10") );


		datatypeDefinitionDate = Reqif10Factory.eINSTANCE
				.createDatatypeDefinitionDate();
		datatypeDefinitionDate
				.setIdentifier("ID_TC1000_DatatypeDefinitionDate");
		datatypeDefinitionDate.setLongName("TC1000 DatatypeDefinitionDate");
		datatypeDefinitionDate.setLastChange(lastChangeDate);

		datatypeDefinitionEnumeration = Reqif10Factory.eINSTANCE
				.createDatatypeDefinitionEnumeration();
		datatypeDefinitionEnumeration
				.setIdentifier("ID_TC1000_DatatypeDefinitionEnumeration");
		datatypeDefinitionEnumeration
				.setLongName("TC1000 DatatypeDefinitionEnumeration");
		datatypeDefinitionEnumeration.setLastChange(lastChangeDate);
		// red
		enumValueRed = Reqif10Factory.eINSTANCE.createEnumValue();
		enumValueRed
				.setIdentifier("ID_TC1000_DatatypeDefinitionEnumeration_EnumValue_Red");
		enumValueRed.setLongName("TC1000 Red");
		enumValueRed.setLastChange(lastChangeDate);
		EmbeddedValue embeddedValueRed = Reqif10Factory.eINSTANCE
				.createEmbeddedValue();
		embeddedValueRed.setKey(new BigInteger("0"));
		embeddedValueRed.setOtherContent("");
		enumValueRed.setProperties(embeddedValueRed);
		// green
		enumValueGreen = Reqif10Factory.eINSTANCE.createEnumValue();
		enumValueGreen
				.setIdentifier("ID_TC1000_DatatypeDefinitionEnumeration_EnumValue_Green");
		enumValueGreen.setLongName("TC1000 Green");
		enumValueGreen.setLastChange(lastChangeDate);
		EmbeddedValue embeddedValueGreen = Reqif10Factory.eINSTANCE
				.createEmbeddedValue();
		embeddedValueGreen.setKey(new BigInteger("1"));
		embeddedValueGreen.setOtherContent("");
		enumValueGreen.setProperties(embeddedValueGreen);
		// yellow
		enumValueYellow = Reqif10Factory.eINSTANCE.createEnumValue();
		enumValueYellow
				.setIdentifier("ID_TC1000_DatatypeDefinitionEnumeration_EnumValue_Yellow");
		enumValueYellow.setLongName("TC1000 Yellow");
		enumValueYellow.setLastChange(lastChangeDate);
		EmbeddedValue embeddedValueYellow = Reqif10Factory.eINSTANCE
				.createEmbeddedValue();
		embeddedValueYellow.setKey(new BigInteger("2"));
		embeddedValueYellow.setOtherContent("");
		enumValueYellow.setProperties(embeddedValueYellow);

		datatypeDefinitionEnumeration.getSpecifiedValues().add(enumValueRed);
		datatypeDefinitionEnumeration.getSpecifiedValues().add(enumValueGreen);
		datatypeDefinitionEnumeration.getSpecifiedValues().add(enumValueYellow);

		EList<DatatypeDefinition> datatypes = getReqIf().getCoreContent()
				.getDatatypes();
		datatypes.add(datatypeDefinitionBoolean);
		datatypes.add(datatypeDefinitionInteger);
		datatypes.add(datatypeDefinitionString);
		datatypes.add(datatypeDefinitionReal);
		datatypes.add(datatypeDefinitionDate);
		datatypes.add(datatypeDefinitionEnumeration);
	}
	
	


	@Override
	public void createSpecObjectTypes() {
		specObjectType = Reqif10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setIdentifier("ID_TC1000_SpecObjectType");
		specObjectType.setLongName("TC1000 SpecObjectType");
		specObjectType.setLastChange(lastChangeDate);

		attributeDefinitionBooleanTc1000t = createAttributeDefinitionBoolean("ID_TC1000_AttributeDefinitionBoolean_TC1000T", "TC1000T", lastChangeDate, datatypeDefinitionBoolean);
		attributeDefinitionBooleanTc1000f = createAttributeDefinitionBoolean("ID_TC1000_AttributeDefinitionBoolean_TC1000F", "TC1000F", lastChangeDate, datatypeDefinitionBoolean);


		attributeDefinitionInteger = Reqif10Factory.eINSTANCE
				.createAttributeDefinitionInteger();
		attributeDefinitionInteger
				.setIdentifier("ID_TC1000_AttributeDefinitionInteger");
		attributeDefinitionInteger.setLongName("TC1000 Integer");
		attributeDefinitionInteger.setLastChange(lastChangeDate);
		attributeDefinitionInteger.setType(datatypeDefinitionInteger);

		attributeDefinitionString = Reqif10Factory.eINSTANCE
				.createAttributeDefinitionString();
		attributeDefinitionString
				.setIdentifier("ID_TC1000_AttributeDefinitionString");
		attributeDefinitionString.setLongName("TC1000 String");
		attributeDefinitionString.setLastChange(lastChangeDate);
		attributeDefinitionString.setType(datatypeDefinitionString);

		attributeDefinitionReal = Reqif10Factory.eINSTANCE
				.createAttributeDefinitionReal();
		attributeDefinitionReal
				.setIdentifier("ID_TC1000_AttributeDefinitionReal");
		attributeDefinitionReal.setLongName("TC1000 Real");
		attributeDefinitionReal.setLastChange(lastChangeDate);
		attributeDefinitionReal.setType(datatypeDefinitionReal);

		attributeDefinitionDate = Reqif10Factory.eINSTANCE
				.createAttributeDefinitionDate();
		attributeDefinitionDate
				.setIdentifier("ID_TC1000_AttributeDefinitionDate");
		attributeDefinitionDate.setLongName("TC1000 Date");
		attributeDefinitionDate.setLastChange(lastChangeDate);
		attributeDefinitionDate.setType(datatypeDefinitionDate);

		attributeDefinitionEnumeration = Reqif10Factory.eINSTANCE
				.createAttributeDefinitionEnumeration();
		attributeDefinitionEnumeration
				.setIdentifier("ID_TC1000_AttributeDefinitionEnumeration");
		attributeDefinitionEnumeration.setLongName("TC1000 Enum");
		attributeDefinitionEnumeration.setLastChange(lastChangeDate);
		attributeDefinitionEnumeration.setType(datatypeDefinitionEnumeration);
		attributeDefinitionEnumeration.setMultiValued(false);

		specObjectType.getSpecAttributes().add(
				attributeDefinitionBooleanTc1000t);
		specObjectType.getSpecAttributes().add(
				attributeDefinitionBooleanTc1000f);
		specObjectType.getSpecAttributes().add(attributeDefinitionInteger);
		specObjectType.getSpecAttributes().add(attributeDefinitionString);
		specObjectType.getSpecAttributes().add(attributeDefinitionReal);
		specObjectType.getSpecAttributes().add(attributeDefinitionDate);
		specObjectType.getSpecAttributes().add(attributeDefinitionEnumeration);

		getReqIf().getCoreContent().getSpecTypes().add(specObjectType);

	}
	
	

	@Override
	public void createSpecificationTypes() {
		SpecificationType specificationType = Reqif10Factory.eINSTANCE.createSpecificationType();
		specificationType.setIdentifier("ID_TC1000_SpecificationType");
		specificationType.setLongName("TC1000 SpecificationType");
		specificationType.setLastChange(lastChangeDate);
		getReqIf().getCoreContent().getSpecTypes().add(specificationType);
	}

	@Override
	public void createSpecRelationGroups() {
		// TODO Auto-generated method stub
		super.createSpecRelationGroups();
	}

	@Override
	public void createSpecifications() {
		Specification specification = Reqif10Factory.eINSTANCE.createSpecification();
		specification.setIdentifier("ID_TC1000_Specification");
		specification.setType(specificationType);
		specification.setLastChange(lastChangeDate);
		
        SpecHierarchy specHierarchy = Reqif10Factory.eINSTANCE.createSpecHierarchy();
        specHierarchy.setIdentifier("ID_TC1000_SpecHierarchy");
        specHierarchy.setLongName("TC1000 SpecHierarchy");
        specHierarchy.setLastChange(lastChangeDate);
        specHierarchy.setObject(specObject);
        specification.getChildren().add(specHierarchy);
		
        getReqIf().getCoreContent().getSpecifications().add(specification);

	}
	
	public SpecObject createTC1000SpecObject(String identifier, XMLGregorianCalendar lastChangeDate, boolean tc1000t, boolean tc1000f, BigInteger tc1000_integer, String tc1000_text, Double tc1000_real, XMLGregorianCalendar tc1000_lastChangeDate, EnumValue tc1000_enumvalue ) {
		SpecObject specObject = Reqif10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier(identifier);
		specObject.setLastChange(tc1000_lastChangeDate);
		specObject.setType(specObjectType);

		AttributeValueBoolean attributeValueBooleanTc1000t = Reqif10Factory.eINSTANCE.createAttributeValueBoolean();
		attributeValueBooleanTc1000t.setDefinition(attributeDefinitionBooleanTc1000t);
		attributeValueBooleanTc1000t.setTheValue(tc1000t);
		
		AttributeValueBoolean attributeValueBooleanTc1000f = Reqif10Factory.eINSTANCE.createAttributeValueBoolean();
		attributeValueBooleanTc1000f.setDefinition(attributeDefinitionBooleanTc1000f);
		attributeValueBooleanTc1000f.setTheValue(tc1000f);
		
		AttributeValueInteger attributeValueInteger = Reqif10Factory.eINSTANCE.createAttributeValueInteger();
		attributeValueInteger.setDefinition(attributeDefinitionInteger);
		attributeValueInteger.setTheValue(tc1000_integer);
		
		AttributeValueString attributeValueString = Reqif10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(attributeDefinitionString);
		attributeValueString.setTheValue(tc1000_text);
		
		AttributeValueReal attributeValueReal = Reqif10Factory.eINSTANCE.createAttributeValueReal();
		attributeValueReal.setDefinition(attributeDefinitionReal);
		attributeValueReal.setTheValue(tc1000_real);
		
		AttributeValueDate attributeValueDate = Reqif10Factory.eINSTANCE.createAttributeValueDate();
		attributeValueDate.setDefinition(attributeDefinitionDate);		
		attributeValueDate.setTheValue(tc1000_lastChangeDate);
		
		AttributeValueEnumeration attributeValueEnumeration = Reqif10Factory.eINSTANCE.createAttributeValueEnumeration();
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
	public void createSpecObjects() {
		SpecObject specObject = createTC1000SpecObject("ID_TC1000_SpecObject", lastChangeDate, true, false,new BigInteger("5000"), "Plain", 1234.5, lastChangeDate, enumValueYellow );
				
		getReqIf().getCoreContent().getSpecObjects().add(specObject);

	}

	@Override
	public void createSpecRelations() {
		// TODO Auto-generated method stub
		super.createSpecRelations();
	}

}
