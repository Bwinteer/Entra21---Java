package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		//Crie 4 variáveis fora do For onde define se é m(mulher) e h(homem) 
		//e faça dois contador que verifique quantas mulheres e homens são
		

		System.out.println("---------------Bem vindo ao programa!---------------");
		System.out.println("Inform 4 valores, sendo M - Mulher e H - Homem:");
		String valUm = entrada.next();
		String valDois = entrada.next();
		String valTres = entrada.next();
		String valQuatro = entrada.next();
		
		int contadorMulheres = 0;
		int contadorHomens = 0;
		
		for(int i = 0; i < 4; i++) {
			if(valUm.equals("M")) {
			contadorMulheres++;
			} else {
				contadorHomens++;
			}
		}
		System.out.println("Mulheres: " + contadorMulheres);
		System.out.println("Homens: " + contadorHomens);
	}

}
