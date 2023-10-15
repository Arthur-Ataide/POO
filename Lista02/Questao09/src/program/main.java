// Arthur Ataíde de Melo Saraiva 5070

package program;
import entidade.*;

public class main {
    // d. Demonstre como usar esses métodos e como acessar e modificar os atributos
    // de um objeto “Paciente” e de um "Cliente”em um Main no programa.
    
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Arthur", "Masculino", 19, 2, 80, "5070");
        paciente.cadastrar("123456");
        System.out.println(paciente.calculaIMC());

        System.out.println(paciente.getNome());
        
        paciente.setNome("Arthur Saraiva");
        System.out.println(paciente.getNome());
    }

}
