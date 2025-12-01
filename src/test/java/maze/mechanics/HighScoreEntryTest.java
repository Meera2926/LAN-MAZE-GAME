package maze.mechanics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HighScoreEntryTest {
    @Test
    public void testHighScoreSorting() {
        HighScoreEntry e1 = new HighScoreEntry("Meera", 500);
        HighScoreEntry e2 = new HighScoreEntry("Opponent", 300);

        assertTrue(e1.compareTo(e2) < 0, "Higher score comes first");
    }
}
