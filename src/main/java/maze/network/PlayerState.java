package maze.network;

import java.io.Serializable;

public class PlayerState implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String id;
    private int score;
    private boolean isAlive = true;

    public PlayerState(String id) {
        this.id = id;
    }

    public String getId() { return id; }
    public int getScore() { return score; }
    public void addScore(int points) { this.score += points; }
    public boolean isAlive() { return isAlive; }
    public void setAlive(boolean alive) { this.isAlive = alive; }
}
