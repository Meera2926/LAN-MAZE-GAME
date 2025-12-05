package maze.config;

public class GameSettings {
    private int mazeRows = 15;
    private int mazeCols = 20;
    private int roundDurationSeconds = 120;

    public int getMazeRows() { return mazeRows; }
    public void setMazeRows(int rows) { this.mazeRows = rows; }
    public int getMazeCols() { return mazeCols; }
    public void setMazeCols(int cols) { this.mazeCols = cols; }
    public int getRoundDurationSeconds() { return roundDurationSeconds; }
    public void setRoundDurationSeconds(int seconds) { this.roundDurationSeconds = seconds; }
}
