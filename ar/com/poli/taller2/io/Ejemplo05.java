package ar.com.poli.taller2.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo05 {

	public static void main(String[] args) {
		try {
			FileInputStream fr = new FileInputStream("source.txt");
			FileOutputStream fw = null;
			try {
				fw = new FileOutputStream("target.txt");
				byte [] buffer = new byte[15];
				int dato;
				long start = System.currentTimeMillis();
				while ((dato = fr.read(buffer)) != -1) {
					System.out.println(dato);
					fw.write(buffer, 0, dato);
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
