package com.panel.java8.ejemplo04optional.model.logic;

import java.util.Optional;

import com.panel.java8.ejemplo04optional.model.entity.Pelicula;

public class GestionPeliculas {
	public Pelicula buscar(Integer id) {
		switch (id) {
		case 1:
			return new Pelicula(1, "Alien");
		case 2:
			return new Pelicula(2, "Die Hard");
		case 3:
			return new Pelicula(3, "Bracula");
		default:
			return null;
		}
	}
	public Optional<Pelicula> buscarOptional(Integer id){
		switch (id) {
		case 1:
			return Optional.of(new Pelicula(1, "Alien"));
		case 2:
			return Optional.of(new Pelicula(2, "Die Hard"));
		case 3:
			return Optional.of(new Pelicula(3, "Bracula"));
		default:
			return Optional.empty();
		}
	}
}
