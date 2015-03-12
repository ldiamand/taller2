package ar.com.poli.taller2.clasesinternas.anonimas;

public class Outer {

    public void method1() {
 
        // ...
      
        method2(new TypeI() {

            public void interfaceMethod() {
                // ...
            }

        });

        // ...

    }

    void method2(TypeI typeI) {
    
        // ...
    
    }

}

