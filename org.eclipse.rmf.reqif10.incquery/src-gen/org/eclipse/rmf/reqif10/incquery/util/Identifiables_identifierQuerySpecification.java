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
import org.eclipse.rmf.reqif10.incquery.Identifiables_identifierMatch;
import org.eclipse.rmf.reqif10.incquery.Identifiables_identifierMatcher;

/**
 * A pattern-specific query specification that can instantiate Identifiables_identifierMatcher in a type-safe way.
 * 
 * @see Identifiables_identifierMatcher
 * @see Identifiables_identifierMatch
 * 
 */
@SuppressWarnings("all")
public final class Identifiables_identifierQuerySpecification extends BaseGeneratedEMFQuerySpecification<Identifiables_identifierMatcher> {
  private Identifiables_identifierQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static Identifiables_identifierQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected Identifiables_identifierMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return Identifiables_identifierMatcher.on(engine);
  }
  
  @Override
  public Identifiables_identifierMatch newEmptyMatch() {
    return Identifiables_identifierMatch.newEmptyMatch();
  }
  
  @Override
  public Identifiables_identifierMatch newMatch(final Object... parameters) {
    return Identifiables_identifierMatch.newMatch((org.eclipse.rmf.reqif10.Identifiable) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static Identifiables_identifierQuerySpecification INSTANCE = make();
    
    public static Identifiables_identifierQuerySpecification make() {
      return new Identifiables_identifierQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Identifiables_identifierQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.rmf.reqif10.incquery.identifiables_identifier";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("identifiable","identifier");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("identifiable", "org.eclipse.rmf.reqif10.Identifiable"),new PParameter("identifier", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_identifiable = body.getOrCreateVariableByName("identifiable");
      	PVariable var_identifier = body.getOrCreateVariableByName("identifier");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_identifiable, "identifiable"),
      				
      		new ExportedParameter(body, var_identifier, "identifier")
      	));
      	new TypeBinary(body, CONTEXT, var_identifiable, var_identifier, getFeatureLiteral("http://www.omg.org/spec/ReqIF/20110401/reqif.xsd", "Identifiable", "identifier"), "http://www.omg.org/spec/ReqIF/20110401/reqif.xsd/Identifiable.identifier");
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
