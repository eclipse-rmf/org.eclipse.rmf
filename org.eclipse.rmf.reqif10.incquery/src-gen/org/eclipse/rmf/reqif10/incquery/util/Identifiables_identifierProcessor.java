package org.eclipse.rmf.reqif10.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.incquery.Identifiables_identifierMatch;

/**
 * A match processor tailored for the org.eclipse.rmf.reqif10.incquery.identifiables_identifier pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Identifiables_identifierProcessor implements IMatchProcessor<Identifiables_identifierMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pIdentifiable the value of pattern parameter identifiable in the currently processed match
   * @param pIdentifier the value of pattern parameter identifier in the currently processed match
   * 
   */
  public abstract void process(final Identifiable pIdentifiable, final String pIdentifier);
  
  @Override
  public void process(final Identifiables_identifierMatch match) {
    process(match.getIdentifiable(), match.getIdentifier());
  }
}
