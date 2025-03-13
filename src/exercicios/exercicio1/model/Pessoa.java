package exercicios.exercicio1.model;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome
                         + "\nIdade: " + idade
                         + "\nAltura: " + altura);
    }

}
