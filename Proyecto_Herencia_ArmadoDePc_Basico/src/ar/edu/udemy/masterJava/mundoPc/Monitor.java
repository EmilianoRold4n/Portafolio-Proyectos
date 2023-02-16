package ar.edu.udemy.masterJava.mundoPc;

public class Monitor {
	
	private Integer idMonitor = 0; 
	private static Integer contadorMonitores =0; 
	private String marca; 
	private Double pulgadas; 
	
	public Monitor(String marca, Double pulgadas) {
		super();
		this.marca = marca;
		this.pulgadas = pulgadas;
		idMonitor= ++Monitor.contadorMonitores; 
		
	}

	public Integer getIdMonitor() {
		return idMonitor;
	}

	public void setIdMonitor(Integer idMonitor) {
		this.idMonitor = idMonitor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(Double pulgadas) {
		this.pulgadas = pulgadas;
	}


	@Override
	public String toString() {
		return "Monitor [ idMonitor= " + idMonitor + ", marca= " + marca + ", pulgadas= " + pulgadas + "]\n";
	}
	
	
}
