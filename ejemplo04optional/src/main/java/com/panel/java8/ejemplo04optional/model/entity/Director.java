package com.panel.java8.ejemplo04optional.model.entity;

import java.util.Optional;

public class Director {
	private static String texto;
	private String nombre;
	private Optional<Direccion> direccion;
	 {
		texto = "";
		System.out.print("adsdas");;
	}
	public static void main(String[] args) {
		System.out.println("Hola");
		new Director();
		
	}
	public Director() {
		super();
		System.out.println("constructor");
		this.direccion = Optional.empty();
	}
	public Director(String nombre) {
		super();
		this.nombre = nombre;
		this.direccion = Optional.of(new Direccion("Mayor","Pucela"));
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Optional<Direccion> getDireccion() {
		return direccion;
	}
	public void setDireccion(Optional<Direccion> direccion) {
		this.direccion = direccion;
	}
}
