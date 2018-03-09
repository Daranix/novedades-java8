package com.panel.java8.ejemplo07streams;
import java.util.*;
class Producto {
    int id;
    String nombre;
    float precio;
    public Producto(int id, String nombre, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
}
// Este puede producir Java Heap!
public class EjemploSinStream {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        List<Producto> productos = new ArrayList<Producto>();
        Random r = new Random();
        int Low = 10;
        int High = 100;
        long l = 1_000;
        for (int i = 0; i < 20_000_000; i++) {
            productos.add(new Producto(i, "Producto " + i, r.nextInt(High - Low) + Low));
        }
        List<Float> precios = new ArrayList<Float>();
        for (Producto producto : productos) {
            if (producto.precio < 20) {
                precios.add(producto.precio);
} }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000000; // divide by 1000000 to get milliseconds.
        System.out.println(precios.size() + " elementos en " + duration + " segundos");
    }
}