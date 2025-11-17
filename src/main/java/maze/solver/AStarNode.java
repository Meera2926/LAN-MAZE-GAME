package maze.solver;

import maze.core.Cell;

public class AStarNode implements Comparable<AStarNode> {
    public final Cell cell;
    public double gCost;
    public double hCost;
    public AStarNode parent;

    public AStarNode(Cell cell) {
        this.cell = cell;
    }

    public double fCost() { return gCost + hCost; }

    @Override
    public int compareTo(AStarNode other) {
        return Double.compare(this.fCost(), other.fCost());
    }
}
