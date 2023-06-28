package ar.edu.unlam.pb2;

import java.util.Set;
import java.util.TreeSet; //TE ODIO TREESET DEL ORTO HIJO DE REMIL PUTA
import java.util.Collections;
import java.util.HashSet;

public class Mapa {

	private String ciudad="";
	//private Set<Vehiculo> vehiculosAnormal;
	private Set<Vehiculo> vehiculos;
	
	public Mapa(String ciudad) {
		this.ciudad=ciudad;
		vehiculos=new HashSet<Vehiculo>();
		//vehiculosAnormal=new TreeSet<Vehiculo>();
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		
		vehiculos.add(vehiculo);
	}
	
	public Boolean hayColision() throws CollisionException {
		Boolean colisiona=false;
		for (Vehiculo vehiculo:vehiculos) {
			for (Vehiculo vehiculo2:vehiculos) {
				if(vehiculo!=vehiculo2&&vehiculo.getLatitud().equals(vehiculo2.getLatitud())
						&&vehiculo.getLongitud().equals(vehiculo2.getLongitud())) {
					colisiona=true;
					throw new CollisionException ("Ha Colisionao");
				}
			}
		}
		return colisiona;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Set<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Set<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public Integer getCantidadDeVehiculos() {
		return vehiculos.size();
	}


}
