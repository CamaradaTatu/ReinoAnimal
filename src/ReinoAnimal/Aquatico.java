package ReinoAnimal;

public class Aquatico extends Animal {
	String tipoAgua;
	boolean escamas;

	public Aquatico(String especie, String sexo, String dataNasc,String tipoAgua, boolean escamas) {
		super(especie, sexo, dataNasc);
		
		this.tipoAgua = tipoAgua;
		this.escamas = escamas;
	}

	@Override
	void comer() {
		System.out.println("O animal aquático esta comendo...");
	}

	@Override
	public String toString() {

		return "informações sobre o animal:\n especie: " + especie + "\n sexo: " + sexo + 
				"\n dataNasc: " + dataNasc +"\n tipo de água: "+ tipoAgua + "\n tem escamas: " + escamas;

	}

	@Override
	public void perfil() {
		this.toString();
	}

}
