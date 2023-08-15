package mvp;

import data.Registry;
import data.RegistryObject;
import skills.Skill;
import animals.Animal;

import java.util.ArrayList;
import java.util.HashMap;

public class Model {
    private final Registry animalRegistry = new RegistryObject();

    public Model() {
    }

    public void addAnimal(String group, String type, String name) {
        animalRegistry.addAnimal(group, type, name);
    }

    public void addAnimal(String type, String name) {
        animalRegistry.addAnimal(type, name);
    }

    public String getAnimalSkills(Integer animalNumber) {
        Animal animal = animalRegistry.getAnimalMap().get(animalNumber);
        ArrayList<Skill> skills = animalRegistry.getSkillsList(animal);
        StringBuilder skillsString = new StringBuilder();
        for (Skill skill : skills) {
            skillsString.append(String.format("%s = %s\n", skill.getSkillName(), skill.getDescription()));
        }
        return skillsString.toString();
    }

    public void addSkill(Integer animalNumber, String skillName, String skillDescription) {
        Animal animal = animalRegistry.getAnimalMap().get(animalNumber);
        animalRegistry.addSkill(animal, skillName, skillDescription);
    }

    public String getAnimals() {
        HashMap<Integer, Animal> map = animalRegistry.getAnimalMap();
        StringBuilder animalsList = new StringBuilder();
        for (Integer number : map.keySet()) {
            Animal animal = map.get(number);
            animalsList.append(String.format("\t%d. ", number));
            animalsList.append(String.format("%s, %s, ", animal.getName(), animal.getGroupName()));
            animalsList.append(String.format("%s%n", animal.getTypeName()));
        }
        return animalsList.toString();
    }
}
