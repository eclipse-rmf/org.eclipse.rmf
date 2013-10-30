package org.eclipse.rmf.tests.reqif10.excel.serialization;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.excel.serialization.ExcelResourceImpl;
import org.junit.Test;

public class ExcelResourceImplSaveTests {

	@Test
	public void testSave() throws IOException {
		URI emfURI = URI.createURI("working-dir/empty.xls");
		Resource excelResource = new ExcelResourceImpl(emfURI);
		excelResource.save(null);
	}

}
