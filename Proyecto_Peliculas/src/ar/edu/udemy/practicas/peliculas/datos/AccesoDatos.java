package ar.edu.udemy.practicas.peliculas.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ar.edu.udemy.practicas.peliculas.Pelicula;
import ar.edu.udemy.practicas.peliculas.excepciones.AccesoDatosEx;
import ar.edu.udemy.practicas.peliculas.excepciones.DatosNulos;
import ar.edu.udemy.practicas.peliculas.excepciones.EscrituraDeDatosEx;
import ar.edu.udemy.practicas.peliculas.excepciones.LecturaDatosEx;

public interface AccesoDatos {
	
	public Boolean existe (String nombreDelArchivo) throws AccesoDatosEx;
	public List <Pelicula> listar (String nombre) throws LecturaDatosEx;
	public void escribir(Pelicula pelicula, String nombreDelArchivo,Boolean anexar) throws EscrituraDeDatosEx, DatosNulos, AccesoDatosEx, NullPointerException;
	public String buscar (String nombreDelArchivo, String buscar) throws LecturaDatosEx;
	public void crear(String nombreDelArchivo) throws AccesoDatosEx;
	public void borrar(String nombreDelArchivo) throws AccesoDatosEx;

	
}