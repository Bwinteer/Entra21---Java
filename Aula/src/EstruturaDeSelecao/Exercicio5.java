 package EstruturaDeSelecao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/* Dada a idade de um nadador descreva um algoritmo que o classifique em uma das seguintes categorias: 
		 *pré-mirim 5 - 7 anos 
		 *mirim 8 - 10 anos 
		 *infantil 11 - 13 anos 
		 *infanto-juvenil 14 - 17 anos 
		 *juvenil 18 - 20 anos 
		 *adulto maiores de 21 anos
		 */
		
		System.out.println("Qual é a sua idade?");
		int idade = entrada.nextInt();
		
		if(idade <= 4){
            System.out.println("Muito jovem!");
        }
 
        if(idade >= 5 && idade <= 7){
            System.out.println("Pré-Mirim");
        }
 
        if(idade >= 8 && idade <= 10){
            System.out.println("Mirim");
        }
 
        if(idade >= 11 && idade <= 13){
            System.out.println("Infantil");
        }
 
        if(idade >= 14 && idade <= 17){
            System.out.println("Infanto-Juvenil");
        }
        
        if(idade >= 18){
            System.out.println("Adulto");
        }    
		
	}

}
