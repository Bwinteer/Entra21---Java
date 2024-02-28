package Ex7;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empregado extends Funcionario {
	
	String idSindicato;
	Gerente gerente;
	public Empregado(String id, Endereco endereco, LocalDate dataNascimento, String nome, double salario,
			LocalDate dataIngresso, ArrayList<String> habilidades, String idSindicato, Gerente gerente) {
		super(id, endereco, dataNascimento, nome, salario, dataIngresso, habilidades);
		// TODO Auto-generated constructor stub
		setIdSindicato(idSindicato);
		setGerente(gerente);
		
	 }

    public void sairDoSindicato() {
        this.idSindicato = null;
    }

    public double comissao(double valor) {
        valor = valor * 0.05;
        // não consigo utilizar o this.salario porque ele é do pai
        setSalario(getSalario() + valor);
        return getSalario();
    }

    public String getIdSindicato() {
        return idSindicato;
    }

    public void setIdSindicato(String idSindicato) {
    	if(idSindicato != null)
        this.idSindicato = idSindicato;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}