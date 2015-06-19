package org.eclipse.rmf.reqif10.ide.metamodel;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.sphinx.emf.metamodel.IMetaModelDescriptor;
import org.eclipse.rmf.reqif.ide.metamodel.ReqIFMMDescriptor;

/**
 * Implementation of {@linkplain IMetaModelDescriptor} for the ReqIF 1.0.1 meta-model.
 */
public class ReqIF10MMDescriptor extends ReqIFMMDescriptor {

	/**
	 * The id of the content type for ReqIF 1.0 XML files.
	 */
	public static final String XML_CONTENT_TYPE_ID = "org.eclipse.rmf.reqif10.reqif10XMLFile"; //$NON-NLS-1$

	private static final String ID = "org.eclipse.rmf.reqif10"; //$NON-NLS-1$
	private static final String NAME = BASE_NAME + " 1.0"; //$NON-NLS-1$

	/**
	 * Singleton instance.
	 */
	public static final ReqIF10MMDescriptor INSTANCE = new ReqIF10MMDescriptor();

	/**
	 * Private default constructor for singleton pattern.
	 */
	private ReqIF10MMDescriptor() {
		super(ID, BASE_NAMESPACE, NAME);
	}

	/*
	 * @see org.eclipse.sphinx.examples.hummingbird.ide.metamodel.HummingbirdMMDescriptor#getDefaultContentTypeId()
	 */
	@Override
	public String getDefaultContentTypeId() {
		return XML_CONTENT_TYPE_ID;
	}


	
}

