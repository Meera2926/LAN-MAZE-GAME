package maze.ui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameOverDialogTest {
    @Test
    public void testFormattedSummary() {
        GameOverDialog dialog = new GameOverDialog("Meera", 450);
        assertEquals("Game Over! Winner: Meera with 450 pts", dialog.getFormattedSummary());
    }
}
