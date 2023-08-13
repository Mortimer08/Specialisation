package Data;

import Skills.Skill;
import Skills.SkillsList;
import animals.Animal;
import animals.animalGroups.AnimalGroup;
import animals.animalTypes.AnimalType;
import java.util.ArrayList;

public class RegistryObject implements Registry {

    final ArrayList<Animal> registry = new ArrayList<Animal>();
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

    public ArrayList<Animal> getAnimalList() {
        return registry;
    }

    public String getAnimalsList() {
        int skillsNumber = 1;
        StringBuilder animalsList = new StringBuilder();
        for (Animal animal : registry) {
            animalsList.append(String.format("%s, %s, %s%n", animal.getName(), animal.getGroupName(), animal.getTypeName()));
        }
        return animalsList.toString();
    }

    @Override
    public void addAnimal(Animal animal) {
        registry.add(animal);
    }

    public void addAnimal(String group, String type, String name) {
        AnimalGroup nextGroup = this.getGroup(group);
        if (nextGroup != null) {
            AnimalType nextType = nextGroup.getType(type);
            if (nextType != null) {
                this.addAnimal(new Animal(nextType, nextGroup, name));
                System.out.println("Animal Added");
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
