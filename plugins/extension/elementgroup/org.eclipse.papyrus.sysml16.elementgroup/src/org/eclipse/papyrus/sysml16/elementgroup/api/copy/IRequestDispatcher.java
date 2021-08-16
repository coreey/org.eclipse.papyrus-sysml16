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
import org.eclipse.uml2.uml.Element;

/**
 * This Interface declare method to execute a request
 *
 */
public interface IRequestDispatcher {

	/**
	 * @param language
	 *            the type of the language to execute the request
	 * @param context
	 *            the element context
	 * @param request
	 *            the request
	 * @return the list of element
	 * @throws Exception
	 *             if the language is not knew or if the request is bad build.
	 */
	BasicEList<Element> executeRequest(String language, EObject context, String request) throws Exception;

}