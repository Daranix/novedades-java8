package com.panel.java8.ejemplo07streams;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import com.panel.java8.ejemplo07streams.model.entity.Empresario;
import com.panel.java8.ejemplo07streams.model.entity.Sobre;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Empresario e1 = new Empresario(1, "Amancio Hortiga", "Zara");
        Empresario e2 = new Empresario(2, "Botines", "Bancos rojos");
        Empresario e3 = new Empresario(3, "Flo", "A ce Ese que te digo yo");
        List<Sobre> sobres = new LinkedList<>();
        Sobre sobre1 = new Sobre(1,e1,25000d);
        Sobre sobre2 = new Sobre(2,e2,35000d);
        Sobre sobre3 = new Sobre(3,e3,52000d);
        sobres.add(sobre1);
        sobres.add(sobre2);
        sobres.add(sobre3);
        sobres.add(new Sobre(4, e1, 24000d));
        sobres.add(new Sobre(5, e1, 52000d));
        sobres.add(new Sobre(6, e1, 42000d));
        sobres.add(new Sobre(7, e2, 22000d));
        sobres.add(new Sobre(8, e2, 202200d));
        sobres.add(new Sobre(9, e1, 20020d));
        sobres.add(new Sobre(10, e3, 20400d));
        sobres.add(new Sobre(11, e1, 23000d));
        sobres.add(new Sobre(12, e3, 202200d));
        
        sobres.forEach((sobre)->System.out.println("---"+sobre));
        
        Stream<Sobre> streamDeSobres = sobres.stream();
        long total = streamDeSobres.count();
        System.out.println("Total de sobres a repartir " + total);
        try {
        		System.out.println("Total de sobres a repartir " + streamDeSobres.count());
        }catch(Exception e) {
        		System.err.println("No podemos usar un stream dos veces!!");
        }
        sobres.
        		stream().
        			forEach(f -> System.out.println(""));
        sobres.stream()
        		.filter(f->{
        			System.out.println(f+""+(f.getTotal()>25000D));
        			return f.getTotal() > 25000D;
        		}).forEach(f->System.out.println("---"+f.getTotal()+ " " + f.getEmpresario().getNombre()));
   
        int id = 3;
        sobres.stream()
        		.filter(s->s.getTotal() > 25000d)
        			.filter(s->s.getId() == id)
        				.forEach(s->System.out.println("Ha llegado "+ s));
        Iterator<Sobre> iterator = sobres.stream()
        		.filter(s->s.getTotal() > 25000d).iterator();
        System.err.println("-----");
        while(iterator.hasNext()) {
        		Sobre next = iterator.next();
        		System.out.println(next);
        }
        
        
        boolean esUnNombreVago = sobres.stream()
		.filter(s->s.getTotal() < 25000d)
			.allMatch(s->s.getTotal()>14000d);
        System.out.println("Todos los sobres tienen mas de 14000? " + esUnNombreVago);
        
        boolean esOtroNombreVago = sobres.stream()
        		.filter(s->s.getTotal() < 25000d)
        			.anyMatch(s->s.getTotal()>14000d);
        System.out.println("Hay algún sobre mayor de 14000? " + esOtroNombreVago);
        
        Optional<Sobre> elDeMayorValor = sobres.stream().max(
        			(s1,s2)->{
        				return s1.getTotal().intValue() - s2.getTotal().intValue();
        			});
        List<Empresario> empresarios = sobres.stream()
        		.map(s -> s.getEmpresario()).
        			collect(Collectors.toList());
        
        System.out.println("El max" + elDeMayorValor.get());
        
        
        
    
    
    }
    			
    			
    // Metodos al comienzo del stream
    
    // Al final
    // forEach
	
}














