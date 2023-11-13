package program;

import entidade.Eletrodomestico;
import entidade.Televisao;

public class TesteEletrodomesticos {
    public static void main(String[] args) {
        Televisao tv = new Televisao("Samsung", 32);
        tv.ligar();
        System.out.println();
        tv.conectarWifi();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        System.out.println();
        tv.desligar();
    }
}
