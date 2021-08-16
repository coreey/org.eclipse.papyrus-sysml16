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

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml16.modelelements.ElementGroup;

import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intentional Element Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.sysml16.elementgroup.cluster.IntentionalElementGroup#getComputedBy <em>Computed By</em>}</li>
 * <li>{@link org.eclipse.papyrus.sysml16.elementgroup.cluster.IntentionalElementGroup#getComputedMembers <em>Computed Members</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.ClusterPackage#getIntentionalElementGroup()
 * @model
 * @generated
 */
public interface IntentionalElementGroup extends ElementGroup {
	/**
	 * Returns the value of the '<em><b>Computed By</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.sysml16.elementgroup.cluster.OpaqueRequest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computed By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Computed By</em>' containment reference list.
	 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.ClusterPackage#getIntentionalElementGroup_ComputedBy()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OpaqueRequest> getComputedBy();

	/**
	 * Returns the value of the '<em><b>Computed Members</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computed Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Computed Members</em>' reference list.
	 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.ClusterPackage#getIntentionalElementGroup_ComputedMembers()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Element> getComputedMembers();

} // IntentionalElementGroup
