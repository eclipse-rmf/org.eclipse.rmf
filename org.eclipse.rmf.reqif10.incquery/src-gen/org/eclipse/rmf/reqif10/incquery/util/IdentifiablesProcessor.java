package org.eclipse.rmf.reqif10.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.incquery.IdentifiablesMatch;

/**
 * A match processor tailored for the org.eclipse.rmf.reqif10.incquery.identifiables pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class IdentifiablesProcessor implements IMatchProcessor<IdentifiablesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pIdentifiable the value of pattern parameter identifiable in the currently processed match
   * 
   */
  public abstract void process(final Identifiable pIdentifiable);
  
  @Override
  public void process(final IdentifiablesMatch match) {
    process(match.getIdentifiable());
  }
}
