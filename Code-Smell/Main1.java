public class Main1 {
    public static void main(String[] args) {
        MessagingService service = new MessagingService();

        service.sendMessage("Hello Tenant A", "Manager", "Tenant A");
        service.sendMessage("Rent due next week!", "Owner", "Tenant A");

        for (Message msg : service.getMessagesForRecipient("Tenant A")) {
            msg.printDetails();
        }

        service.printAllMessages();
    }
}
