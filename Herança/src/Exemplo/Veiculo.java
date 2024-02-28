package Exemplo;

//super class ou classe pai
public class Veiculo {
    // private o filho precisa usar get e set
	private String modelo;
	// protected o filho ainda consegue usar sem estar encapsulado
	protected double peso;
	double comprimento;
	double velMax;
	int passageiro;

	public Veiculo(String modelo, double peso, double comprimento, double velMax, int passageiro) {
		this.modelo = modelo;
		this.peso = peso;
		this.comprimento = comprimento;
		this.velMax = velMax;
		this.passageiro = passageiro;
	}
	
	public String verificaLimite(int quantidadeDePassageiro) {
		if(quantidadeDePassageiro > passageiro) {
			return "Passou do limite";
		} else {
			return "Não passou do limite";
		}
	}

	// metodo

}
