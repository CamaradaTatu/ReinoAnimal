package ReinoAnimal;

import java.util.ArrayList;

/**
 * Classe de preparo e uso dos métodos criados no projeto
 * @author ruan
 */
public class Principal {
	
	/**
	 * 
	 * @param especie espécie do Animal
	 * @param sexo sexo do Animal
	 * @param dataNasc data de nascimento do Animal
	 * @param tipoAgua tipo de água em que vive o Animal
	 * @param escamas se tem ou não escamas
	 * @return o Animal que acabou de ser cadastrado
	 */
	public Animal cadastrarAquatico(String especie, String sexo, String dataNasc, String tipoAgua, boolean escamas) {
		Animal aquatico = new Aquatico(especie, sexo, dataNasc, tipoAgua, escamas);
		return aquatico;
	}
	/**
	 * 
	 * @param especie espécie do Animal
	 * @param sexo sexo do Animal
	 * @param dataNasc data de nascimento do Animal
	 * @param regiao regiao de origem do Animal
	 * @param pelo tem pelo ou não
	 * @return o Animal que acabou de ser cadastrado
	 */
	public Animal cadastrarTerrestre(String especie, String sexo, String dataNasc, String regiao, boolean pelo) {
		Animal terrestre = new Terrestre(especie, sexo, dataNasc, regiao, pelo);
		return terrestre;
	}
	/**
	 * 
	 * @param especie especie do Animal
	 * @param sexo sexo do Animal
	 * @param dataNasc data de nascimento Animal
	 * @param altitude altitude máxima em que a ave pode voar
	 * @return o Animal que acabou de ser cadastrado
	 */
	public Animal cadastrarAereo(String especie, String sexo, String dataNasc, double altitude) {
		Animal aereo = new Aereo(especie, sexo, dataNasc, altitude);
		return aereo;
	}
	
	/**
	 * Metódo main, onde vão ser executados os diversos métodos do projeto
	 * @param args argumentos do metodo main
	 */
	public static void main(String[] args) {
		
		Principal principal = new Principal();
		//criação e população de um arraylist de animais
		ArrayList<Animal> listaAnimal = new ArrayList<Animal>();
		listaAnimal.add(principal.cadastrarAquatico("Carcharia taurus", "fêmea", "7", "água salgada", false));
		listaAnimal.add(principal.cadastrarAquatico("Pygocentrus nattereri", "macho", "3", "água doce", true));
		listaAnimal.add(principal.cadastrarTerrestre("Felis Catus", "fêmea", "2", "Ásia", true));
		listaAnimal.add(principal.cadastrarTerrestre("Hydrochoerus hydrochaeris", "macho", "8", "Américo do Sul", true));
		listaAnimal.add(principal.cadastrarAereo("Coragyps atratus", "macho" , "3",54.5));
		listaAnimal.add(principal.cadastrarAereo("Amazona aestiva", "fêmea", "10",37.9));

		//impressão de diversas informações agrupadas no arraylist de animais
		for (int i = 0; i < listaAnimal.size(); i++) {

			System.out.println(listaAnimal.get(i).perfil());
			System.out.println(listaAnimal.get(i).comer());


			if (listaAnimal.get(i) instanceof Terrestre) {

				System.out.println(((Terrestre) listaAnimal.get(i)).mover());
				 
			}

			if (listaAnimal.get(i) instanceof Aereo) {

				System.out.println(((Aereo) listaAnimal.get(i)).voar());
			}

		}
		
		System.out.println(Animal.getContador() +" Animais");

	}

}
