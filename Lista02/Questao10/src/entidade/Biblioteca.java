// Arthur Ataíde de Melo Saraiva 5070

package entidade;

public class Biblioteca {
    private Livro[] livros;
    public int numLivros;

    public Biblioteca(int tamanhoMaximo) {
        livros = new Livro[tamanhoMaximo];
        numLivros = 0;
    }

    public void adicionarLivro(Livro livro) { // nao criar o livro aqui, melhor cria fora do metodo e passar como parametro
        livros[numLivros] = livro;
        numLivros++;
    }

    public void listarLivros() {
        System.out.println("Livros na biblioteca:");
        for (int i = 0; i < numLivros; i++) {
            livros[i].mostrarLivro(); //melhor ter um metodo para mostrar o livro no proprio livro para diminuir o acoplamento
        }
    }

    public int getlivroslength() {
        return livros.length;
    }
}


