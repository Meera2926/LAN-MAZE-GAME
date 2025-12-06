package maze.config;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServerConfigTest {
    @Test
    public void testServerPort() {
        assertEquals(12345, ServerConfig.DEFAULT_PORT);
        assertEquals(8, ServerConfig.MAX_CLIENTS);
    }
}
