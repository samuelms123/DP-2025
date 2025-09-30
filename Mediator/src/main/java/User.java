
public class User {
    private static int userId = 0;
    private MessageController controller;
    private MessageCenter messageCenter;

    public User(MessageCenter messageCenter) {
        this.messageCenter = messageCenter;
        userId++;
    }

    public void sendMessage(int from, int to, String message) {
        messageCenter.forwardMessage(from, to, message);
    }

    public void receiveAndDisplayMessage(User from, String message) {
        controller.displayMessage(from, message);
    }

    public int getUserId() {
        return userId;
    }

    public void setController(MessageController controller) {
        this.controller = controller;
    }
}
