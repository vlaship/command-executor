package command.executer;

import command.executer.cmd.PingCmd;
import command.executer.cmd.TimeCmd;
import command.executer.cmd.VersionCmd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandFactoryTest {

    @Test
    void getInstance_time() {
        assertEquals(TimeCmd.class, CommandFactory.getInstance("TIME").getClass());
    }

    @Test
    void getInstance_version() {
        assertEquals(CommandFactory.getInstance("VERSION").getClass(), VersionCmd.class);
    }

    @Test
    void getInstance_ping() {
        assertEquals(PingCmd.class, CommandFactory.getInstance("PING ard").getClass());
    }

    @Test
    void getInstance_throw_null() {
        assertThrows(IllegalArgumentException.class, () -> CommandFactory.getInstance(null));
    }

    @Test
    void getInstance_throw_blank() {
        assertThrows(IllegalArgumentException.class, () -> CommandFactory.getInstance(""));
    }

    @Test
    void getInstance_throw_invalid() {
        assertThrows(IllegalArgumentException.class, () -> CommandFactory.getInstance("null"));
    }
}