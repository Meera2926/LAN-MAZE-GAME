package maze.generators;

import maze.core.Grid;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimsGeneratorTest {
    @Test
    public void testPrimsGeneratesConnectedMaze() {
        Grid grid = new Grid(10, 10);
        PrimsGenerator generator = new PrimsGenerator();
        generator.generate(grid);

        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                assertTrue(grid.getCell(r, c).isVisited());
            }
        }
    }
}
