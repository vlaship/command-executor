package command.executer;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommandsTests {

    @Test
    void ping_arg() {
        assertEquals("arg", CommandFactory.getInstance("PING arg").execute());
    }

    @Test
    void ping_noarg() {
        assertEquals("pong", CommandFactory.getInstance("PING").execute());
    }

    @Test
    void version() {
        assertEquals("1.0", CommandFactory.getInstance("VERSION").execute());
    }

    @Test
    void time() throws NoSuchFieldException, IllegalAccessException {
        final var time = CommandFactory.getInstance("TIME");
        final var field = time.getClass().getDeclaredField("now");
        final var accessible = field.isAccessible();
        field.setAccessible(true);
        final var value = (LocalTime) field.get(time);
        field.setAccessible(accessible);

        assertEquals(value.toString(), time.execute());
    }
}
