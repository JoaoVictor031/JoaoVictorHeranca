package org.example.exercicio4;

public class Main {
    public static void main(String[] args) {
        Administrador admin1 = new Administrador();
        System.out.println("Administrador 1 utilizando o construtor padrão: " + admin1);

        Administrador admin2 = new Administrador(
                "João Victor",
                "AV Centenário, 1234",
                "77 99999-9999",
                108,
                5000.0,
                15.0,
                1000.0
        );
        System.out.println("Administrador 2 utilizando o construtor com todos os atributos: " + admin2);

        admin1.setNome("Thiago");
        admin1.setEndereco("AV João Paulo I, 789");
        admin1.setTelefone("77 99888-8888");
        admin1.setCodigoSetor(206);
        admin1.setSalarioBase(10000.0);
        admin1.setImposto(8.0);
        admin1.setAjudaDeCusto(1500.0);
        System.out.println("Administrador 1 após o set: " + admin1);
    }
}

