package maze.mechanics;

public class ShieldPowerUp extends PowerUp {
    private final int damageAbsorptions;
    private int remainingAbsorptions;

    public ShieldPowerUp(int x, int y, int durationSeconds, int damageAbsorptions) {
        super(x, y, PowerUpType.SHIELD, durationSeconds);
        this.damageAbsorptions = damageAbsorptions;
        this.remainingAbsorptions = damageAbsorptions;
    }

    public boolean absorbHit() {
        if (remainingAbsorptions > 0) {
            remainingAbsorptions--;
            return true;
        }
        return false;
    }

    public int getRemainingAbsorptions() {
        return remainingAbsorptions;
    }

    public int getMaxAbsorptions() {
        return damageAbsorptions;
    }
}
