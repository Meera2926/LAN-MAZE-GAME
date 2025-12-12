package maze.ui;

public class GameOverDialog {
    private final String winnerName;
    private final int finalScore;

    public GameOverDialog(String winnerName, int finalScore) {
        this.winnerName = winnerName;
        this.finalScore = finalScore;
    }

    public String getWinnerName() { return winnerName; }
    public int getFinalScore() { return finalScore; }
    public String getFormattedSummary() {
        return "Game Over! Winner: " + winnerName + " with " + finalScore + " pts";
    }
}
