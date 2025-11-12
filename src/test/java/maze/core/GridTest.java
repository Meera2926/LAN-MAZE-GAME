package maze.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GridTest {
    @Test
    public void testGridInitialization() {
        Grid grid = new Grid(10, 15);
        assertEquals(10, grid.getRows());
        assertEquals(15, grid.getCols());
        assertNotNull(grid.getCell(0, 0));
        assertNull(grid.getCell(-1, 0));
        assertNull(grid.getCell(10, 15));
    }
}
