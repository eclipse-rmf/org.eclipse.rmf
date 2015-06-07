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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.rmf.reqif10.incquery.ComplexPatternMatch;
import org.eclipse.rmf.reqif10.incquery.ComplexPatternMatcher;

/**
 * A pattern-specific query specification that can instantiate ComplexPatternMatcher in a type-safe way.
 * 
 * @see ComplexPatternMatcher
 * @see ComplexPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class ComplexPatternQuerySpecification extends BaseGeneratedEMFQuerySpecification<ComplexPatternMatcher> {
  private ComplexPatternQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ComplexPatternQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ComplexPatternMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ComplexPatternMatcher.on(engine);
  }
  
  @Override
  public ComplexPatternMatch newEmptyMatch() {
    return ComplexPatternMatch.newEmptyMatch();
  }
  
  @Override
  public ComplexPatternMatch newMatch(final Object... parameters) {
    return ComplexPatternMatch.newMatch((org.eclipse.rmf.reqif10.SpecObject) parameters[0], (org.eclipse.rmf.reqif10.AttributeValue) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static ComplexPatternQuerySpecification INSTANCE = make();
    
    public static ComplexPatternQuerySpecification make() {
      return new ComplexPatternQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ComplexPatternQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.eclipse.rmf.reqif10.incquery.complexPattern";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("specObject","value");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("specObject", "org.eclipse.rmf.reqif10.SpecObject"),new PParameter("value", "org.eclipse.rmf.reqif10.AttributeValue"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_specObject = body.getOrCreateVariableByName("specObject");
      	PVariable var_value = body.getOrCreateVariableByName("value");
      	PVariable var_definition = body.getOrCreateVariableByName("definition");
      	PVariable var_datatype = body.getOrCreateVariableByName("datatype");
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_specObject, "specObject"),
      				
      		new ExportedParameter(body, var_value, "value")
      	));
      	new TypeUnary(body, var_specObject, getClassifierLiteral("http://www.omg.org/spec/ReqIF/20110401/reqif.xsd", "SpecObject"), "http://www.omg.org/spec/ReqIF/20110401/reqif.xsd/SpecObject");
      	new TypeBinary(body, CONTEXT, var_specObject, var_value, getFeatureLiteral("http://www.omg.org/spec/ReqIF/20110401/reqif.xsd", "SpecElementWithAttributes", "values"), "http://www.omg.org/spec/ReqIF/20110401/reqif.xsd/SpecElementWithAttributes.values");
      	new TypeBinary(body, CONTEXT, var_value, var_definition, getFeatureLiteral("http://www.omg.org/spec/ReqIF/20110401/reqif.xsd", "AttributeValueString", "definition"), "http://www.omg.org/spec/ReqIF/20110401/reqif.xsd/AttributeValueString.definition");
      	new TypeBinary(body, CONTEXT, var_definition, var_datatype, getFeatureLiteral("http://www.omg.org/spec/ReqIF/20110401/reqif.xsd", "AttributeDefinitionString", "type"), "http://www.omg.org/spec/ReqIF/20110401/reqif.xsd/AttributeDefinitionString.type");
      	new TypeBinary(body, CONTEXT, var_datatype, var___0_, getFeatureLiteral("http://www.omg.org/spec/ReqIF/20110401/reqif.xsd", "DatatypeDefinitionString", "maxLength"), "http://www.omg.org/spec/ReqIF/20110401/reqif.xsd/DatatypeDefinitionString.maxLength");
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
