package ReinoAnimal;

/**
 * Classe de *Animal* terrestre
 */
public class Terrestre extends Animal {
	String regiao;
	boolean pelo;
	
	/**
	 * 
	 * @param especie esp�cie do animal
	 * @param sexo sexo do animal
	 * @param dataNasc data de nascimento do animal
	 * @param regiao regiao de origem do animal
	 * @param pelo tem pelo ou n�o
	 */
	public Terrestre(String especie, String sexo, String dataNasc, String regiao, boolean pelo) {
		super(especie, sexo, dataNasc);
		
		this.regiao = regiao;
		this.pelo = pelo;
	}
	
	/**
	 * M�todo que mostra a a��o do Animal
	 * @return String com a��o do animal
	 */
	public String mover() {
		return ("O animal esta se movendo...");
	}

	@Override
	public
	String comer() {
		
		return ("O animal terrestre est� comendo...");
	}

	@Override
	public String toString() {
		return "\n informa��es sobre o animal:\n regiao:" + regiao + "\n pelo:" + pelo + "\n especie:" + especie
				+ "\n sexo:" + sexo + "\n dataNasc:" + dataNasc +"\n";
	}

	@Override
	public String perfil() {
		return this.toString();
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public boolean isPelo() {
		return pelo;
	}

	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}
	
	
	

	


}
