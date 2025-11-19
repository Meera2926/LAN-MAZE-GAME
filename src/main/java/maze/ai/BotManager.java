package maze.ai;

import java.util.*;

public class BotManager {
    private final List<MazeBot> activeBots = new ArrayList<>();

    public void addBot(MazeBot bot) { activeBots.add(bot); }
    public void removeBot(String botId) { activeBots.removeIf(b -> b.getBotId().equals(botId)); }
    public List<MazeBot> getActiveBots() { return Collections.unmodifiableList(activeBots); }
}
