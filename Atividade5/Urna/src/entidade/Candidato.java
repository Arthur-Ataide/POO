package entidade;

public class Candidato {
    private String nome;
    private String partido;
    private String cargo;
    private int numVotacao;

    public Candidato(String nome, String partido, String cargo, int numVotacao) {
        this.nome = nome;
        this.partido = partido;
        this.cargo = cargo;
        this.numVotacao = numVotacao;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }

    public String getCargo() {
        return cargo;
    }

    public int getNumVotacao() {
        return numVotacao;
    }
}
