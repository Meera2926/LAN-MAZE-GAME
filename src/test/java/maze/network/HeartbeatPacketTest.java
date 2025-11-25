package maze.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeartbeatPacketTest {
    @Test
    public void testHeartbeatSequence() {
        HeartbeatPacket hp = new HeartbeatPacket(42L);
        assertEquals(42L, hp.getPingSequence());
        assertEquals(PacketType.HEARTBEAT, hp.getType());
    }
}
