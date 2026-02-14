package maze.generators;

import maze.core.Grid;
import java.util.Random;

public class EllersGenerator {
    private final int width;
    private final int height;
    private final Random random;

    public EllersGenerator(int width, int height) {
        this(width, height, new Random());
    }

    public EllersGenerator(int width, int height, Random random) {
        this.width = width;
        this.height = height;
        this.random = random;
    }

    public Grid generate() {
        Grid grid = new Grid(width, height);
        // Eller's algorithm creates a perfect maze row by row
        int[] rowSets = new int[width];
        int setCounter = 1;

        for (int x = 0; x < width; x++) {
            rowSets[x] = setCounter++;
        }

        for (int y = 0; y < height - 1; y++) {
            for (int x = 0; x < width - 1; x++) {
                if (rowSets[x] != rowSets[x + 1] && random.nextBoolean()) {
                    int oldSet = rowSets[x + 1];
                    int newSet = rowSets[x];
                    for (int i = 0; i < width; i++) {
                        if (rowSets[i] == oldSet) rowSets[i] = newSet;
                    }
                    grid.carvePassage(x, y, x + 1, y);
                }
            }
        }
        return grid;
    }
}
