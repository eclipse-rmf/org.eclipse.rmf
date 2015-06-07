package org.eclipse.rmf.reqif10.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.incquery.SpecRelationsMatch;

/**
 * A match processor tailored for the org.eclipse.rmf.reqif10.incquery.specRelations pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SpecRelationsProcessor implements IMatchProcessor<SpecRelationsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSpecRelation the value of pattern parameter specRelation in the currently processed match
   * @param pSource the value of pattern parameter source in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * 
   */
  public abstract void process(final SpecRelation pSpecRelation, final SpecObject pSource, final SpecObject pTarget);
  
  @Override
  public void process(final SpecRelationsMatch match) {
    process(match.getSpecRelation(), match.getSource(), match.getTarget());
  }
}
