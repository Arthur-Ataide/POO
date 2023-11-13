package program;

import entidade.Animal;
import entidade.Cachorro;
import entidade.Peixe;

public class main {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro("Toddy", 10.0, "Sitsu");
        Animal animal2 = new Peixe("Nemo", 0.5, "Mar");

        System.out.println(animal1.toString());
        System.out.println(animal2.toString());
    }
}
