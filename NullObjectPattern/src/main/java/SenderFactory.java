public class SenderFactory {

    public static Sender createSender(String type) {
        if ("Sms".equals(type)) {
            return new SmsSender();
        }
        if ("Email".equals(type)) {
            return new EmailSender();
        }
        return new NullSender();
    }
}
