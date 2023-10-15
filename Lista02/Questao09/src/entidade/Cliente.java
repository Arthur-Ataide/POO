package entidade;

public class Cliente extends Pessoa {

    private String id;
    private String cadastro;
    private boolean estaCadastrado;

    public Cliente(String nome, String genero, int idade, double altura, double peso, String id) {
        super(nome, genero, idade, altura, peso);
        this.id = id;
        this.estaCadastrado = false;
    }

    public void cadastrar(String cadastro) {
        this.cadastro = cadastro;
        this.estaCadastrado = true;
    }

}
