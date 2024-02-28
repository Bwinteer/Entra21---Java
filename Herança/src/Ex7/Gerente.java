package Ex7;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gerente extends Funcionario {

    private String idGerente;

    public Gerente(String id, Endereco endereco, LocalDate dataNascimento, String nome, double salario, LocalDate dataIngresso, ArrayList<String> habilidades
            , String idGerente) {
        super(id, endereco, dataNascimento, nome, salario, dataIngresso, habilidades);
        setIdGerente(idGerente);
    }

    public void demitirEmpregado(Empregado Fiuk) {
    	if(Fiuk.getGerente().idGerente.equals(this.idGerente)){
            Fiuk.setId("DEMITIDO");
        } else {
            throw new IllegalArgumentException("O gerente não é o gerente do Funcionário");
        }
    }
	public String getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(String idGerente) {
		if(idGerente.isBlank() || idGerente == null) {
			throw new IllegalArgumentException("Nome do Gerente inválido!");
		} else {
		this.idGerente = idGerente;
	}
    
}	
	@Override
	public String toString() {
		return super.toString() + "\nGerente id: " + idGerente;
	}
}
