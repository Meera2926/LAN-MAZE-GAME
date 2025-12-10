package maze.network;

import java.util.*;

public class SpectatorMode {
    private final Set<String> spectators = new HashSet<>();

    public void addSpectator(String playerId) { spectators.add(playerId); }
    public void removeSpectator(String playerId) { spectators.remove(playerId); }
    public boolean isSpectating(String playerId) { return spectators.contains(playerId); }
}
