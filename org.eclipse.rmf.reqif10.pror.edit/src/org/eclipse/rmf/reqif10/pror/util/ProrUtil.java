/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.EMFEditPlugin;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ProrPresentationConfigurationItemProvider;
import org.eclipse.rmf.reqif10.pror.provider.SpecElementWithAttributesItemProvider;
import org.eclipse.rmf.reqif10.util.ReqIF10Switch;

/**
 * A Class full of tools for PorR-Programming. Note that you find more tools in
 * {@link ReqifUtil}, which are independent from ProR.
 * 
 * @author jastram
 * 
 */
public final class ProrUtil {

	/**
	 * This class is not designed to be instantiated.
	 */
	private ProrUtil() {
		throw new InstantiationError(
				"This class is not designed to be instantiated.");
	}

	/**
	 * Creates Properties for the attributes of the
	 * {@link SpecElementWithAttributes}. This essentially allows us to handle
	 * the Attributes from the associated {@link SpecType} as properties. This
	 * applies to four types of Objects (TODO not all are implemented yet):
	 * {@link SpecObject}, {@link SpecRelation}, {@link Specification} and
	 * SpecGroup.
	 * <p>
	 * As a notable piece of information, the AttributeDefinition's ID is kept
	 * in the descriptor's "description" field.
	 */
	public static void addAttributePropertyDescriptor(
			final SpecElementWithAttributes specElement,
			ItemProviderAdapter provider,
			List<IItemPropertyDescriptor> itemPropertyDescriptors) {

		SpecType type = ReqIF10Util.getSpecType(specElement);

		// No type - no additional descriptors
		if (type == null)
			return;

		// Add one descriptor per definition
		for (AttributeDefinition definition : type.getSpecAttributes()) {
			final String label = definition.getLongName() != null ? definition
					.getLongName() : "UNNAMED (" + definition.getIdentifier()
					+ ")";
			final String category = type.getLongName() != null ? type
					.getLongName() : "<UNNAMED TYPE>";

			IItemPropertyDescriptor descriptor = new ItemPropertyDescriptor(
					provider.getAdapterFactory(),
					label, // DisplayName
					definition.getIdentifier(), // Description
					ReqIF10Package.Literals.SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES,
					true, category);

			itemPropertyDescriptors.add(descriptor);

		}
	}

	/**
	 * Sets the value of the given {@link AttributeValue}. This helper method
	 * exists to work around the lack of inheritance in the
	 * {@link AttributeValue} setValue() infrastructure.
	 */
	public static void setTheValue(AttributeValue av, Object value,
			EditingDomain ed) {
		EStructuralFeature feature = ReqIF10Util.getTheValueFeature(av);
		Command cmd = SetCommand.create(ed, av, feature, value);
		ed.getCommandStack().execute(cmd);
	}

	/**
	 * Sets the value of the given {@link AttributeValue}. This helper method
	 * exists to work around the lack of inheritance in the
	 * {@link AttributeValue} setValue() infrastructure. In addition, it takes a
	 * {@link SpecHierarchy} as an argument that is being used as the affected
	 * object. And last, the value may not be connected to its parent, in which
	 * case this method takes care of that as well.
	 */
	public static void setTheValue(final AttributeValue av, Object value,
			SpecElementWithAttributes parent,
			final Object affectedObject, EditingDomain ed) {

		// The Command that sets the value
		EStructuralFeature feature = ReqIF10Util.getTheValueFeature(av);
		Command cmd = SetCommand.create(ed, av, feature, value);

		// If necessary, create a command to attach the value to its parent
		if (av.eContainer() == null) {
			Command setValueCmd = cmd;
			Command addValueToParentCmd = AddCommand
					.create(ed,
							parent,
							ReqIF10Package.Literals.SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES,
							av);
			cmd = new CompoundCommand();
			((CompoundCommand) cmd).append(addValueToParentCmd);
			((CompoundCommand) cmd).append(setValueCmd);
		}

		// Wrap it all, to get the correct affected objects.
		Command cmd2 = new CommandWrapper(cmd) {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			@Override
			public Collection<?> getAffectedObjects() {
				List list = new ArrayList();
				list.add(affectedObject);
				return list;
			}
		};

		ed.getCommandStack().execute(cmd2);
	}

	/**
	 * Sets the value on the given element, provided the value exists.
	 * 
	 * @param specObject
	 * @param definition
	 * @param value
	 * 
	 * @return true if the value was set, otherwise false.
	 */
	public static boolean setTheValue(SpecObject specObject,
			DatatypeDefinition definition, Object value,
			SpecElementWithAttributes parent, EditingDomain ed) {
		EList<AttributeValue> list = specObject.getValues();
		for (AttributeValue av : list) {
			if (definition.equals(ReqIF10Util.getDatatypeDefinition(av))) {
				ProrUtil.setTheValue(av, value, parent, specObject, ed);
				return true;
			}
		}
		return false;
	}

	/**
	 * Tries to retrieve the ItemProvider for the given object, using the
	 * {@link AdapterFactory}. May return null.
	 * 
	 * @return The AdpaterFactory for object or null if none found.
	 */
	public static ItemProviderAdapter getItemProvider(
			AdapterFactory adapterFactory, Object object) {
		// Workaround - we simply try to retrieve an IItemLabelProvider.
		return (ItemProviderAdapter) adapterFactory.adapt(object,
				IItemLabelProvider.class);
	}

	public static void visitAllSpecElementsWithAttributes(ReqIF reqif,
			ReqIF10Switch<?> visitor) {
		for (TreeIterator<Object> i = EcoreUtil.getAllContents(reqif, false); i
				.hasNext();) {
			Object obj = i.next();
			if (obj instanceof SpecElementWithAttributes) {
				visitor.doSwitch((EObject) obj);
			}
		}
	}

	/**
	 * Collects NewChildDescriptors for the creation of new Elements for
	 * SpecElements that are already typed. These should be hooked into the
	 * various methods of the ItemProviders for SpecObject, SpecHierarchy,
	 * Specification and SpecRelation.
	 * <p>
	 * 
	 * We provide the parent as the owner. This is either {@link ReqIfContent},
	 * but could also be a {@link Specification} or {@link SpecHierarchy}.
	 * <p>
	 * 
	 * As the feature we provide the actual feature for the data object.
	 * <p>
	 * 
	 * The value is a class derived from {@link SpecType} (e.g. SpecObjectType).
	 * <p>
	 * 
	 * These parameters will be handed to
	 * {@link #collectNewChildDescriptorsForTypeCreators(Collection, Object, EStructuralFeature, Class)}
	 * and eventually processed by
	 * {@link SpecElementWithAttributesItemProvider#createAddCommand()}.
	 * 
	 * @param newChildDescriptors
	 * @param object
	 */
	public static void collectNewChildDescriptorsForTypeCreators(
			Collection<Object> newChildDescriptors, Object object,
			EStructuralFeature feature, Class<?> specTypeClass) {

		// Add a Descriptor for each SpecType
		EList<SpecType> specTypes = ReqIF10Util.getReqIF(object)
				.getCoreContent().getSpecTypes();

		for (final SpecType specType : specTypes) {
			if (specTypeClass.isAssignableFrom(specType.getClass())) {
				newChildDescriptors.add(new CommandParameter(object, feature,
						specType));
			}
		}
	}

	/**
	 * Creates a command for adding a typed SpecElement. This should work no
	 * matter what the type is. A correct icon is provided. We return a
	 * {@link CompoundCommand}, so additional commands can be appended (e.g. for
	 * SpecHierarchies). The result index can be adjusted.
	 * <p>
	 * 
	 * @param parent
	 *            The parent of newSpecLement
	 * @param childFeature
	 *            The Feature for adding newSpecElement to parent
	 * @param newSpecElement
	 *            an instance of {@link SpecElementWithAttributes} that will be
	 *            typed.
	 * @param typeFeature
	 *            the feature for adding specType to newSpecElement
	 * @param specType
	 *            an instance of the specType to be used for newSpecElement
	 * @param index
	 *            The index for the position of newSpecElement under parent
	 * @param resultIndex
	 *            The index of the command to be used for affected Elements (the
	 *            resulting CompoundCommand already contains 3 commands)
	 * @param domain
	 *            the EditingDomain
	 * @param adapterFactory
	 *            the AdapterFactory
	 * @return
	 */
	public static CompoundCommand createAddTypedElementCommand(Object parent,
			EReference childFeature, Identifiable newSpecElement,
			EReference typeFeature, SpecType specType, int index,
			int resultIndex, EditingDomain domain, AdapterFactory adapterFactory) {

		ItemProviderAdapter newElementItemProvider = ProrUtil.getItemProvider(
				adapterFactory, newSpecElement);
		Object icon = newElementItemProvider.getImage(newSpecElement);

		final CompoundCommand cmd = createCompoundCommandWithAddIcon(icon,
				resultIndex);

		cmd.append(AddCommand.create(domain, parent, childFeature,
				newSpecElement, index));

		HashSet<SpecType> typeCollection = new HashSet<SpecType>();
		typeCollection.add((SpecType) specType);
		CommandParameter typeParameter = new CommandParameter(newSpecElement,
				typeFeature, typeCollection);

		// TODO doesn't feel right
		cmd.append(newElementItemProvider.createCommand(parent, domain,
				AddCommand.class, typeParameter));
		String name = newSpecElement.getClass().getSimpleName();
		name = name.length() > 4 ? name.substring(0, name.length() - 4) : name;
		cmd.setLabel(name + " (" + ((SpecType) specType).getLongName() + ")");

		return cmd;
	}

	/**
	 * Builds a CompoundCommand that has the given icon, with an overlay plus
	 * (+) to indicate that the command executes an addition.
	 * 
	 * @param icon
	 * @return
	 */
	public static CompoundCommandActionDelegate createCompoundCommandWithAddIcon(
			final Object icon, int resultIndex) {
		return new CompoundCommandActionDelegate(resultIndex) {
			@Override
			public Object getImage() {
				List<Object> images = new ArrayList<Object>();
				images.add(icon);
				images.add(EMFEditPlugin.INSTANCE
						.getImage("full/ovr16/CreateChild"));
				return new ComposedImage(images) {
					@Override
					public List<Point> getDrawPoints(Size size) {
						List<Point> result = super.getDrawPoints(size);
						result.get(1).x = size.width - 7;
						return result;
					}
				};
			}
		};
	}

	/**
	 * @param adapterFactory
	 * @return the handle drag and drop command from presentation plugin or null
	 *         if no plugin can handle the operation.
	 */
	public static Command getPresentationHandleDragAndDropCommand(
			EditingDomain domain, Object owner, float location, int operations,
			int operation, java.util.Collection<?> collection,
			AdapterFactory adapterFactory) {
		// See whether a Presentation feels responsible.
		Set<PresentationEditInterface> ips = ConfigurationUtil
				.getPresentationEditInterfaces(owner, adapterFactory);

		for (PresentationEditInterface ip : ips) {
			Command cmd = ip.handleDragAndDrop(collection, owner, domain,
					operation);
			if (cmd != null) {
				return cmd;
			}
		}
		return null;
	}

	/**
	 * This method creates the command for updating the {@link SpecType} of an
	 * {@link SpecElementWithUserDefinedAttributes}. It does <b>not</b> update
	 * the type itself; instead, it updates the values to match the type of the
	 * given specElement.
	 * <p>
	 * 
	 * Using this command from the ItemProviders allows a clean change of type
	 * and values via the CommandStack.
	 * <p>
	 * 
	 * BEHAVIOR: This command removes all non-matching values, but does not
	 * create new values. Therefore it may remove values, but never add values.
	 * <p>
	 * 
	 * WATCH OUT: This method may return a command that is empty, which in turn
	 * isn't executable by default.
	 * <p>
	 * 
	 * @return The Command that updates the Values
	 */
	public static CompoundCommand createValueAdjustCommand(
			EditingDomain domain, SpecElementWithAttributes specElement,
			Collection<AttributeDefinition> definitions) {

		// Find values that are not needed any more.
		HashSet<AttributeValue> existingObsoleteValues = new HashSet<AttributeValue>(
				specElement.getValues());

		// The list of types for the new values.
		Set<AttributeDefinition> newDefs = new HashSet<AttributeDefinition>(
				definitions);

		// A CompoundCommand for removing values
		CompoundCommand cmd = new CompoundCommand(
				"Updating Type (and associated Values)");

		// Iterate over the required attributes...
		outer: for (AttributeDefinition newDef : newDefs) {
			// ... and check for each whether it already exists:
			for (AttributeValue value : specElement.getValues()) {
				AttributeDefinition def = ReqIF10Util
						.getAttributeDefinition(value);
				if (def != null && def.equals(newDef)) {
					// It does: Continue the outer loop
					existingObsoleteValues.remove(value);
					continue outer;
				}
			}
		}
		// If there are any values left, we need to remove them
		for (AttributeValue value : existingObsoleteValues) {
			cmd.append(RemoveCommand
					.create(domain,
							specElement,
							ReqIF10Package.Literals.SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES,
							value));
		}
		return cmd;
	}

	/**
	 * Builds a command that creates new {@link SpecRelation}s between the given
	 * sources and target. Both, source and target can be {@link SpecObject}s
	 * and {@link SpecHierarchy}s.
	 */
	public static Command createCreateSpecRelationsCommand(
			EditingDomain domain, Collection<?> sources, Object target) {

		// Find the target SpecObject
		SpecObject targetObject = null;
		if (target instanceof SpecObject) {
			targetObject = (SpecObject) target;
		} else if (target instanceof SpecHierarchy) {
			targetObject = ((SpecHierarchy) target).getObject();
		}
		if (targetObject == null) {
			return UnexecutableCommand.INSTANCE;
		}

		ReqIFContent content = ReqIF10Util.getReqIF(targetObject)
				.getCoreContent();
		ArrayList<SpecRelation> relations = new ArrayList<SpecRelation>();

		for (Object source : sources) {
			if (source instanceof SpecHierarchy) {
				source = ((SpecHierarchy) source).getObject();
			}
			if (source instanceof SpecObject) {
				SpecObject sourceObject = (SpecObject) source;
				SpecRelation relation = ReqIF10Factory.eINSTANCE
						.createSpecRelation();
				relation.setSource(sourceObject);
				relation.setTarget(targetObject);
				relations.add(relation);
			}
		}
		return AddCommand.create(domain, content,
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS,
				relations);
	}

	/**
	 * This class reflectively looks for the given postfix and removes it from
	 * the classname of the given object. Should the result contain camel case,
	 * then spaces will be inserted.
	 * <p>
	 * 
	 * If obj is itself a {@link Class}, its simple name is used directly.
	 * 
	 * If the postfix does not match, the simple class name is returned.
	 * <p>
	 * 
	 * If obj is null, the empty string is returned.
	 * <p>
	 * 
	 * The idea is that in some places, it is convenient to extract information
	 * directly from the CamelCased classname, e.g. SpecRelationTypeItemProvider
	 * => "Spec Relation Type".
	 */
	public static String substractPrefixPostfix(Object obj, String prefix,
			String suffix) {
		if (obj == null) {
			return "";
		}

		String className = obj instanceof Class ? ((Class<?>) obj)
				.getSimpleName() : obj.getClass().getSimpleName();
		if (!className.startsWith(suffix) && !className.endsWith(suffix)) {
			return className;
		}
		String name = className.substring(prefix.length(), className.length()
				- suffix.length());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (i != 0 && Character.isUpperCase(c)) {
				sb.append(' ');
			}
			sb.append(c);
		}
		return sb.toString();
	}

	/**
	 * This method must be called by all setType() calls of the subclasses, to
	 * set the values that correspond to the attributes of the type.
	 * <p>
	 * 
	 * @param valueFeature
	 *            the correct value from {@link ReqIFPackage}, e.g.
	 *            {@link ReqIFPackage#SPEC_OBJECT__VALUES}.
	 */
	public static void updateValuesForCurrentType(SpecObject specObject) {

		// First make sure all required values exist
		HashSet<AttributeValue> existingRequiredValues = new HashSet<AttributeValue>(
				specObject.getValues());

		if (specObject.getType() != null) {
			// Iterate over the required attributes...
			outer: for (AttributeDefinition attrDefFromNewType : specObject
					.getType().getSpecAttributes()) {
				// ... and check for each whether it already exists:
				for (AttributeValue value : specObject.getValues()) {
					AttributeDefinition definition = ReqIF10Util
							.getAttributeDefinition(value);
					if (definition != null
							&& definition.equals(attrDefFromNewType)) {
						// It does: Continue the outer loop
						existingRequiredValues.remove(value);
						continue outer;
					}
				}

				// The attribute is missing: Let's add it; but we can only add
				// it, if a type is set.
				AttributeValue value = ReqIF10Util
						.createAttributeValue(attrDefFromNewType);

				if (value != null) {
					specObject.getValues().add(value);
					if (((EObjectImpl) specObject).eNotificationRequired())
						specObject.eNotify(new ENotificationImpl(
								(EObjectImpl) specObject, Notification.ADD,
								null, null, value));
				}
				// If there are any values left, we need to remove them
				for (AttributeValue attributeValue : existingRequiredValues) {
					specObject.getValues().remove(attributeValue);
				}
			}
		} else {
			// We don't do a thing: We leave the (now stale) Attributes. They
			// will be removed if a new type is set.
		}
	}

	
	/**
	 * Helper function for drag and drop operations:
	 * Tests if the element source may be dropped onto the target object.
	 * 
	 * @param source
	 * @param target
	 * @return true if the drop should be accepted, false otherwise
	 */
	public static boolean isValidDrop(SpecHierarchy source, Object target) {
			if (source == target){
				return false;
			}
			
			if (source.getChildren().contains(target)){
				return false;
			}
			
			for (EObject child : source.getChildren()) {
				if (child instanceof SpecHierarchy){
					if (!isValidDrop((SpecHierarchy) child, target)){
						return false;
					}
				}
			}
			
			return true;
	}

	/**
	 * Retrieves the {@link ProrPresentationConfigurationItemProvider} for the
	 * given {@link ProrPresentationConfiguration} element.
	 */
	public static ProrPresentationConfigurationItemProvider getConfigItemProvider(
			ProrPresentationConfiguration config, AdapterFactory adapterFactory) {
		ProrPresentationConfigurationItemProvider itemprovider = (ProrPresentationConfigurationItemProvider) getItemProvider(adapterFactory, config);
		return itemprovider;
	}

}
