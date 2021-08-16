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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.sysml16.elementgroup.cluster.ClusterPackage;
import org.eclipse.papyrus.sysml16.elementgroup.cluster.OpaqueRequest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.OpaqueRequestImpl#getRequest <em>Request</em>}</li>
 * <li>{@link org.eclipse.papyrus.sysml16.elementgroup.cluster.internal.impl.OpaqueRequestImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpaqueRequestImpl extends MinimalEObjectImpl.Container implements OpaqueRequest {
	/**
	 * The default value of the '{@link #getRequest() <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected String request = REQUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected OpaqueRequestImpl() {
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
		return ClusterPackage.Literals.OPAQUE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setRequest(String newRequest) {
		String oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ClusterPackage.OPAQUE_REQUEST__REQUEST, oldRequest, request));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ClusterPackage.OPAQUE_REQUEST__LANGUAGE, oldLanguage, language));
		}
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
		case ClusterPackage.OPAQUE_REQUEST__REQUEST:
			return getRequest();
		case ClusterPackage.OPAQUE_REQUEST__LANGUAGE:
			return getLanguage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ClusterPackage.OPAQUE_REQUEST__REQUEST:
			setRequest((String) newValue);
			return;
		case ClusterPackage.OPAQUE_REQUEST__LANGUAGE:
			setLanguage((String) newValue);
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
		case ClusterPackage.OPAQUE_REQUEST__REQUEST:
			setRequest(REQUEST_EDEFAULT);
			return;
		case ClusterPackage.OPAQUE_REQUEST__LANGUAGE:
			setLanguage(LANGUAGE_EDEFAULT);
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
		case ClusterPackage.OPAQUE_REQUEST__REQUEST:
			return REQUEST_EDEFAULT == null ? request != null : !REQUEST_EDEFAULT.equals(request);
		case ClusterPackage.OPAQUE_REQUEST__LANGUAGE:
			return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (request: "); //$NON-NLS-1$
		result.append(request);
		result.append(", language: "); //$NON-NLS-1$
		result.append(language);
		result.append(')');
		return result.toString();
	}

} // OpaqueRequestImpl
