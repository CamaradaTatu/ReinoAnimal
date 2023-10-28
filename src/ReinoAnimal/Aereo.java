package ReinoAnimal;

public class Aereo extends Animal {
	
	double altitude;
	
	public Aereo(String especie, String sexo, String dataNasc, double altitude) {
		super(especie, sexo, dataNasc);
		
		this.altitude = altitude;

	}


	@Override
	String comer() {
		return ("O animal a�reo esta comendo...");
	}



	@Override
	public String toString() {
		return "\n informa��es sobre o animal:\n altitude de voo:" + altitude + "\n especie:" + especie
				+ "\n sexo:" + sexo + "\n dataNasc:" + dataNasc +"\n" ;
	}



	@Override
	public String perfil() {
		return this.toString();
	}



	String voar() {
		return ("O animal est� voando...");
	}


	public double getAltitude() {
		return altitude;
	}


	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	
	
	

}
