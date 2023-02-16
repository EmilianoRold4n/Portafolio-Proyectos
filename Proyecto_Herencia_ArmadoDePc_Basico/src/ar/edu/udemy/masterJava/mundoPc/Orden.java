package ar.edu.udemy.masterJava.mundoPc;

import java.util.Arrays;

public class Orden {

	private Integer idOrden = 0;
	private static Integer contadorOrdenes=0;
	private Computadora[] nuevaPC; 
	private Integer contadorComputadoras=0;
	private final Integer MAXCOMPUTADORAS=10;

	
	public Orden() {
		super();
		this.idOrden = ++contadorOrdenes;
		nuevaPC = new Computadora[MAXCOMPUTADORAS];
	}

	public void agregarComputadora(Computadora pcGamer) {
		if (contadorComputadoras<=MAXCOMPUTADORAS) {
			for (int i = 0; i < nuevaPC.length; i++) {
				if(nuevaPC[i]== null) {
					nuevaPC[i] = pcGamer; 
					contadorComputadoras++;
					break; 
				}
			}
		}
		
	}

	@Override
	public String toString() {
		return "Orden [idOrden=" + idOrden + ", nuevaPC=" + Arrays.toString(nuevaPC) + ", contadorComputadoras="
				+ contadorComputadoras + "]";
	}

	public void mostrarOrden() {
		for (int i=0; i < nuevaPC.length; i++) {
			System.out.println("Orden [idOrden=" + idOrden + "\nComputadora con: " + nuevaPC[i]+"\n");
		}
		
	}




	
}
