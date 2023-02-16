package ar.edu.udemy.practicas.peliculas.excepciones;


@SuppressWarnings ("serial")
public class AccesoDatosEx extends Exception {
	
	public AccesoDatosEx (String mensaje) {
		super(mensaje);
		//agregar el trhows al metodo
	}

}
