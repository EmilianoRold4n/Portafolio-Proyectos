package ar.edu.udemy.practicas.peliculas.datos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import ar.edu.udemy.practicas.peliculas.Pelicula;
import ar.edu.udemy.practicas.peliculas.excepciones.AccesoDatosEx;
import ar.edu.udemy.practicas.peliculas.excepciones.DatosNulos;
import ar.edu.udemy.practicas.peliculas.excepciones.EscrituraDeDatosEx;
import ar.edu.udemy.practicas.peliculas.excepciones.LecturaDatosEx;

public class AccesoDatosImpl implements AccesoDatos {

	// private List<Pelicula> peliculas = new ArrayList<Pelicula>();

	public AccesoDatosImpl() {
		super();
	}

//	public AccesoDatosImpl(String nombreDeArchivo){
//		super();
//		this.archivo = new Archivos (nombreDeArchivo);
//	}
//	

	@Override
	public Boolean existe(String nombreDelArchivo) {
		File nuevo = new File(nombreDelArchivo);
		return nuevo.exists();

	}

	@Override
	public List<Pelicula> listar(String nombreDelArchivo) throws LecturaDatosEx {
		File archivo = new File(nombreDelArchivo);
		List<Pelicula> peliculas = new ArrayList<Pelicula>();
		try {
			BufferedReader lecturaDeArchivo = new BufferedReader(new FileReader(archivo));

			String lineaACargar;
			lineaACargar = lecturaDeArchivo.readLine();
			while (lineaACargar != null) {
				Pelicula pelicula = new Pelicula(lineaACargar);
				peliculas.add(pelicula);
				lineaACargar = lecturaDeArchivo.readLine();
			}
			lecturaDeArchivo.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new LecturaDatosEx("No se pudo Listar/leer pelicula/Archivo: " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return peliculas;
	}

	@Override
	public void escribir(Pelicula pelicula, String nombreDelArchivo, Boolean anexar)
			throws EscrituraDeDatosEx, DatosNulos, AccesoDatosEx, NullPointerException {
		File archivo = new File(nombreDelArchivo);
		if (anexar == null) {
			throw new DatosNulos("no se han podido leer los datos, verifique opciones nulas");
			//Comentario, se utilizo un condicional, ya que, el programa no podia realizar el correcto catch sobre el nullPointerException para manejar la excepción con sutileza y correcta funcion.
		}

		{
			if (anexar == true && anexar != null) {
				try {
					PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
					salida.println(pelicula.toString());

					System.out.println("se ha agregado el contenido: \n" + pelicula + "\n al archivo.");
					salida.close();
				} catch (RuntimeException e) {
					e.printStackTrace();

					throw new DatosNulos("no se han podido leer los datos, verifique opciones nulas" + e.getMessage());

				} catch (FileNotFoundException e) {
					e.printStackTrace();
					throw new EscrituraDeDatosEx("No se ha podido escribir el archivo" + e.getMessage());

				} catch (IOException e) {
					e.printStackTrace(System.out);
				}

			} else {
				try {
					PrintWriter salida = new PrintWriter(archivo);
					salida.println(pelicula);
					salida.close();

				} catch (RuntimeException e) {
					e.printStackTrace();
					throw new DatosNulos("no se han podido leer los datos, verifique opciones nulas" + e.getMessage());

				} catch (FileNotFoundException e) {
					e.printStackTrace();
					throw new EscrituraDeDatosEx("No se ha podido escribir el archivo" + e.getMessage());
				}

			}
		}

	}

	@Override
	public String buscar(String nombreDelArchivo, String buscar) {
		File archivo = new File(nombreDelArchivo);
		List<String> listaALeer = new ArrayList<String>();
		String resultado = null;
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String lectura = entrada.readLine();
			while (lectura != null) {
				listaALeer.add(lectura);
				lectura = entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
		for (String pelicula : listaALeer) {
			if (pelicula.equalsIgnoreCase(buscar)) {
				int indice = pelicula.indexOf(pelicula.toString()) + 1;
				resultado = "Pelicula encontrada: " + pelicula.toString() + "en la línea: " + indice;
			} else {
				resultado = null;
			}
		}
		return resultado;
	}

	@Override
	public void crear(String nombreDelArchivo) throws AccesoDatosEx {
		File archivo = new File(nombreDelArchivo);
		try {

			PrintWriter salida = new PrintWriter(new FileWriter(archivo));
			salida.close();
			System.out.println("archivo creado");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			throw new AccesoDatosEx("Excepción de creacion de archivo: " + e.getMessage());

		} catch (IOException e) {
			e.printStackTrace();
			throw new AccesoDatosEx("Excepción de creacion de archivo: " + e.getMessage());
		}
	}

	@Override
	public void borrar(String nombreDelArchivo) throws AccesoDatosEx {
		File archivoABorrar = new File(nombreDelArchivo);
		if (archivoABorrar.exists()) {
			archivoABorrar.delete();
			System.out.println("archivo borrado ");
		} else {
			System.out.println("archivo inexistente");
		}
	}

}// ULTIMA LLAVE