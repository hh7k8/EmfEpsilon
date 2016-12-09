/**
 */
package org.xscada.emf.epsilonProject.model.epsilonProject.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xscada.emf.epsilonProject.model.epsilonProject.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EpsilonProjectFactoryImpl extends EFactoryImpl implements EpsilonProjectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EpsilonProjectFactory init() {
		try {
			EpsilonProjectFactory theEpsilonProjectFactory = (EpsilonProjectFactory)EPackage.Registry.INSTANCE.getEFactory(EpsilonProjectPackage.eNS_URI);
			if (theEpsilonProjectFactory != null) {
				return theEpsilonProjectFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EpsilonProjectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpsilonProjectFactoryImpl() {
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
			case EpsilonProjectPackage.PIPE_LINE: return createPipeLine();
			case EpsilonProjectPackage.STATION: return createStation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipeLine createPipeLine() {
		PipeLineImpl pipeLine = new PipeLineImpl();
		return pipeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station createStation() {
		StationImpl station = new StationImpl();
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpsilonProjectPackage getEpsilonProjectPackage() {
		return (EpsilonProjectPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EpsilonProjectPackage getPackage() {
		return EpsilonProjectPackage.eINSTANCE;
	}

} //EpsilonProjectFactoryImpl
