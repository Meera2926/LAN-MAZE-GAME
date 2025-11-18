package maze.solver;

import maze.core.Cell;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeuristicTest {
    @Test
    public void testHeuristicsCalculations() {
        Cell c1 = new Cell(0, 0);
        Cell c2 = new Cell(3, 4);

        assertEquals(7.0, Heuristic.manhattan(c1, c2));
        assertEquals(5.0, Heuristic.euclidean(c1, c2), 0.001);
    }
}
