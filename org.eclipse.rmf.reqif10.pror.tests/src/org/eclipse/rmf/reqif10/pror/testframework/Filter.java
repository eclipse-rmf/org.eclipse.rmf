/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
/**
 * 
 */
package org.eclipse.rmf.reqif10.pror.testframework;

import org.eclipse.emf.common.notify.Notification;

/**
 * I can't believe that there is no Filter Interface in the JDK!  Or am I blind?
 * 
 * @author jastram
 */
public interface Filter {

	/**
	 * Inspects the notification and decides whether it should be processed
	 * further. This is typically an equals test against
	 * {@link Notification#getNotifier()}.
	 * 
	 * @return true if the notification shall be accepted.
	 */
	public boolean accept(Notification notification);

}
