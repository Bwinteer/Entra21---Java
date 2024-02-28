package Exemplo;

// Tudo que eu tenho na classe pai eu consigo usar no filho
// classe filho, que herda 
// abrasileirando = objeto filho estende do objeto pai
public class Aviao extends Veiculo {

	public Aviao(String modelo, double peso, double comprimento, double velMax, int passageiro) {
		// super -> superclasse = classe mãe
		super(modelo, peso, comprimento, velMax, passageiro);
		// TODO Auto-generated constructor stub
		
	}

	int numMotores;
	int numAsas;

}
