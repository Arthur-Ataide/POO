// Arthur Ataíde de Melo Saraiva 5070

package program;
import entidade.Texto;

public class Teste {
    public static void main(String[] args) throws Exception {
        
        Texto t = new Texto();
        String texto1 = "Arara";
        String texto2 = "arara";

        t.conjugarVerbo("amar");

        System.out.println();

        System.out.println("O numero de vogais do texto1 é: " + t.contarVogais(texto1));
        System.out.println("O inverso do texto1 é: " + t.obterInverso(texto1));
        System.out.println("O texto1 é palindromo? " + t.verificarPalindromo(texto1));

        System.out.println();

        System.out.println("O numero de vogais do texto2 é: " + t.contarVogais(texto2));
        System.out.println("O inverso do texto2 é: " + t.obterInverso(texto2));
        System.out.println("O texto2 é palindromo? " + t.verificarPalindromo(texto2));
        
        

    }
}
