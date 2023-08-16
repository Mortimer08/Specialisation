package userInterface;

import mvp.Presenter;
import userInterface.mainMenu.MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleView implements UserInteraction {
    public boolean keepRunning;
    private Menu mainMenu;
    private Scanner scanner;
    private Presenter presenter;

    public ConsoleView() {
        keepRunning = true;
        mainMenu = new MainMenu(this);
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (keepRunning) {
            showMenu();
            String userChoice = scan();
            mainMenu.runCommand(Integer.parseInt(userChoice));
        }
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    private void showMenu() {
        System.out.println(mainMenu.consoleView());
    }

    private String scan() {
        return scanner.nextLine();
    }

    public void addAnimal() {
        presenter.addAnimal("Cat", "Fluff");
    }

    public void showAnimals() {
        System.out.println(presenter.getAnimals());
    }

    public void chooseAnimal() {
        showAnimals();
        String userChoice = scan();
        presenter.setCurrentAnimal(Integer.parseInt(userChoice));
        System.out.println("You choose:");
        System.out.println(presenter.getAnimal(Integer.parseInt(userChoice)));
    }

    public void showSkills(Integer animalNumber) {
        System.out.println(presenter.getSkillsList());
    }

    public void exit() {
        keepRunning = false;
    }
}
