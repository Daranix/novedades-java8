package com.panel.java8.ejemplo02InterfacesFuncionales;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface VerPartido {
	void campo(String nombreDelCampo);
}
class AhoraVieneLoBueno{
	public void hazLoQueQuieras(String cadena,Consumer<String> consumidor) {
		consumidor.accept(cadena);
	}
}
class ConClase {
	
	public ConClase(String valor) {
		super();
		System.out.println("Acabo de crearme con valor " + valor + "!");
	}
	public ConClase() {
		super();
	}
	void estoEsUnMetodo(String cadena) {
		System.out.println("Yo visto " + cadena + " con clase");
	}
}
interface ConClaseYObject <T>{
		T estoDevuelveUnObject(String loQueNecesite);
}

public class App {
	public static void main(String[] args) {
		VerPartido tele = null;

		tele = System.out::println;
		tele.campo("Parque de los Principes");
		ConClase objetoConClase = new ConClase();
		tele = objetoConClase::estoEsUnMetodo;
		tele = new ConClase()::estoEsUnMetodo;
		//tele = new ConClase()::estoEsUnMetodo;

		tele.campo("Parque de los Principes");
		ConClaseYObject<ConClase> ccyo = ConClase::new;
		ConClase objeto = ccyo.estoDevuelveUnObject("Mis miserias");
		objeto.estoEsUnMetodo("y sus cosas");
		AhoraVieneLoBueno esoEs = new AhoraVieneLoBueno();
		esoEs.hazLoQueQuieras("Raaro raaro", System.out::println);
		esoEs.hazLoQueQuieras("otra cadena", new ConClase()::estoEsUnMetodo);
		
		
		List<ConClase> lista = new ArrayList<>();
		lista.add(objeto);
		algo(lista);
		lista.size();
		// esto nooooo!!!! lista.add("asldijasd");
		
		// consumer: public void accept(T t)
		Consumer<String> consumidor = txt -> System.out.println("valor  : " + txt);
		consumidor.accept("valor");
		
		// predicate: public boolean test(T t)
		Predicate<String> filtro = txt -> txt.length() < 10;
		System.out.println("valor: "+filtro.test("fistror"));
		System.out.println("valor: "+filtro.test("Fistro pecador de la pradera de la muerte mala"));
		
		// function<tipo1,tipo2>: tipo2 apply(tipo1)
		Function<String,String> funcionDeTransformacion = (txt)->txt.toUpperCase();
		System.out.println(funcionDeTransformacion.apply("va siendo hora ya no"));
		
		// supplier T get()
		Supplier<Double> supplier = Math::random;
		System.out.println(supplier.get());
		
	}
	public static void algo(List lista) {
		lista.add("li que me de la gana");
	}
}
