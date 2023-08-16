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

    public String getAnimalSkills() {
        Animal animal = animalRegistry.getCurrentAnimal();
        ArrayList<Skill> skills = animalRegistry.getSkillsList();
        StringBuilder skillsString = new StringBuilder();
        skillsString.append(String.format("%s can:\n", animal.getName()));
        for (Skill skill : skills) {
            skillsString.append(String.format("\t%s = %s\n", skill.getSkillName(), skill.getDescription()));
        }
        return skillsString.toString();
    }

    public void addSkill(String skillName, String skillDescription) {
//        Animal animal = animalRegistry.getCurrentAnimal();
        animalRegistry.addSkill(skillName, skillDescription);
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

    public void setCurrentAnimal(Integer animalNumber) {
        animalRegistry.setCurrentAnimal(animalRegistry.getAnimalMap().get(animalNumber));
    }

    public String getAnimal(Integer animalNumber) {
        return animalRegistry.getAnimalMap().get(animalNumber).toString();
    }
}
