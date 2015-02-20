/**
 */
package org.eclipse.rmf.reqif10.pror.configuration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.rmf.reqif10.pror.configuration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationFactoryImpl extends EFactoryImpl implements ConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigurationFactory init() {
		try {
			ConfigurationFactory theConfigurationFactory = (ConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory(ConfigurationPackage.eNS_URI);
			if (theConfigurationFactory != null) {
				return theConfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConfigurationPackage.PROR_TOOL_EXTENSION: return createProrToolExtension();
			case ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION: return createProrSpecViewConfiguration();
			case ConfigurationPackage.COLUMN: return createColumn();
			case ConfigurationPackage.PROR_PRESENTATION_CONFIGURATIONS: return createProrPresentationConfigurations();
			case ConfigurationPackage.PROR_GENERAL_CONFIGURATION: return createProrGeneralConfiguration();
			case ConfigurationPackage.LABEL_CONFIGURATION: return createLabelConfiguration();
			case ConfigurationPackage.UNIFIED_COLUMN: return createUnifiedColumn();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProrToolExtension createProrToolExtension() {
		ProrToolExtensionImpl prorToolExtension = new ProrToolExtensionImpl();
		return prorToolExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProrSpecViewConfiguration createProrSpecViewConfiguration() {
		ProrSpecViewConfigurationImpl prorSpecViewConfiguration = new ProrSpecViewConfigurationImpl();
		return prorSpecViewConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProrPresentationConfigurations createProrPresentationConfigurations() {
		ProrPresentationConfigurationsImpl prorPresentationConfigurations = new ProrPresentationConfigurationsImpl();
		return prorPresentationConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProrGeneralConfiguration createProrGeneralConfiguration() {
		ProrGeneralConfigurationImpl prorGeneralConfiguration = new ProrGeneralConfigurationImpl();
		return prorGeneralConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelConfiguration createLabelConfiguration() {
		LabelConfigurationImpl labelConfiguration = new LabelConfigurationImpl();
		return labelConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnifiedColumn createUnifiedColumn() {
		UnifiedColumnImpl unifiedColumn = new UnifiedColumnImpl();
		return unifiedColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPackage getConfigurationPackage() {
		return (ConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigurationPackage getPackage() {
		return ConfigurationPackage.eINSTANCE;
	}

} //ConfigurationFactoryImpl
