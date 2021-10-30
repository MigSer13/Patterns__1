package com.company.command;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }
    public void execute(){
        for (Command command : commands) {
            command.run();
        }
    }

}
