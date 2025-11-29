package maze.mechanics;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CoinSpawnerTest {
    @Test
    public void testCoinSpawnCount() {
        List<int[]> coins = CoinSpawner.spawnCoins(5, 10, 10);
        assertEquals(5, coins.size());
    }
}
