package maze.mechanics;

public class FreezePowerUp {
    private long freezeUntilTimestamp;

    public void applyFreeze(long durationMs) {
        this.freezeUntilTimestamp = System.currentTimeMillis() + durationMs;
    }

    public boolean isFrozen() {
        return System.currentTimeMillis() < freezeUntilTimestamp;
    }
}
