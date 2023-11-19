package program;

import entidade.Animal;
import entidade.Girafa;
import entidade.Leao;
import entidade.Elefante;
import util.Zoologico;;

public class main {

    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        Animal animal1 = new Girafa("Girafales");
        Animal animal2 = new Girafa("GIRASSOL");

        Animal animal3 = new Leao("Simba");
        Animal animal4 = new Leao("Mufasa");
        Animal animal5 = new Leao("Scar");

        Animal animal6 = new Elefante("Jotalhão");
        Animal animal7 = new Elefante("Dumbo");
        Animal animal8 = new Elefante("Horton");

        zoo.adicionaAnimal(animal3);
        zoo.adicionaAnimal(animal5);
        zoo.adicionaAnimal(animal2);
        zoo.adicionaAnimal(animal7);
        zoo.adicionaAnimal(animal1);
        zoo.adicionaAnimal(animal4);
        zoo.adicionaAnimal(animal8);
        zoo.adicionaAnimal(animal6);

        zoo.alimentaAnimais();
    }
}
