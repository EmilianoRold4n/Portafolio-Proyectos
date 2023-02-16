package ar.edu.udemy.practicas.peliculas.testin;

import ar.edu.udemy.practicas.peliculas.*;
import ar.edu.udemy.practicas.peliculas.datos.AccesoDatos;
import ar.edu.udemy.practicas.peliculas.datos.AccesoDatosImpl;
import ar.edu.udemy.practicas.peliculas.datos.Archivos;
import ar.edu.udemy.practicas.peliculas.excepciones.AccesoDatosEx;
import ar.edu.udemy.practicas.peliculas.excepciones.DatosNulos;
import ar.edu.udemy.practicas.peliculas.excepciones.EscrituraDeDatosEx;
import ar.edu.udemy.practicas.peliculas.negocio.CatalogoPeliculas;
import ar.edu.udemy.practicas.peliculas.negocio.CatalogoPeliculasImpl;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PeliculasTest {

	@Test
	public void queSePuedaCrearUnaPelicula() {
		Pelicula nuevaPelicula = new Pelicula();
		Pelicula otraPelicula = new Pelicula("Batman");
		System.out.println(otraPelicula.getNombre());
		nuevaPelicula.setNombre("Transpoting");
		System.out.println(nuevaPelicula);
		Assert.assertNotNull(nuevaPelicula);
		Assert.assertNotNull(otraPelicula);
	}

	
	@Test(expected = DatosNulos.class)
	public void queNoSePuedanAnexarUnaPeliculaNula() throws EscrituraDeDatosEx, AccesoDatosEx, DatosNulos {
		var catalogo = new CatalogoPeliculasImpl();
		catalogo.iniciarCatalogo();
		String peliculaNueva = "batman";
		catalogo.agregarPelicula(peliculaNueva, null);

	}
	
	

	@Test
	public void queSePuedaIniciarCatalogoNuevo() {
		CatalogoPeliculasImpl catalogo = new CatalogoPeliculasImpl();
		catalogo.iniciarCatalogo();
		Assert.assertNotNull(catalogo);

	}

	@Test
	public void queSePuedaAgregarPelicula() throws DatosNulos, AccesoDatosEx {
		CatalogoPeliculasImpl catalogo = new CatalogoPeliculasImpl();
		catalogo.iniciarCatalogo();
		String peliculaNueva = "batman";
		Boolean vo = catalogo.agregarPelicula(peliculaNueva, false);
		Boolean ve = true;
		Assert.assertEquals(vo, ve);
	}

	@Test
	public void queSePuedaListarPeliculas() throws DatosNulos, AccesoDatosEx {
		CatalogoPeliculasImpl catalogoNumeroDos = new CatalogoPeliculasImpl();
		catalogoNumeroDos.iniciarCatalogo();
		String peliculaNueva = "batman";
		catalogoNumeroDos.agregarPelicula(peliculaNueva, true);
		peliculaNueva = "The Whale";
		catalogoNumeroDos.agregarPelicula(peliculaNueva, true);
		peliculaNueva = "The Reaper";

		Assert.assertNotNull(catalogoNumeroDos.agregarPelicula(peliculaNueva, true));
	}

	@Test
	public void queSePuedaBuscarPeliculas() throws DatosNulos, AccesoDatosEx {
		CatalogoPeliculasImpl catalogo = new CatalogoPeliculasImpl();
		catalogo.iniciarCatalogo();

		String peliculaNueva = "batman";
		catalogo.agregarPelicula(peliculaNueva, false);
		String aver = catalogo.buscarPelicula(peliculaNueva);
		System.out.println(aver);
		assertNotNull(aver);

	}

}
