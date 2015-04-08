package ar.com.poli.taller2.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo03 {

	public static void main(String[] args) {
		System.out.println("Copiando...");
		try {
			FileInputStream fr = new FileInputStream("tomcat_1.zip");
			FileOutputStream fw = null;
			try {
				fw = new FileOutputStream("copia_tomcat.zip");
				int dato;
				long start = System.currentTimeMillis();
				while ((dato = fr.read()) != -1) {
					fw.write(dato);
				}
				long end = System.currentTimeMillis();
				System.out.println(end - start + "ms");
			} finally {
				if (fw != null) {
					fw.close();
				}
				fr.close();
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
