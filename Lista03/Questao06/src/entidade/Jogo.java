package entidade;

import java.util.Random;

import entidade.Objeto;

public class Jogo{

    private Objeto jogador1;
    private Objeto jogador2;

    public Jogo() {
        Random random = new Random();
        int num1 = random.nextInt(3);

        switch (num1) {
            case 1:
                jogador1 = new Pedra();
                break;
            case 2:
                jogador1 = new Papel();
                break;
            case 3:
                jogador1 = new Tesoura();
                break;
            default:
                break;
        }

        int num2 = random.nextInt(3);

        switch (num2) {
            case 1:
                jogador2 = new Pedra();
                break;
            case 2:
                jogador2 = new Papel();
                break;
            case 3:
                jogador2 = new Tesoura();
                break;
            default:
                break;
        }
    }

    public Objeto getJogador1() {
        return jogador1;
    }

    public void setJogador1(Objeto jogador1) {
        this.jogador1 = jogador1;
    }

    public Objeto getJogador2() {
        return jogador2;
    }

    public void setJogador2(Objeto jogador2) {
        this.jogador2 = jogador2;
    }

    public String vencedor(){
        if (jogador1.getTipoString().equals("Pedra") && jogador2.getTipoString().equals("Tesoura")) {
            return "quebra";
        } else if (jogador1.getTipoString().equals("Tesoura") && jogador2.getTipoString().equals("Papel")) {
            return "Corta";
        } else if (jogador1.getTipoString().equals("Papel") && jogador2.getTipoString().equals("Pedra")) {
            return "envolve";
        } else if (jogador1.getTipoString().equals("Tesoura") && jogador2.getTipoString().equals("Pedra")) {
            return "quebra";
        } else if (jogador1.getTipoString().equals("Papel") && jogador2.getTipoString().equals("Tesoura")) {
            return "Corta";
        } else if (jogador1.getTipoString().equals("Pedra") && jogador2.getTipoString().equals("Papel")) {
            return "envolve";
        } else {
            return "Empate";
        }
    }
}
