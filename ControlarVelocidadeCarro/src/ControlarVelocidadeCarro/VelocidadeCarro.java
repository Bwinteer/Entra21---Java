package ControlarVelocidadeCarro;

public class VelocidadeCarro {

	private double velocidade;

	/*
	 * Deseja-se criar uma classe para controlar a velocidade do carro.
	 * 
	 * Implemente os métodos: acelerar(double): void, que deve modificar o conteúdo
	 * do atributo velocidade para velocidade + parâmetro recebido (usar
	 * setVelocidade), mas desde que o valor do parâmetro seja maior ou igual a zero
	 * e menor que 20. Senão, imprime a mensagem “Não foi possível acelerar” e
	 * mantém o valor atual do atributo velocidade.
	 * 
	 * reduzir(double): void, quem modifica o conteúdo do atributo velocidade para
	 * velocidade - parâmetro recebido (usar setVelocidade), mas desde que o valor
	 * do parâmetro seja maior ou igual a zero e menor que 30. Senão, imprime a
	 * mensagem “Não foi possível reduzir” e mantém o valor atual do atributo
	 * velocidade.
	 */

    public VelocidadeCarro() {
        this.velocidade = 0.0;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(double valor) {
        if (valor >= 0 && valor < 20) {
            setVelocidade(getVelocidade() + valor);
        } else {
            System.out.println("Não foi possível acelerar.");
        }
    }

    public void reduzir(double valor) {
        if (valor >= 0 && valor < 30) {
            setVelocidade(getVelocidade() - valor);
        } else {
            System.out.println("Não foi possível reduzir.");
        }
    }
}