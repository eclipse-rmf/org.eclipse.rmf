package org.eclipse.rmf.internal.reqif10.constraints;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinition;

public class ReqIFDiagnostician extends Diagnostician {

	public static final ReqIFDiagnostician INSTANCE = new ReqIFDiagnostician();

	@Override
	public String getObjectLabel(EObject eObject) {
		String label = getReqIFObjectLabel(eObject);
		if (label != null) {
			return label;
		}
		return super.getObjectLabel(eObject);
	}

	public static String getReqIFObjectLabel(EObject identifiable) {
		if (identifiable == null) {
			return null;
		}
		if (identifiable instanceof DatatypeDefinition || identifiable instanceof AttributeDefinition) {
			return identifiable.getClass().getInterfaces()[0].getSimpleName();
		} else {
			return identifiable.getClass().getSimpleName();
		}

	}

}
