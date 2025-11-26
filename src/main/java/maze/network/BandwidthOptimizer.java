package maze.network;

public class BandwidthOptimizer {
    public static boolean shouldBroadcastMovement(int oldR, int oldC, int newR, int newC) {
        return oldR != newR || oldC != newC;
    }
}
