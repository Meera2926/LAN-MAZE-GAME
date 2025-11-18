package maze.solver;

import maze.core.Cell;
import maze.core.Grid;
import java.util.*;

public class AStarSolver implements Pathfinder {
    @Override
    public List<Cell> findPath(Grid grid, Cell start, Cell target) {
        PriorityQueue<AStarNode> openSet = new PriorityQueue<>();
        Map<Cell, AStarNode> allNodes = new HashMap<>();

        AStarNode startNode = new AStarNode(start);
        startNode.gCost = 0;
        startNode.hCost = Heuristic.manhattan(start, target);
        openSet.add(startNode);
        allNodes.put(start, startNode);

        while (!openSet.isEmpty()) {
            AStarNode current = openSet.poll();
            if (current.cell == target) return reconstruct(current);

            for (Cell neighbor : getAccessibleNeighbors(grid, current.cell)) {
                double tentativeG = current.gCost + 1.0;
                AStarNode neighborNode = allNodes.computeIfAbsent(neighbor, AStarNode::new);

                if (neighborNode.gCost == 0 || tentativeG < neighborNode.gCost) {
                    neighborNode.parent = current;
                    neighborNode.gCost = tentativeG;
                    neighborNode.hCost = Heuristic.manhattan(neighbor, target);
                    if (!openSet.contains(neighborNode)) {
                        openSet.add(neighborNode);
                    }
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

    private List<Cell> reconstruct(AStarNode node) {
        LinkedList<Cell> path = new LinkedList<>();
        AStarNode curr = node;
        while (curr != null) {
            path.addFirst(curr.cell);
            curr = curr.parent;
        }
        return path;
    }
}
