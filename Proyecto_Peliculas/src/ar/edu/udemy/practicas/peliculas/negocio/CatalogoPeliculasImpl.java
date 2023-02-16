package ar.edu.udemy.practicas.peliculas.negocio;

import java.io.File;
import java.util.List;

import ar.edu.udemy.practicas.peliculas.Pelicula;
import ar.edu.udemy.practicas.peliculas.datos.AccesoDatosImpl;
import ar.edu.udemy.practicas.peliculas.excepciones.AccesoDatosEx;
import ar.edu.udemy.practicas.peliculas.excepciones.DatosNulos;
import ar.edu.udemy.practicas.peliculas.excepciones.EscrituraDeDatosEx;
import ar.edu.udemy.practicas.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {

	private final AccesoDatosImpl datos;

	public CatalogoPeliculasImpl() {
		super();
		this.datos = new AccesoDatosImpl();

	}

	@Override
	public Boolean agregarPelicula(String nombreDePelicula, Boolean anexar) throws AccesoDatosEx, DatosNulos{
		Pelicula pelicula = new Pelicula(nombreDePelicula);
		Boolean resultado=false;
		if (datos.existe(RECURSO)) {
			try {
				datos.escribir(pelicula, RECURSO, anexar);
				resultado = true;
			} catch (EscrituraDeDatosEx e) {
				System.out.println("error de escritura de datos");
				e.printStackTrace(System.out);
			}
		} else {
			try {
				datos.crear(RECURSO);
				datos.escribir(pelicula, RECURSO, anexar);
				resultado = true;
			} catch (AccesoDatosEx e) {
				System.out.println("no se pudo acceder a los datos");
				e.printStackTrace(System.out);
			} catch (NullPointerException e) {
			
				throw new DatosNulos("no se han podido leer los datos, verifique opciones nulas" + e.getMessage());
			}

		}
		return resultado;
	}

	@Override
	public void listarPelicula() {

		try {
			List<Pelicula> listar = this.datos.listar(RECURSO);
			for (Pelicula pelicula : listar) {
				System.out.println("Nombre: " + pelicula.toString());
			}
			
		} catch (LecturaDatosEx e) {
			System.out.println("Error de Lectura de datos");
			e.printStackTrace(System.out);
		}

	}

	@Override
	public String buscarPelicula(String buscar) {
		String encontrado = null;
		String mensaje;
		encontrado = datos.buscar(RECURSO, buscar);
		if (encontrado == null) {
			mensaje = "Pelicula no encontrada ";
		} else {
			mensaje = "Pelicula encontrada: " + encontrado;
		}
		return mensaje;
	}

	@Override
	public void iniciarCatalogo() {
		try {
			if (this.datos.existe(RECURSO)) {
				datos.borrar(RECURSO);
				datos.crear(RECURSO);
			} else {
				datos.crear(RECURSO);
			}
		} catch (AccesoDatosEx e) {
			System.out.println("error al Iniciar Catalogo");
			e.printStackTrace(System.out);
		}

	}

}
