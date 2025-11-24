package maze.network;

import java.util.*;

public class GameRoom {
    private final String roomId;
    private final int maxPlayers;
    private final List<String> playerIds = new ArrayList<>();
    private boolean isGameStarted;

    public GameRoom(String roomId, int maxPlayers) {
        this.roomId = roomId;
        this.maxPlayers = maxPlayers;
    }

    public synchronized boolean addPlayer(String playerId) {
        if (playerIds.size() >= maxPlayers || isGameStarted) return false;
        playerIds.add(playerId);
        return true;
    }

    public synchronized void removePlayer(String playerId) {
        playerIds.remove(playerId);
    }

    public String getRoomId() { return roomId; }
    public int getPlayerCount() { return playerIds.size(); }
    public boolean isFull() { return playerIds.size() >= maxPlayers; }
    public boolean isGameStarted() { return isGameStarted; }
    public void setGameStarted(boolean started) { this.isGameStarted = started; }
}
