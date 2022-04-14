package command.executer.cmd;

import java.time.LocalTime;

public record TimeCmd(LocalTime now) implements Command {

    @Override
    public String execute() {
        return now.toString();
    }
}
