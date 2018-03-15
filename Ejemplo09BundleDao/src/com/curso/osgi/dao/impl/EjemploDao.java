package com.curso.osgi.dao.impl;

import com.curso.osgi.dao.IEjemploDao;

public class EjemploDao implements IEjemploDao {
	/* (non-Javadoc)
	 * @see com.curso.osgi.dao.impl.IEjemploDao#sqlNuevo(java.lang.String)
	 */
	@Override
	public void sqlNuevo(String tabla) {
		System.out.println("SELECT A,B,C,NUEVO FROM " + tabla);
	}
}
