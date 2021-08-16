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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.sysml16.elementgroup.cluster.ClusterPackage
 * @generated
 */
public interface ClusterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	ClusterFactory eINSTANCE = org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.ClusterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Intentional Element Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Intentional Element Group</em>'.
	 * @generated
	 */
	IntentionalElementGroup createIntentionalElementGroup();

	/**
	 * Returns a new object of class '<em>Opaque Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Opaque Request</em>'.
	 * @generated
	 */
	OpaqueRequest createOpaqueRequest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	ClusterPackage getClusterPackage();

} // ClusterFactory
