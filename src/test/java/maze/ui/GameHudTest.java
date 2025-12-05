package maze.ui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameHudTest {
    @Test
    public void testHudTimerFormatting() {
        assertEquals("02:05", GameHud.formatTimer(125));
        assertEquals("00:45", GameHud.formatTimer(45));
    }
}
