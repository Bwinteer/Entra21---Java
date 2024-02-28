package Ex7;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Brasil", "Santa Catarina", "Blumenau", "Rua do Engenho", "170");
        ArrayList<String> habilidades = new ArrayList<>();
        habilidades.add("Trabalho em Equipe");
        habilidades.add("Organização");
        habilidades.add("Determinada");

        Gerente gerente1 = new Gerente("1", endereco, LocalDate.of(2023, 02, 20), "Bruna",
                5100, LocalDate.of(2022, 05, 30) , habilidades, "1");
        
        System.out.println(gerente1.toString());
        System.out.println(gerente1.getIdade());
        System.out.println(gerente1.calcularSalarioAnual());
        System.out.println(gerente1.calcularAnosDeEmpresa());
  
    }

 }
