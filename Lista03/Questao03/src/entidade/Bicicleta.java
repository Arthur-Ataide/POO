package entidade;

public class Bicicleta extends Veiculo{
    
    private float velocidade;
    
    public int getNumeroRodas() {
        return(2);
    }

    public void acelerar(float velocidade) {
        this.velocidade = velocidade;
    }

    public void parar() {
        this.velocidade = 0;
    }

    public float getVelocidade() {
        return(this.velocidade);
    }

}
