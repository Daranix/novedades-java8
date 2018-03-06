package com.panel.java8.ejemplo01lambdas;
@FunctionalInterface // No es necesario declararla
interface Buscar{
    public void buscar();
}
public class EjemploConExpresionLambda {
    public static void main(String[] args) {
        int encontrados=3;
        Buscar b=()->{
            System.out.println("encontrado "+encontrados);
};
        b.buscar();
    }
}