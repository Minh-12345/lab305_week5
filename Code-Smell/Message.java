public class Message implements Printable {
    private final String content;
    private final String sender;
    private final String recipient;

    public Message(String content, String sender, String recipient) {
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
    }

    public String getContent() { return content; }
    public String getSender() { return sender; }
    public String getRecipient() { return recipient; }

    @Override
    public void printSummary() {
        System.out.printf("From: %s -> To: %s | \"%s\"\n", sender, recipient, content);
    }

    @Override
    public void printDetails() {
        printSummary();
        System.out.printf("Length: %d | Sender UPPER: %s | Recipient lower: %s\n",
                content.length(), sender.toUpperCase(), recipient.toLowerCase());
    }
}
