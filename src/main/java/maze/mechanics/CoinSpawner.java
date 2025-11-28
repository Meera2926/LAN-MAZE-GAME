package maze.mechanics;

import java.util.*;

public class CoinSpawner {
    public static List<int[]> spawnCoins(int count, int rows, int cols) {
        List<int[]> positions = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            positions.add(new int[]{random.nextInt(rows), random.nextInt(cols)});
        }
        return positions;
    }
}
