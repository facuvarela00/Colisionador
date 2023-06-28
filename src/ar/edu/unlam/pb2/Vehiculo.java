package ar.edu.unlam.pb2;

public class Vehiculo implements Comparable {

	private Double latitud=0.0;
	private Double longitud=0.0;
	
	public Vehiculo (Double latitud,Double longitud) {
		this.latitud=latitud;
		this.longitud=longitud;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void actualizarCoordenadas(Double latitud, Double longitud) {
		
		setLongitud(longitud);
		setLatitud(latitud);
	}
	
	
	
}
