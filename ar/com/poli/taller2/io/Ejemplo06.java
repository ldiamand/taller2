package ar.com.poli.taller2.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo06 {

	public static void main(String[] args) {
		try {
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream("tomcat_1.zip"));
			BufferedOutputStream bos = null;
			try {
				bos = new BufferedOutputStream(
						new FileOutputStream("copia_tomcat_1.zip"));
				int dato;
				long start = System.currentTimeMillis();
				while ((dato = bis.read()) != -1) {
					bos.write(dato);
				}
				long end = System.currentTimeMillis();
				System.out.println(end - start + "ms");
			} finally {
				if (bos != null) {
					bos.close();
				}
				bis.close();
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
