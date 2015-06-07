package org.eclipse.rmf.reqif10.incquery;

import java.math.BigInteger;
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
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.incquery.DatatypeDefinitionString_maxLengthsMatch;
import org.eclipse.rmf.reqif10.incquery.util.DatatypeDefinitionString_maxLengthsQuerySpecification;

/**
 * Generated pattern matcher API of the org.eclipse.rmf.reqif10.incquery.datatypeDefinitionString_maxLengths pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link DatatypeDefinitionString_maxLengthsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern datatypeDefinitionString_maxLengths(datatypeDefinitionString : DatatypeDefinitionString, maxLength) {
 * 	DatatypeDefinitionString.maxLength(datatypeDefinitionString,maxLength);
 * }
 * </pre></code>
 * 
 * @see DatatypeDefinitionString_maxLengthsMatch
 * @see DatatypeDefinitionString_maxLengthsProcessor
 * @see DatatypeDefinitionString_maxLengthsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class DatatypeDefinitionString_maxLengthsMatcher extends BaseMatcher<DatatypeDefinitionString_maxLengthsMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static DatatypeDefinitionString_maxLengthsMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    DatatypeDefinitionString_maxLengthsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new DatatypeDefinitionString_maxLengthsMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_DATATYPEDEFINITIONSTRING = 0;
  
  private final static int POSITION_MAXLENGTH = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(DatatypeDefinitionString_maxLengthsMatcher.class);
  
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
  public DatatypeDefinitionString_maxLengthsMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public DatatypeDefinitionString_maxLengthsMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDatatypeDefinitionString the fixed value of pattern parameter datatypeDefinitionString, or null if not bound.
   * @param pMaxLength the fixed value of pattern parameter maxLength, or null if not bound.
   * @return matches represented as a DatatypeDefinitionString_maxLengthsMatch object.
   * 
   */
  public Collection<DatatypeDefinitionString_maxLengthsMatch> getAllMatches(final DatatypeDefinitionString pDatatypeDefinitionString, final BigInteger pMaxLength) {
    return rawGetAllMatches(new Object[]{pDatatypeDefinitionString, pMaxLength});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDatatypeDefinitionString the fixed value of pattern parameter datatypeDefinitionString, or null if not bound.
   * @param pMaxLength the fixed value of pattern parameter maxLength, or null if not bound.
   * @return a match represented as a DatatypeDefinitionString_maxLengthsMatch object, or null if no match is found.
   * 
   */
  public DatatypeDefinitionString_maxLengthsMatch getOneArbitraryMatch(final DatatypeDefinitionString pDatatypeDefinitionString, final BigInteger pMaxLength) {
    return rawGetOneArbitraryMatch(new Object[]{pDatatypeDefinitionString, pMaxLength});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pDatatypeDefinitionString the fixed value of pattern parameter datatypeDefinitionString, or null if not bound.
   * @param pMaxLength the fixed value of pattern parameter maxLength, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final DatatypeDefinitionString pDatatypeDefinitionString, final BigInteger pMaxLength) {
    return rawHasMatch(new Object[]{pDatatypeDefinitionString, pMaxLength});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDatatypeDefinitionString the fixed value of pattern parameter datatypeDefinitionString, or null if not bound.
   * @param pMaxLength the fixed value of pattern parameter maxLength, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final DatatypeDefinitionString pDatatypeDefinitionString, final BigInteger pMaxLength) {
    return rawCountMatches(new Object[]{pDatatypeDefinitionString, pMaxLength});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pDatatypeDefinitionString the fixed value of pattern parameter datatypeDefinitionString, or null if not bound.
   * @param pMaxLength the fixed value of pattern parameter maxLength, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final DatatypeDefinitionString pDatatypeDefinitionString, final BigInteger pMaxLength, final IMatchProcessor<? super DatatypeDefinitionString_maxLengthsMatch> processor) {
    rawForEachMatch(new Object[]{pDatatypeDefinitionString, pMaxLength}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDatatypeDefinitionString the fixed value of pattern parameter datatypeDefinitionString, or null if not bound.
   * @param pMaxLength the fixed value of pattern parameter maxLength, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final DatatypeDefinitionString pDatatypeDefinitionString, final BigInteger pMaxLength, final IMatchProcessor<? super DatatypeDefinitionString_maxLengthsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pDatatypeDefinitionString, pMaxLength}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDatatypeDefinitionString the fixed value of pattern parameter datatypeDefinitionString, or null if not bound.
   * @param pMaxLength the fixed value of pattern parameter maxLength, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public DatatypeDefinitionString_maxLengthsMatch newMatch(final DatatypeDefinitionString pDatatypeDefinitionString, final BigInteger pMaxLength) {
    return DatatypeDefinitionString_maxLengthsMatch.newMatch(pDatatypeDefinitionString, pMaxLength);
  }
  
  /**
   * Retrieve the set of values that occur in matches for datatypeDefinitionString.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DatatypeDefinitionString> rawAccumulateAllValuesOfdatatypeDefinitionString(final Object[] parameters) {
    Set<DatatypeDefinitionString> results = new HashSet<DatatypeDefinitionString>();
    rawAccumulateAllValues(POSITION_DATATYPEDEFINITIONSTRING, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for datatypeDefinitionString.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DatatypeDefinitionString> getAllValuesOfdatatypeDefinitionString() {
    return rawAccumulateAllValuesOfdatatypeDefinitionString(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for datatypeDefinitionString.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DatatypeDefinitionString> getAllValuesOfdatatypeDefinitionString(final DatatypeDefinitionString_maxLengthsMatch partialMatch) {
    return rawAccumulateAllValuesOfdatatypeDefinitionString(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for datatypeDefinitionString.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DatatypeDefinitionString> getAllValuesOfdatatypeDefinitionString(final BigInteger pMaxLength) {
    return rawAccumulateAllValuesOfdatatypeDefinitionString(new Object[]{
    null, 
    pMaxLength
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for maxLength.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<BigInteger> rawAccumulateAllValuesOfmaxLength(final Object[] parameters) {
    Set<BigInteger> results = new HashSet<BigInteger>();
    rawAccumulateAllValues(POSITION_MAXLENGTH, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for maxLength.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<BigInteger> getAllValuesOfmaxLength() {
    return rawAccumulateAllValuesOfmaxLength(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for maxLength.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<BigInteger> getAllValuesOfmaxLength(final DatatypeDefinitionString_maxLengthsMatch partialMatch) {
    return rawAccumulateAllValuesOfmaxLength(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for maxLength.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<BigInteger> getAllValuesOfmaxLength(final DatatypeDefinitionString pDatatypeDefinitionString) {
    return rawAccumulateAllValuesOfmaxLength(new Object[]{
    pDatatypeDefinitionString, 
    null
    });
  }
  
  @Override
  protected DatatypeDefinitionString_maxLengthsMatch tupleToMatch(final Tuple t) {
    try {
    	return DatatypeDefinitionString_maxLengthsMatch.newMatch((org.eclipse.rmf.reqif10.DatatypeDefinitionString) t.get(POSITION_DATATYPEDEFINITIONSTRING), (java.math.BigInteger) t.get(POSITION_MAXLENGTH));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected DatatypeDefinitionString_maxLengthsMatch arrayToMatch(final Object[] match) {
    try {
    	return DatatypeDefinitionString_maxLengthsMatch.newMatch((org.eclipse.rmf.reqif10.DatatypeDefinitionString) match[POSITION_DATATYPEDEFINITIONSTRING], (java.math.BigInteger) match[POSITION_MAXLENGTH]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected DatatypeDefinitionString_maxLengthsMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return DatatypeDefinitionString_maxLengthsMatch.newMutableMatch((org.eclipse.rmf.reqif10.DatatypeDefinitionString) match[POSITION_DATATYPEDEFINITIONSTRING], (java.math.BigInteger) match[POSITION_MAXLENGTH]);
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
  public static IQuerySpecification<DatatypeDefinitionString_maxLengthsMatcher> querySpecification() throws IncQueryException {
    return DatatypeDefinitionString_maxLengthsQuerySpecification.instance();
  }
}
