package ReinoAnimal;

public class Aereo extends Animal {
	
	double altitude;
	
	public Aereo(String especie, String sexo, String dataNasc, double altitude) {
		super(especie, sexo, dataNasc);
		
		this.altitude = altitude;

	}


	@Override
	String comer() {
		return ("O animal aéreo esta comendo...");
	}



	@Override
	public String toString() {
		return "informações sobre o animal:\n altitude de voo:" + altitude + "\n especie:" + especie
				+ "\n sexo:" + sexo + "\n dataNasc:" + dataNasc;
	}



	@Override
	public void perfil() {
		this.toString();
	}



	String voar() {
		return ("O animal está voando");
	}
	

}
