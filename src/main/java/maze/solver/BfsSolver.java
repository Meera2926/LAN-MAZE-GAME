package maze.solver;

import maze.core.Cell;
import maze.core.Grid;
import java.util.*;

public class BfsSolver implements Pathfinder {
    @Override
    public List<Cell> findPath(Grid grid, Cell start, Cell target) {
        if (start == null || target == null) return Collections.emptyList();
        Queue<Cell> queue = new LinkedList<>();
        Map<Cell, Cell> parentMap = new HashMap<>();
        Set<Cell> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            Cell current = queue.poll();
            if (current == target) return reconstructPath(parentMap, target);

            for (Cell neighbor : getAccessibleNeighbors(grid, current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    parentMap.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }
        return Collections.emptyList();
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

    private List<Cell> reconstructPath(Map<Cell, Cell> parents, Cell target) {
        LinkedList<Cell> path = new LinkedList<>();
        Cell curr = target;
        while (curr != null) {
            path.addFirst(curr);
            curr = parents.get(curr);
        }
        return path;
    }
}
