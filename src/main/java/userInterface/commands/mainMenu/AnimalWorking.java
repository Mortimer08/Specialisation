package userInterface.commands.mainMenu;

import userInterface.Menu;
import userInterface.commands.MenuCommand;

public class AnimalWorking extends MenuCommand {

    public AnimalWorking(Menu menu) {
        super(menu, "Work with animal");
    }

    @Override
    public void run() {
        super.getView().workWithAnimal();
    }
}
