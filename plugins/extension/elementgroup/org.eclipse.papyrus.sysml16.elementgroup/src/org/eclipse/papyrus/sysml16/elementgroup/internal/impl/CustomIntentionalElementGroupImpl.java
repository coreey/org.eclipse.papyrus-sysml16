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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.papyrus.sysml16.elementgroup.api.IRequestDispatcher;
import org.eclipse.papyrus.sysml16.elementgroup.api.RequestDispatcherDelegation;
import org.eclipse.papyrus.sysml16.elementgroup.cluster.IntentionalElementGroup;
import org.eclipse.papyrus.sysml16.elementgroup.cluster.OpaqueRequest;
import org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.IntentionalElementGroupImpl;
import org.eclipse.papyrus.sysml16.modelelements.ModelElementsPackage;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This overload the generated in order to create a CustomDynamicCluster.
 * It implement the EditionReq003: It is possible to fill a property of the stereotype "DynamicCluster" in order to write the request.*
 *
 */
@SuppressWarnings("restriction")
public class CustomIntentionalElementGroupImpl extends IntentionalElementGroupImpl implements IntentionalElementGroup {

	protected IRequestDispatcher requestDispatcherDelegation = new RequestDispatcherDelegation();

	/**
	 * Constructor.
	 *
	 */
	public CustomIntentionalElementGroupImpl() {
		super();
	}

	protected EList<OpaqueRequest> computedBy;

	@Override
	public EList<Element> getComputedMembers() {
		if (getComputedBy().size() > 0) {
			OpaqueRequest opaqueRequest = getComputedBy().get(0);
			try {
				return requestDispatcherDelegation.executeRequest(opaqueRequest.getLanguage(), this.getBase_Comment(), opaqueRequest.getRequest());
			} catch (Exception e) {
				String body = this.getBase_Comment().getBody();
				IEditingDomainProvider domainProvider = (IEditingDomainProvider) EcoreUtil.getExistingAdapter(this.getBase_Comment().eResource().getResourceSet(), IEditingDomainProvider.class);
				SetCommand setCommand = new SetCommand(domainProvider.getEditingDomain(), this.getBase_Comment(), UMLPackage.eINSTANCE.getComment_Body(), body + "\n" + e); //$NON-NLS-1$
				domainProvider.getEditingDomain().getCommandStack().execute(setCommand);
				return new BasicEList<Element>();
			}
		}

		return new BasicEList<Element>();
	}

	/**
	 * 7.3.2.2 ElementGroup : /criterion[0..1]: String Specifies the rationale for being member of the group.
	 * Adding an element to the group asserts that the criterion applies to this element.
	 * Derived from Comment::body.
	 * 
	 * @see org.eclipse.papyrus.sysml14.modelelements.internal.impl.ElementGroupImpl#getCriterion()
	 *      <p>
	 *      See the requirement <b>{@papyrus.req org.eclipse.papyrus.sysml14#Req014}</b>.
	 * @return
	 */
	@Override
	public String getCriterion() {
		String criterion = ""; //$NON-NLS-1$
		Comment comment = getBase_Comment();
		if (comment != null) {
			criterion = comment.getBody();
		}
		return criterion;
	}


	/**
	 * 7.3.2.2 ElementGroup : /criterion[0..1]: String Specifies the rationale for being member of the group.
	 * Adding an element to the group asserts that the criterion applies to this element.
	 * Derived from Comment::body.
	 * 
	 * @see org.eclipse.papyrus.sysml14.modelelements.internal.impl.ElementGroupImpl#setCriterion(java.lang.String)
	 *
	 * @param newCriterion
	 */
	public void setCriterion(String newCriterion) {
		Comment comment = getBase_Comment();
		if (comment != null) {
			comment.setBody(newCriterion);
		}
	}

	/**
	 * 
	 * 7.3.2.2 ElementGroup : /member: Element[0..*] Set specifying the members of the group.
	 * Derived from Comment::annotatedElement.
	 * 
	 * @see org.eclipse.papyrus.sysml14.modelelements.internal.impl.ElementGroupImpl#getMember()
	 *
	 * @return
	 */
	@Override
	public EList<Element> getMember() {
		BasicEList<Element> elementEList = new BasicEList<>();
		Comment comment = getBase_Comment();
		if (comment != null) {
			elementEList.addAll(comment.getAnnotatedElements());
		}
		return new UnmodifiableEList<>(this, ModelElementsPackage.eINSTANCE.getElementGroup_Member(), elementEList.size(), elementEList.toArray());
	}

	/**
	 * 7.3.2.2 ElementGroup : /size: Integer Number of members in the group. Derived.
	 * 
	 * @see org.eclipse.papyrus.sysml14.modelelements.internal.impl.ElementGroupImpl#getSize()
	 *
	 * @return
	 */
	@Override
	public int getSize() {
		return getMember().size();
	}
}
