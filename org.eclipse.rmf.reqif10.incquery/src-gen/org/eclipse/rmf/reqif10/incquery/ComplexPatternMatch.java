package org.eclipse.rmf.reqif10.incquery;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.incquery.util.ComplexPatternQuerySpecification;

/**
 * Pattern-specific match representation of the org.eclipse.rmf.reqif10.incquery.complexPattern pattern,
 * to be used in conjunction with {@link ComplexPatternMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ComplexPatternMatcher
 * @see ComplexPatternProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ComplexPatternMatch extends BasePatternMatch {
  private SpecObject fSpecObject;
  
  private AttributeValue fValue;
  
  private static List<String> parameterNames = makeImmutableList("specObject", "value");
  
  private ComplexPatternMatch(final SpecObject pSpecObject, final AttributeValue pValue) {
    this.fSpecObject = pSpecObject;
    this.fValue = pValue;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("specObject".equals(parameterName)) return this.fSpecObject;
    if ("value".equals(parameterName)) return this.fValue;
    return null;
  }
  
  public SpecObject getSpecObject() {
    return this.fSpecObject;
  }
  
  public AttributeValue getValue() {
    return this.fValue;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("specObject".equals(parameterName) ) {
    	this.fSpecObject = (org.eclipse.rmf.reqif10.SpecObject) newValue;
    	return true;
    }
    if ("value".equals(parameterName) ) {
    	this.fValue = (org.eclipse.rmf.reqif10.AttributeValue) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSpecObject(final SpecObject pSpecObject) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSpecObject = pSpecObject;
  }
  
  public void setValue(final AttributeValue pValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fValue = pValue;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.rmf.reqif10.incquery.complexPattern";
  }
  
  @Override
  public List<String> parameterNames() {
    return ComplexPatternMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSpecObject, fValue};
  }
  
  @Override
  public ComplexPatternMatch toImmutable() {
    return isMutable() ? newMatch(fSpecObject, fValue) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"specObject\"=" + prettyPrintValue(fSpecObject) + ", ");
    
    result.append("\"value\"=" + prettyPrintValue(fValue)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSpecObject == null) ? 0 : fSpecObject.hashCode());
    result = prime * result + ((fValue == null) ? 0 : fValue.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ComplexPatternMatch)) { // this should be infrequent
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
    ComplexPatternMatch other = (ComplexPatternMatch) obj;
    if (fSpecObject == null) {if (other.fSpecObject != null) return false;}
    else if (!fSpecObject.equals(other.fSpecObject)) return false;
    if (fValue == null) {if (other.fValue != null) return false;}
    else if (!fValue.equals(other.fValue)) return false;
    return true;
  }
  
  @Override
  public ComplexPatternQuerySpecification specification() {
    try {
    	return ComplexPatternQuerySpecification.instance();
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
  public static ComplexPatternMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSpecObject the fixed value of pattern parameter specObject, or null if not bound.
   * @param pValue the fixed value of pattern parameter value, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ComplexPatternMatch newMutableMatch(final SpecObject pSpecObject, final AttributeValue pValue) {
    return new Mutable(pSpecObject, pValue);
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
  public static ComplexPatternMatch newMatch(final SpecObject pSpecObject, final AttributeValue pValue) {
    return new Immutable(pSpecObject, pValue);
  }
  
  private static final class Mutable extends ComplexPatternMatch {
    Mutable(final SpecObject pSpecObject, final AttributeValue pValue) {
      super(pSpecObject, pValue);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ComplexPatternMatch {
    Immutable(final SpecObject pSpecObject, final AttributeValue pValue) {
      super(pSpecObject, pValue);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
