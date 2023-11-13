package program;

import entidade.Calculadora;
import entidade.CalculadoraCientifica;

public class main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("=====================================");
        System.out.println("Usando a calculadora");
        System.out.println("=====================================");
        System.out.println("numero 1 = 4\nnumero 2 = 2\n"); 
        System.out.println("soma = " + calculadora.somar(4, 2));
        System.out.println("subtracao = " + calculadora.subtrair(4, 2));
        System.out.println("multiplicacao = " + calculadora.multiplicar(4, 2));
        System.out.println("divisao = " + calculadora.dividir(4, 2));
        System.out.println();
        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();
        System.out.println("=====================================");
        System.out.println("Usando a calculadora cientifica");
        System.out.println("=====================================");
        System.out.println("numero 1 = 4\nnumero 2 = 2\n"); 
        System.out.println("soma = " + calculadora.somar(4, 2));
        System.out.println("subtracao = " + calculadora.subtrair(4, 2));
        System.out.println("multiplicacao = " + calculadora.multiplicar(4, 2));
        System.out.println("divisao = " + calculadora.dividir(4, 2));
        System.out.println("potencia = " + calculadoraCientifica.potencia(4, 2));
        System.out.println("raiz = " + calculadoraCientifica.raiz(4, 2));
    }
}
