// Arthur Ataíde de Melo Saraiva 5070

package program;
import entidade.*;

public class main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        
        animal.fazerSom();
        
        cachorro.fazerSom();
        cachorro.cachorro();
    }
}
