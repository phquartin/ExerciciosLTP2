package exercicios.exercicio8.model;

public class Esfera {
    private static final double pi = 3.14159265358979323846;
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return 4 * pi * raio * raio;
    }
    public double calcularVolume() {
        return (4.0/3.0) * pi * raio * raio * raio;
    }

}
