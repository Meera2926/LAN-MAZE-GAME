package maze.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CoinPacketTest {
    @Test
    public void testCoinPacketValues() {
        CoinPacket cp = new CoinPacket(PacketType.SPAWN_COIN, 101, 3, 5, 50);
        assertEquals(101, cp.getCoinId());
        assertEquals(50, cp.getPointValue());
    }
}
