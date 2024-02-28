package Ex5;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lancha lancha1 = new Lancha("123", "branco", 10, 200, 5, 0, 20);
		Embarcacao lancha2 = new Lancha("123", "branco", 10, 200, 5, 10, 20);
	
		System.out.println(lancha1.verificaSeguranca());
		System.out.println(lancha2.verificaSeguranca());
		
	}

}
