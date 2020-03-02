public interface IChatRoom {

    void sendMessage(String message, long userId);

    void addUser(User user);
}
