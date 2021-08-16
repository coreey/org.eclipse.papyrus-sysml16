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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.sysml16.elementgroup.cluster.ClusterPackage;
import org.eclipse.papyrus.sysml16.elementgroup.cluster.IntentionalElementGroup;
import org.eclipse.papyrus.sysml16.elementgroup.cluster.OpaqueRequest;

import org.eclipse.papyrus.sysml16.modelelements.internal.impl.ElementGroupImpl;

import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intentional Element Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.IntentionalElementGroupImpl#getComputedBy <em>Computed By</em>}</li>
 * <li>{@link org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.IntentionalElementGroupImpl#getComputedMembers <em>Computed Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntentionalElementGroupImpl extends ElementGroupImpl implements IntentionalElementGroup {
	/**
	 * The cached value of the '{@link #getComputedBy() <em>Computed By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getComputedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<OpaqueRequest> computedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected IntentionalElementGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClusterPackage.Literals.INTENTIONAL_ELEMENT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<OpaqueRequest> getComputedBy() {
		if (computedBy == null) {
			computedBy = new EObjectContainmentEList<>(OpaqueRequest.class, this, ClusterPackage.INTENTIONAL_ELEMENT_GROUP__COMPUTED_BY);
		}
		return computedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Element> getComputedMembers() {
		// TODO: implement this method to return the 'Computed Members' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ClusterPackage.INTENTIONAL_ELEMENT_GROUP__COMPUTED_BY:
			return ((InternalEList<?>) getComputedBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ClusterPackage.INTENTIONAL_ELEMENT_GROUP__COMPUTED_BY:
			return getComputedBy();
		case ClusterPackage.INTENTIONAL_ELEMENT_GROUP__COMPUTED_MEMBERS:
			return getComputedMembers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ClusterPackage.INTENTIONAL_ELEMENT_GROUP__COMPUTED_BY:
			getComputedBy().clear();
			getComputedBy().addAll((Collection<? extends OpaqueRequest>) newValue);
			return;
		case ClusterPackage.INTENTIONAL_ELEMENT_GROUP__COMPUTED_MEMBERS:
			getComputedMembers().clear();
			getComputedMembers().addAll((Collection<? extends Element>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ClusterPackage.INTENTIONAL_ELEMENT_GROUP__COMPUTED_BY:
			getComputedBy().clear();
			return;
		case ClusterPackage.INTENTIONAL_ELEMENT_GROUP__COMPUTED_MEMBERS:
			getComputedMembers().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ClusterPackage.INTENTIONAL_ELEMENT_GROUP__COMPUTED_BY:
			return computedBy != null && !computedBy.isEmpty();
		case ClusterPackage.INTENTIONAL_ELEMENT_GROUP__COMPUTED_MEMBERS:
			return !getComputedMembers().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // IntentionalElementGroupImpl
