package maze.ai;

public enum BotDifficulty {
    EASY(1.5, 0.4),      // Slow reaction, 40% optimal choice
    MEDIUM(1.0, 0.75),   // Normal reaction, 75% optimal choice
    HARD(0.6, 1.0);      // Fast reaction, 100% optimal A* route

    private final double stepDelaySeconds;
    private final double optimalChoiceRate;

    BotDifficulty(double stepDelaySeconds, double optimalChoiceRate) {
        this.stepDelaySeconds = stepDelaySeconds;
        this.optimalChoiceRate = optimalChoiceRate;
    }

    public double getStepDelaySeconds() { return stepDelaySeconds; }
    public double getOptimalChoiceRate() { return optimalChoiceRate; }
}
