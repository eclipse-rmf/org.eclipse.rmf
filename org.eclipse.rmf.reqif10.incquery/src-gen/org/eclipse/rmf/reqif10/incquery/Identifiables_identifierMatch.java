package org.eclipse.rmf.reqif10.incquery;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.incquery.util.Identifiables_identifierQuerySpecification;

/**
 * Pattern-specific match representation of the org.eclipse.rmf.reqif10.incquery.identifiables_identifier pattern,
 * to be used in conjunction with {@link Identifiables_identifierMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Identifiables_identifierMatcher
 * @see Identifiables_identifierProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Identifiables_identifierMatch extends BasePatternMatch {
  private Identifiable fIdentifiable;
  
  private String fIdentifier;
  
  private static List<String> parameterNames = makeImmutableList("identifiable", "identifier");
  
  private Identifiables_identifierMatch(final Identifiable pIdentifiable, final String pIdentifier) {
    this.fIdentifiable = pIdentifiable;
    this.fIdentifier = pIdentifier;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("identifiable".equals(parameterName)) return this.fIdentifiable;
    if ("identifier".equals(parameterName)) return this.fIdentifier;
    return null;
  }
  
  public Identifiable getIdentifiable() {
    return this.fIdentifiable;
  }
  
  public String getIdentifier() {
    return this.fIdentifier;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("identifiable".equals(parameterName) ) {
    	this.fIdentifiable = (org.eclipse.rmf.reqif10.Identifiable) newValue;
    	return true;
    }
    if ("identifier".equals(parameterName) ) {
    	this.fIdentifier = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setIdentifiable(final Identifiable pIdentifiable) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fIdentifiable = pIdentifiable;
  }
  
  public void setIdentifier(final String pIdentifier) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fIdentifier = pIdentifier;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.rmf.reqif10.incquery.identifiables_identifier";
  }
  
  @Override
  public List<String> parameterNames() {
    return Identifiables_identifierMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fIdentifiable, fIdentifier};
  }
  
  @Override
  public Identifiables_identifierMatch toImmutable() {
    return isMutable() ? newMatch(fIdentifiable, fIdentifier) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"identifiable\"=" + prettyPrintValue(fIdentifiable) + ", ");
    
    result.append("\"identifier\"=" + prettyPrintValue(fIdentifier)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fIdentifiable == null) ? 0 : fIdentifiable.hashCode());
    result = prime * result + ((fIdentifier == null) ? 0 : fIdentifier.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Identifiables_identifierMatch)) { // this should be infrequent
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
    Identifiables_identifierMatch other = (Identifiables_identifierMatch) obj;
    if (fIdentifiable == null) {if (other.fIdentifiable != null) return false;}
    else if (!fIdentifiable.equals(other.fIdentifiable)) return false;
    if (fIdentifier == null) {if (other.fIdentifier != null) return false;}
    else if (!fIdentifier.equals(other.fIdentifier)) return false;
    return true;
  }
  
  @Override
  public Identifiables_identifierQuerySpecification specification() {
    try {
    	return Identifiables_identifierQuerySpecification.instance();
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
  public static Identifiables_identifierMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
   * @param pIdentifier the fixed value of pattern parameter identifier, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Identifiables_identifierMatch newMutableMatch(final Identifiable pIdentifiable, final String pIdentifier) {
    return new Mutable(pIdentifiable, pIdentifier);
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
  public static Identifiables_identifierMatch newMatch(final Identifiable pIdentifiable, final String pIdentifier) {
    return new Immutable(pIdentifiable, pIdentifier);
  }
  
  private static final class Mutable extends Identifiables_identifierMatch {
    Mutable(final Identifiable pIdentifiable, final String pIdentifier) {
      super(pIdentifiable, pIdentifier);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Identifiables_identifierMatch {
    Immutable(final Identifiable pIdentifiable, final String pIdentifier) {
      super(pIdentifiable, pIdentifier);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
