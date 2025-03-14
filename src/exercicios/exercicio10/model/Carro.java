package exercicios.exercicio10.model;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidade = 0;

    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar(int incremento){
        this.velocidade += incremento;
        System.out.println("Marca: " + this.marca + ", Modelo: " + this.modelo);
        System.out.println("Velocidade atual: "+ velocidade);
    }

}
