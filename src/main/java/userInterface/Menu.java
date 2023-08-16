package userInterface;

import userInterface.commands.MenuCommand;

import java.util.ArrayList;

public class Menu {
    private final ConsoleView view;
    private String menuWelcome;
    private int commandsCount;
    private final ArrayList<MenuCommand> commands;

    public Menu(ConsoleView view) {
        this.view = view;
        commands = new ArrayList<>();
    }

    public void addCommand(MenuCommand command) {
        commands.add(command);
        commandsCount = commands.size();
    }

    public String consoleView() {
        StringBuilder consoleView = new StringBuilder();
        consoleView.append(this.menuWelcome);
        consoleView.append("\n");
        int commandNumber = 1;
        for (MenuCommand command : commands) {
            consoleView.append("\t");
            consoleView.append(commandNumber++);
            consoleView.append(". ");
            consoleView.append(command.description());
            consoleView.append("\n");
        }
        return consoleView.toString();
    }

    protected void setMenuWelcome(String welcome) {
        this.menuWelcome = welcome;
    }

    public int getMenuCount() {
        return this.commandsCount;
    }

    public ConsoleView getView() {
        return this.view;
    }

    public void runCommand(int commandNumber) {
        commands.get(commandNumber - 1).run();
    }
}
