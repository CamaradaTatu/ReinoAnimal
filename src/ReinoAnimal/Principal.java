package ReinoAnimal;

import java.util.ArrayList;

public class Principal {

	Animal cadastrarAquatico(String especie, String sexo, String dataNasc, String tipoAgua, boolean escamas) {
		Animal aquatico = new Aquatico(especie, sexo, dataNasc, tipoAgua, escamas);
		return aquatico;
	}

	Animal cadastrarTerrestre(String especie, String sexo, String dataNasc, String regiao, boolean pelo) {
		Animal terrestre = new Terrestre(especie, sexo, dataNasc, regiao, pelo);
		return terrestre;
	}

	Animal cadastrarAereo(String especie, String sexo, String dataNasc, double altitude) {
		Animal aereo = new Aereo(especie, sexo, dataNasc, altitude);
		return aereo;
	}

	public static void main(String[] args) {
		
		Principal principal = new Principal();
		
		ArrayList<Animal> listaAnimal = new ArrayList<Animal>();
		listaAnimal.add(principal.cadastrarAquatico("Carcharia taurus", "fêmea", "7", "água salgada", false));
		listaAnimal.add(principal.cadastrarAquatico("Pygocentrus nattereri", "macho", "3", "água doce", true));
		listaAnimal.add(principal.cadastrarTerrestre("Felis Catus", "fêmea", "2", "Ásia", true));
		listaAnimal.add(principal.cadastrarTerrestre("Hydrochoerus hydrochaeris", "macho", "8", "Américo do Sul", true));
		listaAnimal.add(principal.cadastrarAereo("Coragyps atratus", "macho" , "3",54.5));
		listaAnimal.add(principal.cadastrarAereo("Amazona aestiva", "fêmea", "10",37.9));

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

	}

}
