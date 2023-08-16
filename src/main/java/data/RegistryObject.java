package data;

import skills.Skill;
import animals.Animal;
import animals.animalGroups.AnimalGroup;
import animals.animalTypes.AnimalType;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;

public class RegistryObject implements Registry {
    Integer animalID = 1;
    final HashMap<Integer, Animal> registryMap = new HashMap<>();
    final ArrayList<Animal> registry = new ArrayList<>();
    final ArrayList<AnimalGroup> groups = new ArrayList<>();
    public Animal currentAnimal;

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

    public HashMap<Integer, Animal> getAnimalMap() {
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
    public ArrayList<Skill> getSkillsList() {
        return currentAnimal.getSkills();
    }

    public AnimalGroup getGroup(String group) {
        for (AnimalGroup nextGroup : groups) {
            if (nextGroup.getName().equals(group)) {
                return nextGroup;
            }
        }
        return null;
    }

    public void setBirthDay(Integer number, Data birthday) {
        this.registryMap.get(number).setBirthDay(birthday);
    }

    public Data getBirthday(Integer number) {
        return this.registryMap.get(number).getBirthDay();
    }

    public void addSkill(String skillName, String skillDescription) {
        ArrayList<Skill> skillsList = currentAnimal.getSkills();
        for (Skill skill : skillsList) {
            if (skill.getSkillName().equals(skillName)) {
                return;
            }
        }
        currentAnimal.addSkill(new Skill(skillName, skillDescription));
    }
    public void setCurrentAnimal(Animal animal){
        this.currentAnimal = animal;
    }
    public Animal getCurrentAnimal(){
        return this.currentAnimal;
    }
}
