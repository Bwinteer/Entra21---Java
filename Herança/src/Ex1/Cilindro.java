package Ex1;
// Classe filho
public class Cilindro extends Circulo {

	private double altura;

	public Cilindro(String cor, double raio, double altura) {
		// Super é o construtor da classe pai
		super(cor, raio);
		// Daqui em diante é o construtor do filho
		setAltura(altura);
			
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if(altura < 0) {
			throw new IllegalArgumentException("Altura não pode ser negativa");
		}
		this.altura = altura;
	}
	
	public double calcularVolume() {
		//calcularArea() é herdado do pai, por isso consigo utilizar
		return calcularArea() * altura;
	}
	
	@Override
	public String toString() {
		// vem da classe pai super.toString()
		return super.toString() + ", Volume: " + calcularVolume();
	}
}
