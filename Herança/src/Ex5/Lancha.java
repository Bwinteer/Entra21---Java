package Ex5;

public class Lancha extends Embarcacao{

	private double velMax;

	public Lancha(String id, String modelo, int qntPessoas, double capacidadeCombustivel, double queimaCombustivel,
			int qntBotesSalvaVidas, double velMax) {
		super(id, modelo, qntPessoas, capacidadeCombustivel, queimaCombustivel, qntBotesSalvaVidas);
		// TODO Auto-generated constructor stub
		
		setVelMax(velMax);
	}

	@Override
	public String verificaSeguranca() {
		// TODO Auto-generated method stub
		// caso ela tiver botes
		// getQntBotesSalvaVidas() -> o metodo na classe pai
		if (getQtdBotesSalvaVidas() > 0) {
			return "Botes ok!";
		} else {
			return "Embarcação necessita de mais botes";
		}
		
	}
	
	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}
	
	public double getVelMax() {
		return velMax;
	}
	
	public double tempoDeViagem(double distancia) {
		double tempo = distancia / this.velMax;
	
		return tempo;
	}

}

	