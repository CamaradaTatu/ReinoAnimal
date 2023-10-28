package ReinoAnimal;

/**
 * Classe Animal genérica
 * @author ruan
 */
public class Animal {
	String especie;
	String sexo;
	String dataNasc;

	public static int contador = 0;
	/**
	 * 
	 * @param especie espécie do animal
	 * @param sexo sexo do animal
	 * @param dataNasc data de nascimento do animal
	 */
	public Animal(String especie, String sexo, String dataNasc) {
		super();
		this.especie = especie;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		incrementar();
	}
	
	/**
	 * método que mostra a ação do animal
	 * @return String da ação do animal
	 */
	public String comer() {
		return ("O Animal esta comendo...");
	}

	@Override
	public String toString() {
		return "informações sobre o animal:\n especie:" + especie + "\n sexo:" + sexo + "\n dataNasc:" + dataNasc;
	}
	
	/**
	 * 
	 * @return Informações sobre o animal
	 */
	public String perfil() {
		return this.toString();
	}
	
	/**
	 * metódo simples, serve apenas para manter o controle de cadastro de animais
	 */
	private void incrementar() {
		contador += 1;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Animal.contador = contador;
	}
	
	

}
