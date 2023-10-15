package entidade;

import java.util.ArrayList;

public class Pedido {

    private int id;
    private String nomeCliente;
    private double valorPedido;
    private ArrayList <Produto> produtos;

    public Pedido(int id, String nomeCliente) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionaProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void calculaPrecoFinal() {
        double precoFinal = 0;

        for (int i = 0; i < produtos.size(); i++) {
            precoFinal += this.produtos.get(i).getPreco();
        }

        precoFinal *= 1.1;
        this.valorPedido = precoFinal;
    }

    public void finalizarPedido() {

        System.out.println("Pedido #" + this.id);
        System.out.println("Cliente: " + this.nomeCliente);
        System.out.println("Valor: " + this.valorPedido);

        for (int i = 0; i < produtos.size(); i++) {
            if (this.produtos.get(i).getQuantidade() < 1) 
                System.out.println("Produto: " + this.produtos.get(i).getNome() + " - " + this.produtos.get(i).getPreco() + " - Produto indisponível");

            else{
                this.produtos.get(i).diminuirEstoque(1);
                System.out.println("Produto: " + this.produtos.get(i).getNome() + " - " + this.produtos.get(i).getPreco());
            }
        }
    }

}
