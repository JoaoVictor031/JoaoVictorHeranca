package org.example.exercicio5;

public class Main {
    public static void main(String[] args) {
        Operario operario1 = new Operario();
        System.out.println("Operario 1 utilizando o construtor padrão: " + operario1);

        Operario operario2 = new Operario(
                "João Victor",
                "AV Centenário, 1234",
                "77 99999-9999",
                505,
                3500.0,
                10.0,
                20000.0,
                5.0
        );
        System.out.println("Operario 2 utilizando o construtor com todos os atributos: " + operario2);

        operario1.setNome("Thiago");
        operario1.setEndereco("AV João Paulo I, 789");
        operario1.setTelefone("77 99888-8888");
        operario1.setCodigoSetor(207);
        operario1.setSalarioBase(4000.0);
        operario1.setImposto(12.0);
        operario1.setValorProducao(15000.0);
        operario1.setComissao(7.0);
        System.out.println("Operario 1 após o set: " + operario1);
    }
}

