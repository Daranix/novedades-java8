package com.curso.osgi.dao.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.curso.osgi.dao.IEjemploDao;
import com.curso.osgi.dao.impl.EjemploDao;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private ServiceRegistration<?> service;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Publicando servicio");
		service = bundleContext.registerService(IEjemploDao.class.getName(), new EjemploDao(), null);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		service.unregister();
	}

}
