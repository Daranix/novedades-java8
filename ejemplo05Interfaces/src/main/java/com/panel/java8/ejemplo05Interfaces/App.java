package com.panel.java8.ejemplo05Interfaces;

/**
 * Hello world!
 *
 */
@FunctionalInterface
interface InterfazUno{
	default void metodoPorDefecto() {
		System.out.println("Por Defecto Uno");
	}
	static void miMetodoDeClase() {
		System.out.println("Metodo de clase");
	}
	void metodoAbstractoUno();
}
@FunctionalInterface
interface InterfazDos{
	void metodoAbstractoDos();
	default void metodoPorDefecto() {
		System.out.println("PorDefectoDos");
	}
}

class MiClaseConIfaces implements InterfazUno,InterfazDos {

	@Override
	public void metodoAbstractoUno() {
		System.out.println("Toma metodo uno con MCCI");
		
	}

	@Override
	public void metodoAbstractoDos() {
		System.out.println("Toma metodo dos con MCCI");
		
	}

	@Override
	public void metodoPorDefecto() {
		
		InterfazUno.super.metodoPorDefecto();
	}
	
}
class LaLecheEnPolvo implements InterfazUno,LaLeche,InterfazDos{

	@Override
	public void metodoAbstractoUno() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodoAbstractoDos() {
		// TODO Auto-generated method stub
		
	}
	
}
interface LaLeche extends InterfazUno,InterfazDos{

	@Override
	default void metodoPorDefecto() {
		// TODO Auto-generated method stub
		System.out.println("Este");
	}
	
}
public class App 
{
    public static void main( String[] args )
    {
        MiClaseConIfaces miClaseConIfaces = new MiClaseConIfaces();
        miClaseConIfaces.metodoPorDefecto();
    }
}
