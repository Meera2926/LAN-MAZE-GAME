package maze.mechanics;

public class ScoreMultiplier {
    private int comboStreak = 0;

    public void registerCoinCollected() {
        comboStreak++;
    }

    public void resetCombo() {
        comboStreak = 0;
    }

    public int getMultiplier() {
        if (comboStreak >= 10) return 4;
        if (comboStreak >= 5) return 2;
        return 1;
    }
}
