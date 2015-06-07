package org.eclipse.rmf.reqif10.incquery;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.incquery.ComplexPatternMatch;
import org.eclipse.rmf.reqif10.incquery.util.ComplexPatternQuerySpecification;

/**
 * Generated pattern matcher API of the org.eclipse.rmf.reqif10.incquery.complexPattern pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ComplexPatternMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern complexPattern(specObject : SpecObject, value : AttributeValue ) {
 * 	SpecObject.values(specObject,value);
 * 	AttributeValueString.definition(value, definition);
 * 	AttributeDefinitionString.type(definition, datatype);
 * 	DatatypeDefinitionString.maxLength(datatype,_);	
 * }
 * </pre></code>
 * 
 * @see ComplexPatternMatch
 * @see ComplexPatternProcessor
 * @see ComplexPatternQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ComplexPatternMatcher extends BaseMatcher<ComplexPatternMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ComplexPatternMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ComplexPatternMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ComplexPatternMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SPECOBJECT = 0;
  
  private final static int POSITION_VALUE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ComplexPatternMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public ComplexPatternMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public ComplexPatternMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSpecObject the fixed value of pattern parameter specObject, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return matches represented as a ComplexPatternMatch object.
   * 
   */
  public Collection<ComplexPatternMatch> getAllMatches(final SpecObject pSpecObject, final AttributeValue pValue) {
    return rawGetAllMatches(new Object[]{pSpecObject, pValue});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSpecObject the fixed value of pattern parameter specObject, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return a match represented as a ComplexPatternMatch object, or null if no match is found.
   * 
   */
  public ComplexPatternMatch getOneArbitraryMatch(final SpecObject pSpecObject, final AttributeValue pValue) {
    return rawGetOneArbitraryMatch(new Object[]{pSpecObject, pValue});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSpecObject the fixed value of pattern parameter specObject, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SpecObject pSpecObject, final AttributeValue pValue) {
    return rawHasMatch(new Object[]{pSpecObject, pValue});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSpecObject the fixed value of pattern parameter specObject, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SpecObject pSpecObject, final AttributeValue pValue) {
    return rawCountMatches(new Object[]{pSpecObject, pValue});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSpecObject the fixed value of pattern parameter specObject, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SpecObject pSpecObject, final AttributeValue pValue, final IMatchProcessor<? super ComplexPatternMatch> processor) {
    rawForEachMatch(new Object[]{pSpecObject, pValue}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSpecObject the fixed value of pattern parameter specObject, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SpecObject pSpecObject, final AttributeValue pValue, final IMatchProcessor<? super ComplexPatternMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSpecObject, pValue}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSpecObject the fixed value of pattern parameter specObject, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ComplexPatternMatch newMatch(final SpecObject pSpecObject, final AttributeValue pValue) {
    return ComplexPatternMatch.newMatch(pSpecObject, pValue);
  }
  
  /**
   * Retrieve the set of values that occur in matches for specObject.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<SpecObject> rawAccumulateAllValuesOfspecObject(final Object[] parameters) {
    Set<SpecObject> results = new HashSet<SpecObject>();
    rawAccumulateAllValues(POSITION_SPECOBJECT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for specObject.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SpecObject> getAllValuesOfspecObject() {
    return rawAccumulateAllValuesOfspecObject(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for specObject.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SpecObject> getAllValuesOfspecObject(final ComplexPatternMatch partialMatch) {
    return rawAccumulateAllValuesOfspecObject(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for specObject.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SpecObject> getAllValuesOfspecObject(final AttributeValue pValue) {
    return rawAccumulateAllValuesOfspecObject(new Object[]{
    null, 
    pValue
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<AttributeValue> rawAccumulateAllValuesOfvalue(final Object[] parameters) {
    Set<AttributeValue> results = new HashSet<AttributeValue>();
    rawAccumulateAllValues(POSITION_VALUE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<AttributeValue> getAllValuesOfvalue() {
    return rawAccumulateAllValuesOfvalue(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<AttributeValue> getAllValuesOfvalue(final ComplexPatternMatch partialMatch) {
    return rawAccumulateAllValuesOfvalue(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for value.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<AttributeValue> getAllValuesOfvalue(final SpecObject pSpecObject) {
    return rawAccumulateAllValuesOfvalue(new Object[]{
    pSpecObject, 
    null
    });
  }
  
  @Override
  protected ComplexPatternMatch tupleToMatch(final Tuple t) {
    try {
    	return ComplexPatternMatch.newMatch((org.eclipse.rmf.reqif10.SpecObject) t.get(POSITION_SPECOBJECT), (org.eclipse.rmf.reqif10.AttributeValue) t.get(POSITION_VALUE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ComplexPatternMatch arrayToMatch(final Object[] match) {
    try {
    	return ComplexPatternMatch.newMatch((org.eclipse.rmf.reqif10.SpecObject) match[POSITION_SPECOBJECT], (org.eclipse.rmf.reqif10.AttributeValue) match[POSITION_VALUE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ComplexPatternMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ComplexPatternMatch.newMutableMatch((org.eclipse.rmf.reqif10.SpecObject) match[POSITION_SPECOBJECT], (org.eclipse.rmf.reqif10.AttributeValue) match[POSITION_VALUE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<ComplexPatternMatcher> querySpecification() throws IncQueryException {
    return ComplexPatternQuerySpecification.instance();
  }
}
