// Arthur Ataíde de Melo Saraiva 5070

package entidade;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void aumentarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void diminuirEstoque(int quantidade) {
        this.quantidade -= quantidade;
    }

    public void aumentarPreco(double preco) {
        this.preco += preco;
    }

    public void diminuirPreco(double preco) {
        this.preco -= preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    

}