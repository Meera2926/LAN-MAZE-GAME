package maze.ui;

public class PauseMenu {
    private boolean isPaused = false;

    public void togglePause() { isPaused = !isPaused; }
    public boolean isPaused() { return isPaused; }
    public void resume() { isPaused = false; }
}
