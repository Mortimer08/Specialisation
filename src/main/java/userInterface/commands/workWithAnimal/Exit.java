package userInterface.commands.workWithAnimal;

import userInterface.Menu;
import userInterface.commands.MenuCommand;

public class Exit extends MenuCommand {

    public Exit(Menu menu) {
        super(menu, "Exit");
    }

    @Override
    public void run() {
        super.getView().exitWorkWithAnimal();
    }
}
