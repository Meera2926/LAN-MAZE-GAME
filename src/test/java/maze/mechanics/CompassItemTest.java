package maze.mechanics;

import maze.core.Direction;
import maze.core.Point;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompassItemTest {

    @Test
    public void testCompassDirectionCalculation() {
        CompassItem compass = new CompassItem(new Point(10, 10));
        assertEquals(Direction.EAST, compass.getDirectionToPortal(new Point(2, 8)));
        assertEquals(Direction.SOUTH, compass.getDirectionToPortal(new Point(10, 2)));
        assertTrue(compass.getDistanceToPortal(new Point(10, 5)) == 5.0);
    }
}
