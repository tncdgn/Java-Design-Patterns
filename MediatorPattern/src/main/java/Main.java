public class Main {

    public static void main(String[] args) {
        IChatRoom chatroom = new ChatRoom();

        User user1 = new ChatUser(chatroom, 1, "Adam");
        User user2 = new ChatUser(chatroom, 2, "Jonas");
        User user3 = new ChatUser(chatroom, 3, "Noah");
        User user4 = new ChatUser(chatroom, 4, "Nielsen");

        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);

        user2.sendMessage("Who are you? ", 1);
        user1.sendMessage("Dont you know. I am you", 2);
    }
}
