package userInterface;

import mvp.Presenter;
import userInterface.mainMenu.MainMenu;
import userInterface.workWithAnimal.WorkWithAnimal;

import java.util.Scanner;

public class ConsoleView implements UserInteraction {
    public boolean keepRunning;
    private Menu currentMenu;
    private Menu mainMenu;
    private Menu workWithAnimalMenu;
    private Scanner scanner;
    private Presenter presenter;

    public ConsoleView() {
        keepRunning = true;
        mainMenu = new MainMenu(this);
        workWithAnimalMenu = new WorkWithAnimal(this);
        currentMenu = mainMenu;
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (keepRunning) {
            showMenu();
            String userChoice = scan();
            currentMenu.runCommand(Integer.parseInt(userChoice));
        }
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    private void showMenu() {
        System.out.println(currentMenu.consoleView());
    }

    private String scan() {
        return scanner.nextLine();
    }

    public void addAnimal() {
        System.out.println("Enter animal type");
        String type = scan();
        System.out.println("Enter animal name");
        String name = scan();
        presenter.addAnimal(type, name);
    }

    public void showAnimals() {
        System.out.println(presenter.getAnimals());
    }

    public void workWithAnimal() {
        currentMenu = workWithAnimalMenu;
    }

    public void chooseAnimal() {
        showAnimals();
        String userChoice = scan();
        presenter.setCurrentAnimal(Integer.parseInt(userChoice));
        System.out.println("You choose:");
        System.out.println(presenter.getAnimal(Integer.parseInt(userChoice) - 1));
    }

    public void showSkills() {
        System.out.println(presenter.getSkillsList());
    }

    public void teach() {
        System.out.println("Input command");
        String skillName = scan();
        System.out.println("Input what animal have to do");
        String description = scan();
        presenter.addSkill(skillName, description);
    }

    public void perform() {
        System.out.println("Enter command number");
        System.out.println(presenter.getSkillsList());
        String userChoice = scan();
        System.out.println(presenter.performSkill(Integer.parseInt(userChoice) - 1));
    }

    public void exitWorkWithAnimal() {
        currentMenu = mainMenu;
    }

    public void exit() {
        keepRunning = false;
    }
}
