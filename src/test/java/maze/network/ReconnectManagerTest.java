package maze.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReconnectManagerTest {

    @Test
    public void testSessionPreserveAndRestore() {
        ReconnectManager manager = new ReconnectManager(5000);
        manager.preserveSession("player1", 120, 5, 8);

        ReconnectManager.PlayerSessionSnapshot restored = manager.restoreSession("player1");
        assertNotNull(restored);
        assertEquals(120, restored.score());
        assertEquals(5, restored.x());
        assertEquals(8, restored.y());
    }
}
