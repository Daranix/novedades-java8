package com.panel.java8.ejemplo04optional;
interface EjemploDefault{
      default void porDefecto(){
          System.out.println("Este por defecto");
          esteEsAbstract("texto");
      }
      void esteEsAbstract(String mensajeATrua);
  }
  public class EjemploDefaultApp implements EjemploDefault{
      public void esteEsAbstract(String mensaje){
          System.out.println("Ahora lo implemento con : " + mensaje);
      }
      public static void main(String[] args) {
          EjemploDefaultApp obj = new EjemploDefaultApp();
          obj.porDefecto();
          obj.esteEsAbstract("algo nuevo");
} }
