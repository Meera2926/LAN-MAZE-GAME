package maze.core;

public enum Direction {
    NORTH(-1, 0),
    SOUTH(1, 0),
    WEST(0, -1),
    EAST(0, 1);

    private final int deltaRow;
    private final int deltaCol;

    Direction(int deltaRow, int deltaCol) {
        this.deltaRow = deltaRow;
        this.deltaCol = deltaCol;
    }

    public int getDeltaRow() { return deltaRow; }
    public int getDeltaCol() { return deltaCol; }

    public Direction opposite() {
        switch (this) {
            case NORTH: return SOUTH;
            case SOUTH: return NORTH;
            case WEST: return EAST;
            case EAST: return WEST;
            default: throw new IllegalStateException();
        }
    }
}
