/**
 */
package org.xscada.emf.epsilonProject.model.epsilonProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipe Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xscada.emf.epsilonProject.model.epsilonProject.PipeLine#getName <em>Name</em>}</li>
 *   <li>{@link org.xscada.emf.epsilonProject.model.epsilonProject.PipeLine#getStation <em>Station</em>}</li>
 * </ul>
 *
 * @see org.xscada.emf.epsilonProject.model.epsilonProject.EpsilonProjectPackage#getPipeLine()
 * @model
 * @generated
 */
public interface PipeLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xscada.emf.epsilonProject.model.epsilonProject.EpsilonProjectPackage#getPipeLine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xscada.emf.epsilonProject.model.epsilonProject.PipeLine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Station</b></em>' containment reference list.
	 * The list contents are of type {@link org.xscada.emf.epsilonProject.model.epsilonProject.Station}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Station</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station</em>' containment reference list.
	 * @see org.xscada.emf.epsilonProject.model.epsilonProject.EpsilonProjectPackage#getPipeLine_Station()
	 * @model containment="true"
	 * @generated
	 */
	EList<Station> getStation();

} // PipeLine
