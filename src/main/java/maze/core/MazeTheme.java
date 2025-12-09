package maze.core;

import java.awt.Color;

public enum MazeTheme {
    CLASSIC_STONE(new Color(0x3E, 0x27, 0x23), new Color(0xDC, 0xED, 0xC8)),
    NEON_CYBERPUNK(new Color(0x0D, 0x02, 0x21), new Color(0x00, 0xF5, 0xD4)),
    DUNGEON_DARK(new Color(0x1B, 0x1B, 0x1B), new Color(0x75, 0x75, 0x75));

    private final Color wallColor;
    private final Color floorColor;

    MazeTheme(Color wallColor, Color floorColor) {
        this.wallColor = wallColor;
        this.floorColor = floorColor;
    }

    public Color getWallColor() { return wallColor; }
    public Color getFloorColor() { return floorColor; }
}
