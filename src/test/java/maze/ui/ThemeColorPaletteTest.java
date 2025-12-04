package maze.ui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThemeColorPaletteTest {
    @Test
    public void testColorConstants() {
        assertNotNull(ThemeColorPalette.MAZE_WALL);
        assertNotNull(ThemeColorPalette.COIN_GOLD);
    }
}
