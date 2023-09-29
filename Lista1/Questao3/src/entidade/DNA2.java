// Arthur Ataíde de Melo Saraiva 5070

package entidade;

import java.util.Scanner;

public class DNA2 {

    char[] sequencia = new char[9];

    Scanner sc = new Scanner(System.in);

    public DNA2() {
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

    public int verificarSimilaridade(DNA2 dna) {
        int similaridade = 0;

        for (int i = 0; i < 9; i++)
            if (sequencia[i] == dna.getDNA()[i])
                similaridade++;

        return similaridade;
    }

    

}