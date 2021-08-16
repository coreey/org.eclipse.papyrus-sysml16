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
package org.eclipse.papyrus.sysml16.elementgroup.api.copy;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.sysml16.elementgroup.internal.RequestDispatcher;
import org.eclipse.uml2.uml.Element;


/**
 * This class is used to execute request from the model
 *
 */
public class RequestDispatcherDelegation implements IRequestDispatcher {

	private RequestDispatcher requestDispatcher = new RequestDispatcher();


	/**
	 * @see org.eclipse.papyrus.sysml16.elementgroup.api.IRequestDispatcher#executeRequest(java.lang.String, org.eclipse.emf.ecore.EObject, java.lang.String)
	 */

	@Override
	public BasicEList<Element> executeRequest(String language, EObject context, String request) throws Exception {
		return requestDispatcher.executeRequest(language, context, request);
	}
}
