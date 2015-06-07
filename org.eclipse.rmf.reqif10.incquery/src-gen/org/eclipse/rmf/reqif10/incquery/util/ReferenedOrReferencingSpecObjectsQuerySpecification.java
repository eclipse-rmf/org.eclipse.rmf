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
import org.eclipse.rmf.reqif10.incquery.ReferenedOrReferencingSpecObjectsMatch;
import org.eclipse.rmf.reqif10.incquery.ReferenedOrReferencingSpecObjectsMatcher;

/**
 * A pattern-specific query specification that can instantiate ReferenedOrReferencingSpecObjectsMatcher in a type-safe way.
 * 
 * @see ReferenedOrReferencingSpecObjectsMatcher
 * @see ReferenedOrReferencingSpecObjectsMatch
 * 
 */
@SuppressWarnings("all")
public final class ReferenedOrReferencingSpecObjectsQuerySpecification extends BaseGeneratedEMFQuerySpecification<ReferenedOrReferencingSpecObjectsMatcher> {
  private ReferenedOrReferencingSpecObjectsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ReferenedOrReferencingSpecObjectsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ReferenedOrReferencingSpecObjectsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ReferenedOrReferencingSpecObjectsMatcher.on(engine);
  }
  
  @Override
  public ReferenedOrReferencingSpecObjectsMatch newEmptyMatch() {
    return ReferenedOrReferencingSpecObjectsMatch.newEmptyMatch();
  }
  
  @Override
  public ReferenedOrReferencingSpecObjectsMatch newMatch(final Object... parameters) {
    return ReferenedOrReferencingSpecObjectsMatch.newMatch((org.eclipse.rmf.reqif10.SpecObject) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static ReferenedOrReferencingSpecObjectsQuerySpecification INSTANCE = make();
    
    public static ReferenedOrReferencingSpecObjectsQuerySpecification make() {
      return new ReferenedOrReferencingSpecObjectsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ReferenedOrReferencingSpecObjectsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.rmf.reqif10.incquery.referenedOrReferencingSpecObjects";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("specObject");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("specObject", "org.eclipse.rmf.reqif10.SpecObject"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_specObject = body.getOrCreateVariableByName("specObject");
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_specObject, "specObject")
      	));
      	new TypeBinary(body, CONTEXT, var___0_, var_specObject, getFeatureLiteral("http://www.omg.org/spec/ReqIF/20110401/reqif.xsd", "SpecRelation", "source"), "http://www.omg.org/spec/ReqIF/20110401/reqif.xsd/SpecRelation.source");
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_specObject = body.getOrCreateVariableByName("specObject");
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_specObject, "specObject")
      	));
      	new TypeBinary(body, CONTEXT, var___0_, var_specObject, getFeatureLiteral("http://www.omg.org/spec/ReqIF/20110401/reqif.xsd", "SpecRelation", "target"), "http://www.omg.org/spec/ReqIF/20110401/reqif.xsd/SpecRelation.target");
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
