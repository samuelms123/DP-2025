package App.Handlers;

import App.Message;
import App.MessageType;

public class CompensationHandler extends Handler {

    public void process(Message message) {
        if (message.getType() == MessageType.COMPENSATION) {
            System.out.println("Handling compensation");
        }
        else {
            System.out.println("Forwarding " + message.getType() + " message from compensation request handler");
            super.process(message);
        }
    }
}
