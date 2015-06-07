package org.eclipse.rmf.reqif10.incquery;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.incquery.util.ReferenedOrReferencingSpecObjectsQuerySpecification;

/**
 * Pattern-specific match representation of the org.eclipse.rmf.reqif10.incquery.referenedOrReferencingSpecObjects pattern,
 * to be used in conjunction with {@link ReferenedOrReferencingSpecObjectsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ReferenedOrReferencingSpecObjectsMatcher
 * @see ReferenedOrReferencingSpecObjectsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ReferenedOrReferencingSpecObjectsMatch extends BasePatternMatch {
  private SpecObject fSpecObject;
  
  private static List<String> parameterNames = makeImmutableList("specObject");
  
  private ReferenedOrReferencingSpecObjectsMatch(final SpecObject pSpecObject) {
    this.fSpecObject = pSpecObject;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("specObject".equals(parameterName)) return this.fSpecObject;
    return null;
  }
  
  public SpecObject getSpecObject() {
    return this.fSpecObject;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("specObject".equals(parameterName) ) {
    	this.fSpecObject = (org.eclipse.rmf.reqif10.SpecObject) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSpecObject(final SpecObject pSpecObject) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSpecObject = pSpecObject;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.rmf.reqif10.incquery.referenedOrReferencingSpecObjects";
  }
  
  @Override
  public List<String> parameterNames() {
    return ReferenedOrReferencingSpecObjectsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSpecObject};
  }
  
  @Override
  public ReferenedOrReferencingSpecObjectsMatch toImmutable() {
    return isMutable() ? newMatch(fSpecObject) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"specObject\"=" + prettyPrintValue(fSpecObject)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSpecObject == null) ? 0 : fSpecObject.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ReferenedOrReferencingSpecObjectsMatch)) { // this should be infrequent
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
    ReferenedOrReferencingSpecObjectsMatch other = (ReferenedOrReferencingSpecObjectsMatch) obj;
    if (fSpecObject == null) {if (other.fSpecObject != null) return false;}
    else if (!fSpecObject.equals(other.fSpecObject)) return false;
    return true;
  }
  
  @Override
  public ReferenedOrReferencingSpecObjectsQuerySpecification specification() {
    try {
    	return ReferenedOrReferencingSpecObjectsQuerySpecification.instance();
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
  public static ReferenedOrReferencingSpecObjectsMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSpecObject the fixed value of pattern parameter specObject, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ReferenedOrReferencingSpecObjectsMatch newMutableMatch(final SpecObject pSpecObject) {
    return new Mutable(pSpecObject);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSpecObject the fixed value of pattern parameter specObject, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ReferenedOrReferencingSpecObjectsMatch newMatch(final SpecObject pSpecObject) {
    return new Immutable(pSpecObject);
  }
  
  private static final class Mutable extends ReferenedOrReferencingSpecObjectsMatch {
    Mutable(final SpecObject pSpecObject) {
      super(pSpecObject);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ReferenedOrReferencingSpecObjectsMatch {
    Immutable(final SpecObject pSpecObject) {
      super(pSpecObject);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
