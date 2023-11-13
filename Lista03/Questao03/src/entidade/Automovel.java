package entidade;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Automovel extends Veiculo{

    private float velocidade;
    private Date data;
    private Calendar calendar;

    public Automovel() {
        this.velocidade = 0;
        calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
    }

    public int getNumeroRodas() {
        return(4);
    }

    public void acelerar(float velocidade) {
        this.velocidade = velocidade;
    }

    public void parar() {
        this.velocidade = 0;
    }

    public void trocarOleo() {
        this.data = calendar.getTime();
    }

    public Date getDataTrocaOleo() {
        return(this.data);
    }

    public float getVelocidade() {
        return(this.velocidade);
    }
    
}
