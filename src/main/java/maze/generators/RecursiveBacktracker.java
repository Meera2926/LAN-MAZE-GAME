package maze.generators;

import maze.core.Cell;
import maze.core.Grid;
import java.util.*;

public class RecursiveBacktracker implements MazeGenerator {
    private final Random random = new Random();

    @Override
    public void generate(Grid grid) {
        Stack<Cell> stack = new Stack<>();
        Cell current = grid.getCell(0, 0);
        current.setVisited(true);
        stack.push(current);

        while (!stack.isEmpty()) {
            current = stack.peek();
            List<Cell> unvisitedNeighbors = getUnvisitedNeighbors(grid, current);

            if (!unvisitedNeighbors.isEmpty()) {
                Cell next = unvisitedNeighbors.get(random.nextInt(unvisitedNeighbors.size()));
                removeWalls(current, next);
                next.setVisited(true);
                stack.push(next);
            } else {
                stack.pop();
            }
        }
    }

    private List<Cell> getUnvisitedNeighbors(Grid grid, Cell c) {
        List<Cell> list = new ArrayList<>();
        int r = c.getRow(), col = c.getCol();
        int[][] diffs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int[] d : diffs) {
            Cell neighbor = grid.getCell(r + d[0], col + d[1]);
            if (neighbor != null && !neighbor.isVisited()) {
                list.add(neighbor);
            }
        }
        return list;
    }

    private void removeWalls(Cell a, Cell b) {
        if (a.getRow() == b.getRow() + 1) { a.setTopWall(false); b.setBottomWall(false); }
        else if (a.getRow() == b.getRow() - 1) { a.setBottomWall(false); b.setTopWall(false); }
        else if (a.getCol() == b.getCol() + 1) { a.setLeftWall(false); b.setRightWall(false); }
        else if (a.getCol() == b.getCol() - 1) { a.setRightWall(false); b.setLeftWall(false); }
    }
}
