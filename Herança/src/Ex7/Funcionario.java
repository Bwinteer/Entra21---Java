package Ex7;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public abstract class Funcionario {
    private String id;
    private LocalDate dataNascimento;
    private String nome;
    private double salario;
    private LocalDate dataIngresso;
    private ArrayList<String> habilidades =  new ArrayList<>();


    public Funcionario(String id, Endereco endereco, LocalDate dataNascimento, String nome, double salario, 
    		LocalDate dataIngresso, ArrayList<String> habilidades) {
        setId(id);
        setDataNascimento(dataNascimento);
        setNome(nome);
        setSalario(salario);
        setDataIngresso(dataIngresso);
        setHabilidades(habilidades);
    }

    public int getIdade(){
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public double calcularSalarioAnual(){
        return this.salario * 12;
    }

    public void adicionarHabilidade(String novaHabilidade){
        this.habilidades.add(novaHabilidade);
    }

    public int calcularAnosDeEmpresa(){
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataIngresso, dataAtual);
        return periodo.getYears();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Funcionário " +
                "id: " + this.id +
                ", Data Nascimento: " + this.dataNascimento +
                ", Nome: " + this.nome + 
                ", Salário: " + this.salario +
                ", Data Ingresso: " + this.dataIngresso +
                ", Habilidades: " + this.habilidades;
    }
}