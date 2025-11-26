package maze.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BandwidthOptimizerTest {
    @Test
    public void testRedundantMoveFilter() {
        assertFalse(BandwidthOptimizer.shouldBroadcastMovement(2, 3, 2, 3));
        assertTrue(BandwidthOptimizer.shouldBroadcastMovement(2, 3, 2, 4));
    }
}
