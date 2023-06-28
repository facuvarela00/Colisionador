package ar.edu.unlam.pb2;

public class Tren extends Vehiculo {

	private Integer cantidadDeVagones=0;
	private Integer cantidadDePasajerosPorVagon=0;
	private Integer velMax=0;
	private String patente="";
	
	
	public Tren(String patente, Integer cantidadDeVagones, Integer cantidadDePasajerosPorVagon, Integer velMax, Double latitud, Double longitud) {
		super(latitud, longitud);

		this.cantidadDePasajerosPorVagon=cantidadDePasajerosPorVagon;
		this.velMax=velMax;
		this.cantidadDeVagones=cantidadDeVagones;
		this.patente=patente;
	}


	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}


	public void setCantidadDeVagones(Integer cantidadDeVagones) {
		this.cantidadDeVagones = cantidadDeVagones;
	}


	public Integer getCantidadDePasajerosPorVagon() {
		return cantidadDePasajerosPorVagon;
	}


	public void setCantidadDePasajerosPorVagon(Integer cantidadDePasajerosPorVagon) {
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
	}


	public Integer getVelMax() {
		return velMax;
	}


	public void setVelMax(Integer velMax) {
		this.velMax = velMax;
	}

}
