package maze.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PacketTest {
    @Test
    public void testPacketCreation() {
        Packet packet = new Packet(PacketType.CONNECT);
        assertEquals(PacketType.CONNECT, packet.getType());
        assertTrue(packet.getTimestamp() > 0);
    }
}
