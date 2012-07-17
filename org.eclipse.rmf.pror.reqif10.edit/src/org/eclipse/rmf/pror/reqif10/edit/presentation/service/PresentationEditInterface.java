package org.eclipse.rmf.pror.reqif10.edit.presentation.service;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.SpecHierarchy;

public interface PresentationEditInterface {

	/**
	 * Will be called when the system can't handle a drag and drop operation by
	 * default. Typically, source contains or target is a {@link SpecHierarchy}.
	 * <p>
	 * 
	 * Most presentations will return null here, unless they integrate with
	 * another data model (e.g. Rodin-ProR-Integration).
	 * <p>
	 * 
	 * @param source
	 *            The drag source
	 * @param target
	 *            The drop target
	 * @param editingDomain
	 *            The {@link EditingDomain}, to manipulate the model
	 * @param operation
	 *            The relevant {@link DND} operation
	 * @return the Command that will perform the drop operation if this
	 *         Presentation will handle the request, otherwise null.
	 */
	public Command handleDragAndDrop(Collection<?> source, Object target,
			EditingDomain editingDomain, int operation);

	/**
	 * Returns a label for the given AttributeValue.
	 * 
	 * @param av
	 * @return
	 */
	String getLabel(AttributeValue av);

}
