package Empregado;

import java.util.Scanner;
import java.util.Set;

public class PrincipalEmpregado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/*Crie uma classe Empregado que terá como atributos:
		
		Identificação
		Nome
		Sobrenome
		Salário
		
		Crie métodos para:
		Saber o salário anual do empregado
		Saber o nome completo do empregado
		Modificar o salário, o parâmetro do método deve ser o percentual de aumento
		Imprima o toString do usuário que após o aumento ficou com o maior do salário*/

		System.out.println("Informe um valor para aumento de salário.");
		double aumentoSalario = scan.nextDouble();

		Empregado e1 = new Empregado(475668, "Mateus", "Esperandio", 1100);
		Empregado e2 = new Empregado(84963, "Bruna", "Rubio", 4000);
		Empregado e3 = new Empregado(696969, "Ricardo", "Hedler", 13000);
		Empregado e4 = new Empregado(6755757, "Rafaela", "Bruch", 70000);

		e1.porcentagem(aumentoSalario);
		e2.porcentagem(aumentoSalario);
		e3.porcentagem(aumentoSalario);
		e4.porcentagem(aumentoSalario);

		System.out.println("Salários atualizados:");
		System.out.println(e1.nomeCompleto() + ": " + e1.getSalario());
		System.out.println(e2.nomeCompleto() + ": " + e2.getSalario());
		System.out.println(e3.nomeCompleto() + ": " + e3.getSalario());
		System.out.println(e4.nomeCompleto() + ": " + e4.getSalario());

	/* variavelAuxiliar
	double maiorSalario = Double.MIN_VALUE;
	String empregadoMaiorSalario = null;
	
	for (Empregado pessoas : Empregado.listaEmpregado) {
	pessoas.porcentagem(aumentoSalario);
	
	if (pessoas.getSalario() > maiorSalario) {
	
	}
	maiorSalario = pessoas.getSalario();
	
	empregadoMaiorSalario = pessoas.toString();
	
	}
			System.out.println(empregadoMaiorSalario);*/
			}

		}