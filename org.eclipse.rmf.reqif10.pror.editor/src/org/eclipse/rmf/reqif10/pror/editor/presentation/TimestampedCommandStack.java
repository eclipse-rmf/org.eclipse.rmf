package org.eclipse.rmf.reqif10.pror.editor.presentation;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.domain.EditingDomain;


public class TimestampedCommandStack extends BasicCommandStack {

	protected EditingDomain editingDomain;

	@Override
	public void execute(Command command) {
		
		CompoundCommand compoundCommand = new TimestampedCompoundCommand(editingDomain, command);
		super.execute(compoundCommand);
	}

	public void setEditingDomain(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
		
	}
}
