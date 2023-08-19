package userInterface.commands.workWithAnimal;

import userInterface.Menu;
import userInterface.commands.MenuCommand;

public class ChooseAnimal extends MenuCommand {
    public ChooseAnimal(Menu menu) {
        super(menu, "Choose animal");
    }

    @Override
    public void run() {
        super.getView().chooseAnimal();
    }
}
