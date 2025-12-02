package maze.mechanics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CollisionDetectorTest {
    @Test
    public void testPointOverlap() {
        assertTrue(CollisionDetector.checkPointOverlap(3, 4, 3, 4));
        assertFalse(CollisionDetector.checkPointOverlap(3, 4, 3, 5));
    }
}
