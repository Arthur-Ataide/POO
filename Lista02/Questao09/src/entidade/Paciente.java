package entidade;

public class Paciente extends Cliente {

    public Paciente(String nome, String genero, int idade, double altura, double peso, String id) {
        super(nome, genero, idade, altura, peso, id);
    }

    @Override
    public void cadastrar(String cadastro) {
        super.cadastrar(cadastro);
        System.out.println("Paciente sendo cadastrado");
    }

    public double calculaIMC() {
        return this.getPeso() / (this.getAltura() * this.getAltura());
    }

    

}
