public class EmailSender implements Sender {
    public void send(String message) {
        System.out.println("Email sent. Message is " + message);
    }
}
