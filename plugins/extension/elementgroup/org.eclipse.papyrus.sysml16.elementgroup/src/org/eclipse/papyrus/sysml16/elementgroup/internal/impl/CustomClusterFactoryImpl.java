/*****************************************************************************
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
 *****************************************************************************/
package org.eclipse.papyrus.sysml16.elementgroup.internal.impl;

import org.eclipse.papyrus.sysml16.elementgroup.cluster.IntentionalElementGroup;
import org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.ClusterFactoryImpl;


/**
 * This overload the generated in order to create a CustomDynamicCluster.
 * It implement the EditionReq003: It is possible to fill a property of the stereotype "DynamicCluster" in order to write the request.*
 *
 */
public class CustomClusterFactoryImpl extends ClusterFactoryImpl {
	
	@Override
	public IntentionalElementGroup createIntentionalElementGroup() {
		IntentionalElementGroup dynamicCluster = new CustomIntentionalElementGroupImpl();
		return dynamicCluster;
	}

}
