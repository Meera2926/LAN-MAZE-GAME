package maze.mechanics;

import maze.core.Point;

public class PortalTeleporter {
    private final Point portalA;
    private final Point portalB;

    public PortalTeleporter(Point a, Point b) {
        this.portalA = a;
        this.portalB = b;
    }

    public Point teleport(Point current) {
        if (current.equals(portalA)) return portalB;
        if (current.equals(portalB)) return portalA;
        return current;
    }
}
