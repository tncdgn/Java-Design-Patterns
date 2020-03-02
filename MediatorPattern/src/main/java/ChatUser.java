public class ChatUser extends User {

    public ChatUser(IChatRoom chatRoom, long id, String name) {
        super(chatRoom, id, name);
    }

    public void sendMessage(String message, long userId) {
        System.out.println(getName() + ": " + message);
        getChatRoom().sendMessage(message, userId);
    }

    public void receive(String message) {
        //System.out.println(getName() + ": " + message);
    }
}
