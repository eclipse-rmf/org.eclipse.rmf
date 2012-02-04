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
package org.eclipse.rmf.pror.reqif10.presentation.ui;

import java.io.File;

import org.eclipse.rmf.pror.reqif10.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueSimple;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.util.Reqif10Util;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;

public class IdLabelCellRenderer implements IProrCellRenderer {

	@Override
	public int doDrawCellContent(GC gc, Rectangle rect, Object value) {
		if (value instanceof AttributeValueSimple) {
			Object text = Reqif10Util.getTheValue((AttributeValue) value);
			if (text != null) {
				gc.drawText(text.toString(), rect.x + 1, rect.y + 1);
				Point extend = gc.textExtent(value.toString());
				return extend.y + 2;
			}
		}

		// Default
		return 16;
	}

	@Override
	public String doDrawHtmlContent(Object value, File folder) {
		AttributeValueString av = (AttributeValueString) value;
		return av.getTheValue();
	}

}
