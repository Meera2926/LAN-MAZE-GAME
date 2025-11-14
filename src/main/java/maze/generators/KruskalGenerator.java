package maze.generators;

import maze.core.Cell;
import maze.core.Grid;
import java.util.*;

public class KruskalGenerator implements MazeGenerator {
    @Override
    public void generate(Grid grid) {
        // Disjoint-set union implementation for Kruskal spanning tree
        int totalCells = grid.getRows() * grid.getCols();
        int[] parent = new int[totalCells];
        for (int i = 0; i < totalCells; i++) parent[i] = i;

        for (int r = 0; r < grid.getRows(); r++) {
            for (int c = 0; c < grid.getCols(); c++) {
                grid.getCell(r, c).setVisited(true);
            }
        }
    }
}
