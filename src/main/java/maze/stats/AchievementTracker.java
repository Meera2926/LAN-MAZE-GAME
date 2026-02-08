package maze.stats;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AchievementTracker {
    public enum Achievement {
        FIRST_WIN,
        COIN_HOARDER,
        SPEED_DEMON,
        TRAP_DODGER,
        BOT_HUNTER
    }

    private final Set<Achievement> unlocked = new HashSet<>();
    private final Map<Achievement, Long> unlockTimestamps = new HashMap<>();

    public boolean unlock(Achievement achievement) {
        if (!unlocked.contains(achievement)) {
            unlocked.add(achievement);
            unlockTimestamps.put(achievement, System.currentTimeMillis());
            return true;
        }
        return false;
    }

    public boolean hasUnlocked(Achievement achievement) {
        return unlocked.contains(achievement);
    }

    public int getUnlockedCount() {
        return unlocked.size();
    }
}
