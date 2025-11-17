package maze.solver;

import maze.core.Cell;
import maze.core.Grid;
import java.util.*;

public class DfsSolver implements Pathfinder {
    @Override
    public List<Cell> findPath(Grid grid, Cell start, Cell target) {
        List<Cell> path = new ArrayList<>();
        Set<Cell> visited = new HashSet<>();
        dfs(grid, start, target, visited, path);
        return path;
    }

    private boolean dfs(Grid grid, Cell current, Cell target, Set<Cell> visited, List<Cell> path) {
        if (current == null || visited.contains(current)) return false;
        visited.add(current);
        path.add(current);

        if (current == target) return true;

        for (Cell next : getAccessibleNeighbors(grid, current)) {
            if (dfs(grid, next, target, visited, path)) return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    private List<Cell> getAccessibleNeighbors(Grid grid, Cell c) {
        List<Cell> list = new ArrayList<>();
        int r = c.getRow(), col = c.getCol();
        if (!c.hasTopWall()) list.add(grid.getCell(r - 1, col));
        if (!c.hasBottomWall()) list.add(grid.getCell(r + 1, col));
        if (!c.hasLeftWall()) list.add(grid.getCell(r, col - 1));
        if (!c.hasRightWall()) list.add(grid.getCell(r, col + 1));
        list.removeIf(Objects::isNull);
        return list;
    }
}
