package maze.network;

import java.util.*;

public class RoomManager {
    private final Map<String, GameRoom> rooms = new HashMap<>();

    public synchronized GameRoom createRoom(String roomId, int capacity) {
        GameRoom room = new GameRoom(roomId, capacity);
        rooms.put(roomId, room);
        return room;
    }

    public synchronized GameRoom getRoom(String roomId) {
        return rooms.get(roomId);
    }

    public synchronized void deleteRoom(String roomId) {
        rooms.remove(roomId);
    }
}
