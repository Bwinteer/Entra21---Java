package EstruturaDeSelecao;

public class ExemploCNH {

	public static void main(String[] args) {
		
		/* Se é possível ter uma CNH;
		 *É preciso ter +18 anos;
		 *Ser brasileiro;
		*/
		
		int idade = 18;
		String nacionalidade = "Brasileiro";
		if (idade >= 18 && nacionalidade.equals("Brasileiro")) {
			System.out.println("Não é possível ter a CNH!");
		} else { 
			System.out.println("É possível ter a CNH!");
		}
	}
		
	boolean permissaoJudicial = true;
	if (permissãoJudicial == true || idade >= 18) {
		System.out.println("É possível ter a CNH!");
	}

}
