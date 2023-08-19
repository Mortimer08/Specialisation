package userInterface.commands.mainMenu;

import userInterface.Menu;
import userInterface.commands.MenuCommand;

public class ShowAnimals extends MenuCommand {
    public ShowAnimals(Menu menu) {
        super(menu, "Show animals in registry");
    }

    @Override
    public void run() {
        super.getView().showAnimals();
    }
}
