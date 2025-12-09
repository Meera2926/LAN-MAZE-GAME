package maze.mechanics;

public class Trap {
    private final int row;
    private final int col;
    private final int slowDurationMs;
    private boolean isTriggered;

    public Trap(int row, int col, int slowDurationMs) {
        this.row = row;
        this.col = col;
        this.slowDurationMs = slowDurationMs;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
    public int getSlowDurationMs() { return slowDurationMs; }
    public boolean isTriggered() { return isTriggered; }
    public void trigger() { this.isTriggered = true; }
}
