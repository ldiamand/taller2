package ar.com.poli.taller2.hilos;

public class Contador {

	private int cont;
	
	public synchronized void inc () {
			cont++;
	}
	
	public void dec() {
		synchronized (this) {
			cont--;
		}
	}
	
	public int getCont() {
		return cont;
	}
}
