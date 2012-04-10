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
package org.eclipse.rmf.reqif10.tests.domain;

import org.eclipse.rmf.reqif10.tests.domain.tc1000.TC1000SimpleContentTests;
import org.eclipse.rmf.reqif10.tests.domain.tc1100.TC1100UnformattedSystemAttributesAndSpecHierarchyTests;
import org.eclipse.rmf.reqif10.tests.domain.tc1200.TC1200FormatedContentTests;
import org.eclipse.rmf.reqif10.tests.domain.tc1300.TC1300SpecRelationTests;
import org.eclipse.rmf.reqif10.tests.domain.tc1400.TC1400DoorsStyleTableTests;
import org.eclipse.rmf.reqif10.tests.domain.tc1500.TC1500AccessRestrictionTests;
import org.eclipse.rmf.reqif10.tests.domain.tc1600.TC1600ExternalContentTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TC1000SimpleContentTests.class, TC1100UnformattedSystemAttributesAndSpecHierarchyTests.class, TC1200FormatedContentTests.class,
		TC1300SpecRelationTests.class, TC1400DoorsStyleTableTests.class, TC1500AccessRestrictionTests.class, TC1600ExternalContentTests.class,
		TC9000SimpleContentPerformanceTest.class })
public class AllDomainTests {

}
