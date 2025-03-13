package exercicios.exercicio4.model;

public class Telefone {
    private String numero;
    private String operadora;

    public Telefone(String numero, String operadora) {
        this.numero = numero;
        this.operadora = operadora;
    }

    public void discar(String numero){
        System.out.println("Dicando para " + numero + "\n.\n.\n.\nNinguem atendeu...");
    }
    public void enviarMensagem(String mensagem, String numero){
        System.out.println("Numero "+ numero +" recebeu a mensagem `"+mensagem+"` com sucesso!");
    }

}
