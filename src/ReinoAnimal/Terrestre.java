package ReinoAnimal;

public class Terrestre extends Animal {
	String regiao;
	boolean pelo;
	public Terrestre(String especie, String sexo, String dataNasc, String regiao, boolean pelo) {
		super(especie, sexo, dataNasc);
		
		this.regiao = regiao;
		this.pelo = pelo;
	}
	
	String mover() {
		return ("O animal esta se movendo...");
	}

	@Override
	String comer() {
		
		return ("O animal terrestre está comendo...");
	}

	@Override
	public String toString() {
		return "informações sobre o animal:\n regiao:" + regiao + "\n pelo:" + pelo + "\n especie:" + especie
				+ "\n sexo:" + sexo + "\n dataNasc:" + dataNasc;
	}

	@Override
	public void perfil() {
		this.toString();
	}
	
	
	

	


}
