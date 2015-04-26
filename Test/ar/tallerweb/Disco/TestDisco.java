package ar.tallerweb.Disco;

import org.junit.Assert;
import org.junit.Test;

public class TestDisco {
	
	@Test
	public void testPerimetroInterior(){
		
		Disco prueba = new Disco(3,6);
		double perimetroInterior = prueba.calcularPerimetroInterior();
		Assert.assertEquals(18.84, perimetroInterior,0.1);
	}
	
	@Test
	public void testPerimetroExterior(){
		
		Disco prueba = new Disco(3,6);
		double perimetroExterior = prueba.calcularPerimetroExterior();
		Assert.assertEquals(37.68, perimetroExterior,0.1);
	}
	
	@Test
	public void testCalcularAreaChica(){
		
		Disco prueba = new Disco(3,6);
		double areaChica = prueba.calcularAreaChica();
		Assert.assertEquals(28.26, areaChica,0.1);
	}
	
	@Test
	public void testCalcularAreaGrande(){
		
		Disco prueba = new Disco(3,6);
		double areaGrande = prueba.calcularAreaGrande();
		Assert.assertEquals(113.04, areaGrande,0.1);
	}

	@Test
	public void testCalcularArea(){
		
		Disco prueba = new Disco(3,6);
		double area = prueba.calcularArea();
		Assert.assertEquals(84.78, area,0.1);
	}

	
}

