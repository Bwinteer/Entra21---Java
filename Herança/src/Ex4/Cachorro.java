package Ex4;

public class Cachorro extends Animal {
	private String raca;

	public Cachorro(String especie, boolean estimacao, double peso,
			String raca) {
		super(especie, estimacao, peso);
		setRaca(raca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String som() {
		// TODO Auto-generated method stub
		return "auau";
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		if(raca != null || !raca.isBlank()) {
			this.raca = raca;			
		}
	}

}
