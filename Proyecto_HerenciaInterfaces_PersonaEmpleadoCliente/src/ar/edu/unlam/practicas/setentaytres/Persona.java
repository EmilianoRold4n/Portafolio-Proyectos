package ar.edu.unlam.practicas.setentaytres;

import java.util.Date;
import java.util.Objects;

public class Persona {

	protected String nombre; 
	protected char genero='\0'; 
	protected Integer edad; 
	protected String direccion;
	
	public Persona(String nombre, char genero, Integer edad, String direccion) {
			this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.direccion = direccion;
	}
	public Persona() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Integer getIdEmpleado() {
		return null;
	}
	public Double getSueldo() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setSueldo(Double sueldo) {
		// TODO Auto-generated method stub
		
	}
	public Boolean isVip() {
		// TODO Auto-generated method stub
		return null;
	}
	public Date getFechaRegistro() {
		
		return null;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(direccion, edad, genero, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(edad, other.edad) && genero == other.genero
				&& Objects.equals(nombre, other.nombre);
	}

	
}
