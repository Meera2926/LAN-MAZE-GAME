package maze.solver;

import maze.core.Cell;
import maze.core.Grid;
import maze.generators.RecursiveBacktracker;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class DfsSolverTest {
    @Test
    public void testDfsSolvesMaze() {
        Grid grid = new Grid(6, 6);
        new RecursiveBacktracker().generate(grid);

        DfsSolver solver = new DfsSolver();
        List<Cell> path = solver.findPath(grid, grid.getCell(0, 0), grid.getCell(5, 5));

        assertFalse(path.isEmpty());
        assertEquals(grid.getCell(0, 0), path.get(0));
        assertEquals(grid.getCell(5, 5), path.get(path.size() - 1));
    }
}
