package org.eclipse.rmf.reqif10.excel.serialization;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.SheetUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

public class ExcelResourceImpl extends ResourceImpl implements ExcelResource {

	public ExcelResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	public EList<EObject> getContents() {
		// TODO Auto-generated method stub
		return super.getContents();
	}

	@Override
	public EObject getEObject(String uriFragment) {
		// TODO Auto-generated method stub
		return super.getEObject(uriFragment);
	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		Workbook workbook = new HSSFWorkbook();
		workbook.createSheet("FirstSheet");
		workbook.write(outputStream);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		Workbook workbook = new HSSFWorkbook(inputStream);
		System.out.println("Number of Sheets: " + workbook.getNumberOfSheets());
	}

	@Override
	protected void doUnload() {
		// TODO Auto-generated method stub
		super.doUnload();
	}
	

}
