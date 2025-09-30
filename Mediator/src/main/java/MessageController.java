import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class MessageController {
    @FXML private ListView chat;
    @FXML private TextArea message;
    @FXML private ChoiceBox<Integer> recipient;
    @FXML private Button sendButton;

    private User user;

    public void setUser(User user) {
        this.user = user;
        user.setController(this);
    }

    @FXML
    public void initialize() {
        recipient.getItems().addAll(1, 2, 3);
    }

    public void sendMessage() {
        String msg = message.getText();
        int rec = recipient.getValue();

        if (msg != null && rec != 0) {
            chat.getItems().add("Me: " + msg);
            message.clear();
            user.sendMessage(user.getUserId(), rec, msg);
        }
    }

    public void displayMessage(User from, String message) {
        chat.getItems().add("User " + from.getUserId() + ": " + message);
    }
}
