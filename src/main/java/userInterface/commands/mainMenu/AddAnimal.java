package userInterface.commands.mainMenu;

import userInterface.Menu;
import userInterface.commands.MenuCommand;

public class AddAnimal extends MenuCommand {
    public AddAnimal(Menu menu) {
        super(menu, "Add animal");
    }
    @Override
    public void run(){
        super.getView().addAnimal();
    }
}
