package maze.ai;

import maze.core.Cell;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BotManagerTest {
    @Test
    public void testBotPoolManagement() {
        BotManager manager = new BotManager();
        manager.addBot(new MazeBot("B1", new Cell(0, 0), BotDifficulty.EASY));
        manager.addBot(new MazeBot("B2", new Cell(1, 1), BotDifficulty.HARD));

        assertEquals(2, manager.getActiveBots().size());
        manager.removeBot("B1");
        assertEquals(1, manager.getActiveBots().size());
    }
}
