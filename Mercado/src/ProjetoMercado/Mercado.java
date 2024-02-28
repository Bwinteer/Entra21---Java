package ProjetoMercado;

public class Mercado {

	private String localidade;
	private int macasVendidas;
	private double precoMacas;
	private int laranjasVendidas;
	private double precoLaranjas;

	public Mercado(String localidade, int macasVendidas, double precoMacas, int laranjasVendidas,
			double precoLaranjas) {

		setLocalidade(localidade);
		setMacasVendidas(macasVendidas);
		setPrecoMacas(precoMacas);
		setLaranjasVendidas(laranjasVendidas);
		setPrecoLaranjas(precoLaranjas);
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		if (localidade.isBlank() || localidade.isEmpty() || localidade == null) { // Fazendo a validacao de string
			System.out.println("Erro, nome invalido");
		} else {
			this.localidade = localidade;
		}
	}

	public int getMacasVendidas() {
		return macasVendidas;
	}

	public void setMacasVendidas(int macasVendidas) {
		if (macasVendidas < 0) { // Fazendo a validacao de numero
			System.out.println("Erro, numero nao pode ser negativo");
		} else {
			this.macasVendidas = macasVendidas;
		}
	}

	public double getPrecoMacas() {
		return precoMacas;
	}

	public void setPrecoMacas(double precoMacas) {
		if (precoMacas < 0) {
			System.out.println("Erro, preco nao pode ser negativo");
		} else {
			this.precoMacas = precoMacas;
		}
	}

	public int getLaranjasVendidas() {
		return laranjasVendidas;
	}

	public void setLaranjasVendidas(int laranjasVendidas) {
		if (laranjasVendidas < 0) {
			System.out.println("Erro, numero de laranjas vendidas invalido");
		} else {
			this.laranjasVendidas = laranjasVendidas;
		}
	}

	public double getPrecoLaranjas() {
		return precoLaranjas;
	}

	public void setPrecoLaranjas(double precoLaranjas) {
		if (precoLaranjas < 0) {
			System.out.println("Erro, preco da laranja nao pode ser negativo");
		} else {
			this.precoLaranjas = precoLaranjas;
		}
	}

	public double lucroMacas() {
		return macasVendidas * precoMacas;
	}

	public double lucroLaranja() {
		return laranjasVendidas * precoLaranjas;
	}

	public double lucroTotal() {
		return lucroMacas() + lucroLaranja();
	}

}
