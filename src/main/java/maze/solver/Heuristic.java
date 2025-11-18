package maze.solver;

import maze.core.Cell;

public class Heuristic {
    public static double manhattan(Cell a, Cell b) {
        return Math.abs(a.getRow() - b.getRow()) + Math.abs(a.getCol() - b.getCol());
    }

    public static double euclidean(Cell a, Cell b) {
        int dr = a.getRow() - b.getRow();
        int dc = a.getCol() - b.getCol();
        return Math.sqrt(dr * dr + dc * dc);
    }
}
