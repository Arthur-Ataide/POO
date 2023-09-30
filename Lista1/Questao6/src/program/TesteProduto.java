// Arthur Ataíde de Melo Saraiva 5070

package program;

import entidade.Etiqueta;
import entidade.Produto;

public class TesteProduto {

    public static void main(String[] args) throws Exception {

        String nome, marca, tamanho;
        double preco;

        nome = "Camiseta";
        preco = 99.99;
        marca = "Nike";
        tamanho = "M";


        Etiqueta etiqueta = new Etiqueta(marca, tamanho);
        Produto produto = new Produto(nome, preco, etiqueta);

        produto.printTudo();

        nome = "Calça";
        preco = 199.99;
        marca = "Adidas";
        tamanho = "G";

        Produto produto2 = new Produto(nome, preco, marca, tamanho);

        produto2.printTudo();

        produto2.setNome("Calça Jeans");
        produto2.setPreco(299.99);
        produto2.getEtiqueta().setMarca("Levis");
        produto2.getEtiqueta().setTamanho("GG");

        produto2.printTudo();

    }
}
