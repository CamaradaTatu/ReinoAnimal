package ReinoAnimal;

/**
 * Classe de *Animal* aquatico
 * @author ruan
 */
public class Aquatico extends Animal {
	String tipoAgua;
	boolean escamas;
	/**
	 * 
	 * @param especie espécie do animal
	 * @param sexo sexo do animal
	 * @param dataNasc data de nascimento do animal
	 * @param tipoAgua tipo de água em que o animal vive
	 * @param escamas possui ou não escamas
	 */
	public Aquatico(String especie, String sexo, String dataNasc,String tipoAgua, boolean escamas) {
		super(especie, sexo, dataNasc);

		this.tipoAgua = tipoAgua;
		this.escamas = escamas;
	}
	
	@Override
	public
	String comer() {
		return ("O animal aquático esta comendo...");
	}
	
	@Override
	public String toString() {

		return "\n informações sobre o animal:\n especie: " + especie + "\n sexo: " + sexo 
				+ "\n dataNasc: " + dataNasc +"\n tipo de água: "+ tipoAgua
				+ "\n tem escamas: " + escamas + "\n";

	}

	@Override
	public String perfil() {
		return this.toString();
	}

	public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public boolean isEscamas() {
		return escamas;
	}

	public void setEscamas(boolean escamas) {
		this.escamas = escamas;
	}
	
	

}
