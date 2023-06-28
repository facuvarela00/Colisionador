package ar.edu.unlam.pb2;

public class Bicicleta extends Vehiculo {

	private String patente="";
	
	public Bicicleta(String patente,Double latitud, Double longitud) {
		super(latitud, longitud);
		this.patente=patente;
	}

}
