package org.eclipse.rmf.tests.reqif10.incquery;

import static org.junit.Assert.assertSame;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.scope.IncQueryScope;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.incquery.SpecRelationsMatch;
import org.eclipse.rmf.reqif10.incquery.SpecRelationsMatcher;
import org.eclipse.sphinx.emf.serialization.XMLPersistenceMappingResourceSetImpl;
import org.junit.Test;

public class NavigationServiceTest {

	@Test
	public void test() throws IOException {
		ResourceSet resourceSet = new XMLPersistenceMappingResourceSetImpl();
	    URI fileURI = URI.createPlatformPluginURI(Activator.getPlugin().getBundle()
				.getSymbolicName()
				+ "/resources/input/SpecsWithRelations20k.reqif", false);
		XMLResource resource = (XMLResource)resourceSet.getResource(fileURI, true);
		resource.load(null);
		resource.getEObject("not found");
		
		assertSame(1,resource.getContents().size());
		
		ReqIF reqIF = (ReqIF)resource.getContents().get(0) ;
		
		try {
			// get all matches of the pattern
			// initialization
			// phase 1: (managed) IncQueryEngine
			IncQueryScope incQueryScope = new EMFScope(reqIF) ;
			IncQueryEngine engine = IncQueryEngine.on(incQueryScope);
			
			// phase 2: the matcher itself
			SpecRelationsMatcher matcher = SpecRelationsMatcher.on(engine);
			
			for (SpecObject specObject : reqIF.getCoreContent().getSpecObjects()) {
				Collection<SpecRelationsMatch> incomingMatches = matcher.getAllMatches(null, null, specObject);
				int incomingCount = incomingMatches.size();
				
				Collection<SpecRelationsMatch> outgoingMatches = matcher.getAllMatches(null, specObject, null);
				int outgoingCount = outgoingMatches.size();
				
				if (specObject.getIdentifier().startsWith("RS_")) {
					System.out.println(specObject.getIdentifier() + "  incoming " + incomingCount + ", outgoing: " + outgoingCount);
				}
			}
			
			// get all matches of the pattern
			Collection<SpecRelationsMatch> matches = matcher.getAllMatches();

			System.out.println("Number of Matches: " + matches.size());
			// using a match processor
			/*
			matcher.forEachMatch(new EObjectProcessor() {
				@Override
				public void process(EObject o) {
					results.append("\tEObject: " + o.toString() + "\n");
				}
			});
			*/
		} catch (IncQueryException e) {
			e.printStackTrace();
		}
		
		
	}

}
