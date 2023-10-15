// Arthur Ataíde de Melo Saraiva 5070

package entidade;

public class Automovel {
    
    private String modelo;
    private int ano;
    private double quilometragem;
    private double combustivel;
    private double quilometros_por_litro;

    public Automovel(String modelo, int ano, double quilometragem, double combustivel, double quilometros_por_litro) {
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.combustivel = combustivel;
        this.quilometros_por_litro = quilometros_por_litro;
    }

    public void abastecer(double litros) {
        this.combustivel += litros;
    }

    public void trafegar(double distancia) {
        this.quilometragem += distancia;
        this.combustivel -= distancia / this.quilometros_por_litro;
    }

    public double combustivelNoTanque() {
        return this.combustivel;
    }

    public double quilometragemCarro() {
        return this.quilometragem;
    }

}