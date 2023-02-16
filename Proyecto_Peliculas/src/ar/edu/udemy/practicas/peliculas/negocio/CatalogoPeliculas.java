package ar.edu.udemy.practicas.peliculas.negocio;

import java.util.List;

import ar.edu.udemy.practicas.peliculas.Pelicula;
import ar.edu.udemy.practicas.peliculas.excepciones.AccesoDatosEx;
import ar.edu.udemy.practicas.peliculas.excepciones.DatosNulos;

public interface CatalogoPeliculas {
	
	String RECURSO = "peliculas.txt"; 
	
	public Boolean agregarPelicula(String nombreDePelicula, Boolean anexar) throws DatosNulos, AccesoDatosEx;
	public void listarPelicula();
	public String buscarPelicula(String buscar);
	public void iniciarCatalogo ();
	
}
