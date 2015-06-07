package org.eclipse.rmf.reqif10.incquery;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.incquery.util.DatatypeDefinitionStringsQuerySpecification;

/**
 * Pattern-specific match representation of the org.eclipse.rmf.reqif10.incquery.datatypeDefinitionStrings pattern,
 * to be used in conjunction with {@link DatatypeDefinitionStringsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see DatatypeDefinitionStringsMatcher
 * @see DatatypeDefinitionStringsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class DatatypeDefinitionStringsMatch extends BasePatternMatch {
  private DatatypeDefinitionString fDatatypeDefinitionString;
  
  private static List<String> parameterNames = makeImmutableList("datatypeDefinitionString");
  
  private DatatypeDefinitionStringsMatch(final DatatypeDefinitionString pDatatypeDefinitionString) {
    this.fDatatypeDefinitionString = pDatatypeDefinitionString;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("datatypeDefinitionString".equals(parameterName)) return this.fDatatypeDefinitionString;
    return null;
  }
  
  public DatatypeDefinitionString getDatatypeDefinitionString() {
    return this.fDatatypeDefinitionString;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("datatypeDefinitionString".equals(parameterName) ) {
    	this.fDatatypeDefinitionString = (org.eclipse.rmf.reqif10.DatatypeDefinitionString) newValue;
    	return true;
    }
    return false;
  }
  
  public void setDatatypeDefinitionString(final DatatypeDefinitionString pDatatypeDefinitionString) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDatatypeDefinitionString = pDatatypeDefinitionString;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.rmf.reqif10.incquery.datatypeDefinitionStrings";
  }
  
  @Override
  public List<String> parameterNames() {
    return DatatypeDefinitionStringsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDatatypeDefinitionString};
  }
  
  @Override
  public DatatypeDefinitionStringsMatch toImmutable() {
    return isMutable() ? newMatch(fDatatypeDefinitionString) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"datatypeDefinitionString\"=" + prettyPrintValue(fDatatypeDefinitionString)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDatatypeDefinitionString == null) ? 0 : fDatatypeDefinitionString.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof DatatypeDefinitionStringsMatch)) { // this should be infrequent
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
    DatatypeDefinitionStringsMatch other = (DatatypeDefinitionStringsMatch) obj;
    if (fDatatypeDefinitionString == null) {if (other.fDatatypeDefinitionString != null) return false;}
    else if (!fDatatypeDefinitionString.equals(other.fDatatypeDefinitionString)) return false;
    return true;
  }
  
  @Override
  public DatatypeDefinitionStringsQuerySpecification specification() {
    try {
    	return DatatypeDefinitionStringsQuerySpecification.instance();
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
  public static DatatypeDefinitionStringsMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDatatypeDefinitionString the fixed value of pattern parameter datatypeDefinitionString, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static DatatypeDefinitionStringsMatch newMutableMatch(final DatatypeDefinitionString pDatatypeDefinitionString) {
    return new Mutable(pDatatypeDefinitionString);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDatatypeDefinitionString the fixed value of pattern parameter datatypeDefinitionString, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static DatatypeDefinitionStringsMatch newMatch(final DatatypeDefinitionString pDatatypeDefinitionString) {
    return new Immutable(pDatatypeDefinitionString);
  }
  
  private static final class Mutable extends DatatypeDefinitionStringsMatch {
    Mutable(final DatatypeDefinitionString pDatatypeDefinitionString) {
      super(pDatatypeDefinitionString);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends DatatypeDefinitionStringsMatch {
    Immutable(final DatatypeDefinitionString pDatatypeDefinitionString) {
      super(pDatatypeDefinitionString);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
