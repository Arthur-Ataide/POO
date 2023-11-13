package entidade;

public abstract class DispositivoEletronico implements Ligavel {
    protected boolean ligado;

    public DispositivoEletronico() {
        this.ligado = false;
    }
}
