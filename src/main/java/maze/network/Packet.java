package maze.network;

import java.io.Serializable;

public class Packet implements Serializable {
    private static final long serialVersionUID = 1L;
    private final PacketType type;
    private final long timestamp;

    public Packet(PacketType type) {
        this.type = type;
        this.timestamp = System.currentTimeMillis();
    }

    public PacketType getType() { return type; }
    public long getTimestamp() { return timestamp; }
}
