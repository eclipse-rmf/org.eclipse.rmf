package org.eclipse.rmf.reqif10.incquery.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.rmf.reqif10.incquery.RelationGroupsMatch;
import org.eclipse.rmf.reqif10.incquery.RelationGroupsMatcher;

/**
 * A pattern-specific query specification that can instantiate RelationGroupsMatcher in a type-safe way.
 * 
 * @see RelationGroupsMatcher
 * @see RelationGroupsMatch
 * 
 */
@SuppressWarnings("all")
public final class RelationGroupsQuerySpecification extends BaseGeneratedEMFQuerySpecification<RelationGroupsMatcher> {
  private RelationGroupsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RelationGroupsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected RelationGroupsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return RelationGroupsMatcher.on(engine);
  }
  
  @Override
  public RelationGroupsMatch newEmptyMatch() {
    return RelationGroupsMatch.newEmptyMatch();
  }
  
  @Override
  public RelationGroupsMatch newMatch(final Object... parameters) {
    return RelationGroupsMatch.newMatch((org.eclipse.rmf.reqif10.RelationGroup) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static RelationGroupsQuerySpecification INSTANCE = make();
    
    public static RelationGroupsQuerySpecification make() {
      return new RelationGroupsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static RelationGroupsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.rmf.reqif10.incquery.relationGroups";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("relationGroup");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("relationGroup", "org.eclipse.rmf.reqif10.RelationGroup"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_relationGroup = body.getOrCreateVariableByName("relationGroup");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_relationGroup, "relationGroup")
      	));
      	new TypeUnary(body, var_relationGroup, getClassifierLiteral("http://www.omg.org/spec/ReqIF/20110401/reqif.xsd", "RelationGroup"), "http://www.omg.org/spec/ReqIF/20110401/reqif.xsd/RelationGroup");
      	bodies.add(body);
      }
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
