package command.executer;

public class PingCmd implements Command {
    private final String arg;

    public PingCmd(String arg) {
        this.arg = arg;
    }

    @Override
    public String execute() {
        return arg;
    }
}
