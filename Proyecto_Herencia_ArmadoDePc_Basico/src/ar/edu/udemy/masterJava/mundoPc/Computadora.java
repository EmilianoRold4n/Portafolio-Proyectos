package ar.edu.udemy.masterJava.mundoPc;
import ar.edu.udemy.masterJava.mundoPc.DispositivoEntrada;

public class Computadora {
	
	private static Integer contadorComputadora=0;
	private Integer idComputadora =0; 
	private String nombre; 
	private Monitor pantalla; 
	private Teclado tecladito; 
	private Mouse ratoncito; 
	
	private Computadora () {
		this.idComputadora = ++Computadora.contadorComputadora;
	}

	public Computadora( String nombre, Monitor pantalla, DispositivoEntrada tecladacio, DispositivoEntrada ratonacio) {
		this();
		this.nombre = nombre;
		this.pantalla = pantalla;
		this.tecladito = (Teclado) tecladacio;
		this.ratoncito = (Mouse) ratonacio;
	}

	public Integer getIdComputadora() {
		return idComputadora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Monitor getPantalla() {
		return pantalla;
	}

	public void setPantalla(Monitor pantalla) {
		this.pantalla = pantalla;
	}

	public Teclado getTecladito() {
		return tecladito;
	}

	public void setTecladito(Teclado tecladito) {
		this.tecladito = tecladito;
	}

	public Mouse getRatoncito() {
		return ratoncito;
	}

	public void setRatoncito(Mouse ratoncito) {
		this.ratoncito = ratoncito;
	}

	@Override
	public String toString() {
		return "Computadora \n[idComputadora= " + idComputadora + ", nombre= " + nombre + ", \n\npantalla= " + pantalla
				+ ", \nteclado= " + tecladito + ", \nmouse= " + ratoncito + "]";
	}
		
}//ULTIMA LLAVE
