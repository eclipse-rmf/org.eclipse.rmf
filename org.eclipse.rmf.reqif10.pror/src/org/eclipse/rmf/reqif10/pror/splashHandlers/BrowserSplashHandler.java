/*******************************************************************************
 * Copyright (c) 2013 Formal Mind GmbH
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.splashHandlers;

import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.splash.BasicSplashHandler;
import org.osgi.framework.Version;

public class BrowserSplashHandler extends BasicSplashHandler {

	/**
	 * Taken from org.eclipse.ui.internal.splash.EclipseSplashHandler and
	 * modified.
	 */
	public void init(Shell splash) {
		super.init(splash);
		setProgressRect(new Rectangle(0, 261, 500, 15));
		setMessageRect(new Rectangle(10, 280, 480, 20));

		int foregroundColorInteger = 0x0C3C68;
		setForeground(new RGB((foregroundColorInteger & 0xFF0000) >> 16,
				(foregroundColorInteger & 0xFF00) >> 8,
				foregroundColorInteger & 0xFF));

		Version version = Platform.getBundle("org.eclipse.rmf.reqif10.pror")
				.getVersion();
		final String buildId = version.toString();
		final Point buildIdPoint = new Point(10, 300);

		getContent().addPaintListener(new PaintListener() {

			public void paintControl(PaintEvent e) {
				e.gc.setForeground(getForeground());
				e.gc.drawText(buildId, buildIdPoint.x, buildIdPoint.y, true);
			}
		});
	}
}
