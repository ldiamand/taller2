package ar.com.poli.taller2.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo04 {

	public static void main(String[] args) {
		System.out.println("Copiando....");
		try {
			FileReader fr = new FileReader("tomcat_1.zip");
			FileWriter fw = null;
			try {
				fw = new FileWriter("copia_tomcat.zip");
				int dato;
				while ((dato = fr.read()) != -1) {
					fw.write(dato);
				}
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
