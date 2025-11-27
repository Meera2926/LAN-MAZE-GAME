package maze.mechanics;

public enum PowerUpType {
    SPEED_BOOST(8.0),
    GHOST_WALK(5.0),
    RADAR_REVEAL(10.0),
    FREEZE_OPPONENTS(4.0);

    private final double durationSeconds;

    PowerUpType(double durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public double getDurationSeconds() { return durationSeconds; }
}
