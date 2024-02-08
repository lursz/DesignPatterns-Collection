package pl.edu.agh.dp;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    public List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommand() {
        if (commands.size() > 0) {
            Command command = commands.get(0);
            commands.remove(0);
            command.execute();
        } else {
            System.out.println("No command in the queue.");
        }
    }
}
