package Floricultura;

import java.util.ArrayList;
import java.util.List;

public class Floricultura {

		/*Crie 5 objetos de flor e as coloque em uma Array List
		
		Responda:
		a) Quem comprou a flor mais cara?
		b) Qual o nome da flor mais cara?
		
		Em um sistema de uma floricultura deve se guardar o nome da flor, o preço,
		nome do cliente que comprou a flor e se a flor é para presente ou não.*/
		
		private String flor;
		private int preço;
		private String cliente;
		private String presente;

		public static List<Floricultura> listaFloricultura = new ArrayList<>();

		public Floricultura(String flor, int preço, String cliente, String presente) {

			setFlor(flor);
			setPreço(preço);
			setCliente(cliente);
			setPresente(presente);
			listaFloricultura.add(this);
		}

		public String getFlor() {
			return flor;
		}

		public void setFlor(String flor) {
			this.flor = flor;
		}

		public int getPreço() {
			return preço;
		}

		public void setPreço(int preço) {
			if (preço <= 0) {
				System.out.println("O preço não pode ser negativo");
			} else {
				this.preço = preço;
			}
		}

		public String getCliente() {
			return cliente;
		}

		public void setCliente(String cliente) {
			this.cliente = cliente;
		}

		public String getPresente() {
			return presente;
		}

		public void setPresente(String presente) {
			this.presente = presente;
		}

		@Override
		public String toString() {
			return "O nome da pessoa que comprou a flor mais cara é " + this.getCliente() + " e o nome da flor mais cara é "
					+ this.getFlor() + ".";
		}

	}
