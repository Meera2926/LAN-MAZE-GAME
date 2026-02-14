package maze.generators;

import maze.core.Grid;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

public class EllersGeneratorTest {

    @Test
    public void testEllersGeneratorCreatesGrid() {
        EllersGenerator gen = new EllersGenerator(15, 15, new Random(42));
        Grid grid = gen.generate();
        assertNotNull(grid);
        assertEquals(15, grid.getWidth());
        assertEquals(15, grid.getHeight());
    }
}
