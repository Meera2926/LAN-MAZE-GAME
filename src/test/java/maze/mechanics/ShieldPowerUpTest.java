package maze.mechanics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShieldPowerUpTest {

    @Test
    public void testShieldAbsorbsHitsCorrectly() {
        ShieldPowerUp shield = new ShieldPowerUp(3, 4, 15, 2);
        assertEquals(2, shield.getRemainingAbsorptions());
        assertTrue(shield.absorbHit());
        assertEquals(1, shield.getRemainingAbsorptions());
        assertTrue(shield.absorbHit());
        assertEquals(0, shield.getRemainingAbsorptions());
        assertFalse(shield.absorbHit());
    }
}
