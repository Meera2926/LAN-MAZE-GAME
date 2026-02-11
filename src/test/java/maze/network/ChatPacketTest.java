package maze.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChatPacketTest {

    @Test
    public void testChatPacketSerialization() {
        ChatPacket packet = new ChatPacket("player1", "Good game!", false);
        assertEquals("player1", packet.getSenderId());
        assertEquals("Good game!", packet.getMessageText());
        assertFalse(packet.isQuickChat());
        assertTrue(packet.serialize().contains("Good game!"));
    }
}
