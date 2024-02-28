package Funcao;

import java.util.Scanner;

public class Exercicio2 {
	// fórmula: p.s tipo nome(){}
	// parametros e função não precisam ter o mesmo tipo
	public static String verifica(int dadoUm, int dadoDois) {
		// Então, irá printar as entrada (os dados) ao cubo
		// caso entre em alguma condição abaixo (qualquer um):
		// Algum dos dois números for 5
		// A soma deles é 5
		// A diferença deles é 5
		int numUmAoCubo = dadoUm * dadoUm * dadoUm;
		int numDoisAoCubo = dadoDois * dadoDois * dadoDois;
		// primeira validamos se um dos números é 5 (caminho feliz)
		if (dadoUm == 5 || dadoDois == 5) {
			return "Os numeros ao cubo: " + numUmAoCubo + " " + numDoisAoCubo;
			// agora validar a diferenca
		} else if ((dadoUm - dadoDois) == 5 || (dadoDois - dadoUm) == 5) {
			return "Os numeros ao cubo: " + numUmAoCubo + " " + numDoisAoCubo;
			// A soma deles é 5
		} else if ((dadoUm + dadoDois) == 5) {
			return "Os numeros ao cubo: " + numUmAoCubo + " " + numDoisAoCubo;
		} else {
			int numUmAoQuadrado = dadoUm * dadoUm;
			int numDoisAoQuadrado = dadoDois * dadoDois;
			return "Os numeros ao quadrado: " + numUmAoQuadrado + " " + numDoisAoQuadrado;
		}

	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		 /* Faça um código que receba duas entradas do usuário
		 * 
		 * Printe cada entrada ao cubo se: Algum dos dois números for 5 A soma deles é 5
		 * A diferença deles é 5
		 * 
		 * Se nenhuma dessas condições forem satisfeitas, printe cada entrada ao
		 * quadrado
		 */

		// duas entradas do usuário
		System.out.println("Digite o primeiro número: ");
		int numUm = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		int numDois = entrada.nextInt();

		System.out.println(verifica(numUm, numDois));
	}

}
