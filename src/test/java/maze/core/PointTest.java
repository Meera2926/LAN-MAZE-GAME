package maze.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointTest {
    @Test
    public void testPointEquality() {
        Point p1 = new Point(4, 5);
        Point p2 = new Point(4, 5);
        Point p3 = new Point(5, 4);

        assertEquals(p1, p2);
        assertNotEquals(p1, p3);
        assertEquals(p1.hashCode(), p2.hashCode());
    }
}
