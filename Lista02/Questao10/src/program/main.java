// Arthur Ataíde de Melo Saraiva 5070


// a) acoplamento é quando uma classe depende de outra classe para funcionar, ou seja, quando uma classe 
//    usa outra classe como parametro ou atributo, é importante reduzir o acoplamento para que o codigo
//    fique mais organizado e mais facil de entender e modificar, para isso é importante usar o encapsulamento.



package program;
import entidade.*;

public class main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca(2);
        Livro[] livros = new Livro[3]; 

        livros[0] = new Livro("Java Programming", "John Smith"); // criação do livros fora do metodo biblioteca
        livros[1] = new Livro("Introduction to OOP", "Alice Johnson");
        livros[2] = new Livro("Data Structures", "Bob Davis");

        biblioteca.adicionarLivro(livros[0]);// adicionando os livros na biblioteca
        biblioteca.adicionarLivro(livros[1]);
        
        if (biblioteca.numLivros < biblioteca.getlivroslength()) {
            biblioteca.adicionarLivro(livros[2]);
        }

        biblioteca.listarLivros();
    }
}
