package ar.com.poli.taller2.io;

import java.io.IOException;
import java.io.PrintStream;


public class Ejemplo02 {

	public static void main(String[] args) throws IOException {
		System.setOut(new PrintStream("ejemplo.txt"));
		System.out.println("Hola");
		System.out.println("Chau");
		System.out.println("Pepe");
	}
}
