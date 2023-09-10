import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);

        String nascimentoD = sc.nextLine();
        String atualD = sc.nextLine();

        App app = new App();


        app.calculoDias(nascimentoD, atualD);

    }

    public void calculoDias(String nascimentoD, String atualD){

        String[] nascimentoAux = nascimentoD.split(" ");
        String[] atualAux = atualD.split(" ");
        int[] nascimento = new int[3];
        int[] atual = new int[3];


        for (int i = 0; i < 3; i++) {
            nascimento[i] = Integer.parseInt(nascimentoAux[i]);
            atual[i] = Integer.parseInt(atualAux[i]);
        }


        LocalDate data1 = LocalDate.of((nascimento[2]), (nascimento[1]), (nascimento[0]));
        LocalDate data2 = LocalDate.of((atual[2]), (atual[1]), (atual[0]));

        long diferenca = ChronoUnit.DAYS.between(data1, data2);
        
        System.out.printf("Voce tem %d dias de vida", (long) diferenca);
    }

}
