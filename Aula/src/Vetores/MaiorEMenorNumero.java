package Vetores;

import java.util.Scanner;

public class MaiorEMenorNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//4. Crie uma array de 5 elementos e descubra: 
		//a) Qual o maior elemento 
		//b) Qual o menor elemento 
		//c) A média dos elementos
		
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		double[] vetor = new double[5];
		// vetor.length = tamanho do vetor (quantia de elementos)
		
		double soma = 0;
		for (int indice = 0; indice < vetor.length; indice++)	
			System.out.println("Informe um valor: ");
			int indice = entrada.nextInt();
			vetor[indice] = entrada.nextDouble();
			soma = soma + vetor[indice];
			
	    	if (vetor[indice] < menor) {
	    		menor = vetor[indice];
	            }
	    
            if (vetor[indice] > maior) {
                maior = vetor[indice];
            }
            System.out.println("O maior elemento é: " + maior);
            System.out.println("O menor elemento é: " + menor);
            System.out.println("A média dos elementos é: " + (soma/vetor.length));
        }
	    	
	}


