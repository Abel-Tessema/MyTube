public class EmailService implements MessageService {
    public void sendMessage(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
