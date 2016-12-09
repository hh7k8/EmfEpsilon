/**
 */
package org.xscada.emf.epsilonProject.model.epsilonProject;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xscada.emf.epsilonProject.model.epsilonProject.EpsilonProjectPackage
 * @generated
 */
public interface EpsilonProjectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EpsilonProjectFactory eINSTANCE = org.xscada.emf.epsilonProject.model.epsilonProject.impl.EpsilonProjectFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pipe Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pipe Line</em>'.
	 * @generated
	 */
	PipeLine createPipeLine();

	/**
	 * Returns a new object of class '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Station</em>'.
	 * @generated
	 */
	Station createStation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EpsilonProjectPackage getEpsilonProjectPackage();

} //EpsilonProjectFactory
