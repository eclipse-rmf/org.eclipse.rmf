package org.eclipse.rmf.reqif10.incquery;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.incquery.util.DatatypeDefinitionString_maxLengthsQuerySpecification;

/**
 * Pattern-specific match representation of the org.eclipse.rmf.reqif10.incquery.datatypeDefinitionString_maxLengths pattern,
 * to be used in conjunction with {@link DatatypeDefinitionString_maxLengthsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see DatatypeDefinitionString_maxLengthsMatcher
 * @see DatatypeDefinitionString_maxLengthsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class DatatypeDefinitionString_maxLengthsMatch extends BasePatternMatch {
  private DatatypeDefinitionString fDatatypeDefinitionString;
  
  private BigInteger fMaxLength;
  
  private static List<String> parameterNames = makeImmutableList("datatypeDefinitionString", "maxLength");
  
  private DatatypeDefinitionString_maxLengthsMatch(final DatatypeDefinitionString pDatatypeDefinitionString, final BigInteger pMaxLength) {
    this.fDatatypeDefinitionString = pDatatypeDefinitionString;
    this.fMaxLength = pMaxLength;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("datatypeDefinitionString".equals(parameterName)) return this.fDatatypeDefinitionString;
    if ("maxLength".equals(parameterName)) return this.fMaxLength;
    return null;
  }
  
  public DatatypeDefinitionString getDatatypeDefinitionString() {
    return this.fDatatypeDefinitionString;
  }
  
  public BigInteger getMaxLength() {
    return this.fMaxLength;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("datatypeDefinitionString".equals(parameterName) ) {
    	this.fDatatypeDefinitionString = (org.eclipse.rmf.reqif10.DatatypeDefinitionString) newValue;
    	return true;
    }
    if ("maxLength".equals(parameterName) ) {
    	this.fMaxLength = (java.math.BigInteger) newValue;
    	return true;
    }
    return false;
  }
  
  public void setDatatypeDefinitionString(final DatatypeDefinitionString pDatatypeDefinitionString) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDatatypeDefinitionString = pDatatypeDefinitionString;
  }
  
  public void setMaxLength(final BigInteger pMaxLength) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMaxLength = pMaxLength;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.rmf.reqif10.incquery.datatypeDefinitionString_maxLengths";
  }
  
  @Override
  public List<String> parameterNames() {
    return DatatypeDefinitionString_maxLengthsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDatatypeDefinitionString, fMaxLength};
  }
  
  @Override
  public DatatypeDefinitionString_maxLengthsMatch toImmutable() {
    return isMutable() ? newMatch(fDatatypeDefinitionString, fMaxLength) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"datatypeDefinitionString\"=" + prettyPrintValue(fDatatypeDefinitionString) + ", ");
    
    result.append("\"maxLength\"=" + prettyPrintValue(fMaxLength)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDatatypeDefinitionString == null) ? 0 : fDatatypeDefinitionString.hashCode());
    result = prime * result + ((fMaxLength == null) ? 0 : fMaxLength.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof DatatypeDefinitionString_maxLengthsMatch)) { // this should be infrequent
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
    DatatypeDefinitionString_maxLengthsMatch other = (DatatypeDefinitionString_maxLengthsMatch) obj;
    if (fDatatypeDefinitionString == null) {if (other.fDatatypeDefinitionString != null) return false;}
    else if (!fDatatypeDefinitionString.equals(other.fDatatypeDefinitionString)) return false;
    if (fMaxLength == null) {if (other.fMaxLength != null) return false;}
    else if (!fMaxLength.equals(other.fMaxLength)) return false;
    return true;
  }
  
  @Override
  public DatatypeDefinitionString_maxLengthsQuerySpecification specification() {
    try {
    	return DatatypeDefinitionString_maxLengthsQuerySpecification.instance();
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
  public static DatatypeDefinitionString_maxLengthsMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDatatypeDefinitionString the fixed value of pattern parameter datatypeDefinitionString, or null if not bound.
   * @param pMaxLength the fixed value of pattern parameter maxLength, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static DatatypeDefinitionString_maxLengthsMatch newMutableMatch(final DatatypeDefinitionString pDatatypeDefinitionString, final BigInteger pMaxLength) {
    return new Mutable(pDatatypeDefinitionString, pMaxLength);
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
  public static DatatypeDefinitionString_maxLengthsMatch newMatch(final DatatypeDefinitionString pDatatypeDefinitionString, final BigInteger pMaxLength) {
    return new Immutable(pDatatypeDefinitionString, pMaxLength);
  }
  
  private static final class Mutable extends DatatypeDefinitionString_maxLengthsMatch {
    Mutable(final DatatypeDefinitionString pDatatypeDefinitionString, final BigInteger pMaxLength) {
      super(pDatatypeDefinitionString, pMaxLength);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends DatatypeDefinitionString_maxLengthsMatch {
    Immutable(final DatatypeDefinitionString pDatatypeDefinitionString, final BigInteger pMaxLength) {
      super(pDatatypeDefinitionString, pMaxLength);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
