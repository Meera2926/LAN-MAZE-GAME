package maze.core;

import java.util.HashSet;
import java.util.Set;

public class FogOfWar {
    private final int viewRadius;
    private final Set<Point> exploredTiles = new HashSet<>();

    public FogOfWar(int viewRadius) {
        this.viewRadius = viewRadius;
    }

    public void updateVisibility(int playerX, int playerY) {
        for (int dx = -viewRadius; dx <= viewRadius; dx++) {
            for (int dy = -viewRadius; dy <= viewRadius; dy++) {
                if (dx * dx + dy * dy <= viewRadius * viewRadius) {
                    exploredTiles.add(new Point(playerX + dx, playerY + dy));
                }
            }
        }
    }

    public boolean isVisible(int x, int y, int playerX, int playerY) {
        int dx = x - playerX;
        int dy = y - playerY;
        return (dx * dx + dy * dy) <= (viewRadius * viewRadius);
    }

    public boolean isExplored(int x, int y) {
        return exploredTiles.contains(new Point(x, y));
    }

    public int getViewRadius() {
        return viewRadius;
    }
}
