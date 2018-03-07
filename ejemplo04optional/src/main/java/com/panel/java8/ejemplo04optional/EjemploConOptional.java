package com.panel.java8.ejemplo04optional;
import java.util.Optional;

public class EjemploConOptional {
	public static void main(String[] args) {
		String[] cadena = new String[3];
		Optional<String> testNull = Optional.ofNullable(cadena[2]);
		if (testNull.isPresent()) {
			String cadenaEnMinusculas = cadena[2].toLowerCase();
			System.out.println(cadenaEnMinusculas);
		} else {
			System.out.println("No hay cadena en la posicio n indicada");
		}
	}
}