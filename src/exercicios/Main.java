package exercicios;

import exercicios.exercicio1.model.Pessoa;

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
        }
    }
}
