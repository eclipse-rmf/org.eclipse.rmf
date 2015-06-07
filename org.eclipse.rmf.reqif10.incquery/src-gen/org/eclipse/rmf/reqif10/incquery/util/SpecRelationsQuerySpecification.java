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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.rmf.reqif10.incquery.SpecRelationsMatch;
import org.eclipse.rmf.reqif10.incquery.SpecRelationsMatcher;

/**
 * A pattern-specific query specification that can instantiate SpecRelationsMatcher in a type-safe way.
 * 
 * @see SpecRelationsMatcher
 * @see SpecRelationsMatch
 * 
 */
@SuppressWarnings("all")
public final class SpecRelationsQuerySpecification extends BaseGeneratedEMFQuerySpecification<SpecRelationsMatcher> {
  private SpecRelationsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SpecRelationsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SpecRelationsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SpecRelationsMatcher.on(engine);
  }
  
  @Override
  public SpecRelationsMatch newEmptyMatch() {
    return SpecRelationsMatch.newEmptyMatch();
  }
  
  @Override
  public SpecRelationsMatch newMatch(final Object... parameters) {
    return SpecRelationsMatch.newMatch((org.eclipse.rmf.reqif10.SpecRelation) parameters[0], (org.eclipse.rmf.reqif10.SpecObject) parameters[1], (org.eclipse.rmf.reqif10.SpecObject) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static SpecRelationsQuerySpecification INSTANCE = make();
    
    public static SpecRelationsQuerySpecification make() {
      return new SpecRelationsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SpecRelationsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.rmf.reqif10.incquery.specRelations";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("specRelation","source","target");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("specRelation", "org.eclipse.rmf.reqif10.SpecRelation"),new PParameter("source", "org.eclipse.rmf.reqif10.SpecObject"),new PParameter("target", "org.eclipse.rmf.reqif10.SpecObject"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_specRelation = body.getOrCreateVariableByName("specRelation");
      	PVariable var_source = body.getOrCreateVariableByName("source");
      	PVariable var_target = body.getOrCreateVariableByName("target");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_specRelation, "specRelation"),
      				
      		new ExportedParameter(body, var_source, "source"),
      				
      		new ExportedParameter(body, var_target, "target")
      	));
      	new TypeBinary(body, CONTEXT, var_specRelation, var_source, getFeatureLiteral("http://www.omg.org/spec/ReqIF/20110401/reqif.xsd", "SpecRelation", "source"), "http://www.omg.org/spec/ReqIF/20110401/reqif.xsd/SpecRelation.source");
      	new TypeBinary(body, CONTEXT, var_specRelation, var_target, getFeatureLiteral("http://www.omg.org/spec/ReqIF/20110401/reqif.xsd", "SpecRelation", "target"), "http://www.omg.org/spec/ReqIF/20110401/reqif.xsd/SpecRelation.target");
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
