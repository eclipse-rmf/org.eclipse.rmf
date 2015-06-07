package org.eclipse.rmf.reqif10.common.services;

import java.util.Collection;

import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.eclipse.sphinx.emf.metamodel.services.IMetaModelService;

public interface IReqIFModelQueryService extends IMetaModelService {

	public Collection<SpecRelation> getIncomingSpecRelationsOf(SpecObject specObject);

	public Collection<SpecRelation> getOutgoingSpecRelationsOf(SpecObject specObject);

	public Collection<SpecRelation> getIncomingSpecRelationsOf(SpecObject specObject, SpecRelationType specRelationType);

	public Collection<SpecRelation> getOutgoingSpecRelationsOf(SpecObject specObject, SpecRelationType specRelationType);

}
