package program;

import java.util.ArrayList;
import java.util.Scanner;

import entidade.Circulo;
import entidade.Forma;
import entidade.Quadrado;
import entidade.Retangulo;

public class main {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Retangulo(2, 3));
        formas.add(new Circulo(2));
        formas.add(new Quadrado(2));

        
        
        for (int i = 0; i < formas.size(); i++) {
            System.out.println("====================");
            System.out.println("Area: " + formas.get(i).calcularArea());
            System.out.println("Perimetro: " + formas.get(i).calcularPerimetro());
            System.out.println("====================\n");
        }

        int opcao;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma forma: [1] Retangulo, [2] Circulo, [3] Quadrado\n");
        opcao = sc.nextInt();

        Forma forma = null;

        switch (opcao) {
            case 1:
                forma = new Retangulo(0, 0);
                break;
            case 2:
                forma = new Circulo(0);
                break;
            case 3:
                forma = new Quadrado(0);
                break;
            default:
                System.out.println("Opção inválida");
                System.exit(0);
        }
        
        

        System.out.println(forma.requisitaDados());

        System.out.println("====================");
        System.out.println("Area: " + forma.calcularArea());
        System.out.println("Perimetro: " + forma.calcularPerimetro());
        System.out.println("====================\n");
}
}
