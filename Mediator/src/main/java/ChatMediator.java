import java.util.Map;

public interface ChatMediator {
    void forwardMessage(int from, int to, String message);
    void registerUser(User user);
}
