package Data;

import animals.Animal;

public interface Registry {
    void addAnimal(Animal animal);
    String getAnimalsList();
}
