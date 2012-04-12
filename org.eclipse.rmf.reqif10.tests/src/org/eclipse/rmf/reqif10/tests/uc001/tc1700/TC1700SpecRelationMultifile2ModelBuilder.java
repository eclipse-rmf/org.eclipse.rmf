package org.eclipse.rmf.reqif10.tests.uc001.tc1700;

import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.tests.util.SimpleModelBuilder;

@SuppressWarnings("nls")
public class TC1700SpecRelationMultifile2ModelBuilder extends SimpleModelBuilder {
	final static String LAST_CHANGE_STRING = "2012-04-07T01:51:37.112+02:00";
	final static String TEST_CASE_ID = "TC1700";

	// SpecObjects
	SpecObject specObject1;
	SpecObject specObject2;

	// SpecRelationTypes
	SpecRelationType specRelationType;

	// SpecRelation
	SpecRelation specRelation;

	// Specifications
	Specification specification;

	public TC1700SpecRelationMultifile2ModelBuilder(TC1700SpecRelationMultifile1ModelBuilder modelBuilder) throws Exception {
		super("ID_TC1700_ReqIfHeader_2", "TC1700 'SpecRelation MultiFile'");
		specObject1 = modelBuilder.getSpecObject1();
		specObject2 = modelBuilder.getSpecObject2();
	}

	@Override
	public void createSpecRelations() throws Exception {
		specRelation = ReqIF10Factory.eINSTANCE.createSpecRelation();
		specRelation.setIdentifier("ID_TC1700_SpecRelation");
		specRelation.setLongName("TC 1700 SpecRelation");
		specRelation.setLastChange(toDate(LAST_CHANGE_STRING));
		specRelation.setType(specRelationType);
		specRelation.setSource(specObject1);
		specRelation.setTarget(specObject2);
		getReqIF().getCoreContent().getSpecRelations().add(specRelation);
	}

	@Override
	public void createSpecRelationTypes() throws Exception {
		specRelationType = ReqIF10Factory.eINSTANCE.createSpecRelationType();
		specRelationType.setIdentifier("ID_TC1700_SpecRelationType");
		specRelationType.setLongName("TC 1700 SpecRelationType");
		specRelationType.setLastChange(toDate(LAST_CHANGE_STRING));
		getReqIF().getCoreContent().getSpecTypes().add(specRelationType);
	}

}
