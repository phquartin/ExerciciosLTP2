package exercicios.exercicio6.model;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calculaMedia(){
        return (this.nota1 + this.nota2) / 2;
    }
    public void verificarAprovacao(){
        double media = this.calculaMedia();
        if (media >= 7){
            System.out.println("Aluno " +this.nome+ " Aprovado com " + media + " de media");
            return;
        }
        System.out.println("Aluno " +this.nome+ " Reprovado com " + media + " de media");
    }
}
