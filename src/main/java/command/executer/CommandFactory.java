package command.executer;

public final class CommandFactory {

    public static Command getInstance(String cmdLine) {
        if (cmdLine == null || cmdLine.isBlank()) {
            throw new IllegalArgumentException("empty cmd line");
        }
        final var cmds = cmdLine.split("\\s+");

        final Class<?> aClass = Class.forName(""+cmds+"Cmd");
        aClass.getConstructors()

//        switch (cmds[0].toLowerCase(Locale.ROOT)) {
//            case "time":
//                CountCmd.increment(TimeCmd.class);
//                return new TimeCmd();
//            case "version":
//                CountCmd.increment(VersionCmd.class);
//                return new VersionCmd();
//            case "ping":
//                CountCmd.increment(PingCmd.class);
//                return new PingCmd(cmds.length < 2 ? "pong" : cmds[1]);
//            case "count":
//                CountCmd.increment(CountCmd.class);
//                return CountCmd.getInstance();
//            default:
//                throw new IllegalArgumentException("invalid cmd");
//        }
    }

    private CommandFactory() {
    }
}
