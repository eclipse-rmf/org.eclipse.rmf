package org.eclipse.rmf.reqif10.incquery;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.incquery.util.SpecRelationsQuerySpecification;

/**
 * Pattern-specific match representation of the org.eclipse.rmf.reqif10.incquery.specRelations pattern,
 * to be used in conjunction with {@link SpecRelationsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SpecRelationsMatcher
 * @see SpecRelationsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SpecRelationsMatch extends BasePatternMatch {
  private SpecRelation fSpecRelation;
  
  private SpecObject fSource;
  
  private SpecObject fTarget;
  
  private static List<String> parameterNames = makeImmutableList("specRelation", "source", "target");
  
  private SpecRelationsMatch(final SpecRelation pSpecRelation, final SpecObject pSource, final SpecObject pTarget) {
    this.fSpecRelation = pSpecRelation;
    this.fSource = pSource;
    this.fTarget = pTarget;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("specRelation".equals(parameterName)) return this.fSpecRelation;
    if ("source".equals(parameterName)) return this.fSource;
    if ("target".equals(parameterName)) return this.fTarget;
    return null;
  }
  
  public SpecRelation getSpecRelation() {
    return this.fSpecRelation;
  }
  
  public SpecObject getSource() {
    return this.fSource;
  }
  
  public SpecObject getTarget() {
    return this.fTarget;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("specRelation".equals(parameterName) ) {
    	this.fSpecRelation = (org.eclipse.rmf.reqif10.SpecRelation) newValue;
    	return true;
    }
    if ("source".equals(parameterName) ) {
    	this.fSource = (org.eclipse.rmf.reqif10.SpecObject) newValue;
    	return true;
    }
    if ("target".equals(parameterName) ) {
    	this.fTarget = (org.eclipse.rmf.reqif10.SpecObject) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSpecRelation(final SpecRelation pSpecRelation) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSpecRelation = pSpecRelation;
  }
  
  public void setSource(final SpecObject pSource) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSource = pSource;
  }
  
  public void setTarget(final SpecObject pTarget) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTarget = pTarget;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.rmf.reqif10.incquery.specRelations";
  }
  
  @Override
  public List<String> parameterNames() {
    return SpecRelationsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSpecRelation, fSource, fTarget};
  }
  
  @Override
  public SpecRelationsMatch toImmutable() {
    return isMutable() ? newMatch(fSpecRelation, fSource, fTarget) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"specRelation\"=" + prettyPrintValue(fSpecRelation) + ", ");
    
    result.append("\"source\"=" + prettyPrintValue(fSource) + ", ");
    
    result.append("\"target\"=" + prettyPrintValue(fTarget)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSpecRelation == null) ? 0 : fSpecRelation.hashCode());
    result = prime * result + ((fSource == null) ? 0 : fSource.hashCode());
    result = prime * result + ((fTarget == null) ? 0 : fTarget.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SpecRelationsMatch)) { // this should be infrequent
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
    SpecRelationsMatch other = (SpecRelationsMatch) obj;
    if (fSpecRelation == null) {if (other.fSpecRelation != null) return false;}
    else if (!fSpecRelation.equals(other.fSpecRelation)) return false;
    if (fSource == null) {if (other.fSource != null) return false;}
    else if (!fSource.equals(other.fSource)) return false;
    if (fTarget == null) {if (other.fTarget != null) return false;}
    else if (!fTarget.equals(other.fTarget)) return false;
    return true;
  }
  
  @Override
  public SpecRelationsQuerySpecification specification() {
    try {
    	return SpecRelationsQuerySpecification.instance();
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
  public static SpecRelationsMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSpecRelation the fixed value of pattern parameter specRelation, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SpecRelationsMatch newMutableMatch(final SpecRelation pSpecRelation, final SpecObject pSource, final SpecObject pTarget) {
    return new Mutable(pSpecRelation, pSource, pTarget);
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
  public static SpecRelationsMatch newMatch(final SpecRelation pSpecRelation, final SpecObject pSource, final SpecObject pTarget) {
    return new Immutable(pSpecRelation, pSource, pTarget);
  }
  
  private static final class Mutable extends SpecRelationsMatch {
    Mutable(final SpecRelation pSpecRelation, final SpecObject pSource, final SpecObject pTarget) {
      super(pSpecRelation, pSource, pTarget);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SpecRelationsMatch {
    Immutable(final SpecRelation pSpecRelation, final SpecObject pSource, final SpecObject pTarget) {
      super(pSpecRelation, pSource, pTarget);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
