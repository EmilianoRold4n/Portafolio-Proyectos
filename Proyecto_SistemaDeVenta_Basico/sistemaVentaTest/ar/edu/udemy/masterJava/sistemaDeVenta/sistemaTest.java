package ar.edu.udemy.masterJava.sistemaDeVenta;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class sistemaTest {

	@Test
	public void queSePuedaCrearUnaOrden() {
		Orden nuevaOrden = new Orden();
		System.out.println(nuevaOrden);
		Assert.assertNotNull(nuevaOrden);

	}

	@Test
	public void queSePuedaCrearOrdenConIdDistintasYContarLaCantidadTotal() {
		Orden nuevaOrden = new Orden();
		Orden nuevaOrdenDos = new Orden();
		Integer cantidadEsperada = 2;
		Integer cantidadTotal = Orden.contadorOrdenes();
		Boolean ve = false;
		Boolean vo = nuevaOrden.equals(nuevaOrdenDos);
		assertEquals(cantidadEsperada, cantidadTotal);
		assertFalse(vo);
		Assert.assertNotNull(nuevaOrden);

	}

	@Test
	public void queSePuedaAgregarProductoAOrden() {
		Orden nuevaOrden = new Orden();
		Producto producto1 = new Producto("Jabon", 5.06);
		Producto producto2 = new Producto("Pantalones", 15.07);
		Boolean exitoso1 = nuevaOrden.agregarProductos(producto1);
		System.out.println(exitoso1);
		Boolean exitoso2 = nuevaOrden.agregarProductos(producto2);
		System.out.println(exitoso2);
		Boolean ve = true;
		Assert.assertEquals(ve, exitoso1);
		Assert.assertEquals(ve, exitoso2);

	}

	@Test
	public void queSePuedaCalcularTotalDeOrden() {
		Orden nuevaOrden = new Orden();
		Producto producto1 = new Producto("Jabon", 5.06);
		Producto producto2 = new Producto("Pantalones", 15.07);
		Boolean exitoso1 = nuevaOrden.agregarProductos(producto1);
		Boolean exitoso2 = nuevaOrden.agregarProductos(producto2);
		Double ve = 20.13;
		Double vo = nuevaOrden.calcularTotal();
		Assert.assertEquals(ve, vo);
	}
	@Test
	public void queSePuedaMostrarTodaLaOrdenCompleta() {
		Orden nuevaOrden = new Orden();
		Producto producto1 = new Producto("Jabon", 5.06);
		Producto producto2 = new Producto("Pantalones", 15.07);
		nuevaOrden.agregarProductos(producto1);
		nuevaOrden.agregarProductos(producto2);
		System.out.println(nuevaOrden);
		assertNotNull(nuevaOrden);

	}
	
	@Test 
	public void queBusqueUnIdDeProductoEnParticular() {
		Orden nuevaOrden = new Orden();
		Producto producto1 = new Producto("Jabon", 5.06);
		Producto producto2 = new Producto("Pantalones", 15.07);
		Producto producto3 = new Producto("Jeans", 25.07);
		nuevaOrden.agregarProductos(producto1);
		nuevaOrden.agregarProductos(producto2);
		nuevaOrden.agregarProductos(producto3);
		Integer vo = nuevaOrden.buscarId(producto2);
		Integer ve = 2; 
		assertEquals(ve, vo);
		
		
	}
}
