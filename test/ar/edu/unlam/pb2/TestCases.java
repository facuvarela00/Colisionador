package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSePuedaCrearUnAuto() {
		Vehiculo nuevo = new Auto("JJZ526", 5, 240, 41.40338, 2.17403);

		assertEquals("JJZ526", ((Auto) nuevo).getPatente());
		assertEquals((Integer) 5, ((Auto) nuevo).getCantMaxPasajeros());
		assertEquals((Integer) 240, ((Auto) nuevo).getVelMax());
		assertEquals((Double) 41.40338, ((Auto) nuevo).getLatitud());
		assertEquals((Double) 2.17403, ((Auto) nuevo).getLongitud());
	}
	
	@Test
	public void queSePuedaCrearUnaMoto() {
		Vehiculo nuevo = new Moto("094AB5", 200, 41.40338, 2.17403);
		
		assertEquals("094AB5", ((Moto) nuevo).getPatente());
		assertEquals((Integer) 2, ((Moto) nuevo).getCAPACIDA_MAXIMA_DE_PASAJEROS());
		assertEquals((Integer) 200, ((Moto) nuevo).getVelMax());
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());
	}
	@Test
	public void  queSePuedaCrearUnaBicicleta() {
		Vehiculo nuevo = new Bicicleta("094AB5",41.40338, 2.17403);
		
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());
	}
	
	@Test
	public void  queSePuedaCrearUnTren() {
		Vehiculo nuevo = new Tren("094AB5",15, 250, 100, 41.40338, 2.17403);
		
		assertEquals((Integer) 15, ((Tren) nuevo).getCantidadDeVagones());
		assertEquals((Integer) 250, ((Tren) nuevo).getCantidadDePasajerosPorVagon());
		assertEquals((Integer) 100, ((Tren) nuevo).getVelMax());
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());
		
	}
	@Test
	public void  queSePuedanIncorporarDistintosVehiculos() throws CollisionException{		
		
			Mapa actual = new Mapa("Buenos Aires");
			
			actual.agregarVehiculo(new Auto("JJZ526", 5, 240, 10.40338, 1.17403));
			actual.agregarVehiculo(new Moto("094AB5", 200, 50.40338, 2.5656));
			actual.agregarVehiculo(new Auto("AAA001", 5, 100, 25.40338, 5.17403));
			actual.agregarVehiculo(new Bicicleta("094AB7",33.333, 8.12345));
			actual.agregarVehiculo(new Auto("PPP333", 5, 240, 85.40338, 1.17403));
			actual.agregarVehiculo(new Bicicleta("194AB5",22.63258, 3.96542));
			actual.agregarVehiculo(new Bicicleta("023AB5",31.987452, 3.965482));
			actual.agregarVehiculo(new Moto("088BB5", 100, 36.85421, 8.17403));
			actual.agregarVehiculo(new Moto("094GG5", 90, 29.965482, 4.632152));
			actual.agregarVehiculo(new Tren("670AB5",15, 250, 100, 45.826541, 3.965412));

			assertEquals((Integer) 10, actual.getCantidadDeVehiculos());
			
			assertFalse(actual.hayColision());
	}
	
	@Test (expected = CollisionException.class)
	public void  queChoquenDosVehiculos() throws CollisionException {	
		
		Vehiculo unAuto = new Auto("JJZ526", 5, 240, 41.40338, 2.17403);
		Vehiculo unaMoto = new Moto("094AB5", 200, 25.1234, 1.1234);

		Mapa actual = new Mapa("Buenos Aires");
		
		actual.agregarVehiculo(unAuto);
		actual.agregarVehiculo(unaMoto);
		unAuto.actualizarCoordenadas(25.1234, 1.1234);
	
		try {
			actual.hayColision();
		}catch(CollisionException e) {
			System.out.println(e.getMessage());
		}
		
		
		assertTrue(actual.hayColision());
		
	}
	
}
	/*
	
	
	
	

	
	
	
}*/
