package maze.network;

public class MovePacket extends Packet {
    private final String playerId;
    private final int newRow;
    private final int newCol;

    public MovePacket(String playerId, int newRow, int newCol) {
        super(PacketType.PLAYER_MOVE);
        this.playerId = playerId;
        this.newRow = newRow;
        this.newCol = newCol;
    }

    public String getPlayerId() { return playerId; }
    public int getNewRow() { return newRow; }
    public int getNewCol() { return newCol; }
}
