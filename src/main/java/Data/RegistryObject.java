package Data;

import Skills.Skill;
import Skills.SkillsList;
import animals.Animal;
import animals.animalGroups.AnimalGroup;
import animals.animalTypes.AnimalType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RegistryObject implements Registry {
    Integer animalID = 1;
    final HashMap<Integer, Animal> registryMap = new HashMap<>();
    final ArrayList<Animal> registry = new ArrayList<>();
    final ArrayList<AnimalGroup> groups = new ArrayList<>();

    public RegistryObject() {
        AnimalGroup beastOfBurden = new AnimalGroup("Beast Of Burden");
        AnimalGroup pet = new AnimalGroup("Pet");
        groups.add(beastOfBurden);
        groups.add(pet);
        beastOfBurden.addType(new AnimalType("Horse"));
        beastOfBurden.addType(new AnimalType("Camel"));
        beastOfBurden.addType(new AnimalType("Donkey"));
        pet.addType(new AnimalType("Dog"));
        pet.addType(new AnimalType("Cat"));
        pet.addType(new AnimalType("Hamster"));
    }

    public ArrayList<Animal> getAnimalsList() {
        return registry;
    }

    public HashMap<Integer, Animal> getAnimalMap(){
        return registryMap;
    }

    @Override
    public void addAnimal(Animal animal) {
        registry.add(animal);
        registryMap.put(animalID++, animal);
    }

    public void addAnimal(String group, String type, String name) {
        AnimalGroup nextGroup = this.getGroup(group);
        if (nextGroup != null) {
            AnimalType nextType = nextGroup.getType(type);
            if (nextType != null) {
                this.addAnimal(new Animal(nextType, nextGroup, name));
            }
        }
    }

    public void addAnimal(String type, String name) {
        for (AnimalGroup nextGroup : this.groups) {
            AnimalType nextType = nextGroup.getType(type);
            if (nextType != null) {

                this.addAnimal(new Animal(nextType, nextGroup, name));
            }
        }
    }

    @Override
    public AnimalGroup findGroup(Animal animal) {

        return null;
    }

    @Override
    public AnimalGroup findGroup() {
        return null;
    }

    @Override
    public SkillsList getSkillsList(Animal animal) {
        return null;
    }

    @Override
    public void teachCommand(Animal animal, Skill skill) {

    }

    public ArrayList<AnimalGroup> getGroups() {
        return groups;
    }

    public AnimalGroup getGroup(AnimalGroup group) {
        for (AnimalGroup nextGroup : groups) {
            if (nextGroup.equals(group)) {
                return nextGroup;
            }
        }
        return null;
    }

    public AnimalGroup getGroup(String group) {
        for (AnimalGroup nextGroup : groups) {
            if (nextGroup.getName().equals(group)) {
                return nextGroup;
            }
        }
        return null;
    }

}
