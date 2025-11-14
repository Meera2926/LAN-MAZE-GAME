package maze.generators;

import maze.core.Grid;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KruskalGeneratorTest {
    @Test
    public void testKruskalExecution() {
        Grid grid = new Grid(6, 6);
        KruskalGenerator gen = new KruskalGenerator();
        assertDoesNotThrow(() -> gen.generate(grid));
    }
}
