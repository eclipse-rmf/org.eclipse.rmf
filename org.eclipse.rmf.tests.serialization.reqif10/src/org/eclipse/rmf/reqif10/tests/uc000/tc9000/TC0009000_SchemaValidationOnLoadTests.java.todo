package org.eclipse.rmf.reqif10.tests.uc000.tc9000;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.tests.util.AbstractTestCase;
import org.junit.Test;

@SuppressWarnings("nls")
public class TC0009000_SchemaValidationOnLoadTests extends AbstractTestCase {

	final String INPUT_DIR = "input/uc000/tc9xxx/";
	final String WORK_DIR = "work/uc000/tc9xxx/";

	/**
	 * checks if schema validation is enabled against the built-in schema even if a custom schema is defined but not found
	 */
	@Test
	public void testValidDefinedUnavailableSchemaLocation() {
		try {
			ReqIF reqIF = loadReqIFFile(INPUT_DIR + "TC0009000_valid_definedUnavailableSchemaLocation.reqif", true);
			assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	/**
	 * checks if schema validation is enabled against the built-in schema even if a custom schema is defined but not found
	 */
	@Test
	public void testInvalidDefinedUnavailableSchemaLocation() {
		try {
			ReqIF reqIF = loadReqIFFile(INPUT_DIR + "TC0009000_invalid_definedUnavailableSchemaLocation.reqif", true);
			assertTrue(false);
		} catch (IOException ioe) {
			if (ioe instanceof IOWrappedException) {
				IOWrappedException iowe = (IOWrappedException) ioe;
				Throwable e = iowe.getCause();
				String message = e.getMessage();
				assertNotNull(message);
				assertTrue(message.contains("cvc-datatype-valid.1.2.1: 'This is not a date string' is not a valid value for 'dateTime'"));
			} else {
				ioe.printStackTrace();
				assertTrue(false);
			}
		}
	}

	/**
	 * checks if schema validation is enabled against the built-in schema if there is no schema location hint
	 */
	@Test
	public void testValidUndefinedSchemaLocation() {
		try {
			ReqIF reqIF = loadReqIFFile(INPUT_DIR + "TC0009000_valid_undefinedSchemaLocation.reqif", true);
			assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	/**
	 * checks if schema validation is enabled against the built-in schema if there is no schema location hint
	 */

	@Test
	public void testInvalidUndefinedSchemaLocation() {
		try {
			ReqIF reqIF = loadReqIFFile(INPUT_DIR + "TC0009000_invalid_undefinedSchemaLocation.reqif", true);
			assertTrue(false);
		} catch (IOException ioe) {
			if (ioe instanceof IOWrappedException) {
				IOWrappedException iowe = (IOWrappedException) ioe;
				Throwable e = iowe.getCause();
				String message = e.getMessage();
				assertNotNull(message);
				assertTrue(message.contains("cvc-datatype-valid.1.2.1: 'This is not a date string' is not a valid value for 'dateTime'"));
			} else {
				ioe.printStackTrace();
				assertTrue(false);
			}
		}
	}

}
