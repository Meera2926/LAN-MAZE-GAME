package maze.generators;

import maze.core.Grid;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursiveBacktrackerTest {
    @Test
    public void testAllCellsVisited() {
        Grid grid = new Grid(8, 8);
        RecursiveBacktracker generator = new RecursiveBacktracker();
        generator.generate(grid);

        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                assertTrue(grid.getCell(r, c).isVisited(), "All cells should be visited in a perfect maze");
            }
        }
    }
}
