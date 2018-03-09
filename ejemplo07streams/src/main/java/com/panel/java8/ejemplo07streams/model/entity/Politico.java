package com.panel.java8.ejemplo07streams.model.entity;

import java.util.List;

public class Politico {
	private Integer id;
	private String nombre;
	private String direccion;
	private String telefono;
	private List<Sobre> sobres;
	@Override
	public String toString() {
		return "Politico [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", sobres=" + sobres + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<Sobre> getSobres() {
		return sobres;
	}
	public void setSobres(List<Sobre> sobres) {
		this.sobres = sobres;
	}
	
}
