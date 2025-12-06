package maze.config;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameSettingsTest {
    @Test
    public void testDefaultSettings() {
        GameSettings settings = new GameSettings();
        assertEquals(15, settings.getMazeRows());
        assertEquals(20, settings.getMazeCols());
        assertEquals(120, settings.getRoundDurationSeconds());
    }
}
