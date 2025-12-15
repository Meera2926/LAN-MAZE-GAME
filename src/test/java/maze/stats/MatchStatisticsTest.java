package maze.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatchStatisticsTest {
    @Test
    public void testStatsAccumulation() {
        MatchStatistics stats = new MatchStatistics();
        stats.recordStep();
        stats.recordStep();
        stats.recordCoin();
        stats.recordPowerup();

        assertEquals(2, stats.getTotalStepsWalked());
        assertEquals(1, stats.getCoinsCollected());
        assertEquals(1, stats.getPowerupsUsed());
    }
}
