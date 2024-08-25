package org.example.exercicio1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        System.out.println("Pessoa 1 (Construtor padrão): " + pessoa1);

        Pessoa pessoa2 = new Pessoa("João Victor", "AV Centenário, 1234", "77 99999-9999");
        System.out.println("Pessoa 2 com todos os atributos: " + pessoa2);

        Pessoa pessoa3 = new Pessoa("Thiago", "77 99888-8888");
        System.out.println("Pessoa 3 com nome e telefone): " + pessoa3);

        pessoa1.setNome("Anabelly");
        pessoa1.setEndereco("AV João Paulo I, 1000");
        pessoa1.setTelefone("77 99101-1010");
        System.out.println("Pessoa 1 após o set): " + pessoa1);
    }
}