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
	 * @param especie esp�cie do animal
	 * @param sexo sexo do animal
	 * @param dataNasc data de nascimento do animal
	 * @param tipoAgua tipo de �gua em que o animal vive
	 * @param escamas possui ou n�o escamas
	 */
	public Aquatico(String especie, String sexo, String dataNasc,String tipoAgua, boolean escamas) {
		super(especie, sexo, dataNasc);

		this.tipoAgua = tipoAgua;
		this.escamas = escamas;
	}
	
	@Override
	public
	String comer() {
		return ("O animal aqu�tico esta comendo...");
	}
	
	@Override
	public String toString() {

		return "\n informa��es sobre o animal:\n especie: " + especie + "\n sexo: " + sexo 
				+ "\n dataNasc: " + dataNasc +"\n tipo de �gua: "+ tipoAgua
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
