/**
 */
package org.xscada.emf.epsilonProject.model.epsilonProject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xscada.emf.epsilonProject.model.epsilonProject.EpsilonProjectFactory
 * @model kind="package"
 * @generated
 */
public interface EpsilonProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "epsilonProject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/epsilonProject";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "epsilonProject";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EpsilonProjectPackage eINSTANCE = org.xscada.emf.epsilonProject.model.epsilonProject.impl.EpsilonProjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xscada.emf.epsilonProject.model.epsilonProject.impl.PipeLineImpl <em>Pipe Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xscada.emf.epsilonProject.model.epsilonProject.impl.PipeLineImpl
	 * @see org.xscada.emf.epsilonProject.model.epsilonProject.impl.EpsilonProjectPackageImpl#getPipeLine()
	 * @generated
	 */
	int PIPE_LINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_LINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Station</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_LINE__STATION = 1;

	/**
	 * The number of structural features of the '<em>Pipe Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_LINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pipe Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xscada.emf.epsilonProject.model.epsilonProject.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xscada.emf.epsilonProject.model.epsilonProject.impl.StationImpl
	 * @see org.xscada.emf.epsilonProject.model.epsilonProject.impl.EpsilonProjectPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mile Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__MILE_POST = 1;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.xscada.emf.epsilonProject.model.epsilonProject.PipeLine <em>Pipe Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipe Line</em>'.
	 * @see org.xscada.emf.epsilonProject.model.epsilonProject.PipeLine
	 * @generated
	 */
	EClass getPipeLine();

	/**
	 * Returns the meta object for the attribute '{@link org.xscada.emf.epsilonProject.model.epsilonProject.PipeLine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xscada.emf.epsilonProject.model.epsilonProject.PipeLine#getName()
	 * @see #getPipeLine()
	 * @generated
	 */
	EAttribute getPipeLine_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xscada.emf.epsilonProject.model.epsilonProject.PipeLine#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Station</em>'.
	 * @see org.xscada.emf.epsilonProject.model.epsilonProject.PipeLine#getStation()
	 * @see #getPipeLine()
	 * @generated
	 */
	EReference getPipeLine_Station();

	/**
	 * Returns the meta object for class '{@link org.xscada.emf.epsilonProject.model.epsilonProject.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see org.xscada.emf.epsilonProject.model.epsilonProject.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for the attribute '{@link org.xscada.emf.epsilonProject.model.epsilonProject.Station#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xscada.emf.epsilonProject.model.epsilonProject.Station#getName()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.xscada.emf.epsilonProject.model.epsilonProject.Station#getMilePost <em>Mile Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mile Post</em>'.
	 * @see org.xscada.emf.epsilonProject.model.epsilonProject.Station#getMilePost()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_MilePost();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EpsilonProjectFactory getEpsilonProjectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.xscada.emf.epsilonProject.model.epsilonProject.impl.PipeLineImpl <em>Pipe Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xscada.emf.epsilonProject.model.epsilonProject.impl.PipeLineImpl
		 * @see org.xscada.emf.epsilonProject.model.epsilonProject.impl.EpsilonProjectPackageImpl#getPipeLine()
		 * @generated
		 */
		EClass PIPE_LINE = eINSTANCE.getPipeLine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPE_LINE__NAME = eINSTANCE.getPipeLine_Name();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPE_LINE__STATION = eINSTANCE.getPipeLine_Station();

		/**
		 * The meta object literal for the '{@link org.xscada.emf.epsilonProject.model.epsilonProject.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xscada.emf.epsilonProject.model.epsilonProject.impl.StationImpl
		 * @see org.xscada.emf.epsilonProject.model.epsilonProject.impl.EpsilonProjectPackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NAME = eINSTANCE.getStation_Name();

		/**
		 * The meta object literal for the '<em><b>Mile Post</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__MILE_POST = eINSTANCE.getStation_MilePost();

	}

} //EpsilonProjectPackage
