/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.filter.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.search.filter.DateFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.StringFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

/**
 * The {@link FilterPanel} initially only offers the selection of Attributes.
 * Upon selecting one, the fitting criteria are offered by instantiating the
 * correct {@link FilterControl}.
 * 
 * @author jastram
 */
public class FilterPanel extends Composite {

	private ReqIF reqif;
	private ComboViewer attr;

	public FilterPanel(final Composite parent, ReqIF reqif) {
		super(parent, SWT.BORDER);
		this.reqif = reqif;
		setLayout(new GridLayout(3, false));

		Label close = new Label(this, SWT.FLAT);
		close.setText("\u274C");
		close.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				dispose();
				parent.pack();
			}
		});
		
		attr = new ComboViewer(this, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		GridData layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false);
		layoutData.widthHint = 180;
		attr.getControl().setLayoutData(layoutData);
		attr.setLabelProvider(new AttributeLabelProvider());
		attr.setContentProvider(new ArrayContentProvider());
		attr.setInput(createAttributeInput().toArray());

		attr.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (! event.getSelection().isEmpty()) {
					Object selectedAttr = ((IStructuredSelection)event.getSelection()).getFirstElement();
					attributeChanged(selectedAttr);					
				}
			}
		});
	}

	/**
	 * This constructor uses an existing {@link IFilter} to populate the panel.
	 */
	public FilterPanel(Composite parent, ReqIF reqif, IFilter filter) {
		this(parent, reqif);
		
		// see whether the attribute of the filter still exists
		Object[] input = ((Object[])attr.getInput());
		int attributeIndex = Arrays.asList(input).indexOf(filter.getAttribute());
		if (attributeIndex == -1) return;

		attr.getCombo().select(attributeIndex);
		FilterControl filterControl = new FilterControlString(this, (StringFilter)filter);
		filterControl.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		layout();
		getParent().pack();
	}


	private List<?> createAttributeInput() {
		List<? super Object> list = new ArrayList<Object>();

		// Internal Attributes
		list.addAll(Arrays.asList(StringFilter.InternalAttribute.values()));
		list.addAll(Arrays.asList(DateFilter.InternalAttribute.values()));
		
		// All Attributes in the model
		Map<String, AttributeDefinition> attributes = new HashMap<String, AttributeDefinition>();
		for (SpecType specType : reqif.getCoreContent().getSpecTypes()) {
			for (AttributeDefinition ad : specType.getSpecAttributes()) {
				attributes.put(specType.getLongName() + "." + ad.getLongName(), ad);
			}
		}

		// Add them in alphabetical order.
		List<String> sortedKeys = new ArrayList<String>(attributes.keySet());
		for (String key : sortedKeys) {
			list.add(attributes.get(key));			
		}

		return list;
	}

	protected void attributeChanged(Object attribute) {
		FilterControl filterControl;
		if (getFilterControl() != null) getFilterControl().dispose();
		
		
		if (Arrays.asList(StringFilter.InternalAttribute.values()).contains(attribute)) {
			filterControl = new FilterControlString(this, (StringFilter.InternalAttribute)attribute);
		} else if (attribute instanceof AttributeDefinitionString) {
			filterControl = new FilterControlString(this, (AttributeDefinitionString)attribute);
		} else {
			MessageDialog.openError(getShell(), "Invalid Selection", "Cannot handle (yet): " + attribute);
			filterControl = null;
		}

		filterControl.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		layout();
		getParent().pack();
	}

	/**
	 * @return the current FilterControl, or null of not set.
	 */
	private FilterControl getFilterControl() {
		if (getChildren().length != 3) return null;
		Control control = getChildren()[2];
		if (! (control instanceof FilterControl)) return null;
		return (FilterControl) control;
	}

	/**
	 * @return the {@link IFilter} representing the state of the
	 * {@link FilterPanel}, or null if not set or incorrectly configured.
	 */
	public IFilter getFilter() {
		return getFilterControl() == null ? null : getFilterControl().getFilter();
	}

	/**
	 * To handle objects in the Attribute dropdown, instead of just Strings..
	 */
	class AttributeLabelProvider extends LabelProvider {
		@Override
		public String getText(Object element) {
			if (element instanceof AttributeDefinition) {
				AttributeDefinition ad = (AttributeDefinition)element;
				SpecType specType = (SpecType) ad.eContainer();
				return ad.getLongName() + " (" + specType.getLongName() + ")";
			}
			return element.toString();
		}
	}

}
