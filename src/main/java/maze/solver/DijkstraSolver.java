package maze.solver;

import maze.core.Cell;
import maze.core.Grid;
import java.util.*;

public class DijkstraSolver implements Pathfinder {
    @Override
    public List<Cell> findPath(Grid grid, Cell start, Cell target) {
        // Uniform-cost search variant equivalent to BFS on unweighted grid
        return new BfsSolver().findPath(grid, start, target);
    }
}
