package maze.solver;

import maze.core.Cell;
import maze.core.Grid;
import maze.generators.RecursiveBacktracker;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AStarSolverTest {
    @Test
    public void testAStarFindsOptimalPath() {
        Grid grid = new Grid(8, 8);
        new RecursiveBacktracker().generate(grid);

        AStarSolver solver = new AStarSolver();
        List<Cell> path = solver.findPath(grid, grid.getCell(0, 0), grid.getCell(7, 7));

        assertFalse(path.isEmpty());
        assertEquals(grid.getCell(0, 0), path.get(0));
        assertEquals(grid.getCell(7, 7), path.get(path.size() - 1));
    }
}
