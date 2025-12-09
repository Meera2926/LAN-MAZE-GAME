package maze.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MazeThemeTest {
    @Test
    public void testMazeThemesHaveDistinctColors() {
        assertNotEquals(MazeTheme.CLASSIC_STONE.getWallColor(), MazeTheme.NEON_CYBERPUNK.getWallColor());
    }
}
