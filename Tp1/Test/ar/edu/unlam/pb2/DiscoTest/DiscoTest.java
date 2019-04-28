package ar.edu.unlam.pb2.DiscoTest;

import org.junit.*;
public class DiscoTest {
@Test
	public void testQueVerifiqueElPerimetroInterior() {
		
		Double radioInterior = 2.0;
		Double radioExterior = 5.0;
		
		Disco nuevoPerimetroInteriorDiscoUno = new Disco(radioInterior,radioExterior);
		
		Double perimetroInterior = nuevoPerimetroInteriorDiscoUno.calcularPerimetroInteriorDisco(radioInterior);
		Double perimetroInteriorEsperado = 12.566370614359172;
		
		Assert.assertEquals(perimetroInteriorEsperado, perimetroInterior);
		
	}
	
	@Test
	public void testQueVeifiqueElPerimetroExterior() {
		Double radioInterior = 2.0;
		Double radioExterior = 5.0;
		
		Disco nuevoPerimetroExteriorDiscoUno = new Disco(radioInterior,radioExterior);
		
		Double perimetroExterior = nuevoPerimetroExteriorDiscoUno.calcularPerimetroExteriorDisco(radioExterior);
		Double perimetroExteriorEsperado = 31.415926535897932;
		Assert.assertEquals(perimetroExteriorEsperado, perimetroExterior);
	}
	
	@Test 
	public void TestQueVerifiqueLaSuperficieTotalDelDisco() {
		
		Double radioInterior = 2.0;
		Double radioExterior = 5.0;
		
		Disco nuevoSuperficieTotalDiscoUno = new Disco(radioInterior , radioExterior);
		
		Double superficieTotal = nuevoSuperficieTotalDiscoUno.superficieTotalDelDisco();
		Double superficieTotalEsperada = 74.53981633974483;
		
		Assert.assertEquals(superficieTotalEsperada, superficieTotal);
	}
}


