package UserInterface;

import animals.Animal;
import mvp.Presenter;

import java.util.ArrayList;
import java.util.HashMap;

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
            this.showAnimalsMap(presenter.getAnimalsMap());
            Animal dog = presenter.getAnimalsMap().get(1);
            System.out.println(dog.getName());
            keepRunning = false;
        }
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void showAnimalsList(ArrayList<Animal> list) {
        int skillsNumber = 1;
        StringBuilder animalsList = new StringBuilder();
        for (Animal animal : list) {
            animalsList.append(String.format("\t%d. ", skillsNumber++));
            animalsList.append(String.format("%s, %s, ", animal.getName(), animal.getGroupName()));
            animalsList.append(String.format("%s%n", animal.getTypeName()));
        }
        System.out.println("Animals in registry:");
        System.out.println(animalsList.toString());

    }
    public void showAnimalsMap(HashMap<Integer, Animal> map) {
        StringBuilder animalsList = new StringBuilder();

        for (Integer number: map.keySet()) {
            Animal animal = map.get(number);
            animalsList.append(String.format("\t%d. ", number));
            animalsList.append(String.format("%s, %s, ", animal.getName(), animal.getGroupName()));
            animalsList.append(String.format("%s%n", animal.getTypeName()));
        }
        System.out.println("Animals in registry:");
        System.out.println(animalsList.toString());

    }
}
