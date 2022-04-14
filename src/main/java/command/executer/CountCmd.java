package command.executer;

import java.util.HashMap;
import java.util.Map;

public final class CountCmd implements Command {

    private static final Map<Class<? extends Command>, Integer> map = new HashMap<>();
    private static final CountCmd INSTANCE = new CountCmd();


    @Override
    public String execute() {
        return map.toString();
    }

    public static CountCmd getInstance() {
        return INSTANCE;
    }

    public static void increment(Class<? extends Command> type) {
        var value = map.getOrDefault(type, 0);
        map.put(type, value + 1);
    }

    private CountCmd() {
    }
}
