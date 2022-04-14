package command.executer;

public class VersionCmd implements Command {
    @Override
    public String execute() {
        return "1.0";
    }
}
