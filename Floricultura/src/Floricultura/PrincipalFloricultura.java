package Floricultura;

public class PrincipalFloricultura {

	public static void main(String[] args) {

	/*Crie 5 objetos de flor e as coloque em uma Array List
	
	Responda:
	a) Quem comprou a flor mais cara?
	b) Qual o nome da flor mais cara?
	
	Em um sistema de uma floricultura deve se guardar o nome da flor, o preço,
	nome do cliente que comprou a flor e se a flor é para presente ou não.*/

		Floricultura clienteUm = new Floricultura("Antulho", 10, "Gabriel", "Não, é para presente");
		Floricultura clienteDois = new Floricultura("Rosa", 16, "Bruna", "Sim, é para presente");
		Floricultura clienteTres = new Floricultura("Tulipa", 20, "Ralf", "Sim, é para presente");
		Floricultura clienteQuatro = new Floricultura("Girassol", 8, "Vinicius", "Não, é para presente");
		Floricultura clienteCinco = new Floricultura("Lírio", 8, "Leonardo", "Sim, é para presente");

		// variaveisAuxiliares

		int florCara = Integer.MIN_VALUE;
		Floricultura nomeFlorCara = null;

		for (Floricultura flores : Floricultura.listaFloricultura) {
			if (flores.getPreço() > florCara) {
				florCara = flores.getPreço();
				nomeFlorCara = flores;
			}

		}
		System.out.println(nomeFlorCara.toString());
	}

}


