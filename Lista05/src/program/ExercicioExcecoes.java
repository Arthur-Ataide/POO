package program;

import java.util.Scanner;
import java.util.InputMismatchException;

import util.MediaInsuficiente;

public class ExercicioExcecoes {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int N;

        System.out.print("Digite um número inteiro N: ");

        try {
            N = Integer.parseInt(scanner.nextLine());
            System.out.println("N = " + N);
        } 
        
        catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Erro: " + e.getMessage());
            main(args);
            return;
        }

        int[] numeros;

        try{
            numeros = new int[N];

            for (int i = 0; i < N; i++) {

                int numero;

                try{
                    System.out.print("Digite o " + (i + 1) + "º número (entre 0 e 100): ");
                    String inputNumero = scanner.nextLine();
                    numero = Integer.parseInt(inputNumero);
                }

                catch(NumberFormatException e){
                    System.out.println("Erro: " + e.getMessage());
                    main(args);
                    return;
                }

                if (numero < 0 || numero > 100) {
                    try {
                        throw new IllegalArgumentException("Erro: argumento inválido");
                    } 
                    
                    catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        main(args);
                        return;
                    }
                }

                numeros[i] = numero;
            }
        }

        catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException e) {
            System.out.println("Erro: " + e.getMessage());
            main(args);
            return;
        }

        double soma = 0;

        for (int num : numeros) {
            soma += num;
        }
        
        double media;

        try{
            if (N == 0) {
                throw new ArithmeticException("Divisão por zero");
            }
            
            media = soma / N;
        }
            
        catch (ArithmeticException e){
            System.out.println("Erro: " + e.getMessage());
            media = 0;
        }
        
        try{

            if (media < 60) {
                throw new MediaInsuficiente();
            }

            System.out.println("Média: " + media);

        }

        catch (MediaInsuficiente e) {
            System.out.println(e.getMessage());
        }
    }
}
