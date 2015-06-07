package org.eclipse.rmf.reqif10.incquery.util;

import java.math.BigInteger;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.incquery.DatatypeDefinitionString_maxLengthsMatch;

/**
 * A match processor tailored for the org.eclipse.rmf.reqif10.incquery.datatypeDefinitionString_maxLengths pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DatatypeDefinitionString_maxLengthsProcessor implements IMatchProcessor<DatatypeDefinitionString_maxLengthsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDatatypeDefinitionString the value of pattern parameter datatypeDefinitionString in the currently processed match
   * @param pMaxLength the value of pattern parameter maxLength in the currently processed match
   * 
   */
  public abstract void process(final DatatypeDefinitionString pDatatypeDefinitionString, final BigInteger pMaxLength);
  
  @Override
  public void process(final DatatypeDefinitionString_maxLengthsMatch match) {
    process(match.getDatatypeDefinitionString(), match.getMaxLength());
  }
}
