package entidade;

import java.util.Random;

public class Produto {
    private int numSerial;
    private int volume;
    private String teste;

    public Produto(int numSerial, int volume) {
        this.numSerial = numSerial;
        this.volume = volume;
        this.teste = "nao testado";
    }

    public boolean testaUnidade(){
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(10);

        if (numeroAleatorio < 9){
            this.teste = "aprovado";
            return true;
        }
        
        else
            this.teste = "reprovado";
        return false;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String toString() {
        return "Produto [ numSerial = " + numSerial + ", volume = " + volume + ", teste = " + teste + " ]";
    }
}
