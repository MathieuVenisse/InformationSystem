/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.environment.bindingdialect.util;

import fr.obeo.dsl.viewpoint.DLabelled;
import fr.obeo.dsl.viewpoint.DMappingBased;
import fr.obeo.dsl.viewpoint.DRefreshable;
import fr.obeo.dsl.viewpoint.DRepresentation;
import fr.obeo.dsl.viewpoint.DRepresentationElement;
import fr.obeo.dsl.viewpoint.DSemanticDecorator;

import fr.obeo.dsl.viewpoint.DStylizable;
import fr.obeo.dsl.viewpoint.description.DModelElement;
import fr.obeo.dsl.viewpoint.description.DocumentedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.environment.bindingdialect.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.environment.bindingdialect.BindingdialectPackage
 * @generated
 */
public class BindingdialectAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BindingdialectPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingdialectAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BindingdialectPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingdialectSwitch<Adapter> modelSwitch =
		new BindingdialectSwitch<Adapter>() {
			@Override
			public Adapter caseDBindingEditor(DBindingEditor object) {
				return createDBindingEditorAdapter();
			}
			@Override
			public Adapter caseDBindingEdge(DBindingEdge object) {
				return createDBindingEdgeAdapter();
			}
			@Override
			public Adapter caseDBoundElement(DBoundElement object) {
				return createDBoundElementAdapter();
			}
			@Override
			public Adapter caseDocumentedElement(DocumentedElement object) {
				return createDocumentedElementAdapter();
			}
			@Override
			public Adapter caseDRefreshable(DRefreshable object) {
				return createDRefreshableAdapter();
			}
			@Override
			public Adapter caseDModelElement(DModelElement object) {
				return createDModelElementAdapter();
			}
			@Override
			public Adapter caseDRepresentation(DRepresentation object) {
				return createDRepresentationAdapter();
			}
			@Override
			public Adapter caseDSemanticDecorator(DSemanticDecorator object) {
				return createDSemanticDecoratorAdapter();
			}
			@Override
			public Adapter caseDLabelled(DLabelled object) {
				return createDLabelledAdapter();
			}
			@Override
			public Adapter caseDMappingBased(DMappingBased object) {
				return createDMappingBasedAdapter();
			}
			@Override
			public Adapter caseDStylizable(DStylizable object) {
				return createDStylizableAdapter();
			}
			@Override
			public Adapter caseDRepresentationElement(DRepresentationElement object) {
				return createDRepresentationElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.environment.bindingdialect.DBindingEditor <em>DBinding Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.environment.bindingdialect.DBindingEditor
	 * @generated
	 */
	public Adapter createDBindingEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.environment.bindingdialect.DBindingEdge <em>DBinding Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.environment.bindingdialect.DBindingEdge
	 * @generated
	 */
	public Adapter createDBindingEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.environment.bindingdialect.DBoundElement <em>DBound Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.environment.bindingdialect.DBoundElement
	 * @generated
	 */
	public Adapter createDBoundElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.viewpoint.description.DocumentedElement <em>Documented Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.viewpoint.description.DocumentedElement
	 * @generated
	 */
	public Adapter createDocumentedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.viewpoint.DRefreshable <em>DRefreshable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.viewpoint.DRefreshable
	 * @generated
	 */
	public Adapter createDRefreshableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.viewpoint.description.DModelElement <em>DModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.viewpoint.description.DModelElement
	 * @generated
	 */
	public Adapter createDModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.viewpoint.DRepresentation <em>DRepresentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.viewpoint.DRepresentation
	 * @generated
	 */
	public Adapter createDRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.viewpoint.DSemanticDecorator <em>DSemantic Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.viewpoint.DSemanticDecorator
	 * @generated
	 */
	public Adapter createDSemanticDecoratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.viewpoint.DLabelled <em>DLabelled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.viewpoint.DLabelled
	 * @generated
	 */
	public Adapter createDLabelledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.viewpoint.DMappingBased <em>DMapping Based</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.viewpoint.DMappingBased
	 * @generated
	 */
	public Adapter createDMappingBasedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.viewpoint.DStylizable <em>DStylizable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.viewpoint.DStylizable
	 * @generated
	 */
	public Adapter createDStylizableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.viewpoint.DRepresentationElement <em>DRepresentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.viewpoint.DRepresentationElement
	 * @generated
	 */
	public Adapter createDRepresentationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BindingdialectAdapterFactory