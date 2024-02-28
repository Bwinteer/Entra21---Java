package ContaBanco;

public class PrincipalConta {

	public static void main(String[] args) {

		/*
		 * Faça uma classe chamada Conta, com os atributos nome e saldo.
		 * 
		 * Faça um método para sacar dinheiro Outro método para depositar dinheiro E
		 * outro método para transferir dinheiro de uma conta para outra
		 */

		Conta acc1 = new Conta("Bruna", 4000);
		Conta acc2 = new Conta("Duda", 2000);
		Conta acc3 = new Conta("Leo", 600);
		Conta acc4 = new Conta("Vini", 1400);

		acc1.mostrarSaldo();
		acc2.mostrarSaldo();
		acc3.mostrarSaldo();
		acc4.mostrarSaldo();

		acc1.sacar(200);
		acc2.depositar(300);
		acc3.depositar(10);
		acc4.sacar(600);

		acc1.mostrarSaldo();
		acc2.mostrarSaldo();
		acc3.mostrarSaldo();
		acc4.mostrarSaldo();

		acc1.transferir(acc4, 700);

		acc1.mostrarSaldo();
		acc2.mostrarSaldo();
		acc3.mostrarSaldo();
		acc4.mostrarSaldo();

		acc4.transferir(acc2, 100);

		acc1.mostrarSaldo();
		acc2.mostrarSaldo();
		acc3.mostrarSaldo();
		acc4.mostrarSaldo();
	}
	
}

