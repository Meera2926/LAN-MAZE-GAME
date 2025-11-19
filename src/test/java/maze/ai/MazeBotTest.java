package maze.ai;

import maze.core.Cell;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MazeBotTest {
    @Test
    public void testBotMovement() {
        Cell c1 = new Cell(1, 1);
        Cell c2 = new Cell(1, 2);
        MazeBot bot = new MazeBot("BOT-1", c1, BotDifficulty.MEDIUM);

        assertEquals(c1, bot.getCurrentCell());
        bot.setCurrentCell(c2);
        assertEquals(c2, bot.getCurrentCell());
        assertEquals(BotDifficulty.MEDIUM, bot.getDifficulty());
    }
}
