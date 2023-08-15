package userInterface;

import userInterface.commands.MenuCommand;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuCommand> commands;
    public void show(){
        int commandNumber = 1;
        for (MenuCommand command :commands) {
            System.out.printf("t%d. %s",commandNumber++,command.name);
        }
    }
    public void addCommand(MenuCommand command){
        commands.add(command);
    }
}
