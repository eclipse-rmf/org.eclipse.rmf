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
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.incquery.SpecRelationsMatch;
import org.eclipse.rmf.reqif10.incquery.util.SpecRelationsQuerySpecification;

/**
 * Generated pattern matcher API of the org.eclipse.rmf.reqif10.incquery.specRelations pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SpecRelationsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern specRelations(specRelation : SpecRelation, source : SpecObject, target : SpecObject) {
 * 	SpecRelation.source(specRelation, source);
 * 	SpecRelation.target(specRelation, target);
 * }
 * </pre></code>
 * 
 * @see SpecRelationsMatch
 * @see SpecRelationsProcessor
 * @see SpecRelationsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SpecRelationsMatcher extends BaseMatcher<SpecRelationsMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SpecRelationsMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SpecRelationsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SpecRelationsMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SPECRELATION = 0;
  
  private final static int POSITION_SOURCE = 1;
  
  private final static int POSITION_TARGET = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SpecRelationsMatcher.class);
  
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
  public SpecRelationsMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SpecRelationsMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSpecRelation the fixed value of pattern parameter specRelation, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return matches represented as a SpecRelationsMatch object.
   * 
   */
  public Collection<SpecRelationsMatch> getAllMatches(final SpecRelation pSpecRelation, final SpecObject pSource, final SpecObject pTarget) {
    return rawGetAllMatches(new Object[]{pSpecRelation, pSource, pTarget});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSpecRelation the fixed value of pattern parameter specRelation, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return a match represented as a SpecRelationsMatch object, or null if no match is found.
   * 
   */
  public SpecRelationsMatch getOneArbitraryMatch(final SpecRelation pSpecRelation, final SpecObject pSource, final SpecObject pTarget) {
    return rawGetOneArbitraryMatch(new Object[]{pSpecRelation, pSource, pTarget});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSpecRelation the fixed value of pattern parameter specRelation, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SpecRelation pSpecRelation, final SpecObject pSource, final SpecObject pTarget) {
    return rawHasMatch(new Object[]{pSpecRelation, pSource, pTarget});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSpecRelation the fixed value of pattern parameter specRelation, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SpecRelation pSpecRelation, final SpecObject pSource, final SpecObject pTarget) {
    return rawCountMatches(new Object[]{pSpecRelation, pSource, pTarget});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSpecRelation the fixed value of pattern parameter specRelation, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SpecRelation pSpecRelation, final SpecObject pSource, final SpecObject pTarget, final IMatchProcessor<? super SpecRelationsMatch> processor) {
    rawForEachMatch(new Object[]{pSpecRelation, pSource, pTarget}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSpecRelation the fixed value of pattern parameter specRelation, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SpecRelation pSpecRelation, final SpecObject pSource, final SpecObject pTarget, final IMatchProcessor<? super SpecRelationsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSpecRelation, pSource, pTarget}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSpecRelation the fixed value of pattern parameter specRelation, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SpecRelationsMatch newMatch(final SpecRelation pSpecRelation, final SpecObject pSource, final SpecObject pTarget) {
    return SpecRelationsMatch.newMatch(pSpecRelation, pSource, pTarget);
  }
  
  /**
   * Retrieve the set of values that occur in matches for specRelation.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<SpecRelation> rawAccumulateAllValuesOfspecRelation(final Object[] parameters) {
    Set<SpecRelation> results = new HashSet<SpecRelation>();
    rawAccumulateAllValues(POSITION_SPECRELATION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for specRelation.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SpecRelation> getAllValuesOfspecRelation() {
    return rawAccumulateAllValuesOfspecRelation(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for specRelation.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SpecRelation> getAllValuesOfspecRelation(final SpecRelationsMatch partialMatch) {
    return rawAccumulateAllValuesOfspecRelation(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for specRelation.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SpecRelation> getAllValuesOfspecRelation(final SpecObject pSource, final SpecObject pTarget) {
    return rawAccumulateAllValuesOfspecRelation(new Object[]{
    null, 
    pSource, 
    pTarget
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for source.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<SpecObject> rawAccumulateAllValuesOfsource(final Object[] parameters) {
    Set<SpecObject> results = new HashSet<SpecObject>();
    rawAccumulateAllValues(POSITION_SOURCE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for source.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SpecObject> getAllValuesOfsource() {
    return rawAccumulateAllValuesOfsource(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for source.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SpecObject> getAllValuesOfsource(final SpecRelationsMatch partialMatch) {
    return rawAccumulateAllValuesOfsource(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for source.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SpecObject> getAllValuesOfsource(final SpecRelation pSpecRelation, final SpecObject pTarget) {
    return rawAccumulateAllValuesOfsource(new Object[]{
    pSpecRelation, 
    null, 
    pTarget
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<SpecObject> rawAccumulateAllValuesOftarget(final Object[] parameters) {
    Set<SpecObject> results = new HashSet<SpecObject>();
    rawAccumulateAllValues(POSITION_TARGET, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SpecObject> getAllValuesOftarget() {
    return rawAccumulateAllValuesOftarget(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SpecObject> getAllValuesOftarget(final SpecRelationsMatch partialMatch) {
    return rawAccumulateAllValuesOftarget(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SpecObject> getAllValuesOftarget(final SpecRelation pSpecRelation, final SpecObject pSource) {
    return rawAccumulateAllValuesOftarget(new Object[]{
    pSpecRelation, 
    pSource, 
    null
    });
  }
  
  @Override
  protected SpecRelationsMatch tupleToMatch(final Tuple t) {
    try {
    	return SpecRelationsMatch.newMatch((org.eclipse.rmf.reqif10.SpecRelation) t.get(POSITION_SPECRELATION), (org.eclipse.rmf.reqif10.SpecObject) t.get(POSITION_SOURCE), (org.eclipse.rmf.reqif10.SpecObject) t.get(POSITION_TARGET));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SpecRelationsMatch arrayToMatch(final Object[] match) {
    try {
    	return SpecRelationsMatch.newMatch((org.eclipse.rmf.reqif10.SpecRelation) match[POSITION_SPECRELATION], (org.eclipse.rmf.reqif10.SpecObject) match[POSITION_SOURCE], (org.eclipse.rmf.reqif10.SpecObject) match[POSITION_TARGET]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SpecRelationsMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SpecRelationsMatch.newMutableMatch((org.eclipse.rmf.reqif10.SpecRelation) match[POSITION_SPECRELATION], (org.eclipse.rmf.reqif10.SpecObject) match[POSITION_SOURCE], (org.eclipse.rmf.reqif10.SpecObject) match[POSITION_TARGET]);
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
  public static IQuerySpecification<SpecRelationsMatcher> querySpecification() throws IncQueryException {
    return SpecRelationsQuerySpecification.instance();
  }
}
