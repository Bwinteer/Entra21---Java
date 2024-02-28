package aula2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		DecimalFormat formatar = new DecimalFormat("0.00");

		/*Uma pessoa foi até uma casa de câmbio trocar dólares por reais. 
		 *Para isto ela entregou um valor em dólares para o atendente. 
		 *Calcule quantos reais o atendente deve devolver para a pessoa.
		 */
		
		// Entrada
		System.out.println("Bem vindo ao conversor do dolar em real!\n");
		
		System.out.println("Digite a cotação do dolar: ");
		double cotacaoDolar = entrada.nextDouble();
		System.out.println("Digite o valor em dolar: ");
		double valorDolar = entrada.nextDouble();
		
		/* Caso queira colocar o valor do dolar já incluso no código é só por:
		 * 
		 * double dolar = 4.97;
		 * 
		 * Dai pode retirar a parte de perguntar a cotação do dolar.
		 */
		
		// Processo
		double valorReal = cotacaoDolar * valorDolar;
		
		System.out.println("A atendente deverá devolver para você: " + formatar.format(valorReal));
			
			}

	}