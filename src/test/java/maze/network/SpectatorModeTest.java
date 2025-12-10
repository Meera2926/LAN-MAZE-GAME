package maze.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpectatorModeTest {
    @Test
    public void testSpectatorRegistration() {
        SpectatorMode sm = new SpectatorMode();
        assertFalse(sm.isSpectating("P-1"));
        sm.addSpectator("P-1");
        assertTrue(sm.isSpectating("P-1"));
    }
}
