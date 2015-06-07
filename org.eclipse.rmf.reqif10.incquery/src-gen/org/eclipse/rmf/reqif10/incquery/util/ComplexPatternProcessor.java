package org.eclipse.rmf.reqif10.incquery.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.incquery.ComplexPatternMatch;

/**
 * A match processor tailored for the org.eclipse.rmf.reqif10.incquery.complexPattern pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ComplexPatternProcessor implements IMatchProcessor<ComplexPatternMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSpecObject the value of pattern parameter specObject in the currently processed match
   * @param pValue the value of pattern parameter value in the currently processed match
   * 
   */
  public abstract void process(final SpecObject pSpecObject, final AttributeValue pValue);
  
  @Override
  public void process(final ComplexPatternMatch match) {
    process(match.getSpecObject(), match.getValue());
  }
}
