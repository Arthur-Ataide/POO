package entidade;

public class Televisao extends Eletrodomestico implements AparelhoInteligente{
    private int volume;

    public Televisao(String nome, int volume) {
        super(nome);
        this.volume = volume;
    }

    public void conectarWifi() {
        System.out.println("Conectando a TV " + this.nome + " à rede wifi...");
    }

    public void ligar() {
        System.out.println("Ligando a TV " + this.nome + "...");
        this.ligado = true;
    }

    public void desligar() {
        System.out.println("Desligando a TV " + this.nome + "...");
        this.ligado = false;
    }

    public void aumentarVolume() {
        if (this.volume == 100) {
            System.out.println("Volume máximo atingido!");
            return;
        }
        this.volume++;
        System.out.println("Volume: " + this.volume);
    }

    public void diminuirVolume() {
        if (this.volume == 0) {
            System.out.println("Volume mínimo atingido!");
            return;
        }
        this.volume--;
        System.out.println("Volume: " + this.volume);
    }
}
