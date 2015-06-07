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
import org.eclipse.rmf.reqif10.incquery.DatatypeDefinitionStringsMatch;
import org.eclipse.rmf.reqif10.incquery.DatatypeDefinitionStringsMatcher;

/**
 * A pattern-specific query specification that can instantiate DatatypeDefinitionStringsMatcher in a type-safe way.
 * 
 * @see DatatypeDefinitionStringsMatcher
 * @see DatatypeDefinitionStringsMatch
 * 
 */
@SuppressWarnings("all")
public final class DatatypeDefinitionStringsQuerySpecification extends BaseGeneratedEMFQuerySpecification<DatatypeDefinitionStringsMatcher> {
  private DatatypeDefinitionStringsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static DatatypeDefinitionStringsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected DatatypeDefinitionStringsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return DatatypeDefinitionStringsMatcher.on(engine);
  }
  
  @Override
  public DatatypeDefinitionStringsMatch newEmptyMatch() {
    return DatatypeDefinitionStringsMatch.newEmptyMatch();
  }
  
  @Override
  public DatatypeDefinitionStringsMatch newMatch(final Object... parameters) {
    return DatatypeDefinitionStringsMatch.newMatch((org.eclipse.rmf.reqif10.DatatypeDefinitionString) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static DatatypeDefinitionStringsQuerySpecification INSTANCE = make();
    
    public static DatatypeDefinitionStringsQuerySpecification make() {
      return new DatatypeDefinitionStringsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static DatatypeDefinitionStringsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.rmf.reqif10.incquery.datatypeDefinitionStrings";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("datatypeDefinitionString");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("datatypeDefinitionString", "org.eclipse.rmf.reqif10.DatatypeDefinitionString"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_datatypeDefinitionString = body.getOrCreateVariableByName("datatypeDefinitionString");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_datatypeDefinitionString, "datatypeDefinitionString")
      	));
      	new TypeUnary(body, var_datatypeDefinitionString, getClassifierLiteral("http://www.omg.org/spec/ReqIF/20110401/reqif.xsd", "DatatypeDefinitionString"), "http://www.omg.org/spec/ReqIF/20110401/reqif.xsd/DatatypeDefinitionString");
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
