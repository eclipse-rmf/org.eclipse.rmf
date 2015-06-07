package org.eclipse.rmf.reqif10.incquery;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.rmf.reqif10.RelationGroup;
import org.eclipse.rmf.reqif10.incquery.util.RelationGroupsQuerySpecification;

/**
 * Pattern-specific match representation of the org.eclipse.rmf.reqif10.incquery.relationGroups pattern,
 * to be used in conjunction with {@link RelationGroupsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RelationGroupsMatcher
 * @see RelationGroupsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class RelationGroupsMatch extends BasePatternMatch {
  private RelationGroup fRelationGroup;
  
  private static List<String> parameterNames = makeImmutableList("relationGroup");
  
  private RelationGroupsMatch(final RelationGroup pRelationGroup) {
    this.fRelationGroup = pRelationGroup;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("relationGroup".equals(parameterName)) return this.fRelationGroup;
    return null;
  }
  
  public RelationGroup getRelationGroup() {
    return this.fRelationGroup;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("relationGroup".equals(parameterName) ) {
    	this.fRelationGroup = (org.eclipse.rmf.reqif10.RelationGroup) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRelationGroup(final RelationGroup pRelationGroup) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRelationGroup = pRelationGroup;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.rmf.reqif10.incquery.relationGroups";
  }
  
  @Override
  public List<String> parameterNames() {
    return RelationGroupsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRelationGroup};
  }
  
  @Override
  public RelationGroupsMatch toImmutable() {
    return isMutable() ? newMatch(fRelationGroup) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"relationGroup\"=" + prettyPrintValue(fRelationGroup)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRelationGroup == null) ? 0 : fRelationGroup.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof RelationGroupsMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    RelationGroupsMatch other = (RelationGroupsMatch) obj;
    if (fRelationGroup == null) {if (other.fRelationGroup != null) return false;}
    else if (!fRelationGroup.equals(other.fRelationGroup)) return false;
    return true;
  }
  
  @Override
  public RelationGroupsQuerySpecification specification() {
    try {
    	return RelationGroupsQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static RelationGroupsMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRelationGroup the fixed value of pattern parameter relationGroup, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static RelationGroupsMatch newMutableMatch(final RelationGroup pRelationGroup) {
    return new Mutable(pRelationGroup);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRelationGroup the fixed value of pattern parameter relationGroup, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static RelationGroupsMatch newMatch(final RelationGroup pRelationGroup) {
    return new Immutable(pRelationGroup);
  }
  
  private static final class Mutable extends RelationGroupsMatch {
    Mutable(final RelationGroup pRelationGroup) {
      super(pRelationGroup);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends RelationGroupsMatch {
    Immutable(final RelationGroup pRelationGroup) {
      super(pRelationGroup);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
