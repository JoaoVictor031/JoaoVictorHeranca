package org.example.exercicio2;

public class Main {
    public static void main(String[] args) {

        Fornecedor fornecedor1 = new Fornecedor();
        System.out.println("Fornecedor 1 utilizando o construtor padrão: " + fornecedor1);

        Fornecedor fornecedor2 = new Fornecedor(
                "João Victor",
                "AV Centenário, 1234",
                "77 99999-9999",
                5000.0,
                1500.0
        );
        System.out.println("Fornecedor 2 utilizando o construtor com todos os atributos): " + fornecedor2);

        Fornecedor fornecedor3 = new Fornecedor(
                "Thiago",
                "77 99888-8888",
                10000.0,
                2900.0
        );
        System.out.println("Fornecedor 3 utilizando o construtor com nome e telefone: " + fornecedor3);

        fornecedor1.setNome("Anabelly");
        fornecedor1.setEndereco("AV João Paulo I, 1000");
        fornecedor1.setTelefone("77 99101-1010");
        fornecedor1.setValorCredito(10000.0);
        fornecedor1.setValorDivida(1200.0);
        System.out.println("Fornecedor 1 após o set): " + fornecedor1);
    }
}
