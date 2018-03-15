package com.curso.osgi.ejemplo10eventlistener.listeners;

import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;

public class EventListenerConDos  implements BundleListener{

	@Override
	public void bundleChanged(BundleEvent event) {
		System.err.println("Evento " + event.getBundle().getSymbolicName() + " " + event);
	}

}
