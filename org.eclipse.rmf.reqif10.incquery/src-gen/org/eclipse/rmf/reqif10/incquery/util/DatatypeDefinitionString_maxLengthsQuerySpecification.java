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
import org.eclipse.rmf.reqif10.incquery.DatatypeDefinitionString_maxLengthsMatch;
import org.eclipse.rmf.reqif10.incquery.DatatypeDefinitionString_maxLengthsMatcher;

/**
 * A pattern-specific query specification that can instantiate DatatypeDefinitionString_maxLengthsMatcher in a type-safe way.
 * 
 * @see DatatypeDefinitionString_maxLengthsMatcher
 * @see DatatypeDefinitionString_maxLengthsMatch
 * 
 */
@SuppressWarnings("all")
public final class DatatypeDefinitionString_maxLengthsQuerySpecification extends BaseGeneratedEMFQuerySpecification<DatatypeDefinitionString_maxLengthsMatcher> {
  private DatatypeDefinitionString_maxLengthsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static DatatypeDefinitionString_maxLengthsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected DatatypeDefinitionString_maxLengthsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return DatatypeDefinitionString_maxLengthsMatcher.on(engine);
  }
  
  @Override
  public DatatypeDefinitionString_maxLengthsMatch newEmptyMatch() {
    return DatatypeDefinitionString_maxLengthsMatch.newEmptyMatch();
  }
  
  @Override
  public DatatypeDefinitionString_maxLengthsMatch newMatch(final Object... parameters) {
    return DatatypeDefinitionString_maxLengthsMatch.newMatch((org.eclipse.rmf.reqif10.DatatypeDefinitionString) parameters[0], (java.math.BigInteger) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static DatatypeDefinitionString_maxLengthsQuerySpecification INSTANCE = make();
    
    public static DatatypeDefinitionString_maxLengthsQuerySpecification make() {
      return new DatatypeDefinitionString_maxLengthsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static DatatypeDefinitionString_maxLengthsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.rmf.reqif10.incquery.datatypeDefinitionString_maxLengths";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("datatypeDefinitionString","maxLength");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("datatypeDefinitionString", "org.eclipse.rmf.reqif10.DatatypeDefinitionString"),new PParameter("maxLength", "java.math.BigInteger"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_datatypeDefinitionString = body.getOrCreateVariableByName("datatypeDefinitionString");
      	PVariable var_maxLength = body.getOrCreateVariableByName("maxLength");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_datatypeDefinitionString, "datatypeDefinitionString"),
      				
      		new ExportedParameter(body, var_maxLength, "maxLength")
      	));
      	new TypeBinary(body, CONTEXT, var_datatypeDefinitionString, var_maxLength, getFeatureLiteral("http://www.omg.org/spec/ReqIF/20110401/reqif.xsd", "DatatypeDefinitionString", "maxLength"), "http://www.omg.org/spec/ReqIF/20110401/reqif.xsd/DatatypeDefinitionString.maxLength");
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
