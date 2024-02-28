package PessoaEndereco;

public class Endereco {
	
	/*Na classe Endereco faça o seguinte:
	a) Crie três atributos privados: um do tipo String para o logradouro, outro do tipo String para o complemento e um do tipo int para o número;*/
	
	private String logradouro;
    private String complemento;
    private int numero;

    public Endereco(String logradouro, String complemento, int numero) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Logradouro: " + logradouro + ", Número: " + numero + ", Complemento: " + complemento;
    }
}

