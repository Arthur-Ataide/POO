package entidade;

public class Girafa extends Animal{
    
    public Girafa(String nome) {
        super(nome);
    }

    @Override
    public void alimenta() {
        System.out.println( this.nome + " está comendo folhas da árvore.");
    }

}
