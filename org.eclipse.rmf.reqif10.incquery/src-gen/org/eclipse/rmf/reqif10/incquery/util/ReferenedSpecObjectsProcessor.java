package org.eclipse.rmf.reqif10.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.incquery.ReferenedSpecObjectsMatch;

/**
 * A match processor tailored for the org.eclipse.rmf.reqif10.incquery.referenedSpecObjects pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ReferenedSpecObjectsProcessor implements IMatchProcessor<ReferenedSpecObjectsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSpecObject the value of pattern parameter specObject in the currently processed match
   * 
   */
  public abstract void process(final SpecObject pSpecObject);
  
  @Override
  public void process(final ReferenedSpecObjectsMatch match) {
    process(match.getSpecObject());
  }
}
