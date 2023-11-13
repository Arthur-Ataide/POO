package entidade;

public class Celular extends DispositivoEletronico implements Recarregavel {

    private int bateria;

    public Celular(int bateria) {
        this.bateria = bateria;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void recarregar() {
        this.bateria = 100;
    }
    
}
