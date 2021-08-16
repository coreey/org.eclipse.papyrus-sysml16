/**
 *  Copyright (c) 2021 CEA LIST, and others.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *    Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 */
package org.eclipse.papyrus.sysml16.elementgroup.cluster;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.ClusterFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Cluster'"
 * @generated
 */
public interface ClusterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "cluster"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/Cluster"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "Cluster"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	ClusterPackage eINSTANCE = org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.ClusterPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.IntentionalElementGroupImpl <em>Intentional Element Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.IntentionalElementGroupImpl
	 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.ClusterPackageImpl#getIntentionalElementGroup()
	 * @generated
	 */
	int INTENTIONAL_ELEMENT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_GROUP__BASE_COMMENT = ModelElementsPackage.ELEMENT_GROUP__BASE_COMMENT;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_GROUP__CRITERION = ModelElementsPackage.ELEMENT_GROUP__CRITERION;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_GROUP__MEMBER = ModelElementsPackage.ELEMENT_GROUP__MEMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_GROUP__NAME = ModelElementsPackage.ELEMENT_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Ordered Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_GROUP__ORDERED_MEMBER = ModelElementsPackage.ELEMENT_GROUP__ORDERED_MEMBER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_GROUP__SIZE = ModelElementsPackage.ELEMENT_GROUP__SIZE;

	/**
	 * The feature id for the '<em><b>Computed By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_GROUP__COMPUTED_BY = ModelElementsPackage.ELEMENT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Computed Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_GROUP__COMPUTED_MEMBERS = ModelElementsPackage.ELEMENT_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Intentional Element Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_GROUP_FEATURE_COUNT = ModelElementsPackage.ELEMENT_GROUP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_GROUP___ALL_GROUPS__ELEMENT_ELIST = ModelElementsPackage.ELEMENT_GROUP___ALL_GROUPS__ELEMENT_ELIST;

	/**
	 * The operation id for the '<em>Criterion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_GROUP___CRITERION__STRING = ModelElementsPackage.ELEMENT_GROUP___CRITERION__STRING;

	/**
	 * The operation id for the '<em>Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_GROUP___MEMBER__ELIST = ModelElementsPackage.ELEMENT_GROUP___MEMBER__ELIST;

	/**
	 * The operation id for the '<em>Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_GROUP___SIZE__INT = ModelElementsPackage.ELEMENT_GROUP___SIZE__INT;

	/**
	 * The number of operations of the '<em>Intentional Element Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_GROUP_OPERATION_COUNT = ModelElementsPackage.ELEMENT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.OpaqueRequestImpl <em>Opaque Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.OpaqueRequestImpl
	 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.ClusterPackageImpl#getOpaqueRequest()
	 * @generated
	 */
	int OPAQUE_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OPAQUE_REQUEST__REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OPAQUE_REQUEST__LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>Opaque Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OPAQUE_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Opaque Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OPAQUE_REQUEST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.elementgroup.cluster.IntentionalElementGroup <em>Intentional Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Intentional Element Group</em>'.
	 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.IntentionalElementGroup
	 * @generated
	 */
	EClass getIntentionalElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.sysml16.elementgroup.cluster.IntentionalElementGroup#getComputedBy <em>Computed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Computed By</em>'.
	 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.IntentionalElementGroup#getComputedBy()
	 * @see #getIntentionalElementGroup()
	 * @generated
	 */
	EReference getIntentionalElementGroup_ComputedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml16.elementgroup.cluster.IntentionalElementGroup#getComputedMembers <em>Computed Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Computed Members</em>'.
	 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.IntentionalElementGroup#getComputedMembers()
	 * @see #getIntentionalElementGroup()
	 * @generated
	 */
	EReference getIntentionalElementGroup_ComputedMembers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml16.elementgroup.cluster.OpaqueRequest <em>Opaque Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Opaque Request</em>'.
	 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.OpaqueRequest
	 * @generated
	 */
	EClass getOpaqueRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml16.elementgroup.cluster.OpaqueRequest#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Request</em>'.
	 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.OpaqueRequest#getRequest()
	 * @see #getOpaqueRequest()
	 * @generated
	 */
	EAttribute getOpaqueRequest_Request();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml16.elementgroup.cluster.OpaqueRequest#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.OpaqueRequest#getLanguage()
	 * @see #getOpaqueRequest()
	 * @generated
	 */
	EAttribute getOpaqueRequest_Language();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClusterFactory getClusterFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.IntentionalElementGroupImpl <em>Intentional Element Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.IntentionalElementGroupImpl
		 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.ClusterPackageImpl#getIntentionalElementGroup()
		 * @generated
		 */
		EClass INTENTIONAL_ELEMENT_GROUP = eINSTANCE.getIntentionalElementGroup();

		/**
		 * The meta object literal for the '<em><b>Computed By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference INTENTIONAL_ELEMENT_GROUP__COMPUTED_BY = eINSTANCE.getIntentionalElementGroup_ComputedBy();

		/**
		 * The meta object literal for the '<em><b>Computed Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference INTENTIONAL_ELEMENT_GROUP__COMPUTED_MEMBERS = eINSTANCE.getIntentionalElementGroup_ComputedMembers();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.OpaqueRequestImpl <em>Opaque Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.OpaqueRequestImpl
		 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.ClusterPackageImpl#getOpaqueRequest()
		 * @generated
		 */
		EClass OPAQUE_REQUEST = eINSTANCE.getOpaqueRequest();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OPAQUE_REQUEST__REQUEST = eINSTANCE.getOpaqueRequest_Request();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute OPAQUE_REQUEST__LANGUAGE = eINSTANCE.getOpaqueRequest_Language();

	}

} // ClusterPackage
