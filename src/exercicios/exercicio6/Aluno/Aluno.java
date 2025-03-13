package exercicios.exercicio6.Aluno;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }


}
