package program;

import entidade.Veiculo;
import entidade.Automovel;
import entidade.Bicicleta;

public class main {
    public static void main(String[] args) {
        System.out.println("===============================");
        Veiculo bicicleta = new entidade.Bicicleta();
        bicicleta.acelerar(10);
        System.out.println("Velocidade da bicicleta: " + ((Bicicleta) bicicleta).getVelocidade());
        bicicleta.parar();
        System.out.println("Velocidade da bicicleta: " + ((Bicicleta) bicicleta).getVelocidade());
        System.out.println("Numero de rodas da bicicleta: " + bicicleta.getNumeroRodas());
        System.out.println("===============================\n");

        System.out.println("===============================");
        Veiculo automovel = new entidade.Automovel();
        automovel.acelerar(50);
        System.out.println("Velocidade do automovel: " + ((Automovel)automovel).getVelocidade());
        automovel.parar();
        System.out.println("Velocidade do automovel: " + ((Automovel)automovel).getVelocidade());
        System.out.println("Numero de rodas do automovel: " + automovel.getNumeroRodas());
        ((Automovel)automovel).trocarOleo();
        System.out.println("Data da troca de oleo do automovel: " + ((Automovel)automovel).getDataTrocaOleo());
        System.out.println("===============================\n");
    }
    
}
