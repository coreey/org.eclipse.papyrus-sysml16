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
package org.eclipse.papyrus.sysml16.elementgroup.internal;

import java.util.Collection;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.OCLHelper;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.papyrus.sysml16.elementgroup.api.IRequestDispatcher;
import org.eclipse.uml2.uml.Element;

/**
 * This class is used to execute request from the model
 * for the moment only OCL requests can be interpreted
 *
 */
public class RequestDispatcher implements IRequestDispatcher {
	private static final String OCL_LANGUAGE = "OCL"; //$NON-NLS-1$

	/**
	 * execute an OCL request
	 * 
	 * @param context
	 *            the OCL context
	 * @param request
	 *            the OCL that represent a request
	 * @return a list of element
	 * @throws Exception
	 *             if the request is bad build
	 */
	@SuppressWarnings("unchecked")
	public BasicEList<Element> executeOCLRequest(EObject context, String request) throws Exception {
		OCL ocl = OCL.newInstance();
		org.eclipse.ocl.pivot.Class contextType = ocl.getContextType(context);
		OCLHelper oclHelper = ocl.createOCLHelper(contextType);
		ExpressionInOCL createQuery = oclHelper.createQuery(request);
		Object evaluate = ocl.evaluate(context, createQuery);
		if (evaluate instanceof SetValue) {
			return new BasicEList<Element>((Collection<? extends Element>) ((SetValue) evaluate).getElements());
		}
		return new BasicEList<Element>();
	}

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
	public BasicEList<Element> executeRequest(String language, EObject context, String request) throws Exception {
		if (language != null) {
			if (OCL_LANGUAGE.equals(language)) {
				return executeOCLRequest(context, request);
			}
			throw new ExecutionException("The language is not knew"); //$NON-NLS-1$

		}
		throw new ExecutionException("The language cannot be null"); //$NON-NLS-1$
	}
}
