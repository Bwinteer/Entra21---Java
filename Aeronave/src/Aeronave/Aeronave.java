package Aeronave;

public class Aeronave {

	 /* Faça uma classe chamada Aeronave. Com os atributos: 
	  * Passageiros. 
	  * Velocidade máxima. 
	  * Capacidade de combustível. 
	  * Queima de combustível por minuto.
	  */

	private String aviao;
	private int passageiros;
	private int velMax;
	private int combustivel;
	private double combustivelMin;

	public Aeronave(String aviao, int passageiros, int velMax, int combustivel, double combustivelMin) {
		setAviao(aviao);
		setPassageiros(passageiros);
		setVelMax(velMax);
		setCombustivel(combustivel);
		setCombustivelMin(combustivelMin);
	}

	public String getAviao() {
		return aviao;
	}

	public void setAviao(String aviao) {
		if (aviao.isBlank() || aviao.isEmpty() || aviao == null) {
			System.out.println("Sem nome o aviao.");
		} else {
			this.aviao = aviao;
		}
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		if (passageiros < 0) {
			System.out.println("Sem passageiros.");
		} else {
			this.passageiros = passageiros;
		}
	}

	public int getVelMax() {
		return velMax;
	}

	public void setVelMax(int velMax) {
		if (velMax < 0) {
			System.out.println("Avião parado.");
		} else {
			this.velMax = velMax;
		}

	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		if (combustivel < 0) {
			System.out.println("Sem capacidade.");
		} else {
			this.combustivel = combustivel;
		}

	}

	public double getCombustivelMin() {
		return combustivelMin;
	}

	public void setCombustivelMin(double combustivelMin) {
		if (combustivelMin < 0) {
			System.out.println("Tá estragado o motor.");
		} else {
			this.combustivelMin = combustivelMin;
		}
	}

	public double tempoNoAr() {
		return combustivel / combustivelMin;
	}

	public double maisLonge() {
		return velMax * tempoNoAr();
	}

	@Override
	public String toString() {
		return "A aeronave com mais tempo de voo: " + this.tempoNoAr() + "n/A aeronave com mais passageiros: " + this.getPassageiros() 
		+ "n/A aeronave que voa mais longe: " + this.maisLonge();
	}
}
