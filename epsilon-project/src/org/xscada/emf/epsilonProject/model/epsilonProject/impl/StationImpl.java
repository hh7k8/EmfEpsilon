/**
 */
package org.xscada.emf.epsilonProject.model.epsilonProject.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xscada.emf.epsilonProject.model.epsilonProject.EpsilonProjectPackage;
import org.xscada.emf.epsilonProject.model.epsilonProject.Station;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xscada.emf.epsilonProject.model.epsilonProject.impl.StationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xscada.emf.epsilonProject.model.epsilonProject.impl.StationImpl#getMilePost <em>Mile Post</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StationImpl extends MinimalEObjectImpl.Container implements Station {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMilePost() <em>Mile Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilePost()
	 * @generated
	 * @ordered
	 */
	protected static final double MILE_POST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMilePost() <em>Mile Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilePost()
	 * @generated
	 * @ordered
	 */
	protected double milePost = MILE_POST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpsilonProjectPackage.Literals.STATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpsilonProjectPackage.STATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMilePost() {
		return milePost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMilePost(double newMilePost) {
		double oldMilePost = milePost;
		milePost = newMilePost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpsilonProjectPackage.STATION__MILE_POST, oldMilePost, milePost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EpsilonProjectPackage.STATION__NAME:
				return getName();
			case EpsilonProjectPackage.STATION__MILE_POST:
				return getMilePost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EpsilonProjectPackage.STATION__NAME:
				setName((String)newValue);
				return;
			case EpsilonProjectPackage.STATION__MILE_POST:
				setMilePost((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EpsilonProjectPackage.STATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EpsilonProjectPackage.STATION__MILE_POST:
				setMilePost(MILE_POST_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EpsilonProjectPackage.STATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EpsilonProjectPackage.STATION__MILE_POST:
				return milePost != MILE_POST_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", milePost: ");
		result.append(milePost);
		result.append(')');
		return result.toString();
	}

} //StationImpl
