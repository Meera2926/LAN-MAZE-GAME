package maze.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoomManagerTest {
    @Test
    public void testRoomCreationAndDeletion() {
        RoomManager rm = new RoomManager();
        rm.createRoom("LOBBY-A", 4);
        assertNotNull(rm.getRoom("LOBBY-A"));
        rm.deleteRoom("LOBBY-A");
        assertNull(rm.getRoom("LOBBY-A"));
    }
}
