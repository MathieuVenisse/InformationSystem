/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.ecorebinding.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.obeonetwork.dsl.ecorebinding.util.EcorebindingAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EcorebindingItemProviderAdapterFactory extends EcorebindingAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcorebindingItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.ecorebinding.BModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BModelItemProvider bModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.ecorebinding.BModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBModelAdapter() {
		if (bModelItemProvider == null) {
			bModelItemProvider = new BModelItemProvider(this);
		}

		return bModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.ecorebinding.BPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPackageItemProvider bPackageItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.ecorebinding.BPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBPackageAdapter() {
		if (bPackageItemProvider == null) {
			bPackageItemProvider = new BPackageItemProvider(this);
		}

		return bPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.ecorebinding.BClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BClassItemProvider bClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.ecorebinding.BClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBClassAdapter() {
		if (bClassItemProvider == null) {
			bClassItemProvider = new BClassItemProvider(this);
		}

		return bClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.ecorebinding.BFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BFeatureItemProvider bFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.ecorebinding.BFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBFeatureAdapter() {
		if (bFeatureItemProvider == null) {
			bFeatureItemProvider = new BFeatureItemProvider(this);
		}

		return bFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.ecorebinding.BEnum} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BEnumItemProvider bEnumItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.ecorebinding.BEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBEnumAdapter() {
		if (bEnumItemProvider == null) {
			bEnumItemProvider = new BEnumItemProvider(this);
		}

		return bEnumItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.ecorebinding.BEnumLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BEnumLiteralItemProvider bEnumLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.ecorebinding.BEnumLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBEnumLiteralAdapter() {
		if (bEnumLiteralItemProvider == null) {
			bEnumLiteralItemProvider = new BEnumLiteralItemProvider(this);
		}

		return bEnumLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.ecorebinding.BClassifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BClassifierItemProvider bClassifierItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.ecorebinding.BClassifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBClassifierAdapter() {
		if (bClassifierItemProvider == null) {
			bClassifierItemProvider = new BClassifierItemProvider(this);
		}

		return bClassifierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.ecorebinding.BDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BDataTypeItemProvider bDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.ecorebinding.BDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBDataTypeAdapter() {
		if (bDataTypeItemProvider == null) {
			bDataTypeItemProvider = new BDataTypeItemProvider(this);
		}

		return bDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.ecorebinding.BOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOperationItemProvider bOperationItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.ecorebinding.BOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBOperationAdapter() {
		if (bOperationItemProvider == null) {
			bOperationItemProvider = new BOperationItemProvider(this);
		}

		return bOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.ecorebinding.BParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BParameterItemProvider bParameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.ecorebinding.BParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBParameterAdapter() {
		if (bParameterItemProvider == null) {
			bParameterItemProvider = new BParameterItemProvider(this);
		}

		return bParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.ecorebinding.BTypedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTypedElementItemProvider bTypedElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.ecorebinding.BTypedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTypedElementAdapter() {
		if (bTypedElementItemProvider == null) {
			bTypedElementItemProvider = new BTypedElementItemProvider(this);
		}

		return bTypedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.ecorebinding.BTypeParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTypeParameterItemProvider bTypeParameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.ecorebinding.BTypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBTypeParameterAdapter() {
		if (bTypeParameterItemProvider == null) {
			bTypeParameterItemProvider = new BTypeParameterItemProvider(this);
		}

		return bTypeParameterItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (bModelItemProvider != null) bModelItemProvider.dispose();
		if (bPackageItemProvider != null) bPackageItemProvider.dispose();
		if (bClassItemProvider != null) bClassItemProvider.dispose();
		if (bFeatureItemProvider != null) bFeatureItemProvider.dispose();
		if (bEnumItemProvider != null) bEnumItemProvider.dispose();
		if (bEnumLiteralItemProvider != null) bEnumLiteralItemProvider.dispose();
		if (bClassifierItemProvider != null) bClassifierItemProvider.dispose();
		if (bDataTypeItemProvider != null) bDataTypeItemProvider.dispose();
		if (bOperationItemProvider != null) bOperationItemProvider.dispose();
		if (bParameterItemProvider != null) bParameterItemProvider.dispose();
		if (bTypedElementItemProvider != null) bTypedElementItemProvider.dispose();
		if (bTypeParameterItemProvider != null) bTypeParameterItemProvider.dispose();
	}

}