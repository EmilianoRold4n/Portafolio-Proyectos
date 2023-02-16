package ar.edu.udemy.practicas.peliculas;

public class Pelicula {
	private String nombreDePelicula;

	public Pelicula(String nombre) {
		this.nombreDePelicula=nombre; 
		// TODO Auto-generated constructor stub
	}

	public Pelicula() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombreDePelicula;
	}

	public void setNombre(String string) {
		this.nombreDePelicula=string; 
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		return nombreDePelicula;
	}

}
