package maze.solver;

import maze.core.Cell;
import maze.core.Grid;
import java.util.List;

public interface Pathfinder {
    List<Cell> findPath(Grid grid, Cell start, Cell target);
}
