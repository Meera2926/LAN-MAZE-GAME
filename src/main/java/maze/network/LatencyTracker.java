package maze.network;

import java.util.HashMap;
import java.util.Map;

public class LatencyTracker {
    private final Map<String, Long> pingSentTimestamps = new HashMap<>();
    private final Map<String, Long> roundTripLatencies = new HashMap<>();

    public void recordPingSent(String clientId, long timestamp) {
        pingSentTimestamps.put(clientId, timestamp);
    }

    public void recordPongReceived(String clientId, long timestamp) {
        Long sent = pingSentTimestamps.remove(clientId);
        if (sent != null) {
            roundTripLatencies.put(clientId, timestamp - sent);
        }
    }

    public long getLatency(String clientId) {
        return roundTripLatencies.getOrDefault(clientId, 0L);
    }
}
