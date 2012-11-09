package org.eclipse.rmf.reqif10.pror.editor.presentation;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.Identifiable;

import com.google.common.collect.Lists;

/**
 * @author Graf
 *
 */
public class TimestampedCompoundCommand extends CompoundCommand {

	private EditingDomain domain;

	public TimestampedCompoundCommand(EditingDomain domain, Command command) {
		super(Collections.singletonList(command));
		this.domain = domain;
	}

	@Override
	public void execute() {
		System.out.println("Executing timestamp command");
		Calendar cal = Calendar.getInstance();
		Date lastChange = cal.getTime();
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(lastChange);
		XMLGregorianCalendar date2 = null;
		try {
			date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<Object> lastChangeObjects = new HashSet<Object>();
		ArrayList<Command> arrList = Lists.newArrayList(commandList);
		commandList = arrList;
		for (ListIterator<Command> commands = arrList.listIterator(); commands
				.hasNext();) {
			try {
				Command command = commands.next();
				System.out.println("Executing "+command);
				command.execute();
				
				for(Object obj: command.getAffectedObjects() ) {
					System.out.println("Affected "+obj);
					if(obj instanceof Identifiable && lastChangeObjects.add(obj)) {
						System.out.println("Adding setLastChange");
						SetLastChangeCommand setLastChangeCommand = new SetLastChangeCommand(domain,(Identifiable)obj,date2);
						commands.add(setLastChangeCommand);
						for(int i = 0 ; i< 2 ; i++)
							if(commands.hasPrevious())
								commands.previous(); 
					}
				}
			} catch (RuntimeException exception) {
				// Skip over the command that threw the exception.
				//
				commands.previous();

				try {
					// Iterate back over the executed commands to undo them.
					//
					while (commands.hasPrevious()) {
						Command command = commands.previous();
						if (command.canUndo()) {
							command.undo();
						} else {
							break;
						}
					}
				} catch (RuntimeException nestedException) {
					CommonPlugin.INSTANCE
							.log(new WrappedException(
									CommonPlugin.INSTANCE
											.getString("_UI_IgnoreException_exception"),
									nestedException).fillInStackTrace());
				}

				throw exception;
			}
		}
	}
}
