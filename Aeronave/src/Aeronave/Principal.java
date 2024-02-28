package Aeronave;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
	/*Crie 4 objetos de sua preferência.
	    
	Calcule:
	    
	a) Qual das aeronaves pode ficar no ar por mais tempo?
	b) Qual aeronave leva o maior número de passageiros?
	c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe?
	*/
		
	List<String> lista = new ArrayList<>();
		
	lista.add("Retangulo 1");
	lista.add("Retangulo 2");
	lista.add("Retangulo 3");
	lista.add("Retangulo 4");
	lista.add("Retangulo 5");
	lista.add("Retangulo 6");
	lista.add("Retangulo 7");
	lista.add("Retangulo 8");
	lista.add("Retangulo 9");
	lista.add("Retangulo 10");
	
	
	double maisTempoAr = Integer.MIN_VALUE;
	double maisPassageiros = Integer.MIN_VALUE;
	double maisLongo = Integer.MIN_VALUE;
	String nomeTempoAr = "";
	String nomeMaisPassageiros = "";
	String nomeMaisLongo = "";
	
	for (int i = 0; i < lista.length; i++) {
		if (lista[i].tempoNoAr() > maisTempoAr) {
			maisTempoAr = lista[i].tempoNoAr();
			nomeTempoAr = lista[i].getAviao();
		}
		if (vetor[i].getPassageiros() > maisPassageiros ) {
			maisPassageiros = lista[i].getPassageiros();
			nomeMaisPassageiros = lista[i].getAviao();
		}
		
		if (lista[i].maisLonge() > maisLongo) {
			maisLongo = lista[i].maisLonge();
			nomeMaisLongo = lista[i].getAviao();
		}
		
	}
	
	System.out.println("O avião que mais fica no ar é o da: " + nomeTempoAr);
	System.out.println("O avião com mais espaço é o da: " + nomeMaisPassageiros);
	System.out.println("O avião que vai mais longe é o da: " + nomeMaisLongo);
	
	}

}



