/**
 * Copyright (c) 2012-2017 GEMOC consortium.
 * 
 * http://www.gemoc.org
 * 
 * Contributors:
 *   Stephen Creff - ENSTA Bretagne [stephen.creff@ensta-bretagne.fr]
 *   
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * $Id$
 */
package org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.edit.provider;

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

import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.util.EditionExtensionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EditionExtensionItemProviderAdapterFactory extends EditionExtensionAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public EditionExtensionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.IntegerAssignementBlock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerAssignementBlockItemProvider integerAssignementBlockItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.IntegerAssignementBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerAssignementBlockAdapter() {
		if (integerAssignementBlockItemProvider == null) {
			integerAssignementBlockItemProvider = new IntegerAssignementBlockItemProvider(this);
		}

		return integerAssignementBlockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.IntInfEqual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntInfEqualItemProvider intInfEqualItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.IntInfEqual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntInfEqualAdapter() {
		if (intInfEqualItemProvider == null) {
			intInfEqualItemProvider = new IntInfEqualItemProvider(this);
		}

		return intInfEqualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.IntSupEqual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntSupEqualItemProvider intSupEqualItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.IntSupEqual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntSupEqualAdapter() {
		if (intSupEqualItemProvider == null) {
			intSupEqualItemProvider = new IntSupEqualItemProvider(this);
		}

		return intSupEqualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.RealInfEqual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealInfEqualItemProvider realInfEqualItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.RealInfEqual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealInfEqualAdapter() {
		if (realInfEqualItemProvider == null) {
			realInfEqualItemProvider = new RealInfEqualItemProvider(this);
		}

		return realInfEqualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.RealSupEqual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealSupEqualItemProvider realSupEqualItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.RealSupEqual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealSupEqualAdapter() {
		if (realSupEqualItemProvider == null) {
			realSupEqualItemProvider = new RealSupEqualItemProvider(this);
		}

		return realSupEqualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.IntSelfPlusAssignement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntSelfPlusAssignementItemProvider intSelfPlusAssignementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.IntSelfPlusAssignement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntSelfPlusAssignementAdapter() {
		if (intSelfPlusAssignementItemProvider == null) {
			intSelfPlusAssignementItemProvider = new IntSelfPlusAssignementItemProvider(this);
		}

		return intSelfPlusAssignementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.IntSelfMinusAssignement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntSelfMinusAssignementItemProvider intSelfMinusAssignementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.IntSelfMinusAssignement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntSelfMinusAssignementAdapter() {
		if (intSelfMinusAssignementItemProvider == null) {
			intSelfMinusAssignementItemProvider = new IntSelfMinusAssignementItemProvider(this);
		}

		return intSelfMinusAssignementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.IntSelfMultiplyAssignement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntSelfMultiplyAssignementItemProvider intSelfMultiplyAssignementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.IntSelfMultiplyAssignement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntSelfMultiplyAssignementAdapter() {
		if (intSelfMultiplyAssignementItemProvider == null) {
			intSelfMultiplyAssignementItemProvider = new IntSelfMultiplyAssignementItemProvider(this);
		}

		return intSelfMultiplyAssignementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.IntSelfDivideAssignement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntSelfDivideAssignementItemProvider intSelfDivideAssignementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.IntSelfDivideAssignement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntSelfDivideAssignementAdapter() {
		if (intSelfDivideAssignementItemProvider == null) {
			intSelfDivideAssignementItemProvider = new IntSelfDivideAssignementItemProvider(this);
		}

		return intSelfDivideAssignementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.RealSelfPlusAssignement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealSelfPlusAssignementItemProvider realSelfPlusAssignementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.RealSelfPlusAssignement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealSelfPlusAssignementAdapter() {
		if (realSelfPlusAssignementItemProvider == null) {
			realSelfPlusAssignementItemProvider = new RealSelfPlusAssignementItemProvider(this);
		}

		return realSelfPlusAssignementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.RealSelfMinusAssignement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealSelfMinusAssignementItemProvider realSelfMinusAssignementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.RealSelfMinusAssignement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealSelfMinusAssignementAdapter() {
		if (realSelfMinusAssignementItemProvider == null) {
			realSelfMinusAssignementItemProvider = new RealSelfMinusAssignementItemProvider(this);
		}

		return realSelfMinusAssignementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.RealSelfMultiplyAssignement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealSelfMultiplyAssignementItemProvider realSelfMultiplyAssignementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.RealSelfMultiplyAssignement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealSelfMultiplyAssignementAdapter() {
		if (realSelfMultiplyAssignementItemProvider == null) {
			realSelfMultiplyAssignementItemProvider = new RealSelfMultiplyAssignementItemProvider(this);
		}

		return realSelfMultiplyAssignementItemProvider;
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
		if (integerAssignementBlockItemProvider != null) integerAssignementBlockItemProvider.dispose();
		if (intInfEqualItemProvider != null) intInfEqualItemProvider.dispose();
		if (intSupEqualItemProvider != null) intSupEqualItemProvider.dispose();
		if (realInfEqualItemProvider != null) realInfEqualItemProvider.dispose();
		if (realSupEqualItemProvider != null) realSupEqualItemProvider.dispose();
		if (intSelfPlusAssignementItemProvider != null) intSelfPlusAssignementItemProvider.dispose();
		if (intSelfMinusAssignementItemProvider != null) intSelfMinusAssignementItemProvider.dispose();
		if (intSelfMultiplyAssignementItemProvider != null) intSelfMultiplyAssignementItemProvider.dispose();
		if (intSelfDivideAssignementItemProvider != null) intSelfDivideAssignementItemProvider.dispose();
		if (realSelfPlusAssignementItemProvider != null) realSelfPlusAssignementItemProvider.dispose();
		if (realSelfMinusAssignementItemProvider != null) realSelfMinusAssignementItemProvider.dispose();
		if (realSelfMultiplyAssignementItemProvider != null) realSelfMultiplyAssignementItemProvider.dispose();
	}

}
