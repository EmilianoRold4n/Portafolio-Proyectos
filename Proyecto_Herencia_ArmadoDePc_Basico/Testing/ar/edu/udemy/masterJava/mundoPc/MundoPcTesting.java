package ar.edu.udemy.masterJava.mundoPc;

import static org.junit.Assert.*;



import org.junit.Assert;
import org.junit.Test;

public class MundoPcTesting {

	@Test
	public void queSePuedaCrearMouseYTeclado() {
		DispositivoEntrada ratonacio = new Mouse("USB","Logitech");
		DispositivoEntrada tecladacio = new Teclado("ficha","Red Dragon");
		System.out.println(ratonacio);
		System.out.println(tecladacio);
		Assert.assertNotNull(ratonacio);
		Assert.assertNotNull(tecladacio);
		
	}
	
	@Test
	public void queSePuedaCrearMonitor() {
		Monitor pantallita = new Monitor ("LG",19.25);
		System.out.println(pantallita);
		Assert.assertNotNull(pantallita);
	}

	@Test
	public void queSePuedaCrearComputadora() {
		DispositivoEntrada ratonacio = new Mouse("USB","Logitech");
		DispositivoEntrada tecladacio = new Teclado("ficha","Red Dragon");
		Monitor pantallita = new Monitor ("LG",19.25);
		Computadora pcGamer = new Computadora ("I9",pantallita, tecladacio, ratonacio);
		System.out.println(pcGamer);
		Assert.assertNotNull(pcGamer);
	}
	
	@Test
	public void queSePuedaCrearUnaOrdenCompleta() {
		Orden nuevaOrden = new Orden ();
		DispositivoEntrada ratonacio = new Mouse("USB","Logitech");
		DispositivoEntrada tecladacio = new Teclado("ficha","Red Dragon");
		Monitor pantallita = new Monitor ("LG",19.25);
		Computadora pcGamer = new Computadora ("I9",pantallita, tecladacio, ratonacio);
		nuevaOrden.agregarComputadora(pcGamer); 
		
		nuevaOrden.mostrarOrden();
		
		Assert.assertNotNull(nuevaOrden);
	}

}
