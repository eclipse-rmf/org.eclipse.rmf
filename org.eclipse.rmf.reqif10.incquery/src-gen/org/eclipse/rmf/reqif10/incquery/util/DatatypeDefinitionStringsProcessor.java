package org.eclipse.rmf.reqif10.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.incquery.DatatypeDefinitionStringsMatch;

/**
 * A match processor tailored for the org.eclipse.rmf.reqif10.incquery.datatypeDefinitionStrings pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DatatypeDefinitionStringsProcessor implements IMatchProcessor<DatatypeDefinitionStringsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDatatypeDefinitionString the value of pattern parameter datatypeDefinitionString in the currently processed match
   * 
   */
  public abstract void process(final DatatypeDefinitionString pDatatypeDefinitionString);
  
  @Override
  public void process(final DatatypeDefinitionStringsMatch match) {
    process(match.getDatatypeDefinitionString());
  }
}
