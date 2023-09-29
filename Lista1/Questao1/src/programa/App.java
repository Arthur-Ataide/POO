// Arthur Ataíde de Melo Saraiva 5070

package programa;
import entidade.CondicionadorDeAr;

public class App {
    public static void main(String[] args) throws Exception {

        CondicionadorDeAr ar = new CondicionadorDeAr();

        ar.setLigar();

        ar.aumentarTemperatura(30);

        ar.diminuirTemperatura(10);

        ar.aumentarTemperatura(25);
        ar.printarTudo();

    }
}

