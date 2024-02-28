package EstruturaDeSelecao;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade de Marquinhos:");
        int idadeMarquinhos = entrada.nextInt();

        System.out.println("Digite a idade de Zezinho:");
        int idadeZezinho = entrada.nextInt();

        System.out.println("Digite a idade de Luluzinha:");
        int idadeLuluzinha = entrada.nextInt();

        if (idadeMarquinhos > idadeZezinho && idadeMarquinhos > idadeLuluzinha) {
            System.out.println("Marquinhos é o mais velho.");
            if (idadeZezinho > idadeLuluzinha) {
                System.out.println("Zezinho é o irmão do meio.");
                System.out.println("Luluzinha é a caçula.");
            } else {
                System.out.println("Luluzinha é a irmã do meio.");
                System.out.println("Zezinho é o caçula.");
            }
        } else if (idadeZezinho > idadeMarquinhos && idadeZezinho > idadeLuluzinha) {
            System.out.println("Zezinho é o mais velho.");
            if (idadeMarquinhos > idadeLuluzinha) {
                System.out.println("Marquinhos é o irmão do meio.");
                System.out.println("Luluzinha é a caçula.");
            } else {
                System.out.println("Luluzinha é a irmã do meio.");
                System.out.println("Marquinhos é o caçula.");
            }
        } else {
            System.out.println("Luluzinha é a mais velha.");
            if (idadeMarquinhos > idadeZezinho) {
                System.out.println("Marquinhos é o irmão do meio.");
                System.out.println("Zezinho é o caçula.");
            } else {
                System.out.println("Zezinho é o irmão do meio.");
                System.out.println("Marquinhos é o caçula.");
            }
        }
    }
}