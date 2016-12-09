/**
 */
package org.xscada.emf.epsilonProject.model.epsilonProject.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xscada.emf.epsilonProject.model.epsilonProject.EpsilonProjectPackage;
import org.xscada.emf.epsilonProject.model.epsilonProject.PipeLine;
import org.xscada.emf.epsilonProject.model.epsilonProject.Station;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipe Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xscada.emf.epsilonProject.model.epsilonProject.impl.PipeLineImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xscada.emf.epsilonProject.model.epsilonProject.impl.PipeLineImpl#getStation <em>Station</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipeLineImpl extends MinimalEObjectImpl.Container implements PipeLine {
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
	 * The cached value of the '{@link #getStation() <em>Station</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStation()
	 * @generated
	 * @ordered
	 */
	protected EList<Station> station;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipeLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpsilonProjectPackage.Literals.PIPE_LINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EpsilonProjectPackage.PIPE_LINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Station> getStation() {
		if (station == null) {
			station = new EObjectContainmentEList<Station>(Station.class, this, EpsilonProjectPackage.PIPE_LINE__STATION);
		}
		return station;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EpsilonProjectPackage.PIPE_LINE__STATION:
				return ((InternalEList<?>)getStation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EpsilonProjectPackage.PIPE_LINE__NAME:
				return getName();
			case EpsilonProjectPackage.PIPE_LINE__STATION:
				return getStation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EpsilonProjectPackage.PIPE_LINE__NAME:
				setName((String)newValue);
				return;
			case EpsilonProjectPackage.PIPE_LINE__STATION:
				getStation().clear();
				getStation().addAll((Collection<? extends Station>)newValue);
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
			case EpsilonProjectPackage.PIPE_LINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EpsilonProjectPackage.PIPE_LINE__STATION:
				getStation().clear();
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
			case EpsilonProjectPackage.PIPE_LINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EpsilonProjectPackage.PIPE_LINE__STATION:
				return station != null && !station.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //PipeLineImpl
