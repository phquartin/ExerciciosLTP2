package exercicios;

import exercicios.exercicio1.model.Pessoa;
import exercicios.exercicio2.model.Produto;
import exercicios.exercicio3.model.Calculadora;
import exercicios.exercicio4.model.Telefone;
import exercicios.exercicio5.controller.ContagemRegressiva;
import exercicios.exercicio6.model.Aluno;
import exercicios.exercicio7.controller.SistemaLogin;
import exercicios.exercicio8.model.Esfera;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("Selecione o exercicio(1-10): ");
            int exercicio = Integer.parseInt(sc.nextLine());
            switch (exercicio) {
                case 1:
                    Pessoa pessoa = new Pessoa("Joao", 18, 1.87);
                    pessoa.exibirDados();
                    break;
                case 2:
                    Produto produto = new Produto("Feijao", 10.99);
                    System.out.println("Nome: " + produto.getNome());
                    System.out.println("Preco: " + produto.getPreco());
                case 3:
                    Calculadora calculadora = new Calculadora();
                    System.out.println("Soma 10 + 5: " + calculadora.soma(10, 5));
                    System.out.println("Multiplicacao 5 x 10: " + calculadora.multiplica(5, 10));
                    System.out.println("24 eh par? " + calculadora.parOuImpar(24));
                    System.out.println("13 eh par? " + calculadora.parOuImpar(13));
                    break;
                case 4:
                    Telefone telefone = new Telefone("55441122", "TIM");
                    telefone.discar("1234567");
                    telefone.enviarMensagem("Java eh massa", "9011234");
                    break;
                case 5:
                    ContagemRegressiva cr = new ContagemRegressiva();
                    System.out.print("Digite o numero: ");
                    cr.contagem(sc.nextInt());
                    break;
                case 6:
                    Aluno aluno1 = new Aluno("Pedro", 10, 9);
                    Aluno aluno2 = new Aluno("Kaio", 4, 5);

                    aluno1.verificarAprovacao();
                    aluno2.verificarAprovacao();
                    break;
                case 7:
                    new SistemaLogin().login();
                    break;
                case 8:
                    Esfera esfera = new Esfera(10);
                    System.out.println("Area = " + esfera.calcularArea() + "cm quadrados");
                    System.out.println("Volume = " + esfera.calcularVolume() + "cm cubicos");
                    break;
                case 9:
            }
        }
    }
}
