package maze.ui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinimapRendererTest {
    @Test
    public void testScaleFactor() {
        double scale = MinimapRenderer.computeScaleFactor(1000, 200);
        assertEquals(0.2, scale, 0.001);
    }
}
