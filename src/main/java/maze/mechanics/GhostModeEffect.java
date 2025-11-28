package maze.mechanics;

public class GhostModeEffect {
    private boolean isGhostActive;

    public void setGhostActive(boolean active) { this.isGhostActive = active; }
    public boolean canPassThroughWalls() { return isGhostActive; }
}
