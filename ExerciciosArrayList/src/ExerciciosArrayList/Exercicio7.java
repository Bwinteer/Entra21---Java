package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		/*Descreva um algoritmo que leia 5 valores decimais e os coloque em uma Array List.
		Em seguida, modifique a Array List de modo que os valores das POSIÇÕES ímpares 
		sejam aumentados em 5% e os das POSIÇÕES pares sejam aumentados em 2%.
		Imprima a Array List resultante*/
		
		Scanner scanner = new Scanner(System.in);
		List<Double> lista = new ArrayList<>();
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Insira um valor decimal: ");
			double valor = scanner.nextDouble();
			lista.add(valor);
		}
		// Modificar os valores da ArrayList conforme as posições
        for (int i = 0; i < lista.size(); i++) {
            if (i % 2 == 0) {
                // Aumentar em 2% para posições pares
                double novoValor = lista.get(i) * 1.02;
                lista.set(i, novoValor);
            } else {
                // Aumentar em 5% para posições ímpares
                double novoValor = lista.get(i) * 1.05;
                lista.set(i, novoValor);
            }
        }

        System.out.println("Array List resultante: " + lista);
        
        }
	}
	