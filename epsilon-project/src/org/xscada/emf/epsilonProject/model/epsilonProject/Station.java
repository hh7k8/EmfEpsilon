/**
 */
package org.xscada.emf.epsilonProject.model.epsilonProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xscada.emf.epsilonProject.model.epsilonProject.Station#getName <em>Name</em>}</li>
 *   <li>{@link org.xscada.emf.epsilonProject.model.epsilonProject.Station#getMilePost <em>Mile Post</em>}</li>
 * </ul>
 *
 * @see org.xscada.emf.epsilonProject.model.epsilonProject.EpsilonProjectPackage#getStation()
 * @model
 * @generated
 */
public interface Station extends EObject {
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
	 * @see org.xscada.emf.epsilonProject.model.epsilonProject.EpsilonProjectPackage#getStation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xscada.emf.epsilonProject.model.epsilonProject.Station#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mile Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mile Post</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mile Post</em>' attribute.
	 * @see #setMilePost(double)
	 * @see org.xscada.emf.epsilonProject.model.epsilonProject.EpsilonProjectPackage#getStation_MilePost()
	 * @model
	 * @generated
	 */
	double getMilePost();

	/**
	 * Sets the value of the '{@link org.xscada.emf.epsilonProject.model.epsilonProject.Station#getMilePost <em>Mile Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mile Post</em>' attribute.
	 * @see #getMilePost()
	 * @generated
	 */
	void setMilePost(double value);

} // Station
