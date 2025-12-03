package maze.audio;

public class SoundManager {
    private boolean isMuted;

    public void setMuted(boolean muted) { this.isMuted = muted; }
    public boolean isMuted() { return isMuted; }

    public void playEffect(SoundEffect effect) {
        if (!isMuted) {
            // Synthesized tone trigger for desktop JVM
        }
    }
}
