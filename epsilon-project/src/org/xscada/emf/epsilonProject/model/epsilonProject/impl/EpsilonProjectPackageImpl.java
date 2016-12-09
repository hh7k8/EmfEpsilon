/**
 */
package org.xscada.emf.epsilonProject.model.epsilonProject.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xscada.emf.epsilonProject.model.epsilonProject.EpsilonProjectFactory;
import org.xscada.emf.epsilonProject.model.epsilonProject.EpsilonProjectPackage;
import org.xscada.emf.epsilonProject.model.epsilonProject.PipeLine;
import org.xscada.emf.epsilonProject.model.epsilonProject.Station;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EpsilonProjectPackageImpl extends EPackageImpl implements EpsilonProjectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipeLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.xscada.emf.epsilonProject.model.epsilonProject.EpsilonProjectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EpsilonProjectPackageImpl() {
		super(eNS_URI, EpsilonProjectFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EpsilonProjectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EpsilonProjectPackage init() {
		if (isInited) return (EpsilonProjectPackage)EPackage.Registry.INSTANCE.getEPackage(EpsilonProjectPackage.eNS_URI);

		// Obtain or create and register package
		EpsilonProjectPackageImpl theEpsilonProjectPackage = (EpsilonProjectPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EpsilonProjectPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EpsilonProjectPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEpsilonProjectPackage.createPackageContents();

		// Initialize created meta-data
		theEpsilonProjectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEpsilonProjectPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EpsilonProjectPackage.eNS_URI, theEpsilonProjectPackage);
		return theEpsilonProjectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPipeLine() {
		return pipeLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPipeLine_Name() {
		return (EAttribute)pipeLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipeLine_Station() {
		return (EReference)pipeLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStation() {
		return stationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_Name() {
		return (EAttribute)stationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStation_MilePost() {
		return (EAttribute)stationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpsilonProjectFactory getEpsilonProjectFactory() {
		return (EpsilonProjectFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pipeLineEClass = createEClass(PIPE_LINE);
		createEAttribute(pipeLineEClass, PIPE_LINE__NAME);
		createEReference(pipeLineEClass, PIPE_LINE__STATION);

		stationEClass = createEClass(STATION);
		createEAttribute(stationEClass, STATION__NAME);
		createEAttribute(stationEClass, STATION__MILE_POST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(pipeLineEClass, PipeLine.class, "PipeLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPipeLine_Name(), ecorePackage.getEString(), "name", null, 0, 1, PipeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeLine_Station(), this.getStation(), null, "station", null, 0, -1, PipeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationEClass, Station.class, "Station", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStation_MilePost(), ecorePackage.getEDouble(), "milePost", null, 0, 1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EpsilonProjectPackageImpl
