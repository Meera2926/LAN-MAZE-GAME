package maze.mechanics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FreezePowerUpTest {
    @Test
    public void testFreezeApplication() {
        FreezePowerUp fp = new FreezePowerUp();
        assertFalse(fp.isFrozen());
        fp.applyFreeze(1000L);
        assertTrue(fp.isFrozen());
    }
}
