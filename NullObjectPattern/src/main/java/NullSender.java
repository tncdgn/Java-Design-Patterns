public class NullSender implements Sender {
    public void send(String message) {
        System.out.println("Message can not send");
    }
}
