package maze.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovePacketTest {
    @Test
    public void testMovePacketCoordinates() {
        MovePacket mp = new MovePacket("P-1", 4, 7);
        assertEquals("P-1", mp.getPlayerId());
        assertEquals(4, mp.getNewRow());
        assertEquals(7, mp.getNewCol());
    }
}
