package ar.com.poli.taller2.hilos;

public class HiloInc extends Thread {

	private Contador c;
	
	public HiloInc (Contador c) {
		this.c = c;
		System.out.println("Termino hilo inc");
	}
	
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			c.inc();
		}
	}
}
