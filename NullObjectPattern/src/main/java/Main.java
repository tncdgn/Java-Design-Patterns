import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] senderType = new String[]{"Sms", "Email", null};

        Arrays.stream(senderType).forEach(type -> {
            Sender sender = SenderFactory.createSender(type);

            sender.send("Hi");
        });
    }
}
