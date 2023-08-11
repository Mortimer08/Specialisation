package animals.animalGroups;

import animals.Animal;
import animals.animalTypes.AnimalType;
import animals.animalTypes.Camel;
import animals.animalTypes.Horse;
import animals.animalTypes.Donkey;

import java.util.ArrayList;

public class BeastOfBurden extends AnimalGroup {
    public BeastOfBurden() {
        super("Beast Of Burden");
        super.animalTypes = new ArrayList<>();
        this.addType(new Camel());
        this.addType(new Horse());
        this.addType(new Donkey());
    }
    public void addType(AnimalType animalType){
        animalTypes.add(animalType);
    }
/*    public void setAnimalType(String animalType){
        super.typeName = animalType;
    }*/

}
