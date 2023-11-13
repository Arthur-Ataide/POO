package entidade;

import java.lang.Math;

public class CalculadoraCientifica extends Calculadora{
    public double potencia(double a, double b) {
        return (double) Math.pow(a, b);
    }
    
    public double raiz(double a, double b) {
        return (double) Math.pow(a, 1/b);
    }
}
