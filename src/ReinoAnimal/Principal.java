package ReinoAnimal;

import java.util.ArrayList;

/**
 * Classe de preparo e uso dos m�todos criados no projeto
 * @author ruan
 */
public class Principal {
	
	/**
	 * 
	 * @param especie esp�cie do Animal
	 * @param sexo sexo do Animal
	 * @param dataNasc data de nascimento do Animal
	 * @param tipoAgua tipo de �gua em que vive o Animal
	 * @param escamas se tem ou n�o escamas
	 * @return o Animal que acabou de ser cadastrado
	 */
	public Animal cadastrarAquatico(String especie, String sexo, String dataNasc, String tipoAgua, boolean escamas) {
		Animal aquatico = new Aquatico(especie, sexo, dataNasc, tipoAgua, escamas);
		return aquatico;
	}
	/**
	 * 
	 * @param especie esp�cie do Animal
	 * @param sexo sexo do Animal
	 * @param dataNasc data de nascimento do Animal
	 * @param regiao regiao de origem do Animal
	 * @param pelo tem pelo ou n�o
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
	 * @param altitude altitude m�xima em que a ave pode voar
	 * @return o Animal que acabou de ser cadastrado
	 */
	public Animal cadastrarAereo(String especie, String sexo, String dataNasc, double altitude) {
		Animal aereo = new Aereo(especie, sexo, dataNasc, altitude);
		return aereo;
	}
	
	/**
	 * Met�do main, onde v�o ser executados os diversos m�todos do projeto
	 * @param args argumentos do metodo main
	 */
	public static void main(String[] args) {
		
		Principal principal = new Principal();
		//cria��o e popula��o de um arraylist de animais
		ArrayList<Animal> listaAnimal = new ArrayList<Animal>();
		listaAnimal.add(principal.cadastrarAquatico("Carcharia taurus", "f�mea", "7", "�gua salgada", false));
		listaAnimal.add(principal.cadastrarAquatico("Pygocentrus nattereri", "macho", "3", "�gua doce", true));
		listaAnimal.add(principal.cadastrarTerrestre("Felis Catus", "f�mea", "2", "�sia", true));
		listaAnimal.add(principal.cadastrarTerrestre("Hydrochoerus hydrochaeris", "macho", "8", "Am�rico do Sul", true));
		listaAnimal.add(principal.cadastrarAereo("Coragyps atratus", "macho" , "3",54.5));
		listaAnimal.add(principal.cadastrarAereo("Amazona aestiva", "f�mea", "10",37.9));

		//impress�o de diversas informa��es agrupadas no arraylist de animais
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
