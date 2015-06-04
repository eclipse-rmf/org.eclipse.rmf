package org.eclipse.rmf.reqif10.ide.providers;

import org.eclipse.emf.ecore.EObject;

public class ChildWrapper {



		// private List<Object> children;
		private EObject object;

		public ChildWrapper(EObject object) {
			this.object = object;
		}

		public EObject getObject() {
			return object;
		}

	}




