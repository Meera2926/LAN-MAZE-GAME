package maze.ui;

public enum AvatarSkin {
    MARIO("mario.png", "Mario"),
    SONIC("sonic.png", "Sonic");

    private final String assetPath;
    private final String displayName;

    AvatarSkin(String assetPath, String displayName) {
        this.assetPath = assetPath;
        this.displayName = displayName;
    }

    public String getAssetPath() { return assetPath; }
    public String getDisplayName() { return displayName; }
}
