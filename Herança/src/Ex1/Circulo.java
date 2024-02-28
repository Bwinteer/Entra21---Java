package Ex1;

// Classe pai - primeira classe que construo
public class Circulo {
	
		private String cor;
		private double raio;
		
		// Construtor
		public Circulo(String cor, double raio) {
			setCor(cor);
			setRaio(raio);
			
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			if (cor.isBlank() || cor == null) {
				throw new IllegalArgumentException("Nome não pode estar vázio ou nulo.");
			}
			this.cor = cor;
			}

		public double getRaio() {
			return raio;
		}

		public void setRaio(double raio) {
			if(raio < 0) {
				throw new IllegalArgumentException("Raio não pode ser negativo"); 
			}
			this.raio = raio;
		}

		public double calcularArea() {
			return 3.14 * (getRaio() * getRaio());
		
		}
		
		@Override
		public String toString() {
			return "Cor: " + getCor() + ", Área: " + calcularArea();
		
		}
}