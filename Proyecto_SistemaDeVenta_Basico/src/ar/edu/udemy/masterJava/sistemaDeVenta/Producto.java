package ar.edu.udemy.masterJava.sistemaDeVenta;

import java.util.Objects;

public class Producto {
	private Integer idProducto = 0;
	private static Integer contadorIdProducto = 0;
	private String nombreDeProducto="" ;
	private Double precio=0.0; 
	

	public Producto(String nombre, Double d) {
		this.nombreDeProducto = nombre; 
		this.precio= d; 
		contadorIdProducto++;
		this.idProducto = contadorIdProducto;
		
	}

	public Object getidProducto() {
		// TODO Auto-generated method stub
		return idProducto;
	}


	public Double getPrecio() {
		// TODO Auto-generated method stub
		return this.precio;
	}
	
	
	
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreDeProducto=" + nombreDeProducto + ", precio=" + precio
				+ "]" + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idProducto, nombreDeProducto, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(idProducto, other.idProducto) && Objects.equals(nombreDeProducto, other.nombreDeProducto)
				&& Objects.equals(precio, other.precio);
	}
	
	

}
