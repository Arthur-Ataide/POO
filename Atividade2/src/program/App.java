// Arthur Ataíde de Melo Saraiva 5070

package program;

import entities.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {

        Funcionario funcionario1 = new Funcionario();
        funcionario1.contratar();
        funcionario1.printarTudo();

        System.out.printf("\n\n");

        Funcionario funcionario2 = new Funcionario();
        funcionario2.contratar();
        funcionario2.printarTudo();

        System.out.printf("\n\nDiferença das idades do Funcionario %s e %s: %d dias\n\n", funcionario1.getNome(), funcionario2.getNome() ,funcionario1.nascimento.diferencaData(funcionario2.nascimento));
        
        funcionario1.folhaPagamento();

    }
}
