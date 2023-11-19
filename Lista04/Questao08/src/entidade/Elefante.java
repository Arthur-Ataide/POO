package entidade;

public class Elefante extends Animal{

    public Elefante(String nome) {
        super(nome);
    }

    @Override
    public void alimenta() {
        System.out.println( this.nome + " está comendo amendoim.");
    }
    
}
