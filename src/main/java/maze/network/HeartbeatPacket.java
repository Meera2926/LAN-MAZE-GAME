package maze.network;

public class HeartbeatPacket extends Packet {
    private final long pingSequence;

    public HeartbeatPacket(long pingSequence) {
        super(PacketType.HEARTBEAT);
        this.pingSequence = pingSequence;
    }

    public long getPingSequence() { return pingSequence; }
}
