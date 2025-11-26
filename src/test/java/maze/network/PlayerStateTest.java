package maze.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerStateTest {
    @Test
    public void testPlayerStateAccumulatesScore() {
        PlayerState state = new PlayerState("P-1");
        assertEquals(0, state.getScore());
        state.addScore(100);
        assertEquals(100, state.getScore());
        assertTrue(state.isAlive());
    }
}
