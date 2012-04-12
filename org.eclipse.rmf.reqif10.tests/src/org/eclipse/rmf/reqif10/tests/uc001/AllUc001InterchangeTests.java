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
package org.eclipse.rmf.reqif10.tests.uc001;

import org.eclipse.rmf.reqif10.tests.uc001.tc1000.TC1000SimpleContentTests;
import org.eclipse.rmf.reqif10.tests.uc001.tc1100.TC1100UnformattedSystemAttributesAndSpecHierarchyTests;
import org.eclipse.rmf.reqif10.tests.uc001.tc1200.TC1200FormatedContentTests;
import org.eclipse.rmf.reqif10.tests.uc001.tc1300.TC1300SpecRelationTests;
import org.eclipse.rmf.reqif10.tests.uc001.tc1400.TC1400InternalTableTests;
import org.eclipse.rmf.reqif10.tests.uc001.tc1700.TC1700SpecRelationMultifileTests;
import org.eclipse.rmf.reqif10.tests.uc001.tc3000.TC3000ToolExtensionsTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TC1000SimpleContentTests.class, TC1100UnformattedSystemAttributesAndSpecHierarchyTests.class, TC1200FormatedContentTests.class,
		TC1300SpecRelationTests.class, TC1400InternalTableTests.class, /*
																		 * TC1500AccessRestrictionTests.class,
																		 * TC1600ExternalContentTests.class,
																		 */
		TC1700SpecRelationMultifileTests.class, TC3000ToolExtensionsTests.class, TC9000SimpleContentPerformanceTest.class })
public class AllUc001InterchangeTests {

}
