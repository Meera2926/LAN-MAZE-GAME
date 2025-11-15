package maze.generators;

import maze.core.Grid;

public class MazeValidator {
    public static boolean hasValidDimensions(Grid grid) {
        return grid != null && grid.getRows() > 1 && grid.getCols() > 1;
    }
}
