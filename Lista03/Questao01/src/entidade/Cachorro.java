package entidade;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String Raca) {
        this.raca = Raca;
    }

    @Override
    public String toString() {
        return  "Cachorro [ " + super.toString() + ", raca = " + raca + " ]";
    }

    
}
