package ClasseObjetos;

public class CalculoCirculo {

	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		Circulo c3 = new Circulo();
		Circulo c4 = new Circulo();
		Circulo c5 = new Circulo();
		
		c1.raio = 2;
		c2.raio = 3;
		c3.raio = 4;
		c4.raio = 5;
		c5.raio = 6;
		
		System.out.println(c1.calcularArea());
		System.out.println(c2.calcularArea());
		System.out.println(c3.calcularArea());
		System.out.println(c4.calcularArea());
		System.out.println(c5.calcularArea());
		
	}

}
