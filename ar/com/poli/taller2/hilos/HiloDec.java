package ar.com.poli.taller2.hilos;

public class HiloDec extends Thread {

	private Contador c;
	
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			c.dec();
		}
		System.out.println("Termino hilo dec");
	}

	public void setContador(Contador c) {
		this.c = c;
	}
}
