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
package org.eclipse.rmf.reqif10.pror.editor.presentation;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * This class was generated.  We moved it here to have a
 * standard Perspective for ReqIF (obviously not generated any more)
 * 
 * @author jastram
 * 
 */
public class ProrPerspective implements IPerspectiveFactory {
	/**
	 * Perspective ID
	 */
	public static final String ID_PERSPECTIVE = "org.eclipse.rmf.pror.ProrPerspective";

	/**
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 */
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.addPerspectiveShortcut(ID_PERSPECTIVE);

		IFolderLayout right = layout.createFolder("right",
				IPageLayout.RIGHT, 0.8f, layout.getEditorArea());
		right.addView(IPageLayout.ID_OUTLINE);

		IFolderLayout bottonLeft = layout.createFolder("bottonLeft",
				IPageLayout.BOTTOM, 0.70f, layout.getEditorArea());
		bottonLeft.addView(IPageLayout.ID_PROP_SHEET);

		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT,
				0.2f, layout.getEditorArea());
		left.addView(IPageLayout.ID_PROJECT_EXPLORER);

	}
}
