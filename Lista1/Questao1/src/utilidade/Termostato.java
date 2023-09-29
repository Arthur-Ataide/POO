// Arthur Ataíde de Melo Saraiva 5070

package utilidade;
import java.util.Scanner;

public class Termostato {
    private int temperatura;

    Scanner sc = new Scanner(System.in);

    public Termostato(){
        temperatura = 20;
    }

    public void setTemperatura(int temperatura){
        this.temperatura = temperatura;
    }

    public int getTemperatura(){
        return temperatura;
    }

}

