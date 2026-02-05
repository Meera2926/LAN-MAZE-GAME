package maze.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FogOfWarTest {

    @Test
    public void testVisibilityRadius() {
        FogOfWar fog = new FogOfWar(3);
        assertTrue(fog.isVisible(5, 5, 5, 5));
        assertTrue(fog.isVisible(7, 5, 5, 5));
        assertFalse(fog.isVisible(10, 10, 5, 5));
    }

    @Test
    public void testTileExploration() {
        FogOfWar fog = new FogOfWar(2);
        assertFalse(fog.isExplored(3, 3));
        fog.updateVisibility(3, 3);
        assertTrue(fog.isExplored(3, 3));
        assertTrue(fog.isExplored(4, 3));
    }
}
