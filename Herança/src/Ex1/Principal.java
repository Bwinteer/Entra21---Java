package Ex1;

public class Principal {

	public static void main(String[] args) {

		Circulo circulo1 = new Circulo("Azul", 5);
		Cilindro cilindro1 = new Cilindro("Rosa", 5, 8);
				
		System.out.println("Área do Circulo 1: " + circulo1.toString());
		System.out.println("Volume do Cilindro 1: " + cilindro1.toString());
	}

}
