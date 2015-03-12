package ar.com.poli.taller2.clasesinternas.miembro;

import ar.com.poli.taller2.clasesinternas.miembro.Outer.Inner;

public class OuterTest {

    public static void main (String [] args) {
       // Una forma
       Outer o1 = new Outer();

       // La siguiente referencia a Inner es posible
       // dado que realizamos el import
       Inner in1 = o1.new Inner(); 

       // Otra forma
       Outer.Inner in2 = new Outer().new Inner();
    }

}

