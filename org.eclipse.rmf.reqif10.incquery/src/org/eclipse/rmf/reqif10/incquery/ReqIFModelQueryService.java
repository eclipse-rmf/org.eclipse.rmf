package org.eclipse.rmf.reqif10.incquery;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.rmf.internal.reqif10.incquery.Activator;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.eclipse.rmf.reqif10.common.services.IReqIFModelQueryService;
import org.eclipse.sphinx.emf.incquery.IIncQueryEngineHelper;
import org.eclipse.sphinx.emf.incquery.IncQueryEngineHelper;
import org.eclipse.sphinx.platform.util.PlatformLogUtil;

public class ReqIFModelQueryService implements IReqIFModelQueryService {
	
	private IIncQueryEngineHelper incQueryEngineHelper = null;

	
	public ReqIFModelQueryService() {
		// TODO Auto-generated constructor stub
	}
	
	protected IIncQueryEngineHelper getIncQueryEngineHelper() {
		if (incQueryEngineHelper == null) {
			incQueryEngineHelper = createIncQueryEngineHelper();
		}
		return incQueryEngineHelper;
	}

	protected IIncQueryEngineHelper createIncQueryEngineHelper() {
		return new IncQueryEngineHelper();
	}



	@Override
	public Collection<SpecRelation> getIncomingSpecRelationsOf(
			SpecObject specObject) {
		try {
			IncQueryEngine engine = getIncQueryEngineHelper().getEngine(specObject);
			SpecRelationsMatcher matcher = SpecRelationsMatcher.on(engine);			
			return matcher.getAllValuesOfspecRelation(null, specObject);
		} catch (IncQueryException ex) {
			PlatformLogUtil.logAsError(Activator.getPlugin(), ex);
		}
		return Collections.<SpecRelation> emptyList();
	}

	@Override
	public Collection<SpecRelation> getOutgoingSpecRelationsOf(
			SpecObject specObject) {
		try {
			SpecRelationsMatcher matcher = SpecRelationsMatcher.on(getIncQueryEngineHelper().getEngine(specObject));			
			return matcher.getAllValuesOfspecRelation(specObject, null);
		} catch (IncQueryException ex) {
			PlatformLogUtil.logAsError(Activator.getPlugin(), ex);
		}
		return Collections.<SpecRelation> emptyList();
	}

	@Override
	public Collection<SpecRelation> getIncomingSpecRelationsOf(
			SpecObject specObject, SpecRelationType specRelationType) {
		// TODO Auto-generated method stub
		return Collections.<SpecRelation> emptyList();
	}

	@Override
	public Collection<SpecRelation> getOutgoingSpecRelationsOf(
			SpecObject specObject, SpecRelationType specRelationType) {
		// TODO Auto-generated method stub
		return Collections.<SpecRelation> emptyList();
	}

}
