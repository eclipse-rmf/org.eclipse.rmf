/*******************************************************************************
 * Copyright (c) 2015 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ingo Weigelt - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.actions;

import java.math.BigInteger;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.EmbeddedValue;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.pror.editor.IReqifEditor;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * Subclass of SubtreeDialog with extra functionality for DatatypeConfiguration
 * 
 * Add a content listener that automatically:
 * <ol>
 * <li>Sets the properties of newly created EnumValues</li>
 * <li>Sets the isMultiValue attribute of newly created
 * AttributeDefinitionEnumerations</li>
 * <li>The Finish button triggers a validation. Only if the current model has
 * been validated once the Finish button closes the dialog. (As we dont have a
 * cancel function, the Model does not have to be valid for the dialog to be
 * closed)</li>
 * </ol>
 * 
 * @author weigelt
 */
public class DatatypeConfigurationSubtreeDialog extends SubtreeDialog {
	
	private EContentAdapter contentAdapter;
	private boolean isValidated = true;
	private Button validateButton;

	public DatatypeConfigurationSubtreeDialog(IReqifEditor reqifEditor,
			EObject input, String title, String helpContext) {
		super(reqifEditor, input, title, helpContext);
		
		addContentAdapter();
	}

	private void addContentAdapter(){
		contentAdapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);

				if (notification.isTouch()) {
					return;
				}
				
				setIsValidated(false);
				
				/* Set is MutliValue for new AttributeDefinitionEnumeration */
				if (notification.getNotifier() instanceof SpecType
						&& notification.getEventType() == Notification.ADD
						&& notification
								.getFeatureID(DatatypeDefinitionEnumeration.class) == ReqIF10Package.SPEC_TYPE__SPEC_ATTRIBUTES
						&& notification.getNewValue() instanceof AttributeDefinitionEnumeration) {
					AttributeDefinitionEnumeration attributeDefinition = (AttributeDefinitionEnumeration) notification
							.getNewValue();
					if (!attributeDefinition.isSetMultiValued()) {
						attributeDefinition.setMultiValued(false);
						updateStatus(new Status(IStatus.INFO, PLUGIN_ID,
								"Auto Set MultiValued attribute of new AttributeDefinition to false"));
					}
				}

				
				/* init EnumValues Properties on creation */
				if (notification.getNotifier() instanceof DatatypeDefinitionEnumeration
						&& notification.getEventType() == Notification.ADD
						&& notification
								.getFeatureID(DatatypeDefinitionEnumeration.class) == ReqIF10Package.DATATYPE_DEFINITION_ENUMERATION__SPECIFIED_VALUES
						&& notification.getNewValue() instanceof EnumValue) {
					EnumValue enumValue = (EnumValue) notification
							.getNewValue();
					EmbeddedValue properties = getOrCreateProperties(enumValue);
					initializeProperties(properties);
				}
				
			}
		};
		
		input.eAdapters().add(contentAdapter);
	}
	
	
	/**
	 * Get or create an {@link EnumValue}s embeddedProperties
	 * 
	 * If enumValue does have an embeddedValue set, it is returned Otherwise a
	 * new {@link EmbeddedValue} is created, set as the enumValues Properties
	 * and the returned
	 * 
	 * @param enumValue
	 * @return
	 */
	private EmbeddedValue getOrCreateProperties(EnumValue enumValue) {
		EmbeddedValue properties = enumValue.getProperties();
		if (null != properties){
			return properties;
		}
		properties = ReqIF10Factory.eINSTANCE.createEmbeddedValue();
		enumValue.setProperties(properties);
		return properties;
	}
	
	/**
	 * If embeddedValue does not have key and otherContent set:
	 * 
	 * Scan all {@link EmbeddedValue}s in the reqIF document and find the highest key
	 * Set key of embeddedValue to highest key + 1
	 * Set OtherContent of embeddedValue to the String representation of its key 
	 * 
	 * @param embeddedValue 
	 */
	private void initializeProperties(EmbeddedValue embeddedValue){
		
		if (embeddedValue.isSetKey() && embeddedValue.isSetOtherContent()){
			return;
		}
		
		BigInteger max = BigInteger.valueOf(0);
		
		ReqIFContent content = (ReqIFContent) input;
		EList<DatatypeDefinition> datatypes = content.getDatatypes();
		for (DatatypeDefinition datatypeDefinition : datatypes) {
			if (datatypeDefinition instanceof DatatypeDefinitionEnumeration) {
				DatatypeDefinitionEnumeration ddEnum = (DatatypeDefinitionEnumeration) datatypeDefinition;
				for (EnumValue enumValue : ddEnum.getSpecifiedValues()) {
					EmbeddedValue properties = enumValue.getProperties();
					if (properties!=null){
						BigInteger key = properties.getKey();
						if (key!=null){
							max = max.max(key);
						}
					}
				}
				
			}
		}
		
		embeddedValue.setKey(max.add(BigInteger.ONE));
		embeddedValue.setOtherContent(max.add(BigInteger.ONE).toString());
		
		updateStatus(new Status(IStatus.INFO, PLUGIN_ID, "Auto Set Properties of EnumValue: (" + embeddedValue.getKey() + "," + embeddedValue.getOtherContent()  +")"));
	}
	
	
	protected void setIsValidated(boolean isValidated){
		this.isValidated = isValidated;
		updateButtons();
	}
	
	@Override
	public boolean close() {
		input.eAdapters().remove(contentAdapter);
		return super.close();
	}
	
	
	@Override
	protected void validate() {
		setIsValidated(true);
		super.validate();
	}
	
	/**
	 * Updates the Validate and Finish Buttons<br>
	 * If the current state has been validated, the OK button is labeled Finish
	 * and the validate Button is made visible (In case the user wants to see
	 * the validation results again)<br>
	 * If the stated has not been validated, the OK Button becomes "Validate"
	 * and the Validate Button is hidden
	 */
	protected void updateButtons(){
		if (isValidated){
			getButton(IDialogConstants.OK_ID).setText(IDialogConstants.FINISH_LABEL);
			validateButton.setVisible(true);
		}else{
			getButton(IDialogConstants.OK_ID).setText("Validate");
			validateButton.setVisible(false);
		}
	}
	
	@Override
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) {
			if (!isValidated){
				validate();
				showValidationResults();
			}else{
				super.buttonPressed(buttonId);
			}
		} else {
			super.buttonPressed(buttonId);
		}
	}
	
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID,
				"Close" , true);
		validateButton = createButton(parent, VALIDATE_BUTTON_ID, "Validate", false);
		//validateButton.setVisible(false);
	}
}
