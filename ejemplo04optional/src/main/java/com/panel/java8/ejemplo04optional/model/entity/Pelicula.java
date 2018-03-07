package com.panel.java8.ejemplo04optional.model.entity;

import java.util.Optional;

public class Pelicula {
	private Integer id;
	private String titulo;
	private Optional<Director> director;
	
	public Pelicula() {
		super();
		this.setDirector(Optional.empty());
	}
	public Pelicula(Integer id, String titulo) {
		super();
		this.setId(id);
		this.setTitulo(titulo);
		this.setDirector(Optional.of(new Director("Alfredo Lambda")));
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Optional<Director> getDirector() {
		return director;
	}
	public void setDirector(Optional<Director> director) {
		this.director = director;
	}
}
