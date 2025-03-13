package exercicios;

import exercicios.exercicio1.model.Pessoa;
import exercicios.exercicio2.model.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Selecione o exercicio(1-10): ");
        int exercicio = sc.nextInt();
        switch (exercicio) {
            case 1:
                Pessoa pessoa = new Pessoa("Joao", 18, 1.87);
                pessoa.exibirDados();
                break;
            case 2:
                Produto produto = new Produto("Feijao", 10.99);
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Preco: " + produto.getPreco());

        }
    }
}
