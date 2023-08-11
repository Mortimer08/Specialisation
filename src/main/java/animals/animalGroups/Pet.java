package animals.animalGroups;

import animals.Animal;
import animals.animalTypes.*;

import java.util.ArrayList;

public class Pet extends AnimalGroup {
    public Pet() {
        super("Pet");
        super.animalTypes = new ArrayList<>();
        this.addType(new Dog());
        this.addType(new Cat());
        this.addType(new Hamster());
    }
    public void addType(AnimalType animalType){
        animalTypes.add(animalType);
    }
/*    public void setAnimalType(String animalType) {
        super.typeName = animalType;
    }*/

}
