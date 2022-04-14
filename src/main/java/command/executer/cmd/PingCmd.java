package command.executer.cmd;

public record PingCmd(String arg) implements Command {

    @Override
    public String execute() {
        return arg;
    }
}
