package animals;

import java.util.ArrayList;

public class Registry {
    private ArrayList<Animal> registry;

    public Registry() {
        this.registry = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        registry.add(animal);
    }

    public void showAnimals() {
        for (Animal animal : registry) {
            System.out.printf("%s, %s, %s%n",animal.getName(),animal.getGroupName(),animal.getTypeName());
        }
    }
}
