package util;

import java.util.ArrayList;
import entidade.Animal;

public class Zoologico {

    private ArrayList<Animal> animais;

    public Zoologico() {
        this.animais = new ArrayList<>();
    }

    public void adicionaAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public void alimentaAnimais() {
        for (Animal animal : this.animais) {
            animal.alimenta();
        }
    }

}
