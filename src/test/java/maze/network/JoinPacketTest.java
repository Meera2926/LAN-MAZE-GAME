package maze.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JoinPacketTest {
    @Test
    public void testJoinPacketFields() {
        JoinPacket jp = new JoinPacket("Meera", "mario");
        assertEquals("Meera", jp.getPlayerName());
        assertEquals("mario", jp.getAvatarId());
        assertEquals(PacketType.JOIN_LOBBY, jp.getType());
    }
}
