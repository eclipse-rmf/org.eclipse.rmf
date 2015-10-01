package org.eclipse.rmf.reqif10.headlessValidator.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.rmf.reqif10.constraints.validator.Issue;
import org.eclipse.rmf.reqif10.headlessvalidator.Application;
import org.junit.Before;

public class Test {

	
	private Application application;


	@Before
	public void setup() {
		application = new org.eclipse.rmf.reqif10.headlessvalidator.Application();
	}
	
	@org.junit.Test
	public void testOK() throws Exception {

		LinkedList<String> list = new LinkedList<String>();
		list.add("testdata/resolveProxy/target.reqif");
		
		application.setFiles(list);
		List<Issue> issues = application.run();
		assertTrue(issues.size() == 0);
	}
	
	/**
	 * The file testdata/reference-to-so-in-test1.reqif references (inside a SH)
	 * a SpecObject that is not defined there
	 * 
	 * @throws Exception
	 */
	@org.junit.Test
	public void testMissingReference() throws Exception{
		LinkedList<String> list = new LinkedList<String>();
		list.add("testdata/resolveProxy/reference-to-so-in-target.reqif");
		
		application.setFiles(list);
		List<Issue> issues = application.run();
		assertTrue(issues.size() == 1);
		assertTrue(issues.get(0).getLine() == 65);
		assertTrue(issues.get(0).getMessage().contains("unresolved proxy"));
	}
	
	/**
	 * The file testdata/reference-to-so-in-test1.reqif references (inside a SH)
	 * a SpecObject that is not defined there, but in the file testdata/test1.reqif
	 * 
	 * If both files are validated at the same time, this should be resolved
	 * 
	 * @throws Exception
	 */
	@org.junit.Test
	public void testReferenceInOtherFile() throws Exception{
		LinkedList<String> list = new LinkedList<String>();
		list.add("testdata/resolveProxy/reference-to-so-in-target.reqif");
		list.add("testdata/resolveProxy/target.reqif");
		
		application.setFiles(list);
		List<Issue> issues = application.run();
		assertTrue(issues.size() == 0);
	}
	
	
	@org.junit.Test(expected=IllegalArgumentException.class)
	public void testExceptionWrongFileExtension() throws Exception {
		LinkedList<String> list = new LinkedList<String>();
		list.add("foo.txt");
		application.loadReqifs(list);
	}
	
	@org.junit.Test(expected=FileNotFoundException.class)
	public void testExceptionFileNotFound() throws Exception {
		LinkedList<String> list = new LinkedList<String>();
		list.add("foo.reqif");
		application.loadReqifs(list);
	}

}
