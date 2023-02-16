package ar.edu.udemy.masterJava.sistemaDeVenta;

import java.util.Arrays;
import java.util.Objects;



public class Orden {

	private static Integer contadorStatico = 0; 
	private Integer idOrden = 0; 
	private Producto productos[];
	private final Integer CONTADORMAXIMO=10; 
	
	
	
	public Orden() {
		super();
		contadorStatico++;
		this.idOrden= contadorStatico;
		productos = new Producto[CONTADORMAXIMO];
	}



	public static Integer contadorOrdenes() {
		return contadorStatico;
	}



	public Boolean agregarProductos(Producto producto1) {
		Boolean seCargo = false; 
		for (int i = 0; i<productos.length;i++) {
			if (productos[i] == null) {
				productos[i] = producto1; 
				seCargo = true;
				break; 
			}
		}
		return seCargo; 
	}


	


	public Double calcularTotal() {
		Double total=0.0;
		for (int i = 0; i<productos.length;i++) {
			if (productos[i] != null) {
				total = total + productos[i].getPrecio();
			}
		}
		return total;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(productos);
		result = prime * result + Objects.hash(idOrden);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orden other = (Orden) obj;
		return Objects.equals(idOrden, other.idOrden) && Arrays.equals(productos, other.productos);
	}



	@Override
	public String toString() {
		return "Orden [idOrden=" + idOrden + ", productos="  + Arrays.toString(productos) + "]";
	}



	public Integer buscarId(Producto producto2) {
		Integer numero = 0;
		for (Producto producto : productos) {
		
			if(producto.getidProducto() == (producto2.getidProducto()) ) {
				System.out.println(producto);
				 numero = (Integer) producto.getidProducto();
				 break;
			}
		}
		return numero;
	}







	
	
}//ULTIMO
