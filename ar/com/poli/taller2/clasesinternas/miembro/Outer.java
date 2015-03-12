package ar.com.poli.taller2.clasesinternas.miembro;

public class Outer {

    class Inner {
        
        private int inner;
  
        public void innerMethod() {
            // desde la clase interna puedo
            // acceder a los miembros de la
            // clase externa
            outer = 1;   
        }
    
    }

    private int outer;

    public void outerMethod() {
	// Dentro de la clase externa puedo 
        // instanciar objetos de la clase
        // interna sin problemas
        Inner in = new Inner();
    }

}

