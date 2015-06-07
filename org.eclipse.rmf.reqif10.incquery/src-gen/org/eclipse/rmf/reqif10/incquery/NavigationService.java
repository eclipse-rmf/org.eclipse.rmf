package org.eclipse.rmf.reqif10.incquery;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.rmf.reqif10.incquery.ComplexPatternMatcher;
import org.eclipse.rmf.reqif10.incquery.DatatypeDefinitionString_maxLengthsMatcher;
import org.eclipse.rmf.reqif10.incquery.DatatypeDefinitionStringsMatcher;
import org.eclipse.rmf.reqif10.incquery.IdentifiablesMatcher;
import org.eclipse.rmf.reqif10.incquery.Identifiables_identifierMatcher;
import org.eclipse.rmf.reqif10.incquery.ReferenedOrReferencingSpecObjectsMatcher;
import org.eclipse.rmf.reqif10.incquery.ReferenedSpecObjectsMatcher;
import org.eclipse.rmf.reqif10.incquery.RelationGroupsMatcher;
import org.eclipse.rmf.reqif10.incquery.SpecRelationsMatcher;
import org.eclipse.rmf.reqif10.incquery.util.ComplexPatternQuerySpecification;
import org.eclipse.rmf.reqif10.incquery.util.DatatypeDefinitionString_maxLengthsQuerySpecification;
import org.eclipse.rmf.reqif10.incquery.util.DatatypeDefinitionStringsQuerySpecification;
import org.eclipse.rmf.reqif10.incquery.util.IdentifiablesQuerySpecification;
import org.eclipse.rmf.reqif10.incquery.util.Identifiables_identifierQuerySpecification;
import org.eclipse.rmf.reqif10.incquery.util.ReferenedOrReferencingSpecObjectsQuerySpecification;
import org.eclipse.rmf.reqif10.incquery.util.ReferenedSpecObjectsQuerySpecification;
import org.eclipse.rmf.reqif10.incquery.util.RelationGroupsQuerySpecification;
import org.eclipse.rmf.reqif10.incquery.util.SpecRelationsQuerySpecification;

/**
 * A pattern group formed of all patterns defined in NavigationService.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file NavigationService.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.eclipse.rmf.reqif10.incquery, the group contains the definition of the following patterns: <ul>
 * <li>datatypeDefinitionStrings</li>
 * <li>datatypeDefinitionString_maxLengths</li>
 * <li>identifiables</li>
 * <li>identifiables_identifier</li>
 * <li>referenedSpecObjects</li>
 * <li>referenedOrReferencingSpecObjects</li>
 * <li>specRelations</li>
 * <li>relationGroups</li>
 * <li>complexPattern</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class NavigationService extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static NavigationService instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new NavigationService();
    }
    return INSTANCE;
  }
  
  private static NavigationService INSTANCE;
  
  private NavigationService() throws IncQueryException {
    querySpecifications.add(DatatypeDefinitionStringsQuerySpecification.instance());
    querySpecifications.add(DatatypeDefinitionString_maxLengthsQuerySpecification.instance());
    querySpecifications.add(IdentifiablesQuerySpecification.instance());
    querySpecifications.add(Identifiables_identifierQuerySpecification.instance());
    querySpecifications.add(ReferenedSpecObjectsQuerySpecification.instance());
    querySpecifications.add(ReferenedOrReferencingSpecObjectsQuerySpecification.instance());
    querySpecifications.add(SpecRelationsQuerySpecification.instance());
    querySpecifications.add(RelationGroupsQuerySpecification.instance());
    querySpecifications.add(ComplexPatternQuerySpecification.instance());
  }
  
  public DatatypeDefinitionStringsQuerySpecification getDatatypeDefinitionStrings() throws IncQueryException {
    return DatatypeDefinitionStringsQuerySpecification.instance();
  }
  
  public DatatypeDefinitionStringsMatcher getDatatypeDefinitionStrings(final IncQueryEngine engine) throws IncQueryException {
    return DatatypeDefinitionStringsMatcher.on(engine);
  }
  
  public DatatypeDefinitionString_maxLengthsQuerySpecification getDatatypeDefinitionString_maxLengths() throws IncQueryException {
    return DatatypeDefinitionString_maxLengthsQuerySpecification.instance();
  }
  
  public DatatypeDefinitionString_maxLengthsMatcher getDatatypeDefinitionString_maxLengths(final IncQueryEngine engine) throws IncQueryException {
    return DatatypeDefinitionString_maxLengthsMatcher.on(engine);
  }
  
  public IdentifiablesQuerySpecification getIdentifiables() throws IncQueryException {
    return IdentifiablesQuerySpecification.instance();
  }
  
  public IdentifiablesMatcher getIdentifiables(final IncQueryEngine engine) throws IncQueryException {
    return IdentifiablesMatcher.on(engine);
  }
  
  public Identifiables_identifierQuerySpecification getIdentifiables_identifier() throws IncQueryException {
    return Identifiables_identifierQuerySpecification.instance();
  }
  
  public Identifiables_identifierMatcher getIdentifiables_identifier(final IncQueryEngine engine) throws IncQueryException {
    return Identifiables_identifierMatcher.on(engine);
  }
  
  public ReferenedSpecObjectsQuerySpecification getReferenedSpecObjects() throws IncQueryException {
    return ReferenedSpecObjectsQuerySpecification.instance();
  }
  
  public ReferenedSpecObjectsMatcher getReferenedSpecObjects(final IncQueryEngine engine) throws IncQueryException {
    return ReferenedSpecObjectsMatcher.on(engine);
  }
  
  public ReferenedOrReferencingSpecObjectsQuerySpecification getReferenedOrReferencingSpecObjects() throws IncQueryException {
    return ReferenedOrReferencingSpecObjectsQuerySpecification.instance();
  }
  
  public ReferenedOrReferencingSpecObjectsMatcher getReferenedOrReferencingSpecObjects(final IncQueryEngine engine) throws IncQueryException {
    return ReferenedOrReferencingSpecObjectsMatcher.on(engine);
  }
  
  public SpecRelationsQuerySpecification getSpecRelations() throws IncQueryException {
    return SpecRelationsQuerySpecification.instance();
  }
  
  public SpecRelationsMatcher getSpecRelations(final IncQueryEngine engine) throws IncQueryException {
    return SpecRelationsMatcher.on(engine);
  }
  
  public RelationGroupsQuerySpecification getRelationGroups() throws IncQueryException {
    return RelationGroupsQuerySpecification.instance();
  }
  
  public RelationGroupsMatcher getRelationGroups(final IncQueryEngine engine) throws IncQueryException {
    return RelationGroupsMatcher.on(engine);
  }
  
  public ComplexPatternQuerySpecification getComplexPattern() throws IncQueryException {
    return ComplexPatternQuerySpecification.instance();
  }
  
  public ComplexPatternMatcher getComplexPattern(final IncQueryEngine engine) throws IncQueryException {
    return ComplexPatternMatcher.on(engine);
  }
}
