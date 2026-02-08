package maze.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AchievementTrackerTest {

    @Test
    public void testUnlockAchievements() {
        AchievementTracker tracker = new AchievementTracker();
        assertEquals(0, tracker.getUnlockedCount());

        assertTrue(tracker.unlock(AchievementTracker.Achievement.FIRST_WIN));
        assertFalse(tracker.unlock(AchievementTracker.Achievement.FIRST_WIN));
        assertTrue(tracker.hasUnlocked(AchievementTracker.Achievement.FIRST_WIN));
        assertEquals(1, tracker.getUnlockedCount());
    }
}
