// Arthur Ataíde de Melo Saraiva 5070

package entidade;

import java.util.Scanner;

public class DNA {

    char[] sequencia = new char[9];

    Scanner sc = new Scanner(System.in);

    public DNA() {
        lerDNA();
    }

    public void lerDNA() {
        System.out.printf("Digite o DNA: \n");

        for (int i = 0; i < 9; i++) {
            sequencia[i] = sc.next().charAt(0);
        }
    }

    public char[] getDNA() {
        return sequencia;
    }

    public void setDNA(char[] sequencia) {
        this.sequencia = sequencia;
    }

    public String toString() {
        String dna = "";

        for (int i = 0; i < 9; i++)
            dna += sequencia[i];

        return dna;
    }

    public int obterFrequencia(char base) {
        int cont = 0;
        char[] sequencia = getDNA();

        for (int i = 0; i < 9; i++)
            if (sequencia[i] == base)
                cont++;

        return cont;
    }

}