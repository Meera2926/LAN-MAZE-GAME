package maze.mechanics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowerUpTest {
    @Test
    public void testPowerUpCollection() {
        PowerUp pu = new PowerUp("PU-1", PowerUpType.SPEED_BOOST, 2, 3);
        assertFalse(pu.isCollected());
        pu.setCollected(true);
        assertTrue(pu.isCollected());
        assertEquals(PowerUpType.SPEED_BOOST, pu.getType());
    }
}
