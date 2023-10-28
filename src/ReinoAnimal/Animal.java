package ReinoAnimal;

public class Animal {
	String especie;
	String sexo;
	String dataNasc;

	public static int contador;

	public static int getContador() {
		return contador;
	}

	public Animal(String especie, String sexo, String dataNasc) {
		super();
		this.especie = especie;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		incrementar();
	}

	void comer() {
		System.out.println("O animal esta comendo...");
	}

	@Override
	public String toString() {
		return "informa��es sobre o animal:\n especie:" + especie + "\n sexo:" + sexo + "\n dataNasc:" + dataNasc;
	}

	public void perfil() {
		this.toString();
	}

	private void incrementar() {
		contador += 1;
	}

}
