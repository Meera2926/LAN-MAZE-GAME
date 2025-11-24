package maze.network;

public class CoinPacket extends Packet {
    private final int coinId;
    private final int row;
    private final int col;
    private final int pointValue;

    public CoinPacket(PacketType type, int coinId, int row, int col, int pointValue) {
        super(type);
        this.coinId = coinId;
        this.row = row;
        this.col = col;
        this.pointValue = pointValue;
    }

    public int getCoinId() { return coinId; }
    public int getRow() { return row; }
    public int getCol() { return col; }
    public int getPointValue() { return pointValue; }
}
