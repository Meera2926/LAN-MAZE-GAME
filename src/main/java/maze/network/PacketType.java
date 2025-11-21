package maze.network;

public enum PacketType {
    CONNECT,
    DISCONNECT,
    JOIN_LOBBY,
    PLAYER_MOVE,
    SPAWN_COIN,
    COLLECT_COIN,
    PLAYER_SCORED,
    HEARTBEAT,
    GAME_START,
    GAME_OVER;
}
