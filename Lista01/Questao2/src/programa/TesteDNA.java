// Arthur Ataíde de Melo Saraiva 5070

package programa;

import entidade.DNA;

public class TesteDNA {
    public static void main(String[] args) throws Exception {

        boolean none = true;

        DNA dna1 = new DNA();
        DNA dna2 = new DNA();
        DNA dna3 = new DNA();
        DNA dna4 = new DNA();

        int F1 = dna1.obterFrequencia('A');
        int F2 = dna2.obterFrequencia('A');
        int F3 = dna3.obterFrequencia('A');
        int F4 = dna4.obterFrequencia('A');

        System.out.println("DNAs que a Adenina aparece mais que 2 vezes: ");

        if (F1 > 2) {
            System.out.print("DNA1 ");
            none = false;
        }

        if (F2 > 2) {
            System.out.print("DNA2 ");
            none = false;
        }

        if (F3 > 2) {
            System.out.print("DNA3 ");
            none = false;
        }

        if (F4 > 2) {
            System.out.print("DNA4 ");
            none = false;
        }

        if (none)
            System.out.print("Nenhum dos DNAs tem mais de 2 Adeninas");

        System.out.println();

    }
}
