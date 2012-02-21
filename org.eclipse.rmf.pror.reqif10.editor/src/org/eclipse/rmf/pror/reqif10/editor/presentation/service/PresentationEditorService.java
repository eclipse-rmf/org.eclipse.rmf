package org.eclipse.rmf.pror.reqif10.editor.presentation.service;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.ReqIf;

public interface PresentationEditorService {

	/**
	 * Returns the {@link Class} for the subclass of
	 * {@link ProRPresentationConfiguration} that is used to configure this
	 * Presentation.
	 * <p>
	 * 
	 * This can simply be implemented as:
	 * 
	 * <pre>
	 * return IdConfiguration.class;
	 * </pre>
	 */
	public Class<? extends ProrPresentationConfiguration> getConfigurationInterface();

	/**
	 * Returns a new instance of the {@link ProRPresentationConfiguration}. This
	 * can be implemented simply by using the EMF-Factory as follows:
	 * 
	 * <pre>
	 * return ####Factory.eINSTANCE.create####Configuration();
	 * </pre>
	 * 
	 * Substitute the proper names in Factory and method.
	 */
	public ProrPresentationConfiguration getConfigurationInstance();

	/**
	 * This method is triggered when a new ReqIF is opened, giving the
	 * Presentation a chance to interact, e.g. by registering adapters, etc.
	 * <p>
	 * 
	 * Please note that this method may be called multiple times, if the
	 * Presentation is associated with multiple {@link DatatypeDefinition}s.
	 * 
	 * TODO still true?
	 */
	public void openReqif(ReqIf reqif, EditingDomain domain);

	/**
	 * Returns an {@link IProrCellRenderer} appropriate for the
	 * {@link DatatypeDefinition} associated with this configuration. May return
	 * null (then the default renderer is used).
	 * 
	 * @return
	 */
	IProrCellRenderer getCellRenderer(AttributeValue av);

	/**
	 * Returns the {@link CellEditor} appropriate for the
	 * {@link DatatypeDefinition} associated with this configuration. May return
	 * null (then the default renderer is used).
	 * 
	 * @param av
	 * 
	 * @return
	 */
	CellEditor getCellEditor(AgileGrid agileGrid, EditingDomain editingDomain,
			AttributeValue av);

	/**
	 * Whether the managed {@link AttributeDefinition}s may be modified.
	 */
	boolean canEdit();

}
