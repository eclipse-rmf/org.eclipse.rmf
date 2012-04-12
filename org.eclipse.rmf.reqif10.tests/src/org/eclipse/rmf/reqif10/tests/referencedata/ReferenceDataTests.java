package org.eclipse.rmf.reqif10.tests.referencedata;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.tests.util.AbstractTestCase;
import org.junit.Test;

@SuppressWarnings("nls")
public class ReferenceDataTests extends AbstractTestCase {

	final String INPUT_DIR = "input";
	final String WORK_DIR = "work";

	class ReqIFFileNameFilter implements FilenameFilter {
		public boolean accept(File dir, String name) {
			if (name.endsWith("reqif")) {
				return true;
			} else {
				return false;
			}
		}
	}

	@Test
	public void testSchemaCompliance() {
		File folder = new File(INPUT_DIR);
		if (folder.exists() && folder.isDirectory()) {
			for (String fileName : folder.list(new ReqIFFileNameFilter())) {
				System.out.println("Reading file: " + fileName);
				try {
					validateAgainstSchema(INPUT_DIR + IPath.SEPARATOR + fileName);
				} catch (Exception e) {
					e.printStackTrace();
					assertFalse(true);
				}
			}
		}

	}

	@Test
	public void testAllFilesInInputFolder() {
		File folder = new File(INPUT_DIR);
		if (folder.exists() && folder.isDirectory()) {
			for (String fileName : folder.list(new ReqIFFileNameFilter())) {
				System.out.println("Reading file: " + fileName);
				try {
					// System.out.println("validating input file");
					// validateAgainstSchema(INPUT_DIR + IPath.SEPARATOR + fileName);
					System.out.println("reading input file");
					ReqIF reqIF = loadReqIFFile(INPUT_DIR + IPath.SEPARATOR + fileName);
					// check for unresolved proxies
					assertTrue(checkUnresolvedProxies(reqIF));
					System.out.println("writing file");
					saveReqIFFile(reqIF, WORK_DIR + IPath.SEPARATOR + fileName);
					// System.out.println("validating written file");
					// validateAgainstSchema(WORK_DIR + IPath.SEPARATOR + fileName);
				} catch (Exception e) {
					e.printStackTrace();
					assertFalse(true);
				}
			}
		}
	}

	protected boolean checkUnresolvedProxies(ReqIF reqif) {

		Map<EObject, Collection<Setting>> map = EcoreUtil.UnresolvedProxyCrossReferencer.find(reqif);
		for (EObject eObject : map.keySet()) {
			System.out.println("Unresolved Proxy to object " + eObject);
			for (Setting setting : map.get(eObject)) {
				System.out.println("-" + setting.getEStructuralFeature().getName() + " of  " + setting.getEObject());
			}
		}

		return map.size() == 0;

	}

}
