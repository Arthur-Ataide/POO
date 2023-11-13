package entidade;

public class Eletrodomestico {
    protected String nome;
    protected boolean ligado;

    public Eletrodomestico(String nome) {
        this.nome = nome;
        this.ligado = false;
    }
}
