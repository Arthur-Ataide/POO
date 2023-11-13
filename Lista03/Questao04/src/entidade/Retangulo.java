package entidade;

import java.util.Scanner;

public class Retangulo extends Forma{
    private float lado;
    private float altura;

    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public double calcularArea() {
        return lado * altura;
    }

    public double calcularPerimetro() {
        return 2 * (lado + altura);
    }

    public String getTipo() {
        return this.getClass().getSimpleName();
    }

    public String requisitaDados() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento do retângulo: ");
        this.lado = sc.nextFloat();

        System.out.println("Digite a largura do retângulo: ");
        this.altura = sc.nextFloat();

        return "Lado: " + this.lado + ", Altura: " + this.altura;
    }
}
