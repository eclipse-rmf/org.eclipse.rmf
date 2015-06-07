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
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.incquery.Identifiables_identifierMatch;
import org.eclipse.rmf.reqif10.incquery.util.Identifiables_identifierQuerySpecification;

/**
 * Generated pattern matcher API of the org.eclipse.rmf.reqif10.incquery.identifiables_identifier pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Identifiables_identifierMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern identifiables_identifier(identifiable : Identifiable, identifier) {
 * 	Identifiable.identifier(identifiable, identifier);
 * }
 * </pre></code>
 * 
 * @see Identifiables_identifierMatch
 * @see Identifiables_identifierProcessor
 * @see Identifiables_identifierQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Identifiables_identifierMatcher extends BaseMatcher<Identifiables_identifierMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Identifiables_identifierMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    Identifiables_identifierMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new Identifiables_identifierMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_IDENTIFIABLE = 0;
  
  private final static int POSITION_IDENTIFIER = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(Identifiables_identifierMatcher.class);
  
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
  public Identifiables_identifierMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public Identifiables_identifierMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
   * @param pIdentifier the fixed value of pattern parameter identifier, or null if not bound.
   * @return matches represented as a Identifiables_identifierMatch object.
   * 
   */
  public Collection<Identifiables_identifierMatch> getAllMatches(final Identifiable pIdentifiable, final String pIdentifier) {
    return rawGetAllMatches(new Object[]{pIdentifiable, pIdentifier});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
   * @param pIdentifier the fixed value of pattern parameter identifier, or null if not bound.
   * @return a match represented as a Identifiables_identifierMatch object, or null if no match is found.
   * 
   */
  public Identifiables_identifierMatch getOneArbitraryMatch(final Identifiable pIdentifiable, final String pIdentifier) {
    return rawGetOneArbitraryMatch(new Object[]{pIdentifiable, pIdentifier});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
   * @param pIdentifier the fixed value of pattern parameter identifier, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Identifiable pIdentifiable, final String pIdentifier) {
    return rawHasMatch(new Object[]{pIdentifiable, pIdentifier});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
   * @param pIdentifier the fixed value of pattern parameter identifier, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Identifiable pIdentifiable, final String pIdentifier) {
    return rawCountMatches(new Object[]{pIdentifiable, pIdentifier});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
   * @param pIdentifier the fixed value of pattern parameter identifier, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Identifiable pIdentifiable, final String pIdentifier, final IMatchProcessor<? super Identifiables_identifierMatch> processor) {
    rawForEachMatch(new Object[]{pIdentifiable, pIdentifier}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
   * @param pIdentifier the fixed value of pattern parameter identifier, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Identifiable pIdentifiable, final String pIdentifier, final IMatchProcessor<? super Identifiables_identifierMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pIdentifiable, pIdentifier}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
   * @param pIdentifier the fixed value of pattern parameter identifier, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Identifiables_identifierMatch newMatch(final Identifiable pIdentifiable, final String pIdentifier) {
    return Identifiables_identifierMatch.newMatch(pIdentifiable, pIdentifier);
  }
  
  /**
   * Retrieve the set of values that occur in matches for identifiable.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Identifiable> rawAccumulateAllValuesOfidentifiable(final Object[] parameters) {
    Set<Identifiable> results = new HashSet<Identifiable>();
    rawAccumulateAllValues(POSITION_IDENTIFIABLE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for identifiable.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Identifiable> getAllValuesOfidentifiable() {
    return rawAccumulateAllValuesOfidentifiable(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for identifiable.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Identifiable> getAllValuesOfidentifiable(final Identifiables_identifierMatch partialMatch) {
    return rawAccumulateAllValuesOfidentifiable(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for identifiable.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Identifiable> getAllValuesOfidentifiable(final String pIdentifier) {
    return rawAccumulateAllValuesOfidentifiable(new Object[]{
    null, 
    pIdentifier
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for identifier.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfidentifier(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_IDENTIFIER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for identifier.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfidentifier() {
    return rawAccumulateAllValuesOfidentifier(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for identifier.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfidentifier(final Identifiables_identifierMatch partialMatch) {
    return rawAccumulateAllValuesOfidentifier(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for identifier.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfidentifier(final Identifiable pIdentifiable) {
    return rawAccumulateAllValuesOfidentifier(new Object[]{
    pIdentifiable, 
    null
    });
  }
  
  @Override
  protected Identifiables_identifierMatch tupleToMatch(final Tuple t) {
    try {
    	return Identifiables_identifierMatch.newMatch((org.eclipse.rmf.reqif10.Identifiable) t.get(POSITION_IDENTIFIABLE), (java.lang.String) t.get(POSITION_IDENTIFIER));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Identifiables_identifierMatch arrayToMatch(final Object[] match) {
    try {
    	return Identifiables_identifierMatch.newMatch((org.eclipse.rmf.reqif10.Identifiable) match[POSITION_IDENTIFIABLE], (java.lang.String) match[POSITION_IDENTIFIER]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Identifiables_identifierMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return Identifiables_identifierMatch.newMutableMatch((org.eclipse.rmf.reqif10.Identifiable) match[POSITION_IDENTIFIABLE], (java.lang.String) match[POSITION_IDENTIFIER]);
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
  public static IQuerySpecification<Identifiables_identifierMatcher> querySpecification() throws IncQueryException {
    return Identifiables_identifierQuerySpecification.instance();
  }
}
