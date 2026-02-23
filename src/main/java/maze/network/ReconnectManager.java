package maze.network;

import java.util.HashMap;
import java.util.Map;

public class ReconnectManager {
    private final long sessionTimeoutMillis;
    private final Map<String, PlayerSessionSnapshot> savedSessions = new HashMap<>();

    public record PlayerSessionSnapshot(String playerId, int score, int x, int y, long disconnectedAt) {}

    public ReconnectManager(long sessionTimeoutMillis) {
        this.sessionTimeoutMillis = sessionTimeoutMillis;
    }

    public void preserveSession(String playerId, int score, int x, int y) {
        savedSessions.put(playerId, new PlayerSessionSnapshot(playerId, score, x, y, System.currentTimeMillis()));
    }

    public PlayerSessionSnapshot restoreSession(String playerId) {
        PlayerSessionSnapshot snapshot = savedSessions.get(playerId);
        if (snapshot != null && (System.currentTimeMillis() - snapshot.disconnectedAt() <= sessionTimeoutMillis)) {
            savedSessions.remove(playerId);
            return snapshot;
        }
        savedSessions.remove(playerId);
        return null;
    }
}
