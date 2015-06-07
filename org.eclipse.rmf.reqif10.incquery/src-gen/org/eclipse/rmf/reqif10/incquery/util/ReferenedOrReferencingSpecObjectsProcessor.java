package org.eclipse.rmf.reqif10.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.incquery.ReferenedOrReferencingSpecObjectsMatch;

/**
 * A match processor tailored for the org.eclipse.rmf.reqif10.incquery.referenedOrReferencingSpecObjects pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ReferenedOrReferencingSpecObjectsProcessor implements IMatchProcessor<ReferenedOrReferencingSpecObjectsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSpecObject the value of pattern parameter specObject in the currently processed match
   * 
   */
  public abstract void process(final SpecObject pSpecObject);
  
  @Override
  public void process(final ReferenedOrReferencingSpecObjectsMatch match) {
    process(match.getSpecObject());
  }
}
