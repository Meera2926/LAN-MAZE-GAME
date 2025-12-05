package maze.ui;

public class GameHud {
    public static String formatTimer(int secondsRemaining) {
        int minutes = secondsRemaining / 60;
        int seconds = secondsRemaining % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}
