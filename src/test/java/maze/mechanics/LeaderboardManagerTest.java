package maze.mechanics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeaderboardManagerTest {
    @Test
    public void testTopScoresPruning() {
        LeaderboardManager lm = new LeaderboardManager(3);
        lm.recordScore("P1", 100);
        lm.recordScore("P2", 200);
        lm.recordScore("P3", 300);
        lm.recordScore("P4", 400);

        assertEquals(3, lm.getTopScores().size());
        assertEquals("P4", lm.getTopScores().get(0).getPlayerName());
    }
}
