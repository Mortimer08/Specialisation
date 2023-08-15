package userInterface;

import mvp.Presenter;

import java.util.ArrayList;

public class ConsoleView implements UserInteraction {
    private Presenter presenter;
    public boolean keepRunning;

    public ConsoleView() {
        keepRunning = true;
    }

    public void start() {
        while (keepRunning) {
//            System.out.println("Console View Started");
            presenter.addAnimal("Pet", "Dog", "Polkan");
            presenter.addAnimal("Cat", "Fluff");
            presenter.addAnimal("Horse", "Beast");
            presenter.addAnimal("Donkey", "Ear");
            presenter.addAnimal("Pet", "Dog", "Polkan");
            showAnimals();

            presenter.addSkill(1,"Voice", "Saying woof");
            showSkills(1);
            keepRunning = false;
        }
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    /*public void showAnimalsList(ArrayList<Animal> list) {
        int skillsNumber = 1;
        StringBuilder animalsList = new StringBuilder();
        for (Animal animal : list) {
            animalsList.append(String.format("\t%d. ", skillsNumber++));
            animalsList.append(String.format("%s, %s, ", animal.getName(), animal.getGroupName()));
            animalsList.append(String.format("%s%n", animal.getTypeName()));
        }
        System.out.println("Animals in registry:");
        System.out.println(animalsList.toString());

    }*/
    public void showAnimals() {
        System.out.println(presenter.getAnimals());
    }
    public void showSkills(Integer animalNumber){
        System.out.println(presenter.getSkillsList(animalNumber));
    }
}
