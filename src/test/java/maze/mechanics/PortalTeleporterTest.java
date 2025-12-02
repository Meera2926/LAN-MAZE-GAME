package maze.mechanics;

import maze.core.Point;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PortalTeleporterTest {
    @Test
    public void testPortalWarp() {
        Point pA = new Point(1, 1);
        Point pB = new Point(8, 8);
        PortalTeleporter portal = new PortalTeleporter(pA, pB);

        assertEquals(pB, portal.teleport(pA));
        assertEquals(pA, portal.teleport(pB));
        assertEquals(new Point(3, 3), portal.teleport(new Point(3, 3)));
    }
}
