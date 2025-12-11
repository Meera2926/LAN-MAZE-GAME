package maze.audio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MidiAudioSynthesizerTest {
    @Test
    public void testMidiMuteControl() {
        MidiAudioSynthesizer synth = new MidiAudioSynthesizer();
        assertFalse(synth.isMuted());
        synth.setMuted(true);
        assertTrue(synth.isMuted());
    }
}
