package command.executer;

import java.time.LocalTime;

public class TimeCmd implements Command {

    public TimeCmd() {
        this.now = LocalTime.now();
    }

    private final LocalTime now;

    @Override
    public String execute() {
        return now.toString();
    }
}
