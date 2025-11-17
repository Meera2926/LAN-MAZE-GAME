package maze.solver;

import maze.core.Cell;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AStarNodeTest {
    @Test
    public void testAStarNodeComparison() {
        AStarNode n1 = new AStarNode(new Cell(0, 0));
        n1.gCost = 5.0;
        n1.hCost = 5.0; // f = 10

        AStarNode n2 = new AStarNode(new Cell(1, 1));
        n2.gCost = 2.0;
        n2.hCost = 3.0; // f = 5

        assertTrue(n2.compareTo(n1) < 0, "n2 has lower fCost so comes first");
    }
}
