package com.panel.java8.ejemplo03forEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {
	public static void main(String[] args) {
		
		List<String> listaDeExitos = new ArrayList<>();
		listaDeExitos.add("No woman no cri cri");
		listaDeExitos.add("Todos los de los gandules!!");
		
		//for listaDeExitos.size()
		//Iterator<String> iterator = listaDeExitos.iterator();
		for(String exito : listaDeExitos) {
			System.out.println(exito);
		}
		listaDeExitos.forEach(exito->System.out.println(exito));
		// ArrayList
		// LinkedList
		// []
		Map<String,String> diccionario = new HashMap<>();
		diccionario.put("Cabron", "Macho de la cabra");
		diccionario.put("Otro Cabron", "Otro macho macho man!");
		//Set<String> keySet = diccionario.keySet();
		//keySet.iterator();
		diccionario.forEach((clave,valor)->{
			System.out.println(clave+ " -> " + valor);
			});
		
	}
	
}
