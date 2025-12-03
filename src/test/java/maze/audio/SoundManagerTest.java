package maze.audio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SoundManagerTest {
    @Test
    public void testMuteToggle() {
        SoundManager sm = new SoundManager();
        assertFalse(sm.isMuted());
        sm.setMuted(true);
        assertTrue(sm.isMuted());
    }
}
