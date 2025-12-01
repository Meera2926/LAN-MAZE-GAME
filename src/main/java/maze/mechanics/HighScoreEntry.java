package maze.mechanics;

import java.io.Serializable;

public class HighScoreEntry implements Comparable<HighScoreEntry>, Serializable {
    private static final long serialVersionUID = 1L;
    private final String playerName;
    private final int score;

    public HighScoreEntry(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    public String getPlayerName() { return playerName; }
    public int getScore() { return score; }

    @Override
    public int compareTo(HighScoreEntry o) {
        return Integer.compare(o.score, this.score); // descending
    }
}
