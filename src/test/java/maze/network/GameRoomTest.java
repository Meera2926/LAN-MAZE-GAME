package maze.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameRoomTest {
    @Test
    public void testGameRoomCapacity() {
        GameRoom room = new GameRoom("ROOM-1", 2);
        assertTrue(room.addPlayer("P1"));
        assertTrue(room.addPlayer("P2"));
        assertFalse(room.addPlayer("P3"), "Cannot exceed max room players");
        assertTrue(room.isFull());
    }
}
