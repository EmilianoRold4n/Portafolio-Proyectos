package ar.edu.unlam.practicas.setentaytres;

import java.util.Date;

public class Cliente extends Persona {
	private Integer idCliente = 0; 
	private static Integer clientela=0; 
	private Date fechaRegistro; 
	private Boolean vip=false;
	
	
	public Cliente() {
		super();
		clientela++;
		this.idCliente = clientela;
	 
	}
	
	public Cliente(Date fecha) {
		super();
		clientela++;
		this.idCliente = clientela;
		this.fechaRegistro=fecha;
	}


	public Cliente(String nombre, char genero, Integer edad, String direccion, 
			Date fecha, Boolean vip) {
		super(nombre, genero, edad, direccion);
		clientela++;
		this.idCliente = clientela;
		this.fechaRegistro= fecha;
		this.vip = vip;
		
	}


	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public Date getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public Boolean isVip() {
		return vip;
	}


	public void setVip(Boolean vip) {
		this.vip = vip;
	} 
	
	
	
}
