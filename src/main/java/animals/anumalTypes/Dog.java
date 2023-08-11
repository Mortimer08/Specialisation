package animals.anumalTypes;

import animals.animalGroups.AnimalGroup;
import animals.animalGroups.Pet;

public class Dog extends AnimalType {
    public Dog(String typeName) {
        super(typeName);
        super.setAnimalGroup(new Pet());
    }

}
