package maze.core;

public class Cell {
    private final int row;
    private final int col;
    private boolean visited;
    private boolean topWall = true;
    private boolean bottomWall = true;
    private boolean leftWall = true;
    private boolean rightWall = true;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
    public boolean isVisited() { return visited; }
    public void setVisited(boolean visited) { this.visited = visited; }

    public boolean hasTopWall() { return topWall; }
    public void setTopWall(boolean topWall) { this.topWall = topWall; }

    public boolean hasBottomWall() { return bottomWall; }
    public void setBottomWall(boolean bottomWall) { this.bottomWall = bottomWall; }

    public boolean hasLeftWall() { return leftWall; }
    public void setLeftWall(boolean leftWall) { this.leftWall = leftWall; }

    public boolean hasRightWall() { return rightWall; }
    public void setRightWall(boolean rightWall) { this.rightWall = rightWall; }
}
