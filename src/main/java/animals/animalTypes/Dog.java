package animals.animalTypes;

import animals.animalGroups.Pet;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
        super.setAnimalType("Dog");
    }
}
