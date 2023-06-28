package ar.edu.unlam.pb2;

public class Auto extends Vehiculo {

	private String patente="";
	private Integer cantMaxPasajeros=0;
	private Integer velMax=0;
	
	public Auto(String patente, Integer cantMaxPasajeros, Integer velMax, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.patente=patente;
		this.cantMaxPasajeros=cantMaxPasajeros;
		this.velMax=velMax;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getCantMaxPasajeros() {
		return cantMaxPasajeros;
	}

	public void setCantMaxPasajeros(Integer cantMaxPasajeros) {
		this.cantMaxPasajeros = cantMaxPasajeros;
	}

	public Integer getVelMax() {
		return velMax;
	}

	public void setVelMax(Integer velMax) {
		this.velMax = velMax;
	}

	
	
}
