package ar.edu.udemy.practicas.peliculas.datos;

import java.io.*;

public class Archivos {

	private File archivo;

	public Archivos(String Nombre) {
		archivo = new File(Nombre);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.close();
			System.out.println("archivo creado");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
	}

	public void escribirArchivos(String nombreDelArchivo, String Contenido) {
		archivo = new File(nombreDelArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.println(Contenido);
			salida.close();
			System.out.println("archivo creado");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
	}

	public void anexarArchivos(String nombreDelArchivo, String Contenido) {
		archivo = new File(nombreDelArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			salida.println(Contenido);

			System.out.println("se ha agregado el contenido: \n" + Contenido + "\n al archivo.");
			salida.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}

	public void leerArchivos(String nombreDelArchivo) {
		archivo = new File(nombreDelArchivo);
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));

			String lectura = entrada.readLine();
			while (lectura != null) {
				System.out.println(lectura + "\n");
				entrada.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
