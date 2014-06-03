/*******************************************************************************
 * Copyright (c) 2014 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Mark Broerkens (itemis AG) - initial API and implementation
 *******************************************************************************/
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
