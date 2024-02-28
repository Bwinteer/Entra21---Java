package Ex2_Corrigida;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// catalogar
		List<Gato> listaDeGatos = new ArrayList<>();
		List<Aves> listaDeaves = new ArrayList<>();
		// como o primata não tem nenhum atributo, nenhum metodo especifico
		// eu consigo trabalhar com o api
		List<Animal> listaDePrimatas = new ArrayList<>();
		
		listaDeGatos.add(new Gato("selvagem", "Gato-de-pallas", "teste", "teste", "teste", "teste", "teste"));

		listaDeaves.add(new Aves("ave1", "ave 1", "arvore", "branco", "brasil", "branco", "pastosa"));
		
		//listaDePrimatas.add(new Animal("primata", "macaco", "medio", "floresta", "brasil"));
		
		// listaDeGatos.get(0) -> get(int index)
		// funciona bem parecido com a ideia de vetores e matrizes
		// onde especifico a posição (quadradinho) que quero mostrar
		// System.out.println(listaDeGatos.get(0));
	
		for (Gato gato : listaDeGatos) {
			System.out.println(gato.toString());
		}
		
		for (Aves ave : listaDeaves) {
			System.out.println(ave.toString());
		}
		
		for (Animal animal : listaDePrimatas) {
			System.out.println(animal.toString());
		}
		
		// eu tenho uma casse pai, eu consigo ter somente uma lista
		
		List<Animal> listaDeAnimais = new ArrayList<>();
		// Animal -> tipo pai, eu tenho a mesma base
		// new Tipo -> precisa ser especifico (Gato, Ave ou primata)
		Animal g1 = new Gato("selvagem", "Gato-de-pallas", "teste", "teste", "teste", "teste", "teste");
		Animal a1 = new Aves("ave1", "ave 1", "arvore", "branco", "brasil", "branco", "pastosa");
	   // Animal prmata = new Animal("primata", "macaco", "medio", "floresta", "brasil");
	    
		//listaDeAnimais.add(prmata);
		// Se eu tenho uma lista e essa lista é com uma classe abstrata
		// ou seja do objeto pai
		// eu consigo ter a lista, porem os dados(ojetos) que vão
		// ser inseridos, serão do tipo dos filhos
	    listaDeAnimais.add(g1);
	    listaDeAnimais.add(a1);
	    
	    // isto aqui é instanciar
	    Gato gatoNovo = new Gato(null, null, null, null, null, null, null);
	}

}
