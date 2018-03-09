package com.panel.java8.ejemplo07streams.model.entity;


public class Empresario {
	private int id;
	private String nombre;
	@Override
	public String toString() {
		return "Empresario [id=" + id + ", nombre=" + nombre + ", nombreEmpresa=" + nombreEmpresa + "]";
	}
	private String nombreEmpresa;
	public int getId() {
		return id;
	}
	public Empresario(int id, String nombre, String nombreEmpresa) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nombreEmpresa = nombreEmpresa;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
