package App.Handlers;

import App.Message;
import App.MessageType;

public class FeedbackHandler extends Handler {

    public void process(Message message) {
        if (message.getType() == MessageType.FEEDBACK) {
            System.out.println("Handling Feedback");
        }
        else {
            System.out.println("Forwarding " + message.getType() + " message from feedback handler");
            super.process(message);
        }
    }
}
