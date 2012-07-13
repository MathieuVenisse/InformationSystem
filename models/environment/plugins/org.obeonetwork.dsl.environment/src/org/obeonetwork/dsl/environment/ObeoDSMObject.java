/**
 * Copyright (c) 2008-2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *
 * $Id$
 */
package org.obeonetwork.dsl.environment;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obeo DSM Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.environment.ObeoDSMObject#getMetadatas <em>Metadatas</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.ObeoDSMObject#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.ObeoDSMObject#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.ObeoDSMObject#getBehaviours <em>Behaviours</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.ObeoDSMObject#getBindingRegistries <em>Binding Registries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.environment.EnvironmentPackage#getObeoDSMObject()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ObeoDSMObject extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2008-2009 Obeo.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Metadatas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadatas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadatas</em>' containment reference.
	 * @see #setMetadatas(MetaDataContainer)
	 * @see org.obeonetwork.dsl.environment.EnvironmentPackage#getObeoDSMObject_Metadatas()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	MetaDataContainer getMetadatas();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.environment.ObeoDSMObject#getMetadatas <em>Metadatas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadatas</em>' containment reference.
	 * @see #getMetadatas()
	 * @generated
	 */
	void setMetadatas(MetaDataContainer value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.obeonetwork.dsl.environment.EnvironmentPackage#getObeoDSMObject_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.environment.ObeoDSMObject#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywords</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute list.
	 * @see org.obeonetwork.dsl.environment.EnvironmentPackage#getObeoDSMObject_Keywords()
	 * @model
	 * @generated
	 */
	EList<String> getKeywords();

	/**
	 * Returns the value of the '<em><b>Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.environment.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviours</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviours</em>' containment reference list.
	 * @see org.obeonetwork.dsl.environment.EnvironmentPackage#getObeoDSMObject_Behaviours()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Behaviour> getBehaviours();

	/**
	 * Returns the value of the '<em><b>Binding Registries</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.environment.BindingRegistry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Registries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Registries</em>' reference list.
	 * @see org.obeonetwork.dsl.environment.EnvironmentPackage#getObeoDSMObject_BindingRegistries()
	 * @model
	 * @generated
	 */
	EList<BindingRegistry> getBindingRegistries();

} // ObeoDSMObject