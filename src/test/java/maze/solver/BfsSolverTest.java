package maze.solver;

import maze.core.Cell;
import maze.core.Grid;
import maze.generators.RecursiveBacktracker;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BfsSolverTest {
    @Test
    public void testBfsFindsPathInGeneratedMaze() {
        Grid grid = new Grid(10, 10);
        new RecursiveBacktracker().generate(grid);

        BfsSolver solver = new BfsSolver();
        List<Cell> path = solver.findPath(grid, grid.getCell(0, 0), grid.getCell(9, 9));

        assertFalse(path.isEmpty(), "Path should exist in perfect maze");
        assertEquals(grid.getCell(0, 0), path.get(0));
        assertEquals(grid.getCell(9, 9), path.get(path.size() - 1));
    }
}
