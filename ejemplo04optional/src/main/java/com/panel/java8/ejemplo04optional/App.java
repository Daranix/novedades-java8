package com.panel.java8.ejemplo04optional;

import java.util.Optional;

import com.panel.java8.ejemplo04optional.model.entity.Direccion;
import com.panel.java8.ejemplo04optional.model.entity.Director;
import com.panel.java8.ejemplo04optional.model.entity.Pelicula;
import com.panel.java8.ejemplo04optional.model.logic.GestionPeliculas;

public class App {
	private static Optional<Pelicula> buscarOptional;

	public static void main(String[] args) {
		GestionPeliculas peliculas = new GestionPeliculas();
		Pelicula pelicula = peliculas.buscar(3);
		System.out.println(pelicula.getTitulo());
		Pelicula p2 = peliculas.buscar(2000);
		//System.out.println(p2.getTitulo());
		Optional<Pelicula> buscarOptional1 = peliculas.buscarOptional(3);
		if(buscarOptional1.isPresent()) {
			System.out.println(buscarOptional1.get().getTitulo());
		}
		Optional<Pelicula> buscarOptional2 = peliculas.buscarOptional(3000);
		if(buscarOptional2.isPresent()) {
			System.out.println(buscarOptional2.get().getTitulo());
		}
		//buscarOptional2.get().getTitulo();
		
		Optional<Pelicula> buscarOptional3 = peliculas.buscarOptional(1);
		if(buscarOptional3.isPresent()) {
			Optional<Director> director = buscarOptional3.get().getDirector();
			if(director.isPresent()) {
				Optional<Direccion> direccion = director.get().getDireccion();
				if(direccion.isPresent()) {
					System.out.println(direccion.get().getCiudad());
				}
			}
		}
		buscarOptional3.ifPresent(peli->System.out.println(peli.getTitulo()));
		
		Optional<String> ciudad = buscarOptional3.
				// flatMap cuando devuelve un Optional
			flatMap(p -> p.getDirector()).
			flatMap(d -> d.getDireccion()).
			// cuando devuelve un objeto no Optional
			map(dir -> dir.getCiudad());
		if(ciudad.isPresent()) {
			System.err.println(ciudad.get());
		}
		String resultado = buscarOptional3.
			flatMap(p -> p.getDirector()).
				flatMap(d -> d.getDireccion()).
					map(dir -> dir.getCiudad()).
						filter(c -> c.equals("León")).
						orElse("No es león");
		System.out.println(resultado);
						}
}






