package com.panel.java8.ejemplo01lambdas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@FunctionalInterface
interface AlfredoLambda {
	void actuar();
}
@FunctionalInterface
interface ArnoldSchwartzenegger{
	String aDarYoyas(String aQuienLeDoy);
}
@FunctionalInterface
interface BatmanYRobin{
	String darPalizas(String batman,String robin);
}
public class App 
{
    public static void main( String[] args )
    {
        AlfredoLambda miLambda = ()->{
        		System.out.println("Actuandoooooo.....");
        };
        miLambda.actuar();
        
        JButton botoncillo = new JButton("Esta es mi miseria a las 19:23");
        botoncillo.addActionListener((tomaEventoMach)->{System.out.println("Y esto es solo el principio");});
        ArnoldSchwartzenegger mazas = algunoDeVosotros->"A ti " + algunoDeVosotros + " te voy a dar mas yoyas quel copón";
        String  result = mazas.aDarYoyas("Mi jefa");
        System.out.println(result);
        BatmanYRobin br = (b,r)->
        		"Y cada uno a repartir yoyas, primero "+ b.toLowerCase() + " como Batman y luego " +
        				r.toUpperCase() + "como Robin";
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
