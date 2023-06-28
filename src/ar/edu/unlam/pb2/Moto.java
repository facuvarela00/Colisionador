package ar.edu.unlam.pb2;

public class Moto extends Vehiculo {

	private final Integer CAPACIDA_MAXIMA_DE_PASAJEROS=2; 
	private String patente="";
	private Integer velMax=0;
	
	public Moto(String patente, Integer velMax, Double latitud, Double longitud) {
		super(latitud,longitud);
		this.patente=patente;
		this.velMax=velMax;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getVelMax() {
		return velMax;
	}

	public void setVelMax(Integer velMax) {
		this.velMax = velMax;
	}

	public Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return CAPACIDA_MAXIMA_DE_PASAJEROS;
	}
	

}
