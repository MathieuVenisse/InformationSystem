package org.obeonetwork.dsl.cinematic.view.spec;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.obeonetwork.dsl.cinematic.view.AbstractViewElement;
import org.obeonetwork.dsl.cinematic.view.ViewContainer;
import org.obeonetwork.dsl.cinematic.view.ViewContainerReference;
import org.obeonetwork.dsl.cinematic.view.ViewElement;
import org.obeonetwork.dsl.cinematic.view.ViewPackage;
import org.obeonetwork.dsl.cinematic.view.impl.ViewContainerImpl;

public class ViewContainerSpec extends ViewContainerImpl {
	@Override
	public EList<ViewContainer> getViewContainers() {
		List<ViewContainer> viewContainers = new ArrayList<ViewContainer>();
		for (AbstractViewElement element : getOwnedElements()) {
			if (element instanceof ViewContainer) {
				viewContainers.add((ViewContainer)element);
			}
		}
		return new EcoreEList.UnmodifiableEList<ViewContainer>(
				this,
				ViewPackage.Literals.VIEW_CONTAINER__VIEW_CONTAINERS,
				viewContainers.size(),
				viewContainers.toArray());
	}
	@Override
	public EList<ViewElement> getViewElements() {
		List<ViewElement> viewElements = new ArrayList<ViewElement>();
		for (AbstractViewElement element : getOwnedElements()) {
			if (element instanceof ViewElement) {
				viewElements.add((ViewElement)element);
			}
		}
		return new EcoreEList.UnmodifiableEList<ViewElement>(
				this,
				ViewPackage.Literals.VIEW_CONTAINER__VIEW_CONTAINERS,
				viewElements.size(),
				viewElements.toArray());
	}
	
	@Override
	public EList<ViewContainerReference> getViewContainerReferences() {
		List<ViewContainerReference> viewContainerReferences = new ArrayList<ViewContainerReference>();
		for (AbstractViewElement element : getOwnedElements()) {
			if (element instanceof ViewContainerReference) {
				viewContainerReferences.add((ViewContainerReference)element);
			}
		}
		return new EcoreEList.UnmodifiableEList<ViewContainerReference>(
				this,
				ViewPackage.Literals.VIEW_CONTAINER__VIEW_CONTAINERS,
				viewContainerReferences.size(),
				viewContainerReferences.toArray());
	}
}