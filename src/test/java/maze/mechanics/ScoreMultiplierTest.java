package maze.mechanics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScoreMultiplierTest {
    @Test
    public void testComboMultipliers() {
        ScoreMultiplier sm = new ScoreMultiplier();
        assertEquals(1, sm.getMultiplier());

        for (int i = 0; i < 5; i++) sm.registerCoinCollected();
        assertEquals(2, sm.getMultiplier());

        for (int i = 0; i < 5; i++) sm.registerCoinCollected();
        assertEquals(4, sm.getMultiplier());

        sm.resetCombo();
        assertEquals(1, sm.getMultiplier());
    }
}
