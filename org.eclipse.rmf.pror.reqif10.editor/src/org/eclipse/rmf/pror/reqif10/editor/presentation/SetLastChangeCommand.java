package org.eclipse.rmf.pror.reqif10.editor.presentation;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.ReqIF10Package;

public class SetLastChangeCommand extends SetCommand {

	public SetLastChangeCommand(EditingDomain domain, EObject owner,
			XMLGregorianCalendar value) {
		
		


		
		super(domain, owner, ReqIF10Package.eINSTANCE.getIdentifiable_LastChange(), value);
	}


}
