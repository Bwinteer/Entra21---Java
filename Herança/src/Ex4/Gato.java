package Ex4;

public class Gato extends Animal {

	private boolean castrado;
	
	public Gato(String especie, boolean estimacao, double peso, 
			boolean castrado) {
		super(especie, estimacao, peso);
		setCastrado(castrado);
		// TODO Auto-generated constructor stub
	}

	// Metodos abstratos serão obrigatoriamente implementados nos filhos
	// aqui eles passam a ter um corpo
	@Override
	public String som() {
		return "miau";
	}
	
	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	
	public boolean isCastrado() {
		return castrado;
	}
	

}
