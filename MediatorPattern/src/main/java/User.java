public abstract class User {

    private IChatRoom chatRoom;

    private long id;
    private String name;

    public User(IChatRoom chatRoom, long id, String name) {
        this.chatRoom = chatRoom;
        this.id = id;
        this.name = name;
    }

    public abstract void sendMessage(String message,long userId);
    public abstract void receive(String message);

    public IChatRoom getChatRoom() {
        return chatRoom;
    }

    public void setChatRoom(IChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
