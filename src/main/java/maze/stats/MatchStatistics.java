package maze.stats;

public class MatchStatistics {
    private int totalStepsWalked = 0;
    private int coinsCollected = 0;
    private int powerupsUsed = 0;

    public void recordStep() { totalStepsWalked++; }
    public void recordCoin() { coinsCollected++; }
    public void recordPowerup() { powerupsUsed++; }

    public int getTotalStepsWalked() { return totalStepsWalked; }
    public int getCoinsCollected() { return coinsCollected; }
    public int getPowerupsUsed() { return powerupsUsed; }
}
