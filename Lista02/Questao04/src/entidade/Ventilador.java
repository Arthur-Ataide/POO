// Arthur Ataíde de Melo Saraiva 5070

package entidade;

public class Ventilador {

    private int velocidade;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Ventilador(int velocidade, String modelo, int ano, boolean ligado) {
        this.velocidade = velocidade;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void aumentarVelocidade() {
        this.velocidade++;
    }

    public void diminuirVelocidade() {
        this.velocidade--;
    }

}