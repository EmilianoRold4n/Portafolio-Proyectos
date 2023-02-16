package ar.edu.unlam.practicas.setentaytres;

public class Empleado extends Persona {
	private static Integer idEmpleadoStatico=0; 
	private Integer idEmpleado=0;
	private Double sueldo =0.0;
	
	public Empleado() {
		super();
		idEmpleadoStatico++;
		idEmpleado = idEmpleadoStatico;
	}
	
	public Empleado(String nombre, char genero, Integer edad, String direccion) {
		super(nombre, genero, edad, direccion);
		idEmpleadoStatico++;
		idEmpleado=idEmpleadoStatico;
	}
	
	@Override
	public  Integer getIdEmpleado() {
		return this.idEmpleado;
	}
//
//	public void setIdEmpleado(Integer idEmpleado) {
//		this.idEmpleado = idEmpleado;
//	}
	@Override
	public Double getSueldo() {
		return sueldo;
	}
	@Override
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	} 
	
	
	
}
