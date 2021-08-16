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
package org.eclipse.papyrus.sysml16.elementgroup.ui.queries.element;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.papyrus.sysml16.modelelements.ElementGroup;

public class OrderedMembersQuery implements IJavaQuery2<Element, Collection<Element>> {
	
	
	public Collection<Element> evaluate(final Element context,
			final IParameterValueList2 parameterValues,
			final IFacetManager facetManager)
			throws DerivedTypedElementException {

		ElementGroup elementGroup = UMLUtil.getStereotypeApplication(context, ElementGroup.class);
		if (elementGroup == null) {
			return Collections.emptyList();
		} else {
			Collection<Element> collec = elementGroup.getMember();
			return collec;
		}
	}
}
