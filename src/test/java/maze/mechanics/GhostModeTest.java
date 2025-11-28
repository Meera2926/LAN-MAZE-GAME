package maze.mechanics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GhostModeTest {
    @Test
    public void testGhostModePhasing() {
        GhostModeEffect gm = new GhostModeEffect();
        assertFalse(gm.canPassThroughWalls());
        gm.setGhostActive(true);
        assertTrue(gm.canPassThroughWalls());
    }
}
