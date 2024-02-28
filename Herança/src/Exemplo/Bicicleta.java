package Exemplo;

public class Bicicleta extends Veiculo {


	boolean freio;
	// é possivel editar os metodos da classe pai
	public Bicicleta(String modelo, double peso, double comprimento, 
			double velMax, int passageiro, boolean freio) {
		super(modelo, peso, comprimento, velMax, passageiro);
		// TODO Auto-generated constructor stub
		this.freio = freio;
	}
}
