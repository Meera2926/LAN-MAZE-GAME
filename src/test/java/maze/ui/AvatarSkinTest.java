package maze.ui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AvatarSkinTest {
    @Test
    public void testAvatarSkinProperties() {
        assertEquals("mario.png", AvatarSkin.MARIO.getAssetPath());
        assertEquals("Sonic", AvatarSkin.SONIC.getDisplayName());
    }
}
