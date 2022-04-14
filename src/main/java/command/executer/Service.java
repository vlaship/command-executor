package command.executer;

public class Service {
    String handleCommand(String commandLine) {
        return CommandFactory.getInstance(commandLine).execute();
    }
}
