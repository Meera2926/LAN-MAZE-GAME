package maze.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LatencyTrackerTest {
    @Test
    public void testLatencyCalculation() {
        LatencyTracker tracker = new LatencyTracker();
        tracker.recordPingSent("C1", 1000L);
        tracker.recordPongReceived("C1", 1045L);
        assertEquals(45L, tracker.getLatency("C1"));
    }
}
