// Arthur Ataíde de Melo Saraiva 5070

package entidade;

public class Produto {
    
    private String nome;
    private double preco;
    private Etiqueta etiqueta;

//     Crie um construtor, que receba o nome, preço e um
// objeto Etiqueta como parâmetros. Crie outro construtor, que receba o nome e preço do
// produto, e também a marca e tamanho da etiqueta como parâmetros (o objeto Etiqueta deve
// ser instanciado no construtor). Crie os métodos de acesso e modificadores.

    public Produto(String nome, double preco, Etiqueta etiqueta) {
        this.nome = nome;
        this.preco = preco;
        this.etiqueta = etiqueta;
    }

    public Produto(String nome, double preco, String marca, String tamanho) {
        this.nome = nome;
        this.preco = preco;
        this.etiqueta = new Etiqueta(marca, tamanho);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Etiqueta getEtiqueta() {
        return etiqueta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void printTudo(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Marca: " + this.etiqueta.getMarca());
        System.out.println("Tamanho: " + this.etiqueta.getTamanho() + "\n");
    }

}
