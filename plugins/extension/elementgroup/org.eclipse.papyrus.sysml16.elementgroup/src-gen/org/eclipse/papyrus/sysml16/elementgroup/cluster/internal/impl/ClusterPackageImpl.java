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
package org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml16.elementgroup.cluster.ClusterFactory;
import org.eclipse.papyrus.sysml16.elementgroup.cluster.ClusterPackage;
import org.eclipse.papyrus.sysml16.elementgroup.cluster.IntentionalElementGroup;
import org.eclipse.papyrus.sysml16.elementgroup.cluster.OpaqueRequest;

import org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage;

import org.eclipse.papyrus.sysml16.sysml.SysMLPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.profile.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ClusterPackageImpl extends EPackageImpl implements ClusterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass intentionalElementGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass opaqueRequestEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.ClusterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClusterPackageImpl() {
		super(eNS_URI, ClusterFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link ClusterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClusterPackage init() {
		if (isInited) {
			return (ClusterPackage) EPackage.Registry.INSTANCE.getEPackage(ClusterPackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredClusterPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ClusterPackageImpl theClusterPackage = registeredClusterPackage instanceof ClusterPackageImpl ? (ClusterPackageImpl) registeredClusterPackage : new ClusterPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		StandardPackage.eINSTANCE.eClass();
		SysMLPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theClusterPackage.createPackageContents();

		// Initialize created meta-data
		theClusterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClusterPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClusterPackage.eNS_URI, theClusterPackage);
		return theClusterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIntentionalElementGroup() {
		return intentionalElementGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getIntentionalElementGroup_ComputedBy() {
		return (EReference) intentionalElementGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getIntentionalElementGroup_ComputedMembers() {
		return (EReference) intentionalElementGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getOpaqueRequest() {
		return opaqueRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getOpaqueRequest_Request() {
		return (EAttribute) opaqueRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getOpaqueRequest_Language() {
		return (EAttribute) opaqueRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ClusterFactory getClusterFactory() {
		return (ClusterFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		intentionalElementGroupEClass = createEClass(INTENTIONAL_ELEMENT_GROUP);
		createEReference(intentionalElementGroupEClass, INTENTIONAL_ELEMENT_GROUP__COMPUTED_BY);
		createEReference(intentionalElementGroupEClass, INTENTIONAL_ELEMENT_GROUP__COMPUTED_MEMBERS);

		opaqueRequestEClass = createEClass(OPAQUE_REQUEST);
		createEAttribute(opaqueRequestEClass, OPAQUE_REQUEST__REQUEST);
		createEAttribute(opaqueRequestEClass, OPAQUE_REQUEST__LANGUAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModelElementsPackage theModelElementsPackage = (ModelElementsPackage) EPackage.Registry.INSTANCE.getEPackage(ModelElementsPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage) EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		intentionalElementGroupEClass.getESuperTypes().add(theModelElementsPackage.getElementGroup());

		// Initialize classes, features, and operations; add parameters
		initEClass(intentionalElementGroupEClass, IntentionalElementGroup.class, "IntentionalElementGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIntentionalElementGroup_ComputedBy(), this.getOpaqueRequest(), null, "computedBy", null, 0, -1, IntentionalElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, //$NON-NLS-1$
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getIntentionalElementGroup_ComputedMembers(), theUMLPackage.getElement(), null, "computedMembers", null, 0, -1, IntentionalElementGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, //$NON-NLS-1$
				IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(opaqueRequestEClass, OpaqueRequest.class, "OpaqueRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOpaqueRequest_Request(), theTypesPackage.getString(), "request", null, 1, 1, OpaqueRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOpaqueRequest_Language(), theTypesPackage.getString(), "language", null, 1, 1, OpaqueRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML"; //$NON-NLS-1$
		addAnnotation(this,
				source,
				new String[] {
						"originalName", "Cluster" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} // ClusterPackageImpl
