package animals.animalTypes;

import animals.animalGroups.Pet;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        super.setAnimalType("Cat");
    }
}
