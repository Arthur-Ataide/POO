package entidade;

public class Leao extends Animal{
    
    public Leao(String nome) {
        super(nome);
    }

    @Override
    public void alimenta() {
        System.out.println( this.nome + " está comendo a girafa.");
    }

}
