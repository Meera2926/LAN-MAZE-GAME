package maze.solver;

import maze.core.Cell;
import maze.core.Grid;
import maze.generators.RecursiveBacktracker;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class DijkstraSolverTest {
    @Test
    public void testDijkstraResolvesPath() {
        Grid grid = new Grid(5, 5);
        new RecursiveBacktracker().generate(grid);

        DijkstraSolver solver = new DijkstraSolver();
        List<Cell> path = solver.findPath(grid, grid.getCell(0, 0), grid.getCell(4, 4));

        assertFalse(path.isEmpty());
    }
}
