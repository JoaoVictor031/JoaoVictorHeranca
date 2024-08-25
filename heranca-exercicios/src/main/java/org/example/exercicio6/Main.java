package org.example.exercicio6;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor();
        System.out.println("Vendedor 1 utilizando o construtor padrão): " + vendedor1);

        Vendedor vendedor2 = new Vendedor(
                "João Victor",
                "AV Centenário, 1234",
                "77 99999-9999",
                110,
                4000.0,
                15.0,
                25000.0,
                8.0
        );
        System.out.println("Vendedor 2 utilizando o construtor com todos os atributos): " + vendedor2);

        vendedor1.setNome("Thiago");
        vendedor1.setEndereco("AV João Paulo I, 789");
        vendedor1.setTelefone("77 99888-8888");
        vendedor1.setCodigoSetor(208);
        vendedor1.setSalarioBase(6000.0);
        vendedor1.setImposto(9.0);
        vendedor1.setValorVendas(30000.0);
        vendedor1.setComissao(10.0);
        System.out.println("Vendedor 1 após o set: " + vendedor1);
    }
}

