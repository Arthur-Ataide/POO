// Arthur Ataíde de Melo Saraiva 5070

package entidade;

public class Pessoa {
    
    private String nome;
    private String genero;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(String nome, String genero, int idade, double altura, double peso) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }
    
    public double getAltura() {
        return altura;
    }



 


}