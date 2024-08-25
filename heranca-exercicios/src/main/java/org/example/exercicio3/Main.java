package org.example.exercicio3;

public class Main {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        System.out.println("Empregado 1 utilizando o construtor padrão: " + empregado1);

        Empregado empregado2 = new Empregado(
                "João Victor",
                "AV Centenário, 1234",
                "77 99999-9999",
                107,
                5000.0,
                15.0
        );
        System.out.println("Empregado 2 utilizando o construtor com todos os atributos: " + empregado2);

        empregado1.setNome("Thiago");
        empregado1.setEndereco("AV João Paulo I, 789");
        empregado1.setTelefone("77 99888-8888");
        empregado1.setCodigoSetor(205);
        empregado1.setSalarioBase(10000.0);
        empregado1.setImposto(10.0);
        System.out.println("Empregado 1 após o set: " + empregado1);
    }
}
