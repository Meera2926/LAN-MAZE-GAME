package maze.ui;

public class SettingsDialog {
    private int masterVolume = 80;
    private boolean fogOfWarEnabled = false;
    private boolean showMinimap = true;

    public void setMasterVolume(int volume) {
        this.masterVolume = Math.max(0, Math.min(100, volume));
    }

    public int getMasterVolume() {
        return masterVolume;
    }

    public void setFogOfWarEnabled(boolean enabled) {
        this.fogOfWarEnabled = enabled;
    }

    public boolean isFogOfWarEnabled() {
        return fogOfWarEnabled;
    }

    public void setShowMinimap(boolean show) {
        this.showMinimap = show;
    }

    public boolean isShowMinimap() {
        return showMinimap;
    }
}
