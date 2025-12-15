package maze.config;

import org.junit.jupiter.api.Test;
import java.awt.event.KeyEvent;
import static org.junit.jupiter.api.Assertions.*;

public class KeyBindingsTest {
    @Test
    public void testDefaultKeys() {
        assertEquals(KeyEvent.VK_W, KeyBindings.MOVE_UP);
        assertEquals(KeyEvent.VK_SPACE, KeyBindings.USE_POWERUP);
    }
}
