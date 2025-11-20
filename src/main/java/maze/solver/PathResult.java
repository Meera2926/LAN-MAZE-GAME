package maze.solver;

import maze.core.Cell;
import java.util.List;

public class PathResult {
    private final List<Cell> path;
    private final int nodesExplored;
    private final long executionTimeNanos;

    public PathResult(List<Cell> path, int nodesExplored, long executionTimeNanos) {
        this.path = path;
        this.nodesExplored = nodesExplored;
        this.executionTimeNanos = executionTimeNanos;
    }

    public List<Cell> getPath() { return path; }
    public int getPathLength() { return path.size(); }
    public int getNodesExplored() { return nodesExplored; }
    public long getExecutionTimeNanos() { return executionTimeNanos; }
}
