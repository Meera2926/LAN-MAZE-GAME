package maze.generators;

import maze.core.Grid;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MazeValidatorTest {
    @Test
    public void testValidDimensions() {
        Grid valid = new Grid(5, 5);
        Grid invalid = new Grid(1, 1);

        assertTrue(MazeValidator.hasValidDimensions(valid));
        assertFalse(MazeValidator.hasValidDimensions(invalid));
    }
}
