// Arthur Ataíde de Melo Saraiva 5070

package program;
import entidade.*;

public class main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Papel", 10, 10);
        Produto produto2 = new Produto("Arvore", 20, 0);

        Pedido pedido = new Pedido(1, "Arthur");

        pedido.adicionaProduto(produto1);
        pedido.adicionaProduto(produto2);

        pedido.calculaPrecoFinal();
        pedido.finalizarPedido();
    }
}
