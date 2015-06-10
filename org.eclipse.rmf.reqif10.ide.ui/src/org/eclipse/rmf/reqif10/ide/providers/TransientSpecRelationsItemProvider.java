package org.eclipse.rmf.reqif10.ide.providers;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.StyledString.Style;
import org.eclipse.rmf.internal.reqif10.ide.ui.Activator;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.sphinx.emf.edit.TransientItemProvider;

public class TransientSpecRelationsItemProvider extends TransientItemProvider {
	
	

	public TransientSpecRelationsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	
	@Override
	public String getText(Object object) { 
	  return "Spec Relations (" + ((ReqIFContent)getParent(object)).getSpecRelations().size() + ")";//$NON-NLS-1$
	} 
	
	@Override
	public Object getStyledText(Object object) { 
	  return new StyledString(getText(object), Style.NO_STYLE);
	}
	
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) { 
	  if (childrenFeatures == null) {
	    super.getChildrenFeatures(object);
	    childrenFeatures.add(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS); 
	  }
	  return childrenFeatures; 
	} 
	
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) { 
	  super.collectNewChildDescriptors(newChildDescriptors, object);
	  newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS,ReqIF10Factory.eINSTANCE.createSpecRelation()));
	  System.out.println(newChildDescriptors.size());
	} 
	
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations, int operation, Collection<?> collection) { 
	  if (new AddCommand(domain, (EObject) owner, ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS, collection).canExecute()) {
	    return super.createDragAndDropCommand(domain, owner, location, operations, operation, collection); 
	  } 
	  return UnexecutableCommand.INSTANCE; 
	} 

	@Override
	public ResourceLocator getResourceLocator() { 
	  return Activator.INSTANCE;
	}
	
	@Override
	public Object getImage(Object object) {
		if (object != null) {
			return overlayImage(object, Activator.INSTANCE.getImage("full/obj16/TransientSpecRelations.png")); //$NON-NLS-1$
		}
		return null;
	}
}
