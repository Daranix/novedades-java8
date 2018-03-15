package com.curso.osgi.ejemplo10eventlistener;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.curso.osgi.ejemplo10eventlistener.listeners.EventListenerConDos;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private static EventListenerConDos eventListenerConDos;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		Activator.eventListenerConDos = new EventListenerConDos();
		bundleContext.addBundleListener(Activator.eventListenerConDos);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		bundleContext.removeBundleListener(Activator.eventListenerConDos);
	}

}
