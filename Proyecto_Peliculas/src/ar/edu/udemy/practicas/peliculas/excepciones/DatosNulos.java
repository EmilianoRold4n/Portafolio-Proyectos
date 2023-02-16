package ar.edu.udemy.practicas.peliculas.excepciones;

@SuppressWarnings("serial")
public class DatosNulos extends RuntimeException {
	
	public DatosNulos(String m) {
		super(m);
	}

}
