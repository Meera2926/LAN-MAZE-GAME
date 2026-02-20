package maze.mechanics;

import maze.core.Direction;
import maze.core.Point;

public class CompassItem {
    private final Point targetPortal;

    public CompassItem(Point targetPortal) {
        this.targetPortal = targetPortal;
    }

    public Direction getDirectionToPortal(Point playerPos) {
        int dx = targetPortal.getX() - playerPos.getX();
        int dy = targetPortal.getY() - playerPos.getY();

        if (Math.abs(dx) >= Math.abs(dy)) {
            return dx > 0 ? Direction.EAST : Direction.WEST;
        } else {
            return dy > 0 ? Direction.SOUTH : Direction.NORTH;
        }
    }

    public double getDistanceToPortal(Point playerPos) {
        int dx = targetPortal.getX() - playerPos.getX();
        int dy = targetPortal.getY() - playerPos.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
