package ar.com.poli.taller2.hilos;

public class HiloIncTest {

	public static void main(String[] args) {
		Contador c = new Contador();
		
		HiloInc h1 = new HiloInc(c);
		HiloDec h2 = new HiloDec();
		h2.setContador(c);	
		
		h1.start();
		h2.start();
	
		try {
			h1.join();
			h2.join();
		} catch (InterruptedException e) {
			
		}
		System.out.println("Terminaron los dos hilos");

		System.out.println(c.getCont());
	}
}
