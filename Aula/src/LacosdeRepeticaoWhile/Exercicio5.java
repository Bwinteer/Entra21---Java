package LacosdeRepeticaoWhile;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o nome de uma fruta: ");
        String fruta = scan.nextLine();
        
        while(fruta.equals("banana") || fruta.equals("pera") || fruta.equals("maça")
        		|| fruta.equals("morango")
        		) {
        	System.out.print("Digite o nome de uma fruta: ");
            fruta = scan.nextLine();
        switch (fruta) {
            case "banana":
                System.out.println("Eu gosto dessa fruta!");
                break;
            case "pera":
                System.out.println("Eu não gosto dessa fruta!");
                break;
            case "maça":
            	System.out.println("Eu gosto dessa fruta!");
            	break;
            default:
                System.out.println("Eu não conheço essa fruta!");
                break;
        }
        
	}
}
}
