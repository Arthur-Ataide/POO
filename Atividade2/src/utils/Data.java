// Arthur Ataíde de Melo Saraiva 5070

package utils;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Data {
    public int dia;
    public int mes;
    public int ano;

    public Data (int ano, int mes, int dia){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void printData(){

        System.out.printf("%d/%d/%d\n", dia, mes, ano);

    }

    public long diferencaData(Data nascimento){

        LocalDate data1 = LocalDate.of(ano, mes, dia);
        LocalDate data2 = LocalDate.of(nascimento.ano, nascimento.mes, nascimento.dia);

        long diferenca = ChronoUnit.DAYS.between(data1, data2);
        
        return diferenca;
    }

}
