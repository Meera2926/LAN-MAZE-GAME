package maze.ui;

public class MinimapRenderer {
    public static double computeScaleFactor(int mazeWidth, int minimapPixelSize) {
        if (mazeWidth <= 0) return 1.0;
        return (double) minimapPixelSize / mazeWidth;
    }
}
