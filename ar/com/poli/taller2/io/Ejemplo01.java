package ar.com.poli.taller2.io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ejemplo01 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		try {
			int entero = s.nextInt();
			System.out.println(entero);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
