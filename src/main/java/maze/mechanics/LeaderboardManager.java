package maze.mechanics;

import java.util.*;

public class LeaderboardManager {
    private final List<HighScoreEntry> leaderboard = new ArrayList<>();
    private final int maxEntries;

    public LeaderboardManager(int maxEntries) {
        this.maxEntries = maxEntries;
    }

    public synchronized void recordScore(String playerName, int score) {
        leaderboard.add(new HighScoreEntry(playerName, score));
        Collections.sort(leaderboard);
        if (leaderboard.size() > maxEntries) {
            leaderboard.remove(leaderboard.size() - 1);
        }
    }

    public synchronized List<HighScoreEntry> getTopScores() {
        return Collections.unmodifiableList(leaderboard);
    }
}
