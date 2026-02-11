package maze.network;

public class ChatPacket extends Packet {
    private final String senderId;
    private final String messageText;
    private final boolean isQuickChat;

    public ChatPacket(String senderId, String messageText, boolean isQuickChat) {
        super(PacketType.CHAT);
        this.senderId = senderId;
        this.messageText = messageText;
        this.isQuickChat = isQuickChat;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getMessageText() {
        return messageText;
    }

    public boolean isQuickChat() {
        return isQuickChat;
    }

    @Override
    public String serialize() {
        return getHeader() + ";" + senderId + ";" + isQuickChat + ";" + messageText;
    }
}
