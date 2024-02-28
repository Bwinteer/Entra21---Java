package Ex2;

public class Principal {

	public static void main(String[] args) {
		
		Animal camelo = new Animal("Urb", "Luiz", "Grande", "Deserto", "Sarah", "Mamifero", false, 300);
		Aves ave1 = new Aves("Gavião", "Beto", "Medio", "Floresta", "Brasil", "Preto", "Ausente de Manchas");
		GatosSelvagens gato1 = new GatosSelvagens("Siames", "Romeu", "Pequeno", "Apartamento", "Brasil", "Preto", "Ausente de Manchas");
		
		System.out.println("Animal: " + camelo.toString());
		System.out.println("Aves: " + ave1.toString());
		System.out.println("Gatos Selvagens: " + gato1.toString());

	}

}
