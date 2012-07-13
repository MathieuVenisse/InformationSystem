/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.cinematic.view.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.obeonetwork.dsl.cinematic.CinematicPackage;
import org.obeonetwork.dsl.cinematic.view.ViewAction;
import org.obeonetwork.dsl.cinematic.view.parts.ViewActionPropertiesEditionPart;
import org.obeonetwork.dsl.cinematic.view.parts.ViewViewsRepository;
import org.obeonetwork.dsl.environment.EnvironmentPackage;


// End of user code

/**
 * 
 * 
 */
public class ViewActionViewActionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String VIEWACTION_PART = "ViewAction"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ViewActionViewActionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject viewAction, String editing_mode) {
		super(editingContext, viewAction, editing_mode);
		parts = new String[] { VIEWACTION_PART };
		repositoryKey = ViewViewsRepository.class;
		partKey = ViewViewsRepository.ViewAction.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final ViewAction viewAction = (ViewAction)elt;
			final ViewActionPropertiesEditionPart viewActionPart = (ViewActionPropertiesEditionPart)editingPart;
			// init values
			if (viewAction.getDescription() != null && isAccessible(ViewViewsRepository.ViewAction.Properties.description))
				viewActionPart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, viewAction.getDescription()));
			
			if (viewAction.getName() != null && isAccessible(ViewViewsRepository.ViewAction.Properties.name))
				viewActionPart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, viewAction.getName()));
			
			// init filters
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}





	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ViewViewsRepository.ViewAction.Properties.description) {
			return EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description();
		}
		if (editorKey == ViewViewsRepository.ViewAction.Properties.name) {
			return CinematicPackage.eINSTANCE.getNamedElement_Name();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ViewAction viewAction = (ViewAction)semanticObject;
		if (ViewViewsRepository.ViewAction.Properties.description == event.getAffectedEditor()) {
			viewAction.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ViewViewsRepository.ViewAction.Properties.name == event.getAffectedEditor()) {
			viewAction.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			ViewActionPropertiesEditionPart viewActionPart = (ViewActionPropertiesEditionPart)editingPart;
			if (EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description().equals(msg.getFeature()) && viewActionPart != null && isAccessible(ViewViewsRepository.ViewAction.Properties.description)) {
				if (msg.getNewValue() != null) {
					viewActionPart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					viewActionPart.setDescription("");
				}
			}
			if (CinematicPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && viewActionPart != null && isAccessible(ViewViewsRepository.ViewAction.Properties.name)) {
				if (msg.getNewValue() != null) {
					viewActionPart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					viewActionPart.setName("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (ViewViewsRepository.ViewAction.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description().getEAttributeType(), newValue);
				}
				if (ViewViewsRepository.ViewAction.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CinematicPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CinematicPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}