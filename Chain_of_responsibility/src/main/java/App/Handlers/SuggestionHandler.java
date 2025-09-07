package App.Handlers;

import App.Message;
import App.MessageType;

public class SuggestionHandler extends Handler {

    public void process(Message message) {
        if (message.getType() == MessageType.SUGGESTION) {
            System.out.println("Handling suggestion message");
        }
        else {
            System.out.println("Forwarding " + message.getType() + " message from suggestion handler");
            super.process(message);
        }
    }
}
