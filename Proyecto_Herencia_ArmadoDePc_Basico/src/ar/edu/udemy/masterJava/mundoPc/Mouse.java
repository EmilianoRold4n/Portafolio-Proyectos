package ar.edu.udemy.masterJava.mundoPc;

public class Mouse extends DispositivoEntrada {

		private Integer idMouse=0; 
		private static Integer contadorMouse =0; 
		
		
	public Mouse(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		idMouse= ++Mouse.contadorMouse;
		// TODO Auto-generated constructor stub
	}
	
}
