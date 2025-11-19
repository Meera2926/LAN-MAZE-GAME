package maze.ai;

import maze.core.Cell;

public class MazeBot {
    private final String botId;
    private Cell currentCell;
    private final BotDifficulty difficulty;

    public MazeBot(String botId, Cell initialCell, BotDifficulty difficulty) {
        this.botId = botId;
        this.currentCell = initialCell;
        this.difficulty = difficulty;
    }

    public String getBotId() { return botId; }
    public Cell getCurrentCell() { return currentCell; }
    public void setCurrentCell(Cell cell) { this.currentCell = cell; }
    public BotDifficulty getDifficulty() { return difficulty; }
}
