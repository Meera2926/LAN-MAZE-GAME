package maze.generators;

import maze.core.Cell;
import maze.core.Grid;
import java.util.*;

public class PrimsGenerator implements MazeGenerator {
    private final Random random = new Random();

    @Override
    public void generate(Grid grid) {
        List<Cell> frontier = new ArrayList<>();
        Cell start = grid.getCell(0, 0);
        start.setVisited(true);
        addNeighbors(grid, start, frontier);

        while (!frontier.isEmpty()) {
            Cell current = frontier.remove(random.nextInt(frontier.size()));
            List<Cell> visitedNeighbors = getVisitedNeighbors(grid, current);
            if (!visitedNeighbors.isEmpty()) {
                Cell neighbor = visitedNeighbors.get(random.nextInt(visitedNeighbors.size()));
                removeWalls(current, neighbor);
                current.setVisited(true);
                addNeighbors(grid, current, frontier);
            }
        }
    }

    private void addNeighbors(Grid grid, Cell c, List<Cell> frontier) {
        int[][] diffs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int[] d : diffs) {
            Cell n = grid.getCell(c.getRow() + d[0], c.getCol() + d[1]);
            if (n != null && !n.isVisited() && !frontier.contains(n)) {
                frontier.add(n);
            }
        }
    }

    private List<Cell> getVisitedNeighbors(Grid grid, Cell c) {
        List<Cell> list = new ArrayList<>();
        int[][] diffs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int[] d : diffs) {
            Cell n = grid.getCell(c.getRow() + d[0], c.getCol() + d[1]);
            if (n != null && n.isVisited()) list.add(n);
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
