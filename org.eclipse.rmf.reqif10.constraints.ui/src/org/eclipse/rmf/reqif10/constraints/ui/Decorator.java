package org.eclipse.rmf.reqif10.constraints.ui;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.rmf.reqif10.constraints.ui.popup.actions.ValidateReqIF;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.ResourceUtil;

public class Decorator implements ILabelDecorator {

	public static final String DECORATOR_ID = "org.eclipse.rmf.reqif10.constraints.ui.decorator";
	
	private final static ImageDescriptor WARNING_OVERLAY = PlatformUI.getWorkbench()
			.getSharedImages()
			.getImageDescriptor(ISharedImages.IMG_DEC_FIELD_WARNING);
	
	private final static ImageDescriptor ERROR_OVERLAY = PlatformUI.getWorkbench()
			.getSharedImages()
			.getImageDescriptor(ISharedImages.IMG_DEC_FIELD_ERROR);

	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
	}

	@Override
	public Image decorateImage(Image baseImage, Object element) {
		if (getSeverity(element) <= 0) {
			// OK
			return null;
		}
		ImageDescriptor overlayImage = null;
		if (getSeverity(element) == 1) {
			// WARNING
			overlayImage = WARNING_OVERLAY;
		} else {
			overlayImage = ERROR_OVERLAY;
		}

		DecorationOverlayIcon decoratedImage = new DecorationOverlayIcon(
				baseImage, overlayImage, IDecoration.BOTTOM_LEFT);

		return decoratedImage.createImage();
	}

	@Override
	public String decorateText(String text, Object element) {
		return null;
	}

	private int getSeverity(Object element) {
		int severity = 0;
		try {
			final IResource resource = ResourceUtil.getResource(element);
			severity = resource.findMaxProblemSeverity(
					ValidateReqIF.MARKER_TYPE, true, IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
		}
		return severity;
	}

}
