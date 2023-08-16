package userInterface.mainMenu;

import userInterface.ConsoleView;
import userInterface.Menu;
import userInterface.commands.mainMenu.AddAnimal;
import userInterface.commands.mainMenu.Exit;
import userInterface.commands.mainMenu.ShowAnimals;

public class MainMenu extends Menu {
    public MainMenu(ConsoleView view) {
        super(view);
        super.setMenuWelcome("Enter command number");
        super.addCommand(new ShowAnimals(this));
        super.addCommand(new AddAnimal(this));
        super.addCommand(new Exit(this));
    }
}
