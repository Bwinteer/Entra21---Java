package Ex6;

public class Smartphone extends Computador{

	private int operadora;
	private boolean cameraFrontal;
	
	public Smartphone(String modelo, double ram, double armazenamento, int operadora, boolean cameraFrontal) {
		super(modelo, ram, armazenamento);
		// TODO Auto-generated constructor stub
		setOperadora(operadora);
		setCameraFrontal(cameraFrontal);
	}
	
	public boolean tirarSelfie() {
		if (cameraFrontal == true) {
			return true;
		} else {
			return false;
		}	
	}
	public int getOperadora() {
		return operadora;
	}

	public void setOperadora(int operadora) {		
		this.operadora = operadora;
		}

	public boolean isCameraFrontal() {
		return cameraFrontal;
	}

	public void setCameraFrontal(boolean cameraFrontal) {
		this.cameraFrontal = cameraFrontal;
	}
	
	public String ligarOuDesligar(boolean ligando) {
		if (ligando == true) {
			return "Ligando";
		} else {
			return "Desligando";
		}
	}
	public boolean ligar(int primeiroNumero) {
		
		String numero = ""+ primeiroNumero;
		String operador = ""+ operadora;	
		if (numero.startsWith(operador)) {
			return true;
		} else {
			return false;
		}
		
	}
	@Override
	public boolean rodarAplicacao(String aplicativo) {
		if (aplicativo.endsWith(".afk")) {
			return true;
		} else {
			return false;
		}
	}
}
