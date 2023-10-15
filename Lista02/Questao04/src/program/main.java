// Arthur Ataíde de Melo Saraiva 5070

package program;
import entidade.Ventilador;

public class main {
    public static void main(String[] args) {

        Ventilador ventilador = new Ventilador(1, "Arno", 2020, true);

        System.out.println(ventilador.getVelocidade());

        ventilador.aumentarVelocidade();
        ventilador.aumentarVelocidade();
        ventilador.aumentarVelocidade();
        System.out.println(ventilador.getVelocidade());

        ventilador.diminuirVelocidade();
        System.out.println(ventilador.getVelocidade());

    }
}
