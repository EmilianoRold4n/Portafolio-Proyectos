package ar.edu.udemy.masterJava.mundoPc;

public class Teclado extends DispositivoEntrada {

	private Integer idTeclado = 0; 
	private static Integer contadorTeclado =0;
	
	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		idTeclado = ++Teclado.contadorTeclado;
		// TODO Auto-generated constructor stub
	}

}
