/*******************************************************************************
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.configuration.tests;

import org.eclipse.rmf.reqif10.pror.configuration.provider.ColumnTest;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ConfigurationUtilTest;
import org.eclipse.rmf.reqif10.pror.configuration.provider.HeadlineConfigurationTest;
import org.eclipse.rmf.reqif10.pror.configuration.provider.LabelConfigurationTest;
import org.eclipse.rmf.reqif10.pror.configuration.provider.LinewrapConfigurationTest;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ProrGeneralConfigurationTest;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ProrPresentationConfigurationsTest;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ProrSpecViewConfigurationTest;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ProrToolExtensionTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	ColumnTest.class, 
	ConfigurationUtilTest.class,
	HeadlineConfigurationTest.class,
	LabelConfigurationTest.class,
	LinewrapConfigurationTest.class,
	ProrGeneralConfigurationTest.class,
	ProrPresentationConfigurationsTest.class,
	ProrSpecViewConfigurationTest.class,
	ProrToolExtensionTest.class
	})
public class AllConfigurationTests {
	


}
