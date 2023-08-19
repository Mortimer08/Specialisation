package userInterface.commands.workWithAnimal;

import userInterface.Menu;
import userInterface.commands.MenuCommand;

public class AddSkill extends MenuCommand {
    public AddSkill(Menu menu) {
        super(menu, "Teach animal");
    }

    @Override
    public void run() {
        super.getView().teach();
    }
}
