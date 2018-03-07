package com.panel.java8.ejemplo04optional.model.entity;

public class Direccion {
	private String ciudad;
	private String calle;
	public Direccion(String calle, String ciudad) {
		this.calle = calle;
		this.ciudad = ciudad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}
