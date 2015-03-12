package ar.com.poli.taller2.clasesinternas.localmetodo;

public class OuterTest {

    public static void main (String [] args) {
        Outer o1 = new Outer();
        o1.method1();

        // No puedo acceder a la clase interna
        //Inner in = new Inner(); // NC
    }

}

