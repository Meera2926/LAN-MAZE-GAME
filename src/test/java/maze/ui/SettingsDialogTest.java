package maze.ui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SettingsDialogTest {

    @Test
    public void testSettingsBounds() {
        SettingsDialog settings = new SettingsDialog();
        settings.setMasterVolume(120);
        assertEquals(100, settings.getMasterVolume());

        settings.setMasterVolume(-10);
        assertEquals(0, settings.getMasterVolume());

        settings.setFogOfWarEnabled(true);
        assertTrue(settings.isFogOfWarEnabled());
    }
}
