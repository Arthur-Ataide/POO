package entidade;

public class Gerente extends Funcionario {
    
    private int quantidadeFuncionarios;

    public Gerente(int id, String nome, int alocacao, double valorHora, int quantidadeFuncionarios) {
        super(id, nome, alocacao, valorHora);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    @Override
    public double calculaSalario(double hora) {
        return super.calculaSalario(hora)*1.40;
    }

    @Override
    public double calculaSalario() {
        return calculaSalario(160);
    }

}
