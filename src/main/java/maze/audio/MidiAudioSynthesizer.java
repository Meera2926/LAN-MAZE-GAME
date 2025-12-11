package maze.audio;

public class MidiAudioSynthesizer {
    private boolean isMuted = false;

    public void playTone(int midiNote, int durationMs) {
        if (!isMuted) {
            // Generates synthetic pitch tone
        }
    }

    public void setMuted(boolean muted) { this.isMuted = muted; }
    public boolean isMuted() { return isMuted; }
}
