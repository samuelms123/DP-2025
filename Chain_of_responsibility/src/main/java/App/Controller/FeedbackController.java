package App.Controller;

import App.Handlers.*;
import App.Message;
import App.MessageType;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class FeedbackController {
    @FXML
    private TextField email;
    @FXML
    private ChoiceBox<MessageType> type;
    @FXML
    private TextArea message;
    @FXML
    private Button button;
    @FXML
    private Text result;

    Handler chainStart;

    public void initialize() {
        type.setItems(FXCollections.observableArrayList(MessageType.values()));
        type.setValue(MessageType.FEEDBACK);

        result.setVisible(false);

        Handler feedbackHandler = new FeedbackHandler();
        Handler compensationHandler = new CompensationHandler();
        Handler contactHandler = new ContactHandler();
        Handler suggestionHandler = new SuggestionHandler();

        feedbackHandler.setNextHandler(compensationHandler);
        compensationHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(suggestionHandler);

        chainStart = feedbackHandler;
    }

    public void handleSubmit() {
        result.setVisible(false);

        if (email.getText() == null || email.getText().isEmpty()) {
            result.setText("Please enter your email address");
            result.setVisible(true);
            return;
        }

        MessageType messageType = type.getValue();
        String content = message.getText();
        String emailValue = email.getText();

        Message message = new Message(messageType, content, emailValue);

        chainStart.process(message);

        result.setText("Feedback Submitted");
        result.setVisible(true);

    }


}
