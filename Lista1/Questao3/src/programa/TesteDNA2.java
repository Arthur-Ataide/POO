// Arthur Ataíde de Melo Saraiva 5070

package programa;

import entidade.DNA2;

public class TesteDNA2 {

    public static void main(String[] args) throws Exception {

        DNA2[] vetDnas = new DNA2[4];
        int[][] matrix = new int[4][4];

        for (int i = 0; i < 4; i++)
            vetDnas[i] = new DNA2();

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                matrix[i][j] = vetDnas[i].verificarSimilaridade(vetDnas[j]);

        System.out.println("Matriz de similaridade: \n");

        for (int i = 0; i < 4; i++) {
            System.out.printf("\t");

            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }

            System.out.printf("\n");
        }
    }
}
