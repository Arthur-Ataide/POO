package entidade;

import java.util.Scanner;

public class Circulo extends Forma{
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public String getTipo() {
        return this.getClass().getSimpleName();
    }

    public String requisitaDados() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        this.raio = sc.nextFloat();

        return "Raio: " + this.raio;
    }
}
