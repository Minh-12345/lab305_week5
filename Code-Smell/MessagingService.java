import java.util.*;

public class MessagingService {
    private final Map<String, List<Message>> inbox = new HashMap<>();

    public void sendMessage(String content, String sender, String recipient) {
        Message msg = new Message(content, sender, recipient);
        inbox.computeIfAbsent(recipient, k -> new ArrayList<>()).add(msg);
    }

    public List<Message> getMessagesForRecipient(String recipient) {
        return inbox.getOrDefault(recipient, List.of());
    }

    public void printAllMessages() {
        inbox.forEach((recipient, messages) -> {
            System.out.println("Messages for: " + recipient);
            for (Message m : messages) {
                m.printSummary();
            }
        });
    }
}
