package animals.animalGroups;

import animals.animalTypes.AnimalType;

import java.util.ArrayList;

public class AnimalGroup {
    protected ArrayList<AnimalType> animalTypes;
    private String name;

    public AnimalGroup(String name) {
        animalTypes = new ArrayList<>();
        this.name = name;
    }

    public void addType(AnimalType animalType) {
        animalTypes.add(animalType);
    }

    public String getName() {
        return this.name;
    }

/*    public boolean getType(AnimalType type) {
        for (AnimalType nextType : animalTypes) {
            if (nextType.equals(type)) return true;
        }
        return false;
    }*/

    public AnimalType getType(String type) {
        for (AnimalType nextType : animalTypes) {
            if (nextType.name.equals(type)) return nextType;
        }
        return null;
    }


}
