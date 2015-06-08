package org.eclipse.rmf.reqif10.ide.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.provider.ReqIFContentItemProvider;

public class ExtendedReqIFContentItemProvider extends ReqIFContentItemProvider {

	public ExtendedReqIFContentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) { 
	  super.getChildrenFeatures(object);
	  childrenFeatures.remove(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_OBJECTS);
	  //childrenFeatures.remove(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATION_GROUPS);
	  childrenFeatures.remove(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS);
	  childrenFeatures.remove(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES);
	  childrenFeatures.remove(ReqIF10Package.Literals.REQ_IF_CONTENT__DATATYPES);
	  childrenFeatures.remove(ReqIF10Package.Literals.REQ_IF_CONTENT__SPECIFICATIONS);
	  return childrenFeatures; 
	} 
	
	@Override
	public Collection<?> getChildren(Object object) {
	  List<Object> children = new ArrayList<Object>(super.getChildren(object));
	  children.add(adapterFactory.adapt(object, TransientSpecificationsItemProvider.class));
	  children.add(adapterFactory.adapt(object, TransientSpecRelationsItemProvider.class));
	  //children.add(adapterFactory.adapt(object, TransientSpecRelationGroupsItemProvider.class));
	  children.add(adapterFactory.adapt(object, TransientSpecObjectsItemProvider.class));
	  children.add(adapterFactory.adapt(object, TransientSpecTypesItemProvider.class));
	  children.add(adapterFactory.adapt(object, TransientDataTypesItemProvider.class));
	  return children;
	} 
	
	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection, int index) { 
	  return createWrappedCommand(super.createAddCommand(domain, owner, feature, collection, index), owner, feature);
	} 

	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection) {
	  return createWrappedCommand(super.createRemoveCommand(domain, owner, feature, collection), owner, feature);
	} 
	
	protected Command createWrappedCommand(Command command, final EObject owner, final EStructuralFeature feature) {
		  if (feature == ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_OBJECTS ||
				  feature == ReqIF10Package.Literals.REQ_IF_CONTENT__SPECIFICATIONS ||
				  feature == ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS ||
				  feature == ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES ||
				  feature == ReqIF10Package.Literals.REQ_IF_CONTENT__DATATYPES  /*||
				  feature == ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATION_GROUPS*/
				  ) {
		    return new CommandWrapper(command) {
		      @Override
		      public Collection<?> getAffectedObjects() {
		        Collection<?> affected = super.getAffectedObjects();
		        if (affected.contains(owner)) {
		        	if (feature == ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_OBJECTS) {
		        		affected = Collections.singleton(adapterFactory.adapt(owner, TransientSpecObjectsItemProvider.class)); 
		        	} else if (feature == ReqIF10Package.Literals.REQ_IF_CONTENT__SPECIFICATIONS) {
		        		affected = Collections.singleton(adapterFactory.adapt(owner, TransientSpecificationsItemProvider.class));
		        	} else if (feature == ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS) {
		        		affected = Collections.singleton(adapterFactory.adapt(owner, TransientSpecRelationsItemProvider.class));
		        	} else if (feature == ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES) {
		        		affected = Collections.singleton(adapterFactory.adapt(owner, TransientSpecTypesItemProvider.class));
		        	} else if (feature == ReqIF10Package.Literals.REQ_IF_CONTENT__DATATYPES) {
		        		affected = Collections.singleton(adapterFactory.adapt(owner, TransientDataTypesItemProvider.class));
		        	} else if (feature == ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATION_GROUPS) {
		        		// TODO;
		        	}
		        }
		        return affected;
		    }};
		  } return command; 
		}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		//updateChildren(notification);
		switch (notification.getFeatureID(ReqIFContent.class)) {
	    case ReqIF10Package.REQ_IF_CONTENT__SPEC_OBJECTS:
	    case ReqIF10Package.REQ_IF_CONTENT__SPECIFICATIONS:
	      
	    case ReqIF10Package.REQ_IF_CONTENT__DATATYPES:
		     
	    case ReqIF10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS:
		    
	    case ReqIF10Package.REQ_IF_CONTENT__SPEC_RELATIONS:
		     
	    case ReqIF10Package.REQ_IF_CONTENT__SPEC_TYPES:
		      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
		      return;
	  }
	}

	
	
}
