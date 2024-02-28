package Ex6;

public abstract class Computador {
	
	private String modelo;
	private double ram;
	private double armazenamento;
	
	
	public Computador(String modelo, double ram, double armazenamento) {
		setModelo(modelo);
		setRam(ram);
		setArmazenamento(armazenamento);
		}

	public String ligarOuDesligar(boolean estado) {
		if (estado == true) {
			return "Ligando!";
		} else {
			return "Desligando!";
		}	
	}
	
	public abstract boolean rodarAplicacao(String aplicativo);
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if (modelo.isBlank() || modelo == null) {
			throw new IllegalArgumentException("Modelo inválido");
		} else {
			this.modelo = modelo;
		}
	}
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		if (ram < 0) {
			throw new IllegalArgumentException("Quantidade inválida de ram.");
		} else {
		this.ram = ram;
	}
}
	public double getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(double armazenamento) {
		if (armazenamento < 0) {
			throw new IllegalArgumentException("Quantidade inválida de ram.");
		} else {
		this.armazenamento = armazenamento;
		}
	}

	@Override
	public String toString() {
		return "Modelo: " + this.modelo + ", Ram: " + this.ram + ", Armazenamento: " + this.armazenamento;
	}	
}
	