package ar.edu.unlam.practicas.setentaytres;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class SetentaYTresTest {

	@Test
	public void queSePuedaCrearPersona() {
		Persona personita = new Persona();
		Assert.assertNotNull(personita);	
	}
	@Test
	public void queSePuedaCrearPersonaConDatos() {
		Persona personita = new Persona ("Emiliano", 'M', 33, "calle falsa 123");
		Assert.assertNotNull(personita);
	}
	@Test
	public void queSePuedaCrearEmpleadoConIdYSueldoCero() {
		Persona empleadito = new Empleado ();
		Integer vo =  empleadito.getIdEmpleado();
		Integer ve = 1; 
		System.out.println(( (Empleado) empleadito).getIdEmpleado());
		Double voDos= empleadito.getSueldo();
		Double veDos= 0.0; 		
		Assert.assertEquals(vo, ve);
		Assert.assertEquals(voDos, veDos);
		Assert.assertNotNull(empleadito);
	}
	@Test
	public void queSePuedaCrearDosEmpleadosConIdDistintos() {
		Persona empleadito = new Empleado ();
		Persona empleaditoDos = new Empleado ();
		Boolean vo = ((Empleado) empleadito).getIdEmpleado().equals(((Empleado) empleadito).getIdEmpleado());
		Boolean ve = false; 
		System.out.println(( (Empleado) empleadito).getIdEmpleado());
		System.out.println(( (Empleado) empleaditoDos).getIdEmpleado());
		Assert.assertNotEquals(vo, ve);
		Assert.assertNotNull(empleadito);
	}
	
	@Test
	public void queSePuedaCrearDosEmpleadosConIdDistintosYCargarSusDatos() {
		Persona empleadito = new Empleado ("Emiliano", 'M', 33, "calle False 222");
		Persona empleaditoDos = new Empleado ("Emiliana", 'F', 33, "False calle 333");
		Boolean vo = empleadito.getIdEmpleado().equals(empleadito.getIdEmpleado());
		Boolean ve = false; 
		System.out.println(( (Empleado) empleadito).getIdEmpleado());
		System.out.println(( (Empleado) empleaditoDos).getIdEmpleado());
		Assert.assertNotEquals(vo, ve);
		Assert.assertNotNull(empleadito);
		Assert.assertNotNull(empleaditoDos);
	}
	
	@Test 
	public void queSePuedaCrearUnClienteNoVip () {
		Persona clienteUno = new Cliente(new Date()); 
		System.out.println(clienteUno);
		Boolean vo = clienteUno.isVip();
		System.out.println(clienteUno.getFechaRegistro());
		System.out.println(vo);
		Boolean ve = false; 
		Assert.assertEquals(ve,vo);
	}
	
	@Test 
	public void queSePuedaHabilitarPersistenciaABM() {
		IABM interfase = new ImplementacionEnMySQL ();
		interfase.eliminar();
		Assert.assertNotNull(interfase);
		
	}
	
	
}//ULTIMO
