package org.eclipse.rmf.reqif10.incquery;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.incquery.util.IdentifiablesQuerySpecification;

/**
 * Pattern-specific match representation of the org.eclipse.rmf.reqif10.incquery.identifiables pattern,
 * to be used in conjunction with {@link IdentifiablesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see IdentifiablesMatcher
 * @see IdentifiablesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class IdentifiablesMatch extends BasePatternMatch {
  private Identifiable fIdentifiable;
  
  private static List<String> parameterNames = makeImmutableList("identifiable");
  
  private IdentifiablesMatch(final Identifiable pIdentifiable) {
    this.fIdentifiable = pIdentifiable;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("identifiable".equals(parameterName)) return this.fIdentifiable;
    return null;
  }
  
  public Identifiable getIdentifiable() {
    return this.fIdentifiable;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("identifiable".equals(parameterName) ) {
    	this.fIdentifiable = (org.eclipse.rmf.reqif10.Identifiable) newValue;
    	return true;
    }
    return false;
  }
  
  public void setIdentifiable(final Identifiable pIdentifiable) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fIdentifiable = pIdentifiable;
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.rmf.reqif10.incquery.identifiables";
  }
  
  @Override
  public List<String> parameterNames() {
    return IdentifiablesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fIdentifiable};
  }
  
  @Override
  public IdentifiablesMatch toImmutable() {
    return isMutable() ? newMatch(fIdentifiable) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"identifiable\"=" + prettyPrintValue(fIdentifiable)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fIdentifiable == null) ? 0 : fIdentifiable.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof IdentifiablesMatch)) { // this should be infrequent
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
    IdentifiablesMatch other = (IdentifiablesMatch) obj;
    if (fIdentifiable == null) {if (other.fIdentifiable != null) return false;}
    else if (!fIdentifiable.equals(other.fIdentifiable)) return false;
    return true;
  }
  
  @Override
  public IdentifiablesQuerySpecification specification() {
    try {
    	return IdentifiablesQuerySpecification.instance();
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
  public static IdentifiablesMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static IdentifiablesMatch newMutableMatch(final Identifiable pIdentifiable) {
    return new Mutable(pIdentifiable);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pIdentifiable the fixed value of pattern parameter identifiable, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static IdentifiablesMatch newMatch(final Identifiable pIdentifiable) {
    return new Immutable(pIdentifiable);
  }
  
  private static final class Mutable extends IdentifiablesMatch {
    Mutable(final Identifiable pIdentifiable) {
      super(pIdentifiable);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends IdentifiablesMatch {
    Immutable(final Identifiable pIdentifiable) {
      super(pIdentifiable);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
