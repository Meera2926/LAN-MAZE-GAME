package maze.mechanics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpeedBoostTest {
    @Test
    public void testSpeedBoostActivation() {
        SpeedBoostEffect effect = new SpeedBoostEffect(2.0);
        effect.activate(1000L);
        assertTrue(effect.isActive());
        assertEquals(2.0, effect.getSpeedMultiplier());
    }
}
