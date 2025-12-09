package maze.mechanics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrapTest {
    @Test
    public void testTrapTriggerState() {
        Trap trap = new Trap(3, 4, 2000);
        assertFalse(trap.isTriggered());
        trap.trigger();
        assertTrue(trap.isTriggered());
        assertEquals(2000, trap.getSlowDurationMs());
    }
}
