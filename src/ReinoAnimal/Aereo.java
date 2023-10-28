package ReinoAnimal;

/**
 * Classe de *Animal* a�reo
 * @author ruan
 */
public class Aereo extends Animal {
	
	double altitude;
	
	/**
	 * 
	 * @param especie especie do animal
	 * @param sexo sexo do animal
	 * @param dataNasc data de nascimento animal
	 * @param altitude altitude m�xima em que a ave pode voar
	 */
	public Aereo(String especie, String sexo, String dataNasc, double altitude) {
		super(especie, sexo, dataNasc);
		
		this.altitude = altitude;

	}


	@Override
	public
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
	
	/**
	 * M�todo que mostra a a��o da ave
	 * @return String com a��o da ave
	 */
	public String voar() {
		return ("O animal est� voando...");
	}


	public double getAltitude() {
		return altitude;
	}


	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	
	
	

}
