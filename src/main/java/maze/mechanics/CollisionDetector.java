package maze.mechanics;

public class CollisionDetector {
    public static boolean checkPointOverlap(int r1, int c1, int r2, int c2) {
        return r1 == r2 && c1 == c2;
    }
}
