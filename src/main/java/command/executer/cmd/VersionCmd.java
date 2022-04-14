package command.executer.cmd;

public record VersionCmd() implements Command {
    @Override
    public String execute() {
        return "1.0";
    }
}
