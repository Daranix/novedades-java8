package com.panel.java8.ejemplo07streams;
import java.util.*;
import java.util.stream.Collectors;
public class EjemploConStream {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        List<Producto> productos = new ArrayList<Producto>();
        Random r = new Random();
        int Low = 10;
        int High = 100;
        for (int i = 0; i < 20_000_000; i++) {
            productos.add(new Producto(i, "Producto " + i, r.nextInt(High - Low) + Low));
        }
        List<Float> preciosStream = productos.
        		stream().
        		filter(p -> p.precio < 20).
        		map(p -> p.precio)
                .collect(Collectors.toList());
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000000; // divide by 1000000 to get milliseconds.
        System.out.println(preciosStream.size() + " elementos en " + duration + " segundos");
    }
}