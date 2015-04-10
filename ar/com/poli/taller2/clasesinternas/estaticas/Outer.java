package ar.com.poli.taller2.clasesinternas.estaticas;

public class Outer {

    public static class Inner {
     
        private int i;

        public void innerMethod () {
            // No puedo acceder a los campos de instancia
            // desde una clase interna estática
            //outterField = 1; // NC 
        }

    }

    private int outerField;

    public void outerMethod() {
        // Puedo crear instancias de la misma
	Inner in = new Inner(); 
    }

}

