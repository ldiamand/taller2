package ar.com.poli.taller2.clasesinternas.estaticas;

import ar.com.poli.taller2.clasesinternas.estaticas;

public class OuterTest {

    public static void main (String [] args) {
        // No necesito una instancia de la clase
        // contenedora para crear una instancia
        // de la clase interna
        Outer.Inner in1 = new Inner();
    }

} 

