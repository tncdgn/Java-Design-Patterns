import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements IChatRoom {

    Map<Long, User> userMap = new HashMap<Long, User>();

    public void sendMessage(String message, long userId) {
        User user = userMap.get(userId);

        user.receive(message);
    }

    public void addUser(User user) {
        userMap.put(user.getId(), user);
    }
}
