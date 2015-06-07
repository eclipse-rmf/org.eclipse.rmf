package org.eclipse.rmf.reqif10.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.rmf.reqif10.RelationGroup;
import org.eclipse.rmf.reqif10.incquery.RelationGroupsMatch;

/**
 * A match processor tailored for the org.eclipse.rmf.reqif10.incquery.relationGroups pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RelationGroupsProcessor implements IMatchProcessor<RelationGroupsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRelationGroup the value of pattern parameter relationGroup in the currently processed match
   * 
   */
  public abstract void process(final RelationGroup pRelationGroup);
  
  @Override
  public void process(final RelationGroupsMatch match) {
    process(match.getRelationGroup());
  }
}
