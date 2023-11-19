package entidade;

public class Funcionario {

    private int id;
    private String nome;
    private int alocacao;
    private double valorHora;

    public Funcionario(int id, String nome, int alocacao, double valorHora) {
        this.id = id;
        this.nome = nome;
        this.alocacao = alocacao;
        this.valorHora = valorHora;
    }

    public double calculaSalario(double hora) {
        return hora * valorHora;
    }

    public double calculaSalario(){
        return calculaSalario(160);
    }

}
