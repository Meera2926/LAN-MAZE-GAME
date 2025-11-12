package maze.core;

public class Wall {
    private final int row;
    private final int col;
    private final Direction direction;

    public Wall(int row, int col, Direction direction) {
        this.row = row;
        this.col = col;
        this.direction = direction;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
    public Direction getDirection() { return direction; }
}
