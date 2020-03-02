public class SmsSender implements Sender {
    public void send(String message) {
        System.out.println("Sms sent.Message is " + message);
    }
}
