package maze.mechanics;

public class PowerUp {
    private final String id;
    private final PowerUpType type;
    private final int row;
    private final int col;
    private boolean isCollected;

    public PowerUp(String id, PowerUpType type, int row, int col) {
        this.id = id;
        this.type = type;
        this.row = row;
        this.col = col;
    }

    public String getId() { return id; }
    public PowerUpType getType() { return type; }
    public int getRow() { return row; }
    public int getCol() { return col; }
    public boolean isCollected() { return isCollected; }
    public void setCollected(boolean collected) { this.isCollected = collected; }
}
