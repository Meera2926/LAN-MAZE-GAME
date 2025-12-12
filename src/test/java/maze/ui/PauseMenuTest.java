package maze.ui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PauseMenuTest {
    @Test
    public void testPauseToggle() {
        PauseMenu pm = new PauseMenu();
        assertFalse(pm.isPaused());
        pm.togglePause();
        assertTrue(pm.isPaused());
        pm.resume();
        assertFalse(pm.isPaused());
    }
}
