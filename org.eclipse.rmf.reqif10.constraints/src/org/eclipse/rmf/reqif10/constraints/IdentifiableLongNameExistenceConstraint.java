/*******************************************************************************
 * Copyright (c) 2014 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Mark Broerkens (itemis AG) - initial API and implementation
 *******************************************************************************/
package org.eclipse.rmf.reqif10.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.rmf.internal.reqif10.constraints.ReqIFDiagnostician;
import org.eclipse.rmf.reqif10.Identifiable;

public class IdentifiableLongNameExistenceConstraint extends ReqIFModelConstraint {

	@Override
	public IStatus doValidate(IValidationContext ctx) {
		Object target = ctx.getTarget();
		if (target != null && target instanceof Identifiable) {
			Identifiable identifiable = (Identifiable) target;
			String longName = identifiable.getLongName();
			if (!identifiable.isSetLongName() || null == longName || "".equals(longName)) { //$NON-NLS-1$
				return ctx.createFailureStatus(ReqIFDiagnostician.getReqIFObjectLabel(identifiable));
			} else {
				return Status.OK_STATUS;
			}
		} else {
			return Status.OK_STATUS;
		}
	}
}