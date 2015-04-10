package ar.com.poli.taller2.clasesinternas.localmetodo;

public class Outer {

    private int outerField;

    public void method1() {
        
        int i = 0;
 
        // Definición de la clase interna
        class Inner {
      
            private int innerField;

            public void innerMethdo() {
    
            }

        };

        // Más código

        // Uso la clase
        Inner in = new Inner();
    }

}

