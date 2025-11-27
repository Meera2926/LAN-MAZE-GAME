package maze.mechanics;

public class SpeedBoostEffect {
    private final double speedMultiplier;
    private long expirationTimeMs;

    public SpeedBoostEffect(double speedMultiplier) {
        this.speedMultiplier = speedMultiplier;
    }

    public void activate(long durationMs) {
        this.expirationTimeMs = System.currentTimeMillis() + durationMs;
    }

    public boolean isActive() {
        return System.currentTimeMillis() < expirationTimeMs;
    }

    public double getSpeedMultiplier() {
        return isActive() ? speedMultiplier : 1.0;
    }
}
