package maze.network;

public class JoinPacket extends Packet {
    private final String playerName;
    private final String avatarId;

    public JoinPacket(String playerName, String avatarId) {
        super(PacketType.JOIN_LOBBY);
        this.playerName = playerName;
        this.avatarId = avatarId;
    }

    public String getPlayerName() { return playerName; }
    public String getAvatarId() { return avatarId; }
}
