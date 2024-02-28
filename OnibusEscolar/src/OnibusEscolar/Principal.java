package OnibusEscolar;

public class Principal {

	public static void main(String[] args) {
		OnibusEscolar onibus = new OnibusEscolar(40, 1);

		int valor = 3;
		
		onibus.removerAlunos(valor);

		System.out.println(onibus);
    }

	}



