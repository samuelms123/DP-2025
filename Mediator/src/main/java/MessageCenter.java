import java.util.HashMap;
import java.util.Map;

public class MessageCenter implements ChatMediator {

    Map<Integer, User> users = new HashMap<>();

    @Override
    public void forwardMessage(int from, int to, String message) {
        User toUser = users.get(to);
        User fromUser = users.get(from);

        if (fromUser != null && toUser != null) {
            toUser.receiveAndDisplayMessage(fromUser, message);
            System.out.println("Forward");
        }
    }

    @Override
    public void registerUser(User user) {
        users.put(user.getUserId(), user);
    }

}
